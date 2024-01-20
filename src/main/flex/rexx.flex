package com.github.neppord.rexxintellijplugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import java.lang.invoke.StringConcatFactory;
import static com.github.neppord.rexxintellijplugin.RexxTokensKt.*;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.intellij.psi.TokenType.BAD_CHARACTER;

%% 
%unicode
%class _RexxLexer
%implements FlexLexer
%function advance
%type IElementType
%caseless

%eof{          
  return;
%eof}

//line_comment = "--" [^"\n"]*

%%


// OPERATORS

"+"            { return OPERATOR_PLUS; }
"-"            { return OPERATOR_SUBTRACT; }
"*"            { return OPERATOR_MULTIPLY; }
"/"            { return OPERATOR_DIVIDE; }
"\\"           { return OPERATOR_INTDIV; }
"%"            { return OPERATOR_REMAINDER; }
"**"           { return OPERATOR_POWER; }
"||"           { return OPERATOR_CONCATENATE; }
"&&"           { return OPERATOR_AND; }
      
"&"            { return OPERATOR_BITWISE_AND; }
"|"            { return OPERATOR_OR; }
"^^"           { return OPERATOR_XOR; }

"="            { return OPERATOR_EQUAL; }
"\\="          { return OPERATOR_BACKSLASH_EQUAL; }
">"            { return OPERATOR_GREATERTHAN; }
"\\>"          { return OPERATOR_BACKSLASH_GREATERTHAN; }
"<"            { return OPERATOR_LESSTHAN; }
"\\<"          { return OPERATOR_BACKSLASH_LESSTHAN; }
">="           { return OPERATOR_GREATERTHAN_EQUAL; }
"=<"           { return OPERATOR_LESSTHAN_EQUAL; }

"=="           { return OPERATOR_STRICT_EQUAL; }
"\\=="         { return OPERATOR_STRICT_BACKSLASH_EQUAL; }
"==>"          { return OPERATOR_STRICT_GREATERTHAN; }
"\\==>"        { return OPERATOR_STRICT_BACKSLASH_GREATERTHAN; }
"==<"          { return OPERATOR_STRICT_LESSTHAN; }
"\\==<"        { return OPERATOR_STRICT_BACKSLASH_LESSTHAN; }
"==>="         { return OPERATOR_STRICT_GREATERTHAN_EQUAL; }
"==<="         { return OPERATOR_STRICT_LESSTHAN_EQUAL; }
"<>"           { return OPERATOR_LESSTHAN_GREATERTHAN; }
"><"           { return OPERATOR_GREATERTHAN_LESSTHAN; }

"\\\\"         { return OPERATOR_BACKSLASH; }
      
// KEYWORDS

// language directive table
"ANNOTATE"       {return DIRECTIVE_ANNOTATE;}
"ATTRIBUTE"      {return DIRECTIVE_ATTRIBUTE;}
"CLASS"          {return DIRECTIVE_CLASS;}
"CONSTANT"       {return DIRECTIVE_CONSTANT;}
"METHOD"         {return DIRECTIVE_METHOD;}
"OPTIONS"        {return DIRECTIVE_OPTIONS;}
"REQUIRES"       {return DIRECTIVE_REQUIRES;}
"RESOURCE"       {return DIRECTIVE_RESOURCE;}
"ROUTINE"        {return DIRECTIVE_ROUTINE;}

// The keyword instruction table
"ADDRESS"        {return KEYWORD_ADDRESS;}
"ARG"            {return KEYWORD_ARG;}
"CALL"           {return KEYWORD_CALL;}
"DO"             {return KEYWORD_DO;}
"DROP"           {return KEYWORD_DROP;}
"ELSE"           {return KEYWORD_ELSE;}
"END"            {return KEYWORD_END;}
"EXIT"           {return KEYWORD_EXIT;}
"EXPOSE"         {return KEYWORD_EXPOSE;}
"FORWARD"        {return KEYWORD_FORWARD;}
"GUARD"          {return KEYWORD_GUARD;}
"IF"             {return KEYWORD_IF;}
"INTERPRET"      {return KEYWORD_INTERPRET;}
"ITERATE"        {return KEYWORD_ITERATE;}
"LEAVE"          {return KEYWORD_LEAVE;}
"LOOP"           {return KEYWORD_LOOP;}
"NOP"            {return KEYWORD_NOP;}
"NUMERIC"        {return KEYWORD_NUMERIC;}
"OPTIONS"        {return KEYWORD_OPTIONS;}
"OTHERWISE"      {return KEYWORD_OTHERWISE;}
"PARSE"          {return KEYWORD_PARSE;}
"PROCEDURE"      {return KEYWORD_PROCEDURE;}
"PULL"           {return KEYWORD_PULL;}
"PUSH"           {return KEYWORD_PUSH;}
"QUEUE"          {return KEYWORD_QUEUE;}
"RAISE"          {return KEYWORD_RAISE;}
"REPLY"          {return KEYWORD_REPLY;}
"RETURN"         {return KEYWORD_RETURN;}
"SAY"            {return KEYWORD_SAY;}
"SELECT"         {return KEYWORD_SELECT;}
"SIGNAL"         {return KEYWORD_SIGNAL;}
"THEN"           {return KEYWORD_THEN;}
"TRACE"          {return KEYWORD_TRACE;}
"USE"            {return KEYWORD_USE;}
"WHEN"           {return KEYWORD_WHEN;}

