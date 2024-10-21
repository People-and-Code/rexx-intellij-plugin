package se.peopleandcode.rexxintellijplugin

import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.util.IconLoader
import javax.swing.Icon

object RexxFileType : LanguageFileType(RexxLanguage) {
    override fun getName() = "Rexx File"
    override fun getDescription() = "Rexx Language file"
    override fun getDefaultExtension() = "rex"
    override fun getIcon(): Icon = requireNotNull(
        IconLoader.findIcon("/icons/file.svg", RexxFileType::class.java)
    ) { "Icon not found" }
}