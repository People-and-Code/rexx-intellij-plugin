package se.peopleandcode.rexxintellijplugin.expressions

import se.peopleandcode.rexxintellijplugin.gen.psi.*
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner
import com.intellij.psi.PsiReferenceBase
import com.intellij.psi.util.parents
import com.intellij.psi.util.siblings

class VariableReference(private val variable: Variable) :
    PsiReferenceBase<RexxVariable>(variable, variable.identifier_.textRangeInParent) {
    override fun resolve(): PsiElement? {
        val variableName = variable.name
        return candidates().firstOrNull {
            it.name == variableName
        }
    }

    override fun getVariants(): Array<Any> = candidates().toList().toTypedArray()

    private fun candidates(): Sequence<PsiNameIdentifierOwner> {
        val instruction = variable.parents(true).filter {
            it is RexxAssignment ||
                    it is RexxSayInstruction ||
                    it is RexxIfInstruction ||
                    it is RexxCallInstruction ||
                    it is RexxInstructionBlock
        }
        val previousInstructions = instruction.flatMap {
            it.siblings(forward = false, withSelf = false)
        }
        return previousInstructions.flatMap {
            when(it) {
                is RexxAssignment -> sequenceOf(it.nameDeclaration)
                is RexxParseArgInstruction -> it.nameDeclarationList.asSequence()
                is RexxParseValueInstruction -> it.nameDeclarationList.asSequence()
                is RexxParseVarInstruction -> it.nameDeclarationList.asSequence()
                is RexxParseSourceInstruction -> it.nameDeclarationList.asSequence()
                else -> sequenceOf()
            }
        }.filterIsInstance<PsiNameIdentifierOwner>()
    }

    override fun handleElementRename(newElementName: String): PsiElement =
        variable.setName(newElementName)

}