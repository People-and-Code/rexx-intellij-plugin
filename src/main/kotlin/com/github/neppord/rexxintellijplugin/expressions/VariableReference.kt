package com.github.neppord.rexxintellijplugin.expressions

import com.github.neppord.rexxintellijplugin.gen.psi.RexxAssignment
import com.github.neppord.rexxintellijplugin.gen.psi.RexxParseArgInstruction
import com.github.neppord.rexxintellijplugin.gen.psi.RexxParseVarInstruction
import com.github.neppord.rexxintellijplugin.gen.psi.RexxSayInstruction
import com.github.neppord.rexxintellijplugin.gen.psi.RexxVariable
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner
import com.intellij.psi.PsiReferenceBase
import com.intellij.psi.util.parents
import com.intellij.psi.util.siblings

class VariableReference(private val variable: Variable) :
    PsiReferenceBase<RexxVariable>(variable, variable.identifier.textRangeInParent) {
    override fun resolve(): PsiElement? {
        val variableName = variable.name
        return candidates().firstOrNull {
            it.name == variableName
        }
    }

    override fun getVariants(): Array<Any> = candidates().toList().toTypedArray()

    private fun candidates(): Sequence<PsiNameIdentifierOwner> {
        val instruction = variable.parents(true).firstOrNull {
            it is RexxAssignment || it is RexxSayInstruction
        }
        val previousInstructions = instruction?.siblings(forward = false) ?: emptySequence()
        return previousInstructions.flatMap {
            when(it) {
                is RexxAssignment -> sequenceOf(it.nameDeclaration)
                is RexxParseArgInstruction -> it.nameDeclarationList.asSequence()
                is RexxParseVarInstruction -> it.nameDeclarationList.asSequence()
                else -> sequenceOf()
            }
        }.filterIsInstance<PsiNameIdentifierOwner>()
    }

    override fun handleElementRename(newElementName: String): PsiElement =
        variable.setName(newElementName)

}