package com.github.neppord.rexxintellijplugin

import com.github.neppord.rexxintellijplugin.RexxTokensKt.*
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors as Default

class RexxSyntaxHighlighter: SyntaxHighlighterBase() {
    private val operator: TokenSet = TokenSet.create()
    private val keyword: TokenSet = TokenSet.create(
        KEYWORD_SAY
    )
    private val number: TokenSet = TokenSet.create(
        NUMBER_INT,
        NUMBER_DECIMAL,
        NUMBER_BINARY,
        NUMBER_SCIENTIFIC,
        NUMBER_HEXADECIMAL
    )

    override fun getHighlightingLexer() = RexxLexer()
    override fun getTokenHighlights(tokenType: IElementType?) = when {
        operator.contains(tokenType) -> arrayOf(Default.OPERATION_SIGN)
        keyword.contains(tokenType) -> arrayOf(Default.KEYWORD)
        number.contains(tokenType) -> arrayOf(Default.NUMBER)
        SHEBANG == tokenType -> arrayOf(Default.LINE_COMMENT)
        LINE_COMMENT == tokenType -> arrayOf(Default.LINE_COMMENT)
        MULTILINE_COMMENT == tokenType -> arrayOf(Default.BLOCK_COMMENT)
        STRING == tokenType -> arrayOf(Default.STRING)
        else -> arrayOf()
    }

}