from [extended_rexx_standard.pdf]
```ebf
program := 
    [label_list] 
    [ncl] 
    [requires+] 
    [prolog_instruction+]
    (class_definition [requires+])+
requires := 'REQUIRES' ( taken_constant | Msg19.8 ) ';'+
prolog_instruction:= (package | import | options) ncl
package := 'PACKAGE'( NAME | Msgnn )
import := 'IMPORT' ( NAME | Msgnn ) ['.']
options := 'OPTIONS' ( symbol+ | Msgnn )
ncl := null_clause+ | Msg21.1
null_clause := ';' [label_list]
label_list := (LABEL ';')+
class_definition := class [property_info] [method_definition+]
class 
    := 'CLASS' ( taken_constant | Msg19.12 )
    [class_option+]
    ['INHERIT' ( taken_constant | Msg19.13 )+]
    ncl
class_option := visibility | modifier | 'BINARY' | 'DEPRECATED'
    | 'EXTENDS' ( NAME | Msgnn )
    | 'USES' ( NAMElist | Msgnn )
    | 'IMPLEMENTS' ( NAMElist | Msgnn )
    | external | metaclass | submix /* | 'PUBLIC' */
external := 'EXTERNAL' (STRING | Msg19.14)
metaclass := 'METACLASS' ( taken_constant | Msg19.15 )
submix := 'MIXINCLASS' ( taken_constant | Msg19.16 )
    | 'SUBCLASS' ( taken_constant | Msg19.17 )
visibility := 'PUBLIC' | 'PRIVATE'
modifier := 'ABSTRACT' | 'FINAL' | 'INTERFACE' | 'ADAPTER'
NAMElist := NAME [(',' ( NAME | Msgnn ) )+]
property_info := numeric | property_assignment | properties | trace
numeric := 'NUMERIC' (numeric_digits | numeric_form | Msg25.15)
numeric_digits:= 'DIGITS' [expression]
numeric_form := 'FORM' ['ENGINEERING' | 'SCIENTIFIC']
property_assignment := NAME | assignment
properties := 'PROPERTIES' ( properties_option+ | Msgnn)
properties_option := properties_visibility | properties_modifier
properties_visibility := 'INHERITABLE' | 'PRIVATE' | 'PUBLIC' | 'INDIRECT'
properties_modifier := 'CONSTANT' | 'STATIC' | 'VOLATILE' | 'TRANSIENT'
trace := 'TRACE' ['ALL' | 'METHODS' | 'OFF' | 'RESULTS']
method_definition := (method [expose ncl]| routine) balanced
expose := 'EXPOSE' variable_list
method := 'METHOD' (taken_constant | Msg19.9)
 [ '(' assigncommalist | Msgnn ( ')' | Msgnn )]
 [method_option+]
 ncl
assigncommalist := assignment [(',' ( assignment | Msgnn ) )+]
method_option := method_visibility | method_modifier | 'PROTECT'
    | 'RETURNS' ( term | Msgnn )
    | 'SIGNAL' ( termcommalist | Msgnn )
    | 'DEPRECATED'
    | 'CLASS' 
    | 'ATTRIBUTE' 
    | /*'PRIVATE' | */ guarded
guarded := 'GUARDED' | 'UNGUARDED'
method_visibility := 'INHERITABLE' | 'PRIVATE' | 'PUBLIC' | 'SHARED'
method_modifier := 'ABSTRACT' | 'CONSTANT' | 'FINAL' | 'NATIVE' | 'STATIC'
termcommalist := term [(',' ( term | Msgnn ) )+]
routine := 'ROUTINE' ( taken_constant | Msg19.11 ) ['PUBLIC'] ncl
balanced:= instruction_list ['END' Msg10.1]
instruction_list:= instruction+

/* The second part is about groups */
instruction := group | single_instruction ncl
group := do ncl | if | loop ncl | select ncl
do := do_specification ncl [instruction+] [group_handler] ('END' [NAME] | Eos Msg14.1 | Msg35.1)
group_option := 'LABEL' ( NAME | Msgnn ) | 'PROTECT' ( term | Msgnn )
group handler := catch | finally | catch finally
catch := 'CATCH' [ NAME '=' ] ( NAME | Msgnn) ncl [instruction+]
 
/* FINALLY implies a semicolon. */
finally := 'FINALLY' ncl ( instruction+ | Msgnn )
if := 'IF' expression [ncl] (then | Msg18.1) [else]
then := 'THEN' ncl (instruction | EOS Msg14.3 | 'END' Msg10.5)
else := 'ELSE' ncl (instruction | EOS Msg14.4 | 'END' Msg10.6)

loop := 'LOOP' [group_option+] [repetitor] [conditional] ncl
 instruction+ [group_handler]
 loop_ending

loop_ending := 'END' [VAR_SYMBOL] | EOS Msg14.n | Msg35.1
conditional := 'WHILE' whileexpr | 'UNTIL' untilexpr
untilexpr := expression
whileexpr := expression
repetitor := assignment [count_option+] | expression | over | 'FOREVER'
count_option := loopt | loopb | loopf
loopt := 'TO' expression
loopb := 'BY' expression
loopf := 'FOR' expression
over
    := VAR_SYMBOL 'OVER' expression
    | NUMBER 'OVER' Msg31.1
    | CONST_SYMBOL 'OVER' (Msg31.2 | Msg31.3)

select := 'SELECT' [group_option+] ncl select_body [group_handler]
 ('END' [NAME Msg10.4] | EOS Msg14.2 | Msg7.2)

select_body := (when | Msg7.1) [when+] [otherwise]
when := 'WHEN' expression [ncl] (then | Msg18.2)
otherwise := 'OTHERWISE' ncl [instruction+]

/* Third part is for single instructions. */
single_instruction
    := assignment
    | message_instruction
    | keyword_instruction
    | command
assignment := VAR_SYMBOL '=' expression
    | NUMBER '=' Msg31.1
    | CONST_SYMBOL '=' (Msg31.2 | Msg31.3)
message_instruction := message_term | message_term '=' expression
keyword_instruction
    := address
    | arg
    | call
    | drop
    | exit
    | interpret
    | iterate
    | leave
    | nop
    | numeric
    | options
    | parse
    | procedure
    | pull
    | push
    | queue
    | raise
    | reply
    | return
    | say
    | signal
    | trace
    | use
    | 'THEN' Msg8.1
    | 'ELSE' Msg8.2
    | 'WHEN' Msg9.1
    | 'OTHERWISE' Msg9.2

command := expression
address := 'ADDRESS' [
        ( taken_constant [expression] | Msg19.1 | valueexp )
        [ 'WITH' connection ]
    ]
taken_constant := symbol | STRING
valueexp := 'VALUE' expression
connection := ad_option+
ad_option := error | input | output | Msg25.5
error := 'ERROR' (resourceo | Msg25.14)
input := 'INPUT' (resourcei | Msg25.6)
resourcei := resources | 'NORMAL'
output := 'OUTPUT' (resourceo | Msg25.7)
resourceo
    := 'APPEND' (resources | Msg25.8)
    | 'REPLACE' (resources | Msg25.9)
    | resources
    | 'NORMAL'
resources
    := 'STREAM' (VAR_SYMBOL | Msg53.1)
    | 'STEM' (VAR_SYMBOL | Msg53.2)
vref := '(' var_symbol (')' | Msg46.1)
var_symbol := VAR_SYMBOL | Msg20.1
arg := 'ARG' [template_list]
call := 'CALL'
    ( callon_spec
    | (taken_constant | vref | Msg19.2) [expression_list]
    )
callon_spec
    := 'ON' (callable_condition | Msg25.1) ['NAME' (symbol_constant_term | Msg19.3)]
    | 'OFF' (callable_condition | Msg25.2)
symbol_constant_term := term
callable_condition
    := 'ANY' | 'ERROR' | 'FAILURE' | 'HALT' | 'NOTREADY'
    | 'USER' ( symbol_constant_term | Msg19.18 )
condition := callable_condition | 'LOSTDIGITS' | 'NOMETHOD' | 'NOSTRING' | 'NOVALUE' | 'SYNTAX'
expression_list := expr | [expr] ',' [expression_list]
do_specification := do_simple | do_repetitive
do_simple := 'DO' [group_option+]
do_repetitive := do_simple 
    ( dorep 
    | conditional 
    | dorep conditional
    )
dorep := 'FOREVER' | repetitor
drop := 'DROP' variable_list
variable_list := (vref | var_symbol)+
exit := 'EXIT' [expression]
forward := 'FORWARD' [forward_option+ | Msg25.18]
forward_option := 'CONTINUE' | ArrayArgOption | MessageOption | ClassOption | ToOption
ArrayArgOption := 'ARRAY' arguments | 'ARGUMENTS' term
MessageOption :='MESSAGE' term
ClassOption := 'CLASS' term
ToOption := 'TO' term
guard
    := 'GUARD' ('ON' | Msg25.22) [('WHEN' | Msg25.21) expression]
    | ( 'OFF' | Msg25.19) [('WHEN' | Msg25.21) expression]
interpret := 'INTERPRET' expression
iterate := 'ITERATE' [VAR_SYMBOL | Msg20.2]
leave := 'LEAVE' [VAR_SYMBOL | Msg20.2]
nop := 'NOP'
numeric := 'NUMERIC' (numeric_digits | numeric_form | numeric_fuzz | Msg25.15)
numeric_digits := 'DIGITS' [expression]
numeric_form := 'FORM' [numeric_form_suffix]
numeric_form_suffix:=('ENGINEERING'|'SCIENTIFIC'|valueexp | Msg25.11)
numeric_fuzz := 'FUZZ' [expression]
options := 'OPTIONS' expression
parse := 'PARSE' [translations] (parse_type | Msg25.12) [template_list]
translations := 'CASELESS' ['UPPER' | 'LOWER'] | ('UPPER' | 'LOWER') ['CASELESS']
parse_type := parse_key | parse_value | parse_var | term
parse_key := 'ARG' | 'PULL' | 'SOURCE' | 'LINEIN' | 'VERSION'
parse_value := 'VALUE' [expression] ('WITH' | Msg38.3)
parse_var := 'VAR' var_symbol
template := NAME [( [pattern] NAME)+]
pattern:= STRING | [indicator] NUMBER | [indicator] '(' symbol ')'
indicator := '+' | '-' | '='
procedure := 'PROCEDURE' [expose | Msg25.17]
pull := 'PULL' [template_list]
push := 'PUSH' [expression]
queue := 'QUEUE' [expression]
raise := 'RAISE' conditions (raise_option | Msg25.24)
conditions
    := 'ANY' | 'ERROR' term | 'FAILURE' term | 'HALT'| 'LOSTDIGITS'
    | 'NOMETHOD' | 'NOSTRING' | 'NOTREADY' | 'NOVALUE' | 'PROPAGATE'
    | 'SYNTAX' term | 'USER' ( symbol_constant_term | Msg19.18) | Msg25.23
raise_option := ExitRetOption | Description | ArrayOption
ExitRetOption := 'EXIT' [term] | 'RETURN' [term]
Description :='DESCRIPTION' term
ArrayOption := 'ADDITIONAL' term | 'ARRAY' arguments
reply := 'REPLY' [ expression]
return := 'RETURN' [expression]
say := 'SAY' [expression]
signal := 'SIGNAL' (signal_spec | valueexp | symbol_constant_term | Msg19.4)
signal_spec
    := 'ON' (condition | Msg25.3) ['NAME' (symbol_constant_term | Msg19.3)]
    | 'OFF' (condition | Msg25.4)
trace := 'TRACE' [(taken_constant | Msg19.6) | valueexp]
use := 'USE' ('ARG' | Msg25.26) [use_list]
use_list := VAR_SYMBOL | [VAR_SYMBOL] ',' [use_list]

/* Note: The next part describes templates. */
template_list := template | [template] ',' [template_list]
template := (trigger | target | Msg38.1)+
target := VAR_SYMBOL | '.'
trigger := pattern | positional
pattern := STRING | vrefp
vrefp := '(' (VAR_SYMBOL | Msg19.7) (')' | Msg46.1)
positional := absolute_positional | relative_positional
absolute_positional:= NUMBER | '=' position
position := NUMBER | vrefp | Msg38.2
relative_positional:= ('+' | '-') position

/* Note: The final part specifies the various forms of symbol, and
expression. */
expression := expr [(',' Msg37.1) | (')' Msg37.2 )]
expr := expr_alias
expr_alias := and_expression | expr_alias or_operator and_expression
or_operator := '|' | '&&'
and_expression := comparison | and_expression '&' comparison
comparison := concatenation | comparison comparison_operator concatenation
comparison_operator:= normal_compare | strict_compare
normal_compare:= '=' | '\=' | '<>' | '><' | '>' | '<' | '>=' | '<=' | '\>' | '\<'
strict_compare:= '==' | '\==' | '>>' | '<<' | '>>=' | '<<=' | '\>>' | '\<<'
concatenation := addition | concatenation (' ' | '||') addition
addition := multiplication | addition additive_operator multiplication
additive_operator:= '+' | '-'
multiplication := power_expression | multiplication multiplicative_operator power_expression
multiplicative_operator:= '*' | '/' | '//' | '%'
power_expression := prefix_expression | power_expression '**' prefix_expression
prefix_expression := ('+' | '-' | '\') prefix_expression | term | Msg35.1

/* "Stub" has to be identified semantically? */
term := simple_term [ '.' ( term | Msgnn )]
simple_term 
    := symbol 
    | STRING 
    | invoke 
    | indexed
    | '(' expression ( ')' | Msg36 )
    | initializer
    | message_term '##'
message_term
    := term ('~' | '~~') method_name [arguments]
    | term '['[ expression_list ] (']' | Msg36.2)
symbol := VAR_SYMBOL | CONST_SYMBOL | NUMBER

method_name := (taken_constant | Msg19.19) [':' ( VAR_SYMBOL | Msg19.21 )]

/* Method-call without arguments is syntactically like symbol. */
/* Editor - not sure of my notes about here. */
invoke := (symbol | STRING) arguments
arguments := '#(' [expression_list] (')' | Msg36)
expression_list := expression | [expression] ',' [expression_list]
indexed := (symbol | STRING) indices
indices := '#[' [expression_list] (']' | Msg36.n)
initializer := '['expression_list (']' | Msg36.n)
```