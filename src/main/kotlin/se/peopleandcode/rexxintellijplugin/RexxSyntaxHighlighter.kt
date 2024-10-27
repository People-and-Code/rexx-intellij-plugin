package se.peopleandcode.rexxintellijplugin

import se.peopleandcode.rexxintellijplugin.gen.RexxTokens.*
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors as Default

class RexxSyntaxHighlighter: SyntaxHighlighterBase() {
    private val parentheses: TokenSet = TokenSet.create(
        TOKEN_LEFT,
        TOKEN_RIGHT
    )
    private val operator: TokenSet = TokenSet.create(
        OPERATOR_PLUS,
        OPERATOR_SUBTRACT,
        OPERATOR_MULTIPLY,
        OPERATOR_DIVIDE,
        //OPERATOR_INTDIV,
        OPERATOR_REMAINDER,
        OPERATOR_POWER,
        OPERATOR_CONCATENATE,
        OPERATOR_AND,
    )
    private val keyword: TokenSet = TokenSet.create(
        ARG,
        DO,
        ELSE,
        END,
        EXIT,
        IF,
        PARSE,
        PULL,
        SAY,
        SOURCE,
        THEN,
        VALUE,
        VAR,
        RETURN,
        WHILE,
    )
    private val number: TokenSet = TokenSet.create(
        NUMBER_INT,
        NUMBER_DECIMAL,
        NUMBER_BINARY,
        NUMBER_SCIENTIFIC,
        NUMBER_HEXADECIMAL
    )
    private val identifier: TokenSet = TokenSet.create(
        IDENTIFIER
    )

    override fun getHighlightingLexer() = RexxLexer()
    override fun getTokenHighlights(tokenType: IElementType?) = when {
        operator.contains(tokenType) -> arrayOf(Default.OPERATION_SIGN)
        keyword.contains(tokenType) -> arrayOf(Default.KEYWORD)
        number.contains(tokenType) -> arrayOf(Default.NUMBER)
        parentheses.contains(tokenType) -> arrayOf(Default.PARENTHESES)
        SHEBANG == tokenType -> arrayOf(Default.LINE_COMMENT)
        LINE_COMMENT == tokenType -> arrayOf(Default.LINE_COMMENT)
        MULTILINE_COMMENT == tokenType -> arrayOf(Default.BLOCK_COMMENT)
        STRING == tokenType -> arrayOf(Default.STRING)
        identifier.contains(tokenType) -> arrayOf(Default.IDENTIFIER)
        else -> arrayOf()
    }

}