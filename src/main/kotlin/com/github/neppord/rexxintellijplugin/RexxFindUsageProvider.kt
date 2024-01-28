package com.github.neppord.rexxintellijplugin

import com.intellij.lang.findUsages.FindUsagesProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNamedElement

class RexxFindUsageProvider : FindUsagesProvider {
    override fun canFindUsagesFor(psiElement: PsiElement): Boolean = true
    override fun getHelpId(psiElement: PsiElement): String? = null

    override fun getType(element: PsiElement): String = "variable"

    override fun getDescriptiveName(element: PsiElement): String = when (element) {
        is PsiNamedElement -> element.name ?: "unkown"
        else -> "unknown"
    }

    override fun getNodeText(element: PsiElement, useFullName: Boolean): String = element.text
}