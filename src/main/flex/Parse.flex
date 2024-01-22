package com.github.neppord.rexxintellijplugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.github.neppord.rexxintellijplugin.RexxTokensKt.*;

%%

%{
  public _RexxLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _RexxLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode
%caseless

EOL=\R
WHITE_SPACE=\s+

STRING=\"[^\"\n]*\"|'[^'\n]*'
IDENTIFIER=[a-zA-Z][a-zA-Z0-9._]*
SHEBANG="#!"[^\n]*
LINE_COMMENT=--[^\n]*
MULTILINE_COMMENT="/"[*][^*]*[*]+("/"[^*]*[*]+)*"/"
NUMBER_BINARY=0b[01]+
NUMBER_INT=[0-9]+
NUMBER_DECIMAL=[0-9]*[.]?[0-9]+
NUMBER_SCIENTIFIC=[0-9]*[.][0-9]+([eE][+-]?[0-9]+)
NUMBER_HEXADECIMAL=0[xX][0-9a-fA-F]+

%%
<YYINITIAL> {
  {WHITE_SPACE}              { return WHITE_SPACE; }

  "SAY"                      { return KEYWORD_SAY; }

  {STRING}                   { return STRING; }
  {IDENTIFIER}               { return IDENTIFIER; }
  {SHEBANG}                  { return SHEBANG; }
  {LINE_COMMENT}             { return LINE_COMMENT; }
  {MULTILINE_COMMENT}        { return MULTILINE_COMMENT; }
  {NUMBER_BINARY}            { return NUMBER_BINARY; }
  {NUMBER_INT}               { return NUMBER_INT; }
  {NUMBER_DECIMAL}           { return NUMBER_DECIMAL; }
  {NUMBER_SCIENTIFIC}        { return NUMBER_SCIENTIFIC; }
  {NUMBER_HEXADECIMAL}       { return NUMBER_HEXADECIMAL; }

}

[^] { return BAD_CHARACTER; }
