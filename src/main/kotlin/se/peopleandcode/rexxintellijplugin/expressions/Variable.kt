package se.peopleandcode.rexxintellijplugin.expressions

import se.peopleandcode.rexxintellijplugin.RexxLanguage
import se.peopleandcode.rexxintellijplugin.gen.psi.RexxAssignment
import se.peopleandcode.rexxintellijplugin.gen.psi.RexxVariable
import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFileFactory
import com.intellij.psi.PsiNamedElement
import com.intellij.psi.util.descendantsOfType

abstract class Variable(@JvmField val node: ASTNode) :
    PsiNamedElement,
    RexxVariable,
    ASTWrapperPsiElement(node) {
    override fun setName(name: String): PsiElement {
        val new = PsiFileFactory.getInstance(project)
            .createFileFromText(RexxLanguage, "${name} = 1")
            .descendantsOfType<RexxAssignment>()
            .first()
            .nameDeclaration.identifier_
        identifier_.replace(new)
        return this
    }

    override fun getName(): String? = identifier_.text


}