// instruction subkeyword table
"ADDITIONAL"     {return SUBKEY_ADDITIONAL;}
"APPEND"         {return SUBKEY_APPEND;}
"ARG"            {return SUBKEY_ARG;}
"ARGUMENTS"      {return SUBKEY_ARGUMENTS;}
"ARRAY"          {return SUBKEY_ARRAY;}
"BY"             {return SUBKEY_BY;}
"CASE"           {return SUBKEY_CASE;}
"CLASS"          {return SUBKEY_CLASS;}
"CONTINUE"       {return SUBKEY_CONTINUE;}
"COUNTER"        {return SUBKEY_COUNTER;}
"DESCRIPTION"    {return SUBKEY_DESCRIPTION;}
"DIGITS"         {return SUBKEY_DIGITS;}
"ENGINEERING"    {return SUBKEY_ENGINEERING;}
"ERROR"          {return SUBKEY_ERROR;}
"EXIT"           {return SUBKEY_EXIT;}
"EXPOSE"         {return SUBKEY_EXPOSE;}
"FALSE"          {return SUBKEY_FALSE;}
"FOR"            {return SUBKEY_FOR;}
"FOREVER"        {return SUBKEY_FOREVER;}
"FORM"           {return SUBKEY_FORM;}
"FUZZ"           {return SUBKEY_FUZZ;}
"INDEX"          {return SUBKEY_INDEX;}
"INPUT"          {return SUBKEY_INPUT;}
"ITEM"           {return SUBKEY_ITEM;}
"LABEL"          {return SUBKEY_LABEL;}
"LOCAL"          {return SUBKEY_LOCAL;}
"MESSAGE"        {return SUBKEY_MESSAGE;}
"NAME"           {return SUBKEY_NAME;}
"NORMAL"         {return SUBKEY_NORMAL;}
"OFF"            {return SUBKEY_OFF;}
"ON"             {return SUBKEY_ON;}
"OUTPUT"         {return SUBKEY_OUTPUT;}
"OVER"           {return SUBKEY_OVER;}
"REPLACE"        {return SUBKEY_REPLACE;}
"RETURN"         {return SUBKEY_RETURN;}
"SCIENTIFIC"     {return SUBKEY_SCIENTIFIC;}
"STEM"           {return SUBKEY_STEM;}
"STREAM"         {return SUBKEY_STREAM;}
"STRICT"         {return SUBKEY_STRICT;}
"THEN"           {return SUBKEY_THEN;}
"TO"             {return SUBKEY_TO;}
"TRUE"           {return SUBKEY_TRUE;}
"UNTIL"          {return SUBKEY_UNTIL;}
"USING"          {return SUBKEY_USING;}
"VALUE"          {return SUBKEY_VALUE;}
"WHEN"           {return SUBKEY_WHEN;}
"WHILE"          {return SUBKEY_WHILE;}
"WITH"           {return SUBKEY_WITH;}
      
// parse option subkeywords
"CASELESS"       {return SUBKEY_CASELESS;}
"LINEIN"         {return SUBKEY_LINEIN;}
"LOWER"          {return SUBKEY_LOWER;}
"PULL"           {return SUBKEY_PULL;}
"SOURCE"         {return SUBKEY_SOURCE;}
"UPPER"          {return SUBKEY_UPPER;}
"VAR"            {return SUBKEY_VAR;}
"VERSION"        {return SUBKEY_VERSION;}

