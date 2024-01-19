package com.github.neppord.rexxintellijplugin

import com.intellij.lexer.FlexAdapter
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors as Default

class RexxSyntaxHighlighter: SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer {
        return FlexAdapter(_RexxLexer(null))
    }

    override fun getTokenHighlights(tokenType: IElementType?): Array<TextAttributesKey> {
        return when {
            operator.contains(tokenType) -> arrayOf(Default.OPERATION_SIGN)
            keyword.contains(tokenType) -> arrayOf(Default.KEYWORD)
            else -> arrayOf()
        }
    }

}