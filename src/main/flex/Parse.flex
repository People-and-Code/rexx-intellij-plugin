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

OPERATOR_PLUS=[+]
OPERATOR_SUBTRACT=-
OPERATOR_MULTIPLY=[*]
OPERATOR_DIVIDE="/"
OPERATOR_REMAINDER=%
OPERATOR_POWER=[*][*]
OPERATOR_CONCATENATE=[|][|]
OPERATOR_AND=&&
OPERATOR_BITWISE_AND=&
OPERATOR_OR=[|]
OPERATOR_XOR=\^\^
OPERATOR_EQUAL==
OPERATOR_BACKSLASH_EQUAL=\\=
OPERATOR_GREATERTHAN=>
OPERATOR_BACKSLASH_GREATERTHAN=\\>
OPERATOR_LESSTHAN=<
OPERATOR_BACKSLASH_LESSTHAN=\\<
OPERATOR_GREATERTHAN_EQUAL=>=
OPERATOR_LESSTHAN_EQUAL==<
OPERATOR_STRICT_EQUAL===
OPERATOR_STRICT_BACKSLASH_EQUAL=\\==
OPERATOR_STRICT_BACKSLASH_GREATERTHAN=\\==>
OPERATOR_STRICT_LESSTHAN===<
OPERATOR_STRICT_BACKSLASH_LESSTHAN=\\==<
OPERATOR_STRICT_GREATERTHAN_EQUAL===>
OPERATOR_STRICT_LESSTHAN_EQUAL===<=
OPERATOR_LESSTHAN_GREATERTHAN=<>
OPERATOR_GREATERTHAN_LESSTHAN=><
OPERATOR_BACKSLASH=\\\\
KEYWORD_CALL=CALL
KEYWORD_DO=DO
KEYWORD_DROP=DROP
KEYWORD_ELSE=ELSE
KEYWORD_END=END
KEYWORD_FORWARD=FORWARD
KEYWORD_GUARD=GUARD
KEYWORD_IF=IF
KEYWORD_INTERPRET=INTERPRET
KEYWORD_ITERATE=ITERATE
KEYWORD_LEAVE=LEAVE
KEYWORD_LOOP=LOOP
KEYWORD_NOP=NOP
KEYWORD_NUMERIC=NUMERIC
KEYWORD_OPTIONS=OPTIONS
KEYWORD_OTHERWISE=OTHERWISE
KEYWORD_PARSE=PARSE
KEYWORD_PROCEDURE=PROCEDURE
KEYWORD_PUSH=PUSH
KEYWORD_QUEUE=QUEUE
KEYWORD_RAISE=RAISE
KEYWORD_REPLY=REPLY
KEYWORD_SAY=SAY
KEYWORD_SELECT=SELECT
KEYWORD_SIGNAL=SIGNAL
KEYWORD_TRACE=TRACE
KEYWORD_USE=USE
SHEBANG=[#][!][^\n]*
LINE_COMMENT=--[^\n]*
MULTILINE_COMMENT="/"[*][^*]*[*]+("/"[^*]*[*]+)*"/"
STRING=\"[^\"\n]*\"|'[^'\n]*'
IDENTIFIER=[a-zA-Z][a-zA-Z0-9._]*
NUMBER_BINARY=0b[01]+
NUMBER_INT=[0-9]+
NUMBER_DECIMAL=[0-9]*[.]?[0-9]+
NUMBER_SCIENTIFIC=[0-9]*[.][0-9]+([eE][+-]?[0-9]+)
NUMBER_HEXADECIMAL=0[xX][0-9a-fA-F]+
KEYWORD_CLASS=::class
KEYWORD_ATTRIBUTE=::attribute
KEYWORD_METHOD=::method
DOT=[.]
TILDE=[~]

%%
<YYINITIAL> {
  {WHITE_SPACE}                                 { return WHITE_SPACE; }

  "("                                           { return TOKEN_LEFT; }
  ")"                                           { return TOKEN_RIGHT; }

  {OPERATOR_PLUS}                               { return OPERATOR_PLUS; }
  {OPERATOR_SUBTRACT}                           { return OPERATOR_SUBTRACT; }
  {OPERATOR_MULTIPLY}                           { return OPERATOR_MULTIPLY; }
  {OPERATOR_DIVIDE}                             { return OPERATOR_DIVIDE; }
  {OPERATOR_REMAINDER}                          { return OPERATOR_REMAINDER; }
  {OPERATOR_POWER}                              { return OPERATOR_POWER; }
  {OPERATOR_CONCATENATE}                        { return OPERATOR_CONCATENATE; }
  {OPERATOR_AND}                                { return OPERATOR_AND; }
  {OPERATOR_BITWISE_AND}                        { return OPERATOR_BITWISE_AND; }
  {OPERATOR_OR}                                 { return OPERATOR_OR; }
  {OPERATOR_XOR}                                { return OPERATOR_XOR; }
  {OPERATOR_EQUAL}                              { return OPERATOR_EQUAL; }
  {OPERATOR_BACKSLASH_EQUAL}                    { return OPERATOR_BACKSLASH_EQUAL; }
  {OPERATOR_GREATERTHAN}                        { return OPERATOR_GREATERTHAN; }
  {OPERATOR_BACKSLASH_GREATERTHAN}              { return OPERATOR_BACKSLASH_GREATERTHAN; }
  {OPERATOR_LESSTHAN}                           { return OPERATOR_LESSTHAN; }
  {OPERATOR_BACKSLASH_LESSTHAN}                 { return OPERATOR_BACKSLASH_LESSTHAN; }
  {OPERATOR_GREATERTHAN_EQUAL}                  { return OPERATOR_GREATERTHAN_EQUAL; }
  {OPERATOR_LESSTHAN_EQUAL}                     { return OPERATOR_LESSTHAN_EQUAL; }
  {OPERATOR_STRICT_EQUAL}                       { return OPERATOR_STRICT_EQUAL; }
  {OPERATOR_STRICT_BACKSLASH_EQUAL}             { return OPERATOR_STRICT_BACKSLASH_EQUAL; }
  {OPERATOR_STRICT_BACKSLASH_GREATERTHAN}       { return OPERATOR_STRICT_BACKSLASH_GREATERTHAN; }
  {OPERATOR_STRICT_LESSTHAN}                    { return OPERATOR_STRICT_LESSTHAN; }
  {OPERATOR_STRICT_BACKSLASH_LESSTHAN}          { return OPERATOR_STRICT_BACKSLASH_LESSTHAN; }
  {OPERATOR_STRICT_GREATERTHAN_EQUAL}           { return OPERATOR_STRICT_GREATERTHAN_EQUAL; }
  {OPERATOR_STRICT_LESSTHAN_EQUAL}              { return OPERATOR_STRICT_LESSTHAN_EQUAL; }
  {OPERATOR_LESSTHAN_GREATERTHAN}               { return OPERATOR_LESSTHAN_GREATERTHAN; }
  {OPERATOR_GREATERTHAN_LESSTHAN}               { return OPERATOR_GREATERTHAN_LESSTHAN; }
  {OPERATOR_BACKSLASH}                          { return OPERATOR_BACKSLASH; }
  {KEYWORD_CALL}                                { return KEYWORD_CALL; }
  {KEYWORD_DO}                                  { return KEYWORD_DO; }
  {KEYWORD_DROP}                                { return KEYWORD_DROP; }
  {KEYWORD_ELSE}                                { return KEYWORD_ELSE; }
  {KEYWORD_END}                                 { return KEYWORD_END; }
  {KEYWORD_FORWARD}                             { return KEYWORD_FORWARD; }
  {KEYWORD_GUARD}                               { return KEYWORD_GUARD; }
  {KEYWORD_IF}                                  { return KEYWORD_IF; }
  {KEYWORD_INTERPRET}                           { return KEYWORD_INTERPRET; }
  {KEYWORD_ITERATE}                             { return KEYWORD_ITERATE; }
  {KEYWORD_LEAVE}                               { return KEYWORD_LEAVE; }
  {KEYWORD_LOOP}                                { return KEYWORD_LOOP; }
  {KEYWORD_NOP}                                 { return KEYWORD_NOP; }
  {KEYWORD_NUMERIC}                             { return KEYWORD_NUMERIC; }
  {KEYWORD_OPTIONS}                             { return KEYWORD_OPTIONS; }
  {KEYWORD_OTHERWISE}                           { return KEYWORD_OTHERWISE; }
  {KEYWORD_PARSE}                               { return KEYWORD_PARSE; }
  {KEYWORD_PROCEDURE}                           { return KEYWORD_PROCEDURE; }
  {KEYWORD_PUSH}                                { return KEYWORD_PUSH; }
  {KEYWORD_QUEUE}                               { return KEYWORD_QUEUE; }
  {KEYWORD_RAISE}                               { return KEYWORD_RAISE; }
  {KEYWORD_REPLY}                               { return KEYWORD_REPLY; }
  {KEYWORD_SAY}                                 { return KEYWORD_SAY; }
  {KEYWORD_SELECT}                              { return KEYWORD_SELECT; }
  {KEYWORD_SIGNAL}                              { return KEYWORD_SIGNAL; }
  {KEYWORD_TRACE}                               { return KEYWORD_TRACE; }
  {KEYWORD_USE}                                 { return KEYWORD_USE; }
  {SHEBANG}                                     { return SHEBANG; }
  {LINE_COMMENT}                                { return LINE_COMMENT; }
  {MULTILINE_COMMENT}                           { return MULTILINE_COMMENT; }
  {STRING}                                      { return STRING; }
  {IDENTIFIER}                                  { return IDENTIFIER; }
  {NUMBER_BINARY}                               { return NUMBER_BINARY; }
  {NUMBER_INT}                                  { return NUMBER_INT; }
  {NUMBER_DECIMAL}                              { return NUMBER_DECIMAL; }
  {NUMBER_SCIENTIFIC}                           { return NUMBER_SCIENTIFIC; }
  {NUMBER_HEXADECIMAL}                          { return NUMBER_HEXADECIMAL; }
  {KEYWORD_CLASS}                               { return KEYWORD_CLASS; }
  {KEYWORD_ATTRIBUTE}                           { return KEYWORD_ATTRIBUTE; }
  {KEYWORD_METHOD}                              { return KEYWORD_METHOD; }
  {DOT}                                         { return DOT; }
  {TILDE}                                       { return TILDE; }

}

[^] { return BAD_CHARACTER; }