// table of builtin functions
"ABBREV"         {return BUILTIN_ABBREV;}
"ABS"            {return BUILTIN_ABS;}
"ADDRESS"        {return BUILTIN_ADDRESS;}
"ARG"            {return BUILTIN_ARG;}
"B2X"            {return BUILTIN_B2X;}
"BITAND"         {return BUILTIN_BITAND;}
"BITOR"          {return BUILTIN_BITOR;}
"BITXOR"         {return BUILTIN_BITXOR;}
"C2D"            {return BUILTIN_C2D;}
"C2X"            {return BUILTIN_C2X;}
"CENTER"         {return BUILTIN_CENTER;}
"CENTRE"         {return BUILTIN_CENTRE;}
"CHANGESTR"      {return BUILTIN_CHANGESTR;}
"CHARIN"         {return BUILTIN_CHARIN;}
"CHAROUT"        {return BUILTIN_CHAROUT;}
"CHARS"          {return BUILTIN_CHARS;}
"COMPARE"        {return BUILTIN_COMPARE;}
"CONDITION"      {return BUILTIN_CONDITION;}
"COPIES"         {return BUILTIN_COPIES;}
"COUNTSTR"       {return BUILTIN_COUNTSTR;}
"D2C"            {return BUILTIN_D2C;}
"D2X"            {return BUILTIN_D2X;}
"DATATYPE"       {return BUILTIN_DATATYPE;}
"DATE"           {return BUILTIN_DATE;}
"DELSTR"         {return BUILTIN_DELSTR;}
"DELWORD"        {return BUILTIN_DELWORD;}
"DIGITS"         {return BUILTIN_DIGITS;}
"ENDLOCAL"       {return BUILTIN_ENDLOCAL;}
"ERRORTEXT"      {return BUILTIN_ERRORTEXT;}
"FORM"           {return BUILTIN_FORM;}
"FORMAT"         {return BUILTIN_FORMAT;}
"FUZZ"           {return BUILTIN_FUZZ;}
"INSERT"         {return BUILTIN_INSERT;}
"LASTPOS"        {return BUILTIN_LASTPOS;}
"LEFT"           {return BUILTIN_LEFT;}
"LENGTH"         {return BUILTIN_LENGTH;}
"LINEIN"         {return BUILTIN_LINEIN;}
"LINEOUT"        {return BUILTIN_LINEOUT;}
"LINES"          {return BUILTIN_LINES;}
"LOWER"          {return BUILTIN_LOWER;}
"MAX"            {return BUILTIN_MAX;}
"MIN"            {return BUILTIN_MIN;}
"OVERLAY"        {return BUILTIN_OVERLAY;}
"POS"            {return BUILTIN_POS;}
"QUALIFY"        {return BUILTIN_QUALIFY;}
"QUEUED"         {return BUILTIN_QUEUED;}
"RANDOM"         {return BUILTIN_RANDOM;}
"REVERSE"        {return BUILTIN_REVERSE;}
"RIGHT"          {return BUILTIN_RIGHT;}
"RXFUNCADD"      {return BUILTIN_RXFUNCADD;}
"RXFUNCDROP"     {return BUILTIN_RXFUNCDROP;}
"RXFUNCQUERY"    {return BUILTIN_RXFUNCQUERY;}
"RXQUEUE"        {return BUILTIN_RXQUEUE;}
"SETLOCAL"       {return BUILTIN_SETLOCAL;}
"SIGN"           {return BUILTIN_SIGN;}
"SOURCELINE"     {return BUILTIN_SOURCELINE;}
"SPACE"          {return BUILTIN_SPACE;}
"STREAM"         {return BUILTIN_STREAM;}
"STRIP"          {return BUILTIN_STRIP;}
"SUBSTR"         {return BUILTIN_SUBSTR;}
"SUBWORD"        {return BUILTIN_SUBWORD;}
"SYMBOL"         {return BUILTIN_SYMBOL;}
"TIME"           {return BUILTIN_TIME;}
"TRACE"          {return BUILTIN_TRACE;}
"TRANSLATE"      {return BUILTIN_TRANSLATE;}
"TRUNC"          {return BUILTIN_TRUNC;}
"UPPER"          {return BUILTIN_UPPER;}
"USERID"         {return BUILTIN_USERID;}
"VALUE"          {return BUILTIN_VALUE;}
"VAR"            {return BUILTIN_VAR;}
"VERIFY"         {return BUILTIN_VERIFY;}
"WORD"           {return BUILTIN_WORD;}
"WORDINDEX"      {return BUILTIN_WORDINDEX;}
"WORDLENGTH"     {return BUILTIN_WORDLENGTH;}
"WORDPOS"        {return BUILTIN_WORDPOS;}
"WORDS"          {return BUILTIN_WORDS;}
"X2B"            {return BUILTIN_X2B;}
"X2C"            {return BUILTIN_X2C;}
"X2D"            {return BUILTIN_X2D;}
"XRANGE"         {return BUILTIN_XRANGE;}

// Condition name table
"ANY"            {return CONDITION_ANY;}
"ERROR"          {return CONDITION_ERROR;}
"FAILURE"        {return CONDITION_FAILURE;}
"HALT"           {return CONDITION_HALT;}
"LOSTDIGITS"     {return CONDITION_LOSTDIGITS;}
"NOMETHOD"       {return CONDITION_NOMETHOD;}
"NOSTRING"       {return CONDITION_NOSTRING;}
"NOTREADY"       {return CONDITION_NOTREADY;}
"NOVALUE"        {return CONDITION_NOVALUE;}
"PROPAGATE"      {return CONDITION_PROPAGATE;}
"SYNTAX"         {return CONDITION_SYNTAX;}
"USER"           {return CONDITION_USER;}


// subkeywords on directive instructions
"ABSTRACT"       {return SUBDIRECTIVE_ABSTRACT;}
"ALL"            {return SUBDIRECTIVE_ALL;}
"ATTRIBUTE"      {return SUBDIRECTIVE_ATTRIBUTE;}
"CLASS"          {return SUBDIRECTIVE_CLASS;}
"CONDITION"      {return SUBDIRECTIVE_CONDITION;}
"CONSTANT"       {return SUBDIRECTIVE_CONSTANT;}
"DELEGATE"       {return SUBDIRECTIVE_DELEGATE;}
"DIGITS"         {return SUBDIRECTIVE_DIGITS;}
"END"            {return SUBDIRECTIVE_END;}
"ERROR"          {return SUBDIRECTIVE_ERROR;}
"EXTERNAL"       {return SUBDIRECTIVE_EXTERNAL;}
"FAILURE"        {return SUBDIRECTIVE_FAILURE;}
"FORM"           {return SUBDIRECTIVE_FORM;}
"FUZZ"           {return SUBDIRECTIVE_FUZZ;}
"GET"            {return SUBDIRECTIVE_GET;}
"GUARDED"        {return SUBDIRECTIVE_GUARDED;}
"INHERIT"        {return SUBDIRECTIVE_INHERIT;}
"LIBRARY"        {return SUBDIRECTIVE_LIBRARY;}
"LOSTDIGITS"     {return SUBDIRECTIVE_LOSTDIGITS;}
"METACLASS"      {return SUBDIRECTIVE_METACLASS;}
"METHOD"         {return SUBDIRECTIVE_METHOD;}
"MIXINCLASS"     {return SUBDIRECTIVE_MIXINCLASS;}
"NAMESPACE"      {return SUBDIRECTIVE_NAMESPACE;}
"NOPROLOG"       {return SUBDIRECTIVE_NOPROLOG;}
"NOSTRING"       {return SUBDIRECTIVE_NOSTRING;}
"NOTREADY"       {return SUBDIRECTIVE_NOTREADY;}
"NOVALUE"        {return SUBDIRECTIVE_NOVALUE;}
"PACKAGE"        {return SUBDIRECTIVE_PACKAGE;}
"PRIVATE"        {return SUBDIRECTIVE_PRIVATE;}
"PROLOG"         {return SUBDIRECTIVE_PROLOG;}
"PROTECTED"      {return SUBDIRECTIVE_PROTECTED;}
"PUBLIC"         {return SUBDIRECTIVE_PUBLIC;}
"ROUTINE"        {return SUBDIRECTIVE_ROUTINE;}
"SET"            {return SUBDIRECTIVE_SET;}
"SUBCLASS"       {return SUBDIRECTIVE_SUBCLASS;}
"SYNTAX"         {return SUBDIRECTIVE_SYNTAX;}
"TRACE"          {return SUBDIRECTIVE_TRACE;}
"UNGUARDED"      {return SUBDIRECTIVE_UNGUARDED;}
"UNPROTECTED"    {return SUBDIRECTIVE_UNPROTECTED;}


// Comments
"#!"[^\n]*       { return SHEBANG; }
"--"[^\n]* { return LINE_COMMENT; }
"/*"[^*]*"*"+(("/"[^*]*"*"+)*"/") { return MULTILINE_COMMENT; }

// complex

[ \t\f\r\n]+          { return WHITE_SPACE; }
"\"" [^"\\\n"]*? "\"" { return STRING;}
'[^']*' { return STRING;}
[a-zA-Z][a-zA-Z0-9._]* {return IDENTIFIER;}
"0b" [01]+ {return NUMBER_BINARY;}
[0-9]+  {return NUMBER_INT;}
[0-9]*"."?[0-9]+  {return NUMBER_DECIMAL;}
[0-9]*\.[0-9]+([eE][+-]?[0-9]+) { return NUMBER_SCIENTIFIC; }
0[xX][0-9a-fA-F]+ { return NUMBER_HEXADECIMAL; }

// OO

"::class"               { return KEYWORD_CLASS; }
"::attribute"           { return KEYWORD_ATTRIBUTE; }
"::method"              { return KEYWORD_METHOD; }
"."                     { return DOT; }
"~"                     { return TILDE; }