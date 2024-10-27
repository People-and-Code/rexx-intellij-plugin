package se.peopleandcode.rexxintellijplugin.gen;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static se.peopleandcode.rexxintellijplugin.gen.RexxTokens.*;

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

EOL=\R
WHITE_SPACE=\s+

WHITE_SPACE=([ \t]|,[\n])+
TERMINATOR=[\n;]+
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
OPERATOR_NOT_EQUAL=<>|><|[\\]=|¬=
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
KEYWORD_ADDRESS=[Aa][Dd][Dd][Rr][Ee][Ss][Ss]
KEYWORD_ARG=[Aa][Rr][Gg]
KEYWORD_VAR=[Vv][Aa][Rr]
KEYWORD_VALUE=[Vv][Aa][Ll][Uu][Ee]
KEYWORD_WITH=[Ww][Ii][Tt][Hh]
KEYWORD_CALL=[Cc][Aa][Ll][Ll]
KEYWORD_DO=[Dd][Oo]
KEYWORD_DROP=[Dd][Rr][Oo][Pp]
KEYWORD_ELSE=[Ee][Ll][Ss][Ee]
KEYWORD_END=[Ee][Nn][Dd]
KEYWORD_EXIT=[Ee][Xx][Ii][Tt]
KEYWORD_EXPOSE=[Ee][Xx][Pp][Oo][Ss][Ee]
KEYWORD_FORWARD=[Ff][Oo][Rr][Ww][Aa][Rr][Dd]
KEYWORD_GUARD=[Gg][Uu][Aa][Rr][Dd]
KEYWORD_IF=[Ii][Ff]
KEYWORD_INTERPRET=[Ii][Nn][Tt][Ee][Rr][Pp][Rr][Ee][Tt]
KEYWORD_ITERATE=[Ii][Tt][Ee][Rr][Aa][Tt][Ee]
KEYWORD_LEAVE=[Ll][Ee][Aa][Vv][Ee]
KEYWORD_LOOP=[Ll][Oo][Oo][Pp]
KEYWORD_NOP=[Nn][Oo][Pp]
KEYWORD_NUMERIC=[Nn][Uu][Mm][Ee][Rr][Ii][Cc]
KEYWORD_OPTIONS=[Oo][Pp][Tt][Ii][Oo][Nn][Ss]
KEYWORD_OTHERWISE=[Oo][Tt][Hh][Ee][Rr][Ww][Ii][Ss][Ee]
KEYWORD_PARSE=[Pp][Aa][Rr][Ss][Ee]
KEYWORD_PROCEDURE=[Pp][Rr][Oo][Cc][Ee][Dd][Uu][Rr][Ee]
KEYWORD_PULL=[Pp][Uu][Ll][Ll]
KEYWORD_PUSH=[Pp][Uu][Ss][Hh]
KEYWORD_QUEUE=[Qq][Uu][Ee][Uu][Ee]
KEYWORD_RAISE=[Rr][Aa][Ii][Ss][Ee]
KEYWORD_REPLY=[Rr][Ee][Pp][Ll][Yy]
KEYWORD_RETURN=[Rr][Ee][Tt][Uu][Rr][Nn]
KEYWORD_SAY=[Ss][Aa][Yy]
KEYWORD_SELECT=[Ss][Ee][Ll][Ee][Cc][Tt]
KEYWORD_SOURCE=[Ss][Oo][Uu][Rr][Cc][Ee]
KEYWORD_SIGNAL=[Ss][Ii][Gg][Nn][Aa][Ll]
KEYWORD_THEN=[Tt][Hh][Ee][Nn]
KEYWORD_TRACE=[Tt][Rr][Aa][Cc][Ee]
KEYWORD_USE=[Uu][Ss][Ee]
KEYWORD_WHILE=[Ww][Hh][Ii][Ll][Ee]
SHEBANG=[#][!][^\n]*
LINE_COMMENT=--[^\n]*
MULTILINE_COMMENT=[/][*]([^*]+|[*]+[^/*])*[*]+[/]
STRING=\"[^\"\n]*\"|'[^'\n]*'
IDENTIFIER=[a-zA-Z][a-zA-Z0-9_]*
NUMBER_BINARY=0b[01]+
NUMBER_INT=[0-9]+
NUMBER_DECIMAL=[0-9]+[.][0-9]+
NUMBER_SCIENTIFIC=[0-9]*[.][0-9]+([eE][+-]?[0-9]+)
NUMBER_HEXADECIMAL=0[xX][0-9a-fA-F]+
KEYWORD_CLASS=::class
KEYWORD_ATTRIBUTE=::attribute
KEYWORD_METHOD=::method
DOT=[.]
EXCLAMATION=[!]
TILDE=[~]
COMMA=[,]
COLON=[:]

%%
<YYINITIAL> {
  {WHITE_SPACE}                                 { return WHITE_SPACE; }

  "("                                           { return TOKEN_LEFT; }
  ")"                                           { return TOKEN_RIGHT; }
  "END"                                         { return END; }

  {WHITE_SPACE}                                 { return WHITE_SPACE; }
  {TERMINATOR}                                  { return TERMINATOR; }
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
  {OPERATOR_NOT_EQUAL}                          { return OPERATOR_NOT_EQUAL; }
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
  {KEYWORD_ADDRESS}                             { return KEYWORD_ADDRESS; }
  {KEYWORD_ARG}                                 { return KEYWORD_ARG; }
  {KEYWORD_VAR}                                 { return KEYWORD_VAR; }
  {KEYWORD_VALUE}                               { return KEYWORD_VALUE; }
  {KEYWORD_WITH}                                { return KEYWORD_WITH; }
  {KEYWORD_CALL}                                { return KEYWORD_CALL; }
  {KEYWORD_DO}                                  { return KEYWORD_DO; }
  {KEYWORD_DROP}                                { return KEYWORD_DROP; }
  {KEYWORD_ELSE}                                { return KEYWORD_ELSE; }
  {KEYWORD_END}                                 { return KEYWORD_END; }
  {KEYWORD_EXIT}                                { return KEYWORD_EXIT; }
  {KEYWORD_EXPOSE}                              { return KEYWORD_EXPOSE; }
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
  {KEYWORD_PULL}                                { return KEYWORD_PULL; }
  {KEYWORD_PUSH}                                { return KEYWORD_PUSH; }
  {KEYWORD_QUEUE}                               { return KEYWORD_QUEUE; }
  {KEYWORD_RAISE}                               { return KEYWORD_RAISE; }
  {KEYWORD_REPLY}                               { return KEYWORD_REPLY; }
  {KEYWORD_RETURN}                              { return KEYWORD_RETURN; }
  {KEYWORD_SAY}                                 { return KEYWORD_SAY; }
  {KEYWORD_SELECT}                              { return KEYWORD_SELECT; }
  {KEYWORD_SOURCE}                              { return KEYWORD_SOURCE; }
  {KEYWORD_SIGNAL}                              { return KEYWORD_SIGNAL; }
  {KEYWORD_THEN}                                { return KEYWORD_THEN; }
  {KEYWORD_TRACE}                               { return KEYWORD_TRACE; }
  {KEYWORD_USE}                                 { return KEYWORD_USE; }
  {KEYWORD_WHILE}                               { return KEYWORD_WHILE; }
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
  {EXCLAMATION}                                 { return EXCLAMATION; }
  {TILDE}                                       { return TILDE; }
  {COMMA}                                       { return COMMA; }
  {COLON}                                       { return COLON; }

}

[^] { return BAD_CHARACTER; }
