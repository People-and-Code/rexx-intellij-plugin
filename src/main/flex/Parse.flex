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

WHITE_SPACE=([ \t]|,\n)+
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
ADDRESS=[Aa][Dd][Dd][Rr][Ee][Ss][Ss]
ARG=[Aa][Rr][Gg]
VAR=[Vv][Aa][Rr]
VALUE=[Vv][Aa][Ll][Uu][Ee]
WITH=[Ww][Ii][Tt][Hh]
CALL=[Cc][Aa][Ll][Ll]
DO=[Dd][Oo]
DROP=[Dd][Rr][Oo][Pp]
ELSE=[Ee][Ll][Ss][Ee]
END=[Ee][Nn][Dd]
EXIT=[Ee][Xx][Ii][Tt]
EXPOSE=[Ee][Xx][Pp][Oo][Ss][Ee]
FORWARD=[Ff][Oo][Rr][Ww][Aa][Rr][Dd]
GUARD=[Gg][Uu][Aa][Rr][Dd]
IF=[Ii][Ff]
INTERPRET=[Ii][Nn][Tt][Ee][Rr][Pp][Rr][Ee][Tt]
ITERATE=[Ii][Tt][Ee][Rr][Aa][Tt][Ee]
LEAVE=[Ll][Ee][Aa][Vv][Ee]
LOOP=[Ll][Oo][Oo][Pp]
NOP=[Nn][Oo][Pp]
NUMERIC=[Nn][Uu][Mm][Ee][Rr][Ii][Cc]
OPTIONS=[Oo][Pp][Tt][Ii][Oo][Nn][Ss]
OTHERWISE=[Oo][Tt][Hh][Ee][Rr][Ww][Ii][Ss][Ee]
PARSE=[Pp][Aa][Rr][Ss][Ee]
PROCEDURE=[Pp][Rr][Oo][Cc][Ee][Dd][Uu][Rr][Ee]
PULL=[Pp][Uu][Ll][Ll]
PUSH=[Pp][Uu][Ss][Hh]
QUEUE=[Qq][Uu][Ee][Uu][Ee]
RAISE=[Rr][Aa][Ii][Ss][Ee]
REPLY=[Rr][Ee][Pp][Ll][Yy]
RETURN=[Rr][Ee][Tt][Uu][Rr][Nn]
SAY=[Ss][Aa][Yy]
SELECT=[Ss][Ee][Ll][Ee][Cc][Tt]
SOURCE=[Ss][Oo][Uu][Rr][Cc][Ee]
SIGNAL=[Ss][Ii][Gg][Nn][Aa][Ll]
THEN=[Tt][Hh][Ee][Nn]
TRACE=[Tt][Rr][Aa][Cc][Ee]
USE=[Uu][Ss][Ee]
WHILE=[Ww][Hh][Ii][Ll][Ee]
WHEN=[Ww][Hh][Ee][Nn]
UPPER=[Uu][Pp][Pp][Ee][Rr]
CASELESS=[Cc][Aa][Ss][Ee][Ll][Ee][Ss][Ss]
LOWER=[Ll][Oo][Ww][Ee][Rr]
SHEBANG=[#][!][^\n]*
LINE_COMMENT=--[^\n]*|,[ \t]*--[^\n]*\n
MULTILINE_COMMENT="/"[*]([^*]+|[*]+[^/*])*[*]+"/"|,([ \t]*"/"[*]([^*]+|[*]+[^/*])*[*]+"/")*\n
STRING=\"[^\"\n]*\"|'[^'\n]*'
IDENTIFIER=[_!?a-zA-Z][a-zA-Z0-9_]*
NUMBER_BINARY=0b[01]+
NUMBER_INT=[0-9]+
NUMBER_DECIMAL=[0-9]+[.][0-9]+
NUMBER_SCIENTIFIC=[0-9]*[.][0-9]+([eE][+-]?[0-9]+)
NUMBER_HEXADECIMAL=0[xX][0-9a-fA-F]+
CLASS_TOKEN=::[Cc][Ll][Aa][Ss][Ss]
ATTRIBUTE=::[Aa][Tt][Tt][Rr][Ii][Bb][Uu][Tt][Ee]
METHOD=::[Mm][Ee][Tt][Hh][Oo][Dd]
DOT=[.]
EXCLAMATION=[!]
TILDE=[~]
COMMA=[,]
COLON=[:]
REQUIRES=::[Rr][Ee][Qq][Uu][Ii][Rr][Ee][Ss]

%%
<YYINITIAL> {
  {WHITE_SPACE}                { return WHITE_SPACE; }

  "("                          { return TOKEN_LEFT; }
  ")"                          { return TOKEN_RIGHT; }
  "="                          { return EQ; }
  "+="                         { return PLUS_EQ; }
  "\\="                        { return NEQ1; }
  "<>"                         { return NEQ2; }
  "><"                         { return NEQ3; }
  ">"                          { return GT; }
  "<"                          { return LT; }
  ">="                         { return GTE; }
  "<="                         { return LTE; }
  "\\>"                        { return ALT_GT; }
  "\\<"                        { return ALT_LT; }
  "=="                         { return STRICT_EQ; }
  "\\=="                       { return STRICT_NEQ; }
  ">>"                         { return STRICT_GT; }
  "<<"                         { return STRICT_LT; }
  ">>="                        { return STRICT_GTE; }
  "<<="                        { return STRICT_LTE; }
  "\\>>"                       { return STRICT_ESC_GT; }
  "\\<<"                       { return STRICT_ESC_LT; }

  {WHITE_SPACE}                { return WHITE_SPACE; }
  {TERMINATOR}                 { return TERMINATOR; }
  {OPERATOR_PLUS}              { return OPERATOR_PLUS; }
  {OPERATOR_SUBTRACT}          { return OPERATOR_SUBTRACT; }
  {OPERATOR_MULTIPLY}          { return OPERATOR_MULTIPLY; }
  {OPERATOR_DIVIDE}            { return OPERATOR_DIVIDE; }
  {OPERATOR_REMAINDER}         { return OPERATOR_REMAINDER; }
  {OPERATOR_POWER}             { return OPERATOR_POWER; }
  {OPERATOR_CONCATENATE}       { return OPERATOR_CONCATENATE; }
  {OPERATOR_AND}               { return OPERATOR_AND; }
  {OPERATOR_BITWISE_AND}       { return OPERATOR_BITWISE_AND; }
  {OPERATOR_OR}                { return OPERATOR_OR; }
  {OPERATOR_XOR}               { return OPERATOR_XOR; }
  {ADDRESS}                    { return ADDRESS; }
  {ARG}                        { return ARG; }
  {VAR}                        { return VAR; }
  {VALUE}                      { return VALUE; }
  {WITH}                       { return WITH; }
  {CALL}                       { return CALL; }
  {DO}                         { return DO; }
  {DROP}                       { return DROP; }
  {ELSE}                       { return ELSE; }
  {END}                        { return END; }
  {EXIT}                       { return EXIT; }
  {EXPOSE}                     { return EXPOSE; }
  {FORWARD}                    { return FORWARD; }
  {GUARD}                      { return GUARD; }
  {IF}                         { return IF; }
  {INTERPRET}                  { return INTERPRET; }
  {ITERATE}                    { return ITERATE; }
  {LEAVE}                      { return LEAVE; }
  {LOOP}                       { return LOOP; }
  {NOP}                        { return NOP; }
  {NUMERIC}                    { return NUMERIC; }
  {OPTIONS}                    { return OPTIONS; }
  {OTHERWISE}                  { return OTHERWISE; }
  {PARSE}                      { return PARSE; }
  {PROCEDURE}                  { return PROCEDURE; }
  {PULL}                       { return PULL; }
  {PUSH}                       { return PUSH; }
  {QUEUE}                      { return QUEUE; }
  {RAISE}                      { return RAISE; }
  {REPLY}                      { return REPLY; }
  {RETURN}                     { return RETURN; }
  {SAY}                        { return SAY; }
  {SELECT}                     { return SELECT; }
  {SOURCE}                     { return SOURCE; }
  {SIGNAL}                     { return SIGNAL; }
  {THEN}                       { return THEN; }
  {TRACE}                      { return TRACE; }
  {USE}                        { return USE; }
  {WHILE}                      { return WHILE; }
  {WHEN}                       { return WHEN; }
  {UPPER}                      { return UPPER; }
  {CASELESS}                   { return CASELESS; }
  {LOWER}                      { return LOWER; }
  {SHEBANG}                    { return SHEBANG; }
  {LINE_COMMENT}               { return LINE_COMMENT; }
  {MULTILINE_COMMENT}          { return MULTILINE_COMMENT; }
  {STRING}                     { return STRING; }
  {IDENTIFIER}                 { return IDENTIFIER; }
  {NUMBER_BINARY}              { return NUMBER_BINARY; }
  {NUMBER_INT}                 { return NUMBER_INT; }
  {NUMBER_DECIMAL}             { return NUMBER_DECIMAL; }
  {NUMBER_SCIENTIFIC}          { return NUMBER_SCIENTIFIC; }
  {NUMBER_HEXADECIMAL}         { return NUMBER_HEXADECIMAL; }
  {CLASS_TOKEN}                { return CLASS_TOKEN; }
  {ATTRIBUTE}                  { return ATTRIBUTE; }
  {METHOD}                     { return METHOD; }
  {DOT}                        { return DOT; }
  {EXCLAMATION}                { return EXCLAMATION; }
  {TILDE}                      { return TILDE; }
  {COMMA}                      { return COMMA; }
  {COLON}                      { return COLON; }
  {REQUIRES}                   { return REQUIRES; }

}

[^] { return BAD_CHARACTER; }
