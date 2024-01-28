package com.github.neppord.rexxintellijplugin.expressions

import com.github.neppord.rexxintellijplugin.RexxLanguage
import com.github.neppord.rexxintellijplugin.gen.psi.RexxAssignment
import com.github.neppord.rexxintellijplugin.gen.psi.RexxVariable
import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFileFactory
import com.intellij.psi.PsiNamedElement
import com.intellij.psi.PsiReference
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
            .nameDeclaration.identifier
        identifier.replace(new)
        return this
    }

    override fun getReference(): PsiReference? = VariableReference(this)
    override fun getName(): String? = identifier.text


}

