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

OPERATOR_PLUS=\\+
OPERATOR_SUBTRACT=-
OPERATOR_MULTIPLY=[*]
OPERATOR_DIVIDE="/"
OPERATOR_INTDIV=\\\\
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
DIRECTIVE_ANNOTATE=ANNOTATE
DIRECTIVE_ATTRIBUTE=ATTRIBUTE
DIRECTIVE_CONSTANT=CONSTANT
DIRECTIVE_METHOD=METHOD
DIRECTIVE_REQUIRES=REQUIRES
DIRECTIVE_RESOURCE=RESOURCE
DIRECTIVE_ROUTINE=ROUTINE
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
SUBKEY_ADDITIONAL=ADDITIONAL
SUBKEY_APPEND=APPEND
SUBKEY_ARGUMENTS=ARGUMENTS
SUBKEY_ARRAY=ARRAY
SUBKEY_BY=BY
SUBKEY_CASE=CASE
SUBKEY_CLASS=CLASS
SUBKEY_CONTINUE=CONTINUE
SUBKEY_COUNTER=COUNTER
SUBKEY_DESCRIPTION=DESCRIPTION
SUBKEY_ENGINEERING=ENGINEERING
SUBKEY_ERROR=ERROR
SUBKEY_EXIT=EXIT
SUBKEY_EXPOSE=EXPOSE
SUBKEY_FALSE=FALSE
SUBKEY_FOR=FOR
SUBKEY_FOREVER=FOREVER
SUBKEY_INDEX=INDEX
SUBKEY_INPUT=INPUT
SUBKEY_ITEM=ITEM
SUBKEY_LABEL=LABEL
SUBKEY_LOCAL=LOCAL
SUBKEY_MESSAGE=MESSAGE
SUBKEY_NAME=NAME
SUBKEY_NORMAL=NORMAL
SUBKEY_OFF=OFF
SUBKEY_ON=ON
SUBKEY_OUTPUT=OUTPUT
SUBKEY_OVER=OVER
SUBKEY_REPLACE=REPLACE
SUBKEY_RETURN=RETURN
SUBKEY_SCIENTIFIC=SCIENTIFIC
SUBKEY_STEM=STEM
SUBKEY_STREAM=STREAM
SUBKEY_STRICT=STRICT
SUBKEY_THEN=THEN
SUBKEY_TO=TO
SUBKEY_TRUE=TRUE
SUBKEY_UNTIL=UNTIL
SUBKEY_USING=USING
SUBKEY_VALUE=VALUE
SUBKEY_WHEN=WHEN
SUBKEY_WHILE=WHILE
SUBKEY_WITH=WITH
SUBKEY_CASELESS=CASELESS
SUBKEY_LINEIN=LINEIN
SUBKEY_LOWER=LOWER
SUBKEY_PULL=PULL
SUBKEY_SOURCE=SOURCE
SUBKEY_UPPER=UPPER
SUBKEY_VAR=VAR
SUBKEY_VERSION=VERSION
BUILTIN_ABBREV=ABBREV
BUILTIN_ABS=ABS
BUILTIN_ADDRESS=ADDRESS
BUILTIN_ARG=ARG
BUILTIN_B2X=B2X
BUILTIN_BITAND=BITAND
BUILTIN_BITOR=BITOR
BUILTIN_BITXOR=BITXOR
BUILTIN_C2D=C2D
BUILTIN_C2X=C2X
BUILTIN_CENTER=CENTER
BUILTIN_CENTRE=CENTRE
BUILTIN_CHANGESTR=CHANGESTR
BUILTIN_CHARIN=CHARIN
BUILTIN_CHAROUT=CHAROUT
BUILTIN_CHARS=CHARS
BUILTIN_COMPARE=COMPARE
BUILTIN_CONDITION=CONDITION
BUILTIN_COPIES=COPIES
BUILTIN_COUNTSTR=COUNTSTR
BUILTIN_D2C=D2C
BUILTIN_D2X=D2X
BUILTIN_DATATYPE=DATATYPE
BUILTIN_DATE=DATE
BUILTIN_DELSTR=DELSTR
BUILTIN_DELWORD=DELWORD
BUILTIN_DIGITS=DIGITS
BUILTIN_ERRORTEXT=ERRORTEXT
BUILTIN_FORM=FORM
BUILTIN_FORMAT=FORMAT
BUILTIN_FUZZ=FUZZ
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


  {OPERATOR_PLUS}                               { return OPERATOR_PLUS; }
  {OPERATOR_SUBTRACT}                           { return OPERATOR_SUBTRACT; }
  {OPERATOR_MULTIPLY}                           { return OPERATOR_MULTIPLY; }
  {OPERATOR_DIVIDE}                             { return OPERATOR_DIVIDE; }
  {OPERATOR_INTDIV}                             { return OPERATOR_INTDIV; }
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
  {DIRECTIVE_ANNOTATE}                          { return DIRECTIVE_ANNOTATE; }
  {DIRECTIVE_ATTRIBUTE}                         { return DIRECTIVE_ATTRIBUTE; }
  {DIRECTIVE_CONSTANT}                          { return DIRECTIVE_CONSTANT; }
  {DIRECTIVE_METHOD}                            { return DIRECTIVE_METHOD; }
  {DIRECTIVE_REQUIRES}                          { return DIRECTIVE_REQUIRES; }
  {DIRECTIVE_RESOURCE}                          { return DIRECTIVE_RESOURCE; }
  {DIRECTIVE_ROUTINE}                           { return DIRECTIVE_ROUTINE; }
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
  {SUBKEY_ADDITIONAL}                           { return SUBKEY_ADDITIONAL; }
  {SUBKEY_APPEND}                               { return SUBKEY_APPEND; }
  {SUBKEY_ARGUMENTS}                            { return SUBKEY_ARGUMENTS; }
  {SUBKEY_ARRAY}                                { return SUBKEY_ARRAY; }
  {SUBKEY_BY}                                   { return SUBKEY_BY; }
  {SUBKEY_CASE}                                 { return SUBKEY_CASE; }
  {SUBKEY_CLASS}                                { return SUBKEY_CLASS; }
  {SUBKEY_CONTINUE}                             { return SUBKEY_CONTINUE; }
  {SUBKEY_COUNTER}                              { return SUBKEY_COUNTER; }
  {SUBKEY_DESCRIPTION}                          { return SUBKEY_DESCRIPTION; }
  {SUBKEY_ENGINEERING}                          { return SUBKEY_ENGINEERING; }
  {SUBKEY_ERROR}                                { return SUBKEY_ERROR; }
  {SUBKEY_EXIT}                                 { return SUBKEY_EXIT; }
  {SUBKEY_EXPOSE}                               { return SUBKEY_EXPOSE; }
  {SUBKEY_FALSE}                                { return SUBKEY_FALSE; }
  {SUBKEY_FOR}                                  { return SUBKEY_FOR; }
  {SUBKEY_FOREVER}                              { return SUBKEY_FOREVER; }
  {SUBKEY_INDEX}                                { return SUBKEY_INDEX; }
  {SUBKEY_INPUT}                                { return SUBKEY_INPUT; }
  {SUBKEY_ITEM}                                 { return SUBKEY_ITEM; }
  {SUBKEY_LABEL}                                { return SUBKEY_LABEL; }
  {SUBKEY_LOCAL}                                { return SUBKEY_LOCAL; }
  {SUBKEY_MESSAGE}                              { return SUBKEY_MESSAGE; }
  {SUBKEY_NAME}                                 { return SUBKEY_NAME; }
  {SUBKEY_NORMAL}                               { return SUBKEY_NORMAL; }
  {SUBKEY_OFF}                                  { return SUBKEY_OFF; }
  {SUBKEY_ON}                                   { return SUBKEY_ON; }
  {SUBKEY_OUTPUT}                               { return SUBKEY_OUTPUT; }
  {SUBKEY_OVER}                                 { return SUBKEY_OVER; }
  {SUBKEY_REPLACE}                              { return SUBKEY_REPLACE; }
  {SUBKEY_RETURN}                               { return SUBKEY_RETURN; }
  {SUBKEY_SCIENTIFIC}                           { return SUBKEY_SCIENTIFIC; }
  {SUBKEY_STEM}                                 { return SUBKEY_STEM; }
  {SUBKEY_STREAM}                               { return SUBKEY_STREAM; }
  {SUBKEY_STRICT}                               { return SUBKEY_STRICT; }
  {SUBKEY_THEN}                                 { return SUBKEY_THEN; }
  {SUBKEY_TO}                                   { return SUBKEY_TO; }
  {SUBKEY_TRUE}                                 { return SUBKEY_TRUE; }
  {SUBKEY_UNTIL}                                { return SUBKEY_UNTIL; }
  {SUBKEY_USING}                                { return SUBKEY_USING; }
  {SUBKEY_VALUE}                                { return SUBKEY_VALUE; }
  {SUBKEY_WHEN}                                 { return SUBKEY_WHEN; }
  {SUBKEY_WHILE}                                { return SUBKEY_WHILE; }
  {SUBKEY_WITH}                                 { return SUBKEY_WITH; }
  {SUBKEY_CASELESS}                             { return SUBKEY_CASELESS; }
  {SUBKEY_LINEIN}                               { return SUBKEY_LINEIN; }
  {SUBKEY_LOWER}                                { return SUBKEY_LOWER; }
  {SUBKEY_PULL}                                 { return SUBKEY_PULL; }
  {SUBKEY_SOURCE}                               { return SUBKEY_SOURCE; }
  {SUBKEY_UPPER}                                { return SUBKEY_UPPER; }
  {SUBKEY_VAR}                                  { return SUBKEY_VAR; }
  {SUBKEY_VERSION}                              { return SUBKEY_VERSION; }
  {BUILTIN_ABBREV}                              { return BUILTIN_ABBREV; }
  {BUILTIN_ABS}                                 { return BUILTIN_ABS; }
  {BUILTIN_ADDRESS}                             { return BUILTIN_ADDRESS; }
  {BUILTIN_ARG}                                 { return BUILTIN_ARG; }
  {BUILTIN_B2X}                                 { return BUILTIN_B2X; }
  {BUILTIN_BITAND}                              { return BUILTIN_BITAND; }
  {BUILTIN_BITOR}                               { return BUILTIN_BITOR; }
  {BUILTIN_BITXOR}                              { return BUILTIN_BITXOR; }
  {BUILTIN_C2D}                                 { return BUILTIN_C2D; }
  {BUILTIN_C2X}                                 { return BUILTIN_C2X; }
  {BUILTIN_CENTER}                              { return BUILTIN_CENTER; }
  {BUILTIN_CENTRE}                              { return BUILTIN_CENTRE; }
  {BUILTIN_CHANGESTR}                           { return BUILTIN_CHANGESTR; }
  {BUILTIN_CHARIN}                              { return BUILTIN_CHARIN; }
  {BUILTIN_CHAROUT}                             { return BUILTIN_CHAROUT; }
  {BUILTIN_CHARS}                               { return BUILTIN_CHARS; }
  {BUILTIN_COMPARE}                             { return BUILTIN_COMPARE; }
  {BUILTIN_CONDITION}                           { return BUILTIN_CONDITION; }
  {BUILTIN_COPIES}                              { return BUILTIN_COPIES; }
  {BUILTIN_COUNTSTR}                            { return BUILTIN_COUNTSTR; }
  {BUILTIN_D2C}                                 { return BUILTIN_D2C; }
  {BUILTIN_D2X}                                 { return BUILTIN_D2X; }
  {BUILTIN_DATATYPE}                            { return BUILTIN_DATATYPE; }
  {BUILTIN_DATE}                                { return BUILTIN_DATE; }
  {BUILTIN_DELSTR}                              { return BUILTIN_DELSTR; }
  {BUILTIN_DELWORD}                             { return BUILTIN_DELWORD; }
  {BUILTIN_DIGITS}                              { return BUILTIN_DIGITS; }
  {BUILTIN_ERRORTEXT}                           { return BUILTIN_ERRORTEXT; }
  {BUILTIN_FORM}                                { return BUILTIN_FORM; }
  {BUILTIN_FORMAT}                              { return BUILTIN_FORMAT; }
  {BUILTIN_FUZZ}                                { return BUILTIN_FUZZ; }
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
