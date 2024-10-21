package se.peopleandcode.rexxintellijplugin

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class RexxFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, RexxLanguage) {
    override fun getFileType(): FileType = RexxFileType
}