package se.peopleandcode.rexxintellijplugin.refactoring

import com.intellij.lang.refactoring.RefactoringSupportProvider
import com.intellij.psi.PsiElement

class RexxRefactoringSupportProvider: RefactoringSupportProvider() {
    override fun isInplaceRenameAvailable(element: PsiElement, context: PsiElement?): Boolean = true
    override fun isMemberInplaceRenameAvailable(element: PsiElement, context: PsiElement?): Boolean = true
}