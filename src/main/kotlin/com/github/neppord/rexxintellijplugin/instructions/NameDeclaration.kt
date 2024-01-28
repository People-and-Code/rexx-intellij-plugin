package com.github.neppord.rexxintellijplugin.instructions

import com.github.neppord.rexxintellijplugin.RexxLanguage
import com.github.neppord.rexxintellijplugin.gen.psi.RexxAssignment
import com.github.neppord.rexxintellijplugin.gen.psi.RexxNameDeclaration
import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFileFactory
import com.intellij.psi.PsiNameIdentifierOwner
import com.intellij.psi.search.LocalSearchScope
import com.intellij.psi.search.SearchScope
import com.intellij.psi.util.descendantsOfType

abstract class NameDeclaration(@JvmField val node: ASTNode):
    PsiNameIdentifierOwner,
    ASTWrapperPsiElement(node),
    RexxNameDeclaration {
    override fun setName(name: String): PsiElement {
        val new = PsiFileFactory.getInstance(project)
            .createFileFromText(RexxLanguage, "${name} = 1")
            .descendantsOfType<RexxAssignment>()
            .first()
            .nameDeclaration.identifier
        identifier.replace(new)
        return this
    }

    override fun getNameIdentifier(): PsiElement = identifier
    override fun getName(): String? = nameIdentifier.text
    override fun getUseScope(): SearchScope = LocalSearchScope(this.containingFile)
}