package com.github.neppord.rexxintellijplugin

import com.github.neppord.rexxintellijplugin.gen.RexxParser
import com.github.neppord.rexxintellijplugin.gen.RexxTokens
import com.github.neppord.rexxintellijplugin.gen.RexxTokens.Factory
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet

class RexxParserDefinition : ParserDefinition {
    override fun createLexer(project: Project?) = RexxLexer()
    override fun createParser(project: Project?): PsiParser = RexxParser()
    override fun getFileNodeType(): IFileElementType = IFileElementType(RexxLanguage)
    override fun getCommentTokens() = TokenSet.create(
        RexxTokens.SHEBANG,
        RexxTokens.LINE_COMMENT,
        RexxTokens.MULTILINE_COMMENT,
    )
    override fun getStringLiteralElements(): TokenSet = TokenSet.create(RexxTokens.STRING_LITERAL)
    override fun createElement(node: ASTNode?): PsiElement = Factory.createElement(node)
    override fun createFile(viewProvider: FileViewProvider): PsiFile = RexxFile(viewProvider)
}

