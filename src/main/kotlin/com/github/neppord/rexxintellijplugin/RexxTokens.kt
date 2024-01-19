package com.github.neppord.rexxintellijplugin

import com.intellij.psi.tree.TokenSet


@JvmField val OPERATOR_PLUS = RexxElementType("OPERATOR_PLUS")
@JvmField val OPERATOR_SUBTRACT = RexxElementType("OPERATOR_SUBTRACT")
@JvmField val OPERATOR_MULTIPLY = RexxElementType("OPERATOR_MULTIPLY")
@JvmField val OPERATOR_DIVIDE = RexxElementType("OPERATOR_DIVIDE")
@JvmField val OPERATOR_INTDIV = RexxElementType("OPERATOR_INTDIV")
@JvmField val OPERATOR_REMAINDER = RexxElementType("OPERATOR_REMAINDER")
@JvmField val OPERATOR_POWER = RexxElementType("OPERATOR_POWER")
@JvmField val OPERATOR_CONCATENATE = RexxElementType("OPERATOR_CONCATENATE")
@JvmField val OPERATOR_AND = RexxElementType("OPERATOR_AND")
      
@JvmField val OPERATOR_BITWISE_AND = RexxElementType("OPERATOR_BITWISE_AND")
@JvmField val OPERATOR_OR = RexxElementType("OPERATOR_OR")
@JvmField val OPERATOR_XOR = RexxElementType("OPERATOR_XOR")

@JvmField val OPERATOR_EQUAL = RexxElementType("OPERATOR_EQUAL")
@JvmField val OPERATOR_BACKSLASH_EQUAL = RexxElementType("OPERATOR_BACKSLASH_EQUAL")
@JvmField val OPERATOR_GREATERTHAN = RexxElementType("OPERATOR_GREATERTHAN")
@JvmField val OPERATOR_BACKSLASH_GREATERTHAN = RexxElementType("OPERATOR_BACKSLASH_GREATERTHAN")
@JvmField val OPERATOR_LESSTHAN = RexxElementType("OPERATOR_LESSTHAN")
@JvmField val OPERATOR_BACKSLASH_LESSTHAN = RexxElementType("OPERATOR_BACKSLASH_LESSTHAN")
@JvmField val OPERATOR_GREATERTHAN_EQUAL = RexxElementType("OPERATOR_GREATERTHAN_EQUAL")
@JvmField val OPERATOR_LESSTHAN_EQUAL = RexxElementType("OPERATOR_LESSTHAN_EQUAL")

@JvmField val OPERATOR_STRICT_EQUAL = RexxElementType("OPERATOR_STRICT_EQUAL")
@JvmField val OPERATOR_STRICT_BACKSLASH_EQUAL = RexxElementType("OPERATOR_STRICT_BACKSLASH_EQUAL")
@JvmField val OPERATOR_STRICT_GREATERTHAN = RexxElementType("OPERATOR_STRICT_GREATERTHAN")
@JvmField val OPERATOR_STRICT_BACKSLASH_GREATERTHAN = RexxElementType("OPERATOR_STRICT_BACKSLASH_GREATERTHAN")
@JvmField val OPERATOR_STRICT_LESSTHAN = RexxElementType("OPERATOR_STRICT_LESSTHAN")
@JvmField val OPERATOR_STRICT_BACKSLASH_LESSTHAN = RexxElementType("OPERATOR_STRICT_BACKSLASH_LESSTHAN")
@JvmField val OPERATOR_STRICT_GREATERTHAN_EQUAL = RexxElementType("OPERATOR_STRICT_GREATERTHAN_EQUAL")
@JvmField val OPERATOR_STRICT_LESSTHAN_EQUAL = RexxElementType("OPERATOR_STRICT_LESSTHAN_EQUAL")
@JvmField val OPERATOR_LESSTHAN_GREATERTHAN = RexxElementType("OPERATOR_LESSTHAN_GREATERTHAN")
@JvmField val OPERATOR_GREATERTHAN_LESSTHAN = RexxElementType("OPERATOR_GREATERTHAN_LESSTHAN")

@JvmField val OPERATOR_BACKSLASH = RexxElementType("OPERATOR_BACKSLASH")

val operator = TokenSet.create(
    OPERATOR_PLUS,
        OPERATOR_SUBTRACT,
        OPERATOR_MULTIPLY,
        OPERATOR_DIVIDE,
        OPERATOR_INTDIV,
        OPERATOR_REMAINDER,
        OPERATOR_POWER,
        OPERATOR_CONCATENATE,
        OPERATOR_AND,
        OPERATOR_BITWISE_AND,
        OPERATOR_OR,
        OPERATOR_XOR,
        OPERATOR_EQUAL,
        OPERATOR_BACKSLASH_EQUAL,
        OPERATOR_GREATERTHAN,
        OPERATOR_BACKSLASH_GREATERTHAN,
        OPERATOR_LESSTHAN,
        OPERATOR_BACKSLASH_LESSTHAN,
        OPERATOR_GREATERTHAN_EQUAL,
        OPERATOR_LESSTHAN_EQUAL,
        OPERATOR_STRICT_EQUAL,
        OPERATOR_STRICT_BACKSLASH_EQUAL,
        OPERATOR_STRICT_GREATERTHAN,
        OPERATOR_STRICT_BACKSLASH_GREATERTHAN,
        OPERATOR_STRICT_LESSTHAN,
        OPERATOR_STRICT_BACKSLASH_LESSTHAN,
        OPERATOR_STRICT_GREATERTHAN_EQUAL,
        OPERATOR_STRICT_LESSTHAN_EQUAL,
        OPERATOR_LESSTHAN_GREATERTHAN,
        OPERATOR_GREATERTHAN_LESSTHAN,
        OPERATOR_BACKSLASH,
)

// KEYWORDS

// language directive table
@JvmField val DIRECTIVE_ANNOTATE = RexxElementType("DIRECTIVE_ANNOTATE")
@JvmField val DIRECTIVE_ATTRIBUTE = RexxElementType("DIRECTIVE_ATTRIBUTE")
@JvmField val DIRECTIVE_CLASS = RexxElementType("DIRECTIVE_CLASS")
@JvmField val DIRECTIVE_CONSTANT = RexxElementType("DIRECTIVE_CONSTANT")
@JvmField val DIRECTIVE_METHOD = RexxElementType("DIRECTIVE_METHOD")
@JvmField val DIRECTIVE_OPTIONS = RexxElementType("DIRECTIVE_OPTIONS")
@JvmField val DIRECTIVE_REQUIRES = RexxElementType("DIRECTIVE_REQUIRES")
@JvmField val DIRECTIVE_RESOURCE = RexxElementType("DIRECTIVE_RESOURCE")
@JvmField val DIRECTIVE_ROUTINE = RexxElementType("DIRECTIVE_ROUTINE")

// The keyword instruction table
@JvmField val KEYWORD_ADDRESS = RexxElementType("KEYWORD_ADDRESS")
@JvmField val KEYWORD_ARG = RexxElementType("KEYWORD_ARG")
@JvmField val KEYWORD_CALL = RexxElementType("KEYWORD_CALL")
@JvmField val KEYWORD_DO = RexxElementType("KEYWORD_DO")
@JvmField val KEYWORD_DROP = RexxElementType("KEYWORD_DROP")
@JvmField val KEYWORD_ELSE = RexxElementType("KEYWORD_ELSE")
@JvmField val KEYWORD_END = RexxElementType("KEYWORD_END")
@JvmField val KEYWORD_EXIT = RexxElementType("KEYWORD_EXIT")
@JvmField val KEYWORD_EXPOSE = RexxElementType("KEYWORD_EXPOSE")
@JvmField val KEYWORD_FORWARD = RexxElementType("KEYWORD_FORWARD")
@JvmField val KEYWORD_GUARD = RexxElementType("KEYWORD_GUARD")
@JvmField val KEYWORD_IF = RexxElementType("KEYWORD_IF")
@JvmField val KEYWORD_INTERPRET = RexxElementType("KEYWORD_INTERPRET")
@JvmField val KEYWORD_ITERATE = RexxElementType("KEYWORD_ITERATE")
@JvmField val KEYWORD_LEAVE = RexxElementType("KEYWORD_LEAVE")
@JvmField val KEYWORD_LOOP = RexxElementType("KEYWORD_LOOP")
@JvmField val KEYWORD_NOP = RexxElementType("KEYWORD_NOP")
@JvmField val KEYWORD_NUMERIC = RexxElementType("KEYWORD_NUMERIC")
@JvmField val KEYWORD_OPTIONS = RexxElementType("KEYWORD_OPTIONS")
@JvmField val KEYWORD_OTHERWISE = RexxElementType("KEYWORD_OTHERWISE")
@JvmField val KEYWORD_PARSE = RexxElementType("KEYWORD_PARSE")
@JvmField val KEYWORD_PROCEDURE = RexxElementType("KEYWORD_PROCEDURE")
@JvmField val KEYWORD_PULL = RexxElementType("KEYWORD_PULL")
@JvmField val KEYWORD_PUSH = RexxElementType("KEYWORD_PUSH")
@JvmField val KEYWORD_QUEUE = RexxElementType("KEYWORD_QUEUE")
@JvmField val KEYWORD_RAISE = RexxElementType("KEYWORD_RAISE")
@JvmField val KEYWORD_REPLY = RexxElementType("KEYWORD_REPLY")
@JvmField val KEYWORD_RETURN = RexxElementType("KEYWORD_RETURN")
@JvmField val KEYWORD_SAY = RexxElementType("KEYWORD_SAY")
@JvmField val KEYWORD_SELECT = RexxElementType("KEYWORD_SELECT")
@JvmField val KEYWORD_SIGNAL = RexxElementType("KEYWORD_SIGNAL")
@JvmField val KEYWORD_THEN = RexxElementType("KEYWORD_THEN")
@JvmField val KEYWORD_TRACE = RexxElementType("KEYWORD_TRACE")
@JvmField val KEYWORD_USE = RexxElementType("KEYWORD_USE")
@JvmField val KEYWORD_WHEN = RexxElementType("KEYWORD_WHEN")

// instruction subkeyword table
@JvmField val SUBKEY_ADDITIONAL = RexxElementType("SUBKEY_ADDITIONAL")
@JvmField val SUBKEY_APPEND = RexxElementType("SUBKEY_APPEND")
@JvmField val SUBKEY_ARG = RexxElementType("SUBKEY_ARG")
@JvmField val SUBKEY_ARGUMENTS = RexxElementType("SUBKEY_ARGUMENTS")
@JvmField val SUBKEY_ARRAY = RexxElementType("SUBKEY_ARRAY")
@JvmField val SUBKEY_BY = RexxElementType("SUBKEY_BY")
@JvmField val SUBKEY_CASE = RexxElementType("SUBKEY_CASE")
@JvmField val SUBKEY_CLASS = RexxElementType("SUBKEY_CLASS")
@JvmField val SUBKEY_CONTINUE = RexxElementType("SUBKEY_CONTINUE")
@JvmField val SUBKEY_COUNTER = RexxElementType("SUBKEY_COUNTER")
@JvmField val SUBKEY_DESCRIPTION = RexxElementType("SUBKEY_DESCRIPTION")
@JvmField val SUBKEY_DIGITS = RexxElementType("SUBKEY_DIGITS")
@JvmField val SUBKEY_ENGINEERING = RexxElementType("SUBKEY_ENGINEERING")
@JvmField val SUBKEY_ERROR = RexxElementType("SUBKEY_ERROR")
@JvmField val SUBKEY_EXIT = RexxElementType("SUBKEY_EXIT")
@JvmField val SUBKEY_EXPOSE = RexxElementType("SUBKEY_EXPOSE")
@JvmField val SUBKEY_FALSE = RexxElementType("SUBKEY_FALSE")
@JvmField val SUBKEY_FOR = RexxElementType("SUBKEY_FOR")
@JvmField val SUBKEY_FOREVER = RexxElementType("SUBKEY_FOREVER")
@JvmField val SUBKEY_FORM = RexxElementType("SUBKEY_FORM")
@JvmField val SUBKEY_FUZZ = RexxElementType("SUBKEY_FUZZ")
@JvmField val SUBKEY_INDEX = RexxElementType("SUBKEY_INDEX")
@JvmField val SUBKEY_INPUT = RexxElementType("SUBKEY_INPUT")
@JvmField val SUBKEY_ITEM = RexxElementType("SUBKEY_ITEM")
@JvmField val SUBKEY_LABEL = RexxElementType("SUBKEY_LABEL")
@JvmField val SUBKEY_LOCAL = RexxElementType("SUBKEY_LOCAL")
@JvmField val SUBKEY_MESSAGE = RexxElementType("SUBKEY_MESSAGE")
@JvmField val SUBKEY_NAME = RexxElementType("SUBKEY_NAME")
@JvmField val SUBKEY_NORMAL = RexxElementType("SUBKEY_NORMAL")
@JvmField val SUBKEY_OFF = RexxElementType("SUBKEY_OFF")
@JvmField val SUBKEY_ON = RexxElementType("SUBKEY_ON")
@JvmField val SUBKEY_OUTPUT = RexxElementType("SUBKEY_OUTPUT")
@JvmField val SUBKEY_OVER = RexxElementType("SUBKEY_OVER")
@JvmField val SUBKEY_REPLACE = RexxElementType("SUBKEY_REPLACE")
@JvmField val SUBKEY_RETURN = RexxElementType("SUBKEY_RETURN")
@JvmField val SUBKEY_SCIENTIFIC = RexxElementType("SUBKEY_SCIENTIFIC")
@JvmField val SUBKEY_STEM = RexxElementType("SUBKEY_STEM")
@JvmField val SUBKEY_STREAM = RexxElementType("SUBKEY_STREAM")
@JvmField val SUBKEY_STRICT = RexxElementType("SUBKEY_STRICT")
@JvmField val SUBKEY_THEN = RexxElementType("SUBKEY_THEN")
@JvmField val SUBKEY_TO = RexxElementType("SUBKEY_TO")
@JvmField val SUBKEY_TRUE = RexxElementType("SUBKEY_TRUE")
@JvmField val SUBKEY_UNTIL = RexxElementType("SUBKEY_UNTIL")
@JvmField val SUBKEY_USING = RexxElementType("SUBKEY_USING")
@JvmField val SUBKEY_VALUE = RexxElementType("SUBKEY_VALUE")
@JvmField val SUBKEY_WHEN = RexxElementType("SUBKEY_WHEN")
@JvmField val SUBKEY_WHILE = RexxElementType("SUBKEY_WHILE")
@JvmField val SUBKEY_WITH = RexxElementType("SUBKEY_WITH")

// parse option subkeywords
@JvmField val SUBKEY_CASELESS = RexxElementType("SUBKEY_CASELESS")
@JvmField val SUBKEY_LINEIN = RexxElementType("SUBKEY_LINEIN")
@JvmField val SUBKEY_LOWER = RexxElementType("SUBKEY_LOWER")
@JvmField val SUBKEY_PULL = RexxElementType("SUBKEY_PULL")
@JvmField val SUBKEY_SOURCE = RexxElementType("SUBKEY_SOURCE")
@JvmField val SUBKEY_UPPER = RexxElementType("SUBKEY_UPPER")
@JvmField val SUBKEY_VAR = RexxElementType("SUBKEY_VAR")
@JvmField val SUBKEY_VERSION = RexxElementType("SUBKEY_VERSION")

// table of builtin functions
@JvmField val BUILTIN_ABBREV = RexxElementType("BUILTIN_ABBREV")
@JvmField val BUILTIN_ABS = RexxElementType("BUILTIN_ABS")
@JvmField val BUILTIN_ADDRESS = RexxElementType("BUILTIN_ADDRESS")
@JvmField val BUILTIN_ARG = RexxElementType("BUILTIN_ARG")
@JvmField val BUILTIN_B2X = RexxElementType("BUILTIN_B2X")
@JvmField val BUILTIN_BITAND = RexxElementType("BUILTIN_BITAND")
@JvmField val BUILTIN_BITOR = RexxElementType("BUILTIN_BITOR")
@JvmField val BUILTIN_BITXOR = RexxElementType("BUILTIN_BITXOR")
@JvmField val BUILTIN_C2D = RexxElementType("BUILTIN_C2D")
@JvmField val BUILTIN_C2X = RexxElementType("BUILTIN_C2X")
@JvmField val BUILTIN_CENTER = RexxElementType("BUILTIN_CENTER")
@JvmField val BUILTIN_CENTRE = RexxElementType("BUILTIN_CENTRE")
@JvmField val BUILTIN_CHANGESTR = RexxElementType("BUILTIN_CHANGESTR")
@JvmField val BUILTIN_CHARIN = RexxElementType("BUILTIN_CHARIN")
@JvmField val BUILTIN_CHAROUT = RexxElementType("BUILTIN_CHAROUT")
@JvmField val BUILTIN_CHARS = RexxElementType("BUILTIN_CHARS")
@JvmField val BUILTIN_COMPARE = RexxElementType("BUILTIN_COMPARE")
@JvmField val BUILTIN_CONDITION = RexxElementType("BUILTIN_CONDITION")
@JvmField val BUILTIN_COPIES = RexxElementType("BUILTIN_COPIES")
@JvmField val BUILTIN_COUNTSTR = RexxElementType("BUILTIN_COUNTSTR")
@JvmField val BUILTIN_D2C = RexxElementType("BUILTIN_D2C")
@JvmField val BUILTIN_D2X = RexxElementType("BUILTIN_D2X")
@JvmField val BUILTIN_DATATYPE = RexxElementType("BUILTIN_DATATYPE")
@JvmField val BUILTIN_DATE = RexxElementType("BUILTIN_DATE")
@JvmField val BUILTIN_DELSTR = RexxElementType("BUILTIN_DELSTR")
@JvmField val BUILTIN_DELWORD = RexxElementType("BUILTIN_DELWORD")
@JvmField val BUILTIN_DIGITS = RexxElementType("BUILTIN_DIGITS")
@JvmField val BUILTIN_ENDLOCAL = RexxElementType("BUILTIN_ENDLOCAL")
@JvmField val BUILTIN_ERRORTEXT = RexxElementType("BUILTIN_ERRORTEXT")
@JvmField val BUILTIN_FORM = RexxElementType("BUILTIN_FORM")
@JvmField val BUILTIN_FORMAT = RexxElementType("BUILTIN_FORMAT")
@JvmField val BUILTIN_FUZZ = RexxElementType("BUILTIN_FUZZ")
@JvmField val BUILTIN_INSERT = RexxElementType("BUILTIN_INSERT")
@JvmField val BUILTIN_LASTPOS = RexxElementType("BUILTIN_LASTPOS")
@JvmField val BUILTIN_LEFT = RexxElementType("BUILTIN_LEFT")
@JvmField val BUILTIN_LENGTH = RexxElementType("BUILTIN_LENGTH")
@JvmField val BUILTIN_LINEIN = RexxElementType("BUILTIN_LINEIN")
@JvmField val BUILTIN_LINEOUT = RexxElementType("BUILTIN_LINEOUT")
@JvmField val BUILTIN_LINES = RexxElementType("BUILTIN_LINES")
@JvmField val BUILTIN_LOWER = RexxElementType("BUILTIN_LOWER")
@JvmField val BUILTIN_MAX = RexxElementType("BUILTIN_MAX")
@JvmField val BUILTIN_MIN = RexxElementType("BUILTIN_MIN")
@JvmField val BUILTIN_OVERLAY = RexxElementType("BUILTIN_OVERLAY")
@JvmField val BUILTIN_POS = RexxElementType("BUILTIN_POS")
@JvmField val BUILTIN_QUALIFY = RexxElementType("BUILTIN_QUALIFY")
@JvmField val BUILTIN_QUEUED = RexxElementType("BUILTIN_QUEUED")
@JvmField val BUILTIN_RANDOM = RexxElementType("BUILTIN_RANDOM")
@JvmField val BUILTIN_REVERSE = RexxElementType("BUILTIN_REVERSE")
@JvmField val BUILTIN_RIGHT = RexxElementType("BUILTIN_RIGHT")
@JvmField val BUILTIN_RXFUNCADD = RexxElementType("BUILTIN_RXFUNCADD")
@JvmField val BUILTIN_RXFUNCDROP = RexxElementType("BUILTIN_RXFUNCDROP")
@JvmField val BUILTIN_RXFUNCQUERY = RexxElementType("BUILTIN_RXFUNCQUERY")
@JvmField val BUILTIN_RXQUEUE = RexxElementType("BUILTIN_RXQUEUE")
@JvmField val BUILTIN_SETLOCAL = RexxElementType("BUILTIN_SETLOCAL")
@JvmField val BUILTIN_SIGN = RexxElementType("BUILTIN_SIGN")
@JvmField val BUILTIN_SOURCELINE = RexxElementType("BUILTIN_SOURCELINE")
@JvmField val BUILTIN_SPACE = RexxElementType("BUILTIN_SPACE")
@JvmField val BUILTIN_STREAM = RexxElementType("BUILTIN_STREAM")
@JvmField val BUILTIN_STRIP = RexxElementType("BUILTIN_STRIP")
@JvmField val BUILTIN_SUBSTR = RexxElementType("BUILTIN_SUBSTR")
@JvmField val BUILTIN_SUBWORD = RexxElementType("BUILTIN_SUBWORD")
@JvmField val BUILTIN_SYMBOL = RexxElementType("BUILTIN_SYMBOL")
@JvmField val BUILTIN_TIME = RexxElementType("BUILTIN_TIME")
@JvmField val BUILTIN_TRACE = RexxElementType("BUILTIN_TRACE")
@JvmField val BUILTIN_TRANSLATE = RexxElementType("BUILTIN_TRANSLATE")
@JvmField val BUILTIN_TRUNC = RexxElementType("BUILTIN_TRUNC")
@JvmField val BUILTIN_UPPER = RexxElementType("BUILTIN_UPPER")
@JvmField val BUILTIN_USERID = RexxElementType("BUILTIN_USERID")
@JvmField val BUILTIN_VALUE = RexxElementType("BUILTIN_VALUE")
@JvmField val BUILTIN_VAR = RexxElementType("BUILTIN_VAR")
@JvmField val BUILTIN_VERIFY = RexxElementType("BUILTIN_VERIFY")
@JvmField val BUILTIN_WORD = RexxElementType("BUILTIN_WORD")
@JvmField val BUILTIN_WORDINDEX = RexxElementType("BUILTIN_WORDINDEX")
@JvmField val BUILTIN_WORDLENGTH = RexxElementType("BUILTIN_WORDLENGTH")
@JvmField val BUILTIN_WORDPOS = RexxElementType("BUILTIN_WORDPOS")
@JvmField val BUILTIN_WORDS = RexxElementType("BUILTIN_WORDS")
@JvmField val BUILTIN_X2B = RexxElementType("BUILTIN_X2B")
@JvmField val BUILTIN_X2C = RexxElementType("BUILTIN_X2C")
@JvmField val BUILTIN_X2D = RexxElementType("BUILTIN_X2D")
@JvmField val BUILTIN_XRANGE = RexxElementType("BUILTIN_XRANGE")

// Condition name table
@JvmField val CONDITION_ANY = RexxElementType("CONDITION_ANY")
@JvmField val CONDITION_ERROR = RexxElementType("CONDITION_ERROR")
@JvmField val CONDITION_FAILURE = RexxElementType("CONDITION_FAILURE")
@JvmField val CONDITION_HALT = RexxElementType("CONDITION_HALT")
@JvmField val CONDITION_LOSTDIGITS = RexxElementType("CONDITION_LOSTDIGITS")
@JvmField val CONDITION_NOMETHOD = RexxElementType("CONDITION_NOMETHOD")
@JvmField val CONDITION_NOSTRING = RexxElementType("CONDITION_NOSTRING")
@JvmField val CONDITION_NOTREADY = RexxElementType("CONDITION_NOTREADY")
@JvmField val CONDITION_NOVALUE = RexxElementType("CONDITION_NOVALUE")
@JvmField val CONDITION_PROPAGATE = RexxElementType("CONDITION_PROPAGATE")
@JvmField val CONDITION_SYNTAX = RexxElementType("CONDITION_SYNTAX")
@JvmField val CONDITION_USER = RexxElementType("CONDITION_USER")

// subkeywords on directive instructions
@JvmField val SUBDIRECTIVE_ABSTRACT = RexxElementType("SUBDIRECTIVE_ABSTRACT")
@JvmField val SUBDIRECTIVE_ALL = RexxElementType("SUBDIRECTIVE_ALL")
@JvmField val SUBDIRECTIVE_ATTRIBUTE = RexxElementType("SUBDIRECTIVE_ATTRIBUTE")
@JvmField val SUBDIRECTIVE_CLASS = RexxElementType("SUBDIRECTIVE_CLASS")
@JvmField val SUBDIRECTIVE_CONDITION = RexxElementType("SUBDIRECTIVE_CONDITION")
@JvmField val SUBDIRECTIVE_CONSTANT = RexxElementType("SUBDIRECTIVE_CONSTANT")
@JvmField val SUBDIRECTIVE_DELEGATE = RexxElementType("SUBDIRECTIVE_DELEGATE")
@JvmField val SUBDIRECTIVE_DIGITS = RexxElementType("SUBDIRECTIVE_DIGITS")
@JvmField val SUBDIRECTIVE_END = RexxElementType("SUBDIRECTIVE_END")
@JvmField val SUBDIRECTIVE_ERROR = RexxElementType("SUBDIRECTIVE_ERROR")
@JvmField val SUBDIRECTIVE_EXTERNAL = RexxElementType("SUBDIRECTIVE_EXTERNAL")
@JvmField val SUBDIRECTIVE_FAILURE = RexxElementType("SUBDIRECTIVE_FAILURE")
@JvmField val SUBDIRECTIVE_FORM = RexxElementType("SUBDIRECTIVE_FORM")
@JvmField val SUBDIRECTIVE_FUZZ = RexxElementType("SUBDIRECTIVE_FUZZ")
@JvmField val SUBDIRECTIVE_GET = RexxElementType("SUBDIRECTIVE_GET")
@JvmField val SUBDIRECTIVE_GUARDED = RexxElementType("SUBDIRECTIVE_GUARDED")
@JvmField val SUBDIRECTIVE_INHERIT = RexxElementType("SUBDIRECTIVE_INHERIT")
@JvmField val SUBDIRECTIVE_LIBRARY = RexxElementType("SUBDIRECTIVE_LIBRARY")
@JvmField val SUBDIRECTIVE_LOSTDIGITS = RexxElementType("SUBDIRECTIVE_LOSTDIGITS")
@JvmField val SUBDIRECTIVE_METACLASS = RexxElementType("SUBDIRECTIVE_METACLASS")
@JvmField val SUBDIRECTIVE_METHOD = RexxElementType("SUBDIRECTIVE_METHOD")
@JvmField val SUBDIRECTIVE_MIXINCLASS = RexxElementType("SUBDIRECTIVE_MIXINCLASS")
@JvmField val SUBDIRECTIVE_NAMESPACE = RexxElementType("SUBDIRECTIVE_NAMESPACE")
@JvmField val SUBDIRECTIVE_NOPROLOG = RexxElementType("SUBDIRECTIVE_NOPROLOG")
@JvmField val SUBDIRECTIVE_NOSTRING = RexxElementType("SUBDIRECTIVE_NOSTRING")
@JvmField val SUBDIRECTIVE_NOTREADY = RexxElementType("SUBDIRECTIVE_NOTREADY")
@JvmField val SUBDIRECTIVE_NOVALUE = RexxElementType("SUBDIRECTIVE_NOVALUE")
@JvmField val SUBDIRECTIVE_PACKAGE = RexxElementType("SUBDIRECTIVE_PACKAGE")
@JvmField val SUBDIRECTIVE_PRIVATE = RexxElementType("SUBDIRECTIVE_PRIVATE")
@JvmField val SUBDIRECTIVE_PROLOG = RexxElementType("SUBDIRECTIVE_PROLOG")
@JvmField val SUBDIRECTIVE_PROTECTED = RexxElementType("SUBDIRECTIVE_PROTECTED")
@JvmField val SUBDIRECTIVE_PUBLIC = RexxElementType("SUBDIRECTIVE_PUBLIC")
@JvmField val SUBDIRECTIVE_ROUTINE = RexxElementType("SUBDIRECTIVE_ROUTINE")
@JvmField val SUBDIRECTIVE_SET = RexxElementType("SUBDIRECTIVE_SET")
@JvmField val SUBDIRECTIVE_SUBCLASS = RexxElementType("SUBDIRECTIVE_SUBCLASS")
@JvmField val SUBDIRECTIVE_SYNTAX = RexxElementType("SUBDIRECTIVE_SYNTAX")
@JvmField val SUBDIRECTIVE_TRACE = RexxElementType("SUBDIRECTIVE_TRACE")
@JvmField val SUBDIRECTIVE_UNGUARDED = RexxElementType("SUBDIRECTIVE_UNGUARDED")
@JvmField val SUBDIRECTIVE_UNPROTECTED = RexxElementType("SUBDIRECTIVE_UNPROTECTED")

val keyword = TokenSet.create(
    DIRECTIVE_ANNOTATE,
        DIRECTIVE_ATTRIBUTE,
        DIRECTIVE_CLASS,
        DIRECTIVE_CONSTANT,
        DIRECTIVE_METHOD,
        DIRECTIVE_OPTIONS,
        DIRECTIVE_REQUIRES,
        DIRECTIVE_RESOURCE,
        DIRECTIVE_ROUTINE,
        KEYWORD_ADDRESS,
        KEYWORD_ARG,
        KEYWORD_CALL,
        KEYWORD_DO,
        KEYWORD_DROP,
        KEYWORD_ELSE,
        KEYWORD_END,
        KEYWORD_EXIT,
        KEYWORD_EXPOSE,
        KEYWORD_FORWARD,
        KEYWORD_GUARD,
        KEYWORD_IF,
        KEYWORD_INTERPRET,
        KEYWORD_ITERATE,
        KEYWORD_LEAVE,
        KEYWORD_LOOP,
        KEYWORD_NOP,
        KEYWORD_NUMERIC,
        KEYWORD_OPTIONS,
        KEYWORD_OTHERWISE,
        KEYWORD_PARSE,
        KEYWORD_PROCEDURE,
        KEYWORD_PULL,
        KEYWORD_PUSH,
        KEYWORD_QUEUE,
        KEYWORD_RAISE,
        KEYWORD_REPLY,
        KEYWORD_RETURN,
        KEYWORD_SAY,
        KEYWORD_SELECT,
        KEYWORD_SIGNAL,
        KEYWORD_THEN,
        KEYWORD_TRACE,
        KEYWORD_USE,
        KEYWORD_WHEN,
        SUBKEY_ADDITIONAL,
        SUBKEY_APPEND,
        SUBKEY_ARG,
        SUBKEY_ARGUMENTS,
        SUBKEY_ARRAY,
        SUBKEY_BY,
        SUBKEY_CASE,
        SUBKEY_CLASS,
        SUBKEY_CONTINUE,
        SUBKEY_COUNTER,
        SUBKEY_DESCRIPTION,
        SUBKEY_DIGITS,
        SUBKEY_ENGINEERING,
        SUBKEY_ERROR,
        SUBKEY_EXIT,
        SUBKEY_EXPOSE,
        SUBKEY_FALSE,
        SUBKEY_FOR,
        SUBKEY_FOREVER,
        SUBKEY_FORM,
        SUBKEY_FUZZ,
        SUBKEY_INDEX,
        SUBKEY_INPUT,
        SUBKEY_ITEM,
        SUBKEY_LABEL,
        SUBKEY_LOCAL,
        SUBKEY_MESSAGE,
        SUBKEY_NAME,
        SUBKEY_NORMAL,
        SUBKEY_OFF,
        SUBKEY_ON,
        SUBKEY_OUTPUT,
        SUBKEY_OVER,
        SUBKEY_REPLACE,
        SUBKEY_RETURN,
        SUBKEY_SCIENTIFIC,
        SUBKEY_STEM,
        SUBKEY_STREAM,
        SUBKEY_STRICT,
        SUBKEY_THEN,
        SUBKEY_TO,
        SUBKEY_TRUE,
        SUBKEY_UNTIL,
        SUBKEY_USING,
        SUBKEY_VALUE,
        SUBKEY_WHEN,
        SUBKEY_WHILE,
        SUBKEY_WITH,
        SUBKEY_CASELESS,
        SUBKEY_LINEIN,
        SUBKEY_LOWER,
        SUBKEY_PULL,
        SUBKEY_SOURCE,
        SUBKEY_UPPER,
        SUBKEY_VAR,
        SUBKEY_VERSION,
        BUILTIN_ABBREV,
        BUILTIN_ABS,
        BUILTIN_ADDRESS,
        BUILTIN_ARG,
        BUILTIN_B2X,
        BUILTIN_BITAND,
        BUILTIN_BITOR,
        BUILTIN_BITXOR,
        BUILTIN_C2D,
        BUILTIN_C2X,
        BUILTIN_CENTER,
        BUILTIN_CENTRE,
        BUILTIN_CHANGESTR,
        BUILTIN_CHARIN,
        BUILTIN_CHAROUT,
        BUILTIN_CHARS,
        BUILTIN_COMPARE,
        BUILTIN_CONDITION,
        BUILTIN_COPIES,
        BUILTIN_COUNTSTR,
        BUILTIN_D2C,
        BUILTIN_D2X,
        BUILTIN_DATATYPE,
        BUILTIN_DATE,
        BUILTIN_DELSTR,
        BUILTIN_DELWORD,
        BUILTIN_DIGITS,
        BUILTIN_ENDLOCAL,
        BUILTIN_ERRORTEXT,
        BUILTIN_FORM,
        BUILTIN_FORMAT,
        BUILTIN_FUZZ,
        BUILTIN_INSERT,
        BUILTIN_LASTPOS,
        BUILTIN_LEFT,
        BUILTIN_LENGTH,
        BUILTIN_LINEIN,
        BUILTIN_LINEOUT,
        BUILTIN_LINES,
        BUILTIN_LOWER,
        BUILTIN_MAX,
        BUILTIN_MIN,
        BUILTIN_OVERLAY,
        BUILTIN_POS,
        BUILTIN_QUALIFY,
        BUILTIN_QUEUED,
        BUILTIN_RANDOM,
        BUILTIN_REVERSE,
        BUILTIN_RIGHT,
        BUILTIN_RXFUNCADD,
        BUILTIN_RXFUNCDROP,
        BUILTIN_RXFUNCQUERY,
        BUILTIN_RXQUEUE,
        BUILTIN_SETLOCAL,
        BUILTIN_SIGN,
        BUILTIN_SOURCELINE,
        BUILTIN_SPACE,
        BUILTIN_STREAM,
        BUILTIN_STRIP,
        BUILTIN_SUBSTR,
        BUILTIN_SUBWORD,
        BUILTIN_SYMBOL,
        BUILTIN_TIME,
        BUILTIN_TRACE,
        BUILTIN_TRANSLATE,
        BUILTIN_TRUNC,
        BUILTIN_UPPER,
        BUILTIN_USERID,
        BUILTIN_VALUE,
        BUILTIN_VAR,
        BUILTIN_VERIFY,
        BUILTIN_WORD,
        BUILTIN_WORDINDEX,
        BUILTIN_WORDLENGTH,
        BUILTIN_WORDPOS,
        BUILTIN_WORDS,
        BUILTIN_X2B,
        BUILTIN_X2C,
        BUILTIN_X2D,
        BUILTIN_XRANGE,
        CONDITION_ANY,
        CONDITION_ERROR,
        CONDITION_FAILURE,
        CONDITION_HALT,
        CONDITION_LOSTDIGITS,
        CONDITION_NOMETHOD,
        CONDITION_NOSTRING,
        CONDITION_NOTREADY,
        CONDITION_NOVALUE,
        CONDITION_PROPAGATE,
        CONDITION_SYNTAX,
        CONDITION_USER,
        SUBDIRECTIVE_ABSTRACT,
        SUBDIRECTIVE_ALL,
        SUBDIRECTIVE_ATTRIBUTE,
        SUBDIRECTIVE_CLASS,
        SUBDIRECTIVE_CONDITION,
        SUBDIRECTIVE_CONSTANT,
        SUBDIRECTIVE_DELEGATE,
        SUBDIRECTIVE_DIGITS,
        SUBDIRECTIVE_END,
        SUBDIRECTIVE_ERROR,
        SUBDIRECTIVE_EXTERNAL,
        SUBDIRECTIVE_FAILURE,
        SUBDIRECTIVE_FORM,
        SUBDIRECTIVE_FUZZ,
        SUBDIRECTIVE_GET,
        SUBDIRECTIVE_GUARDED,
        SUBDIRECTIVE_INHERIT,
        SUBDIRECTIVE_LIBRARY,
        SUBDIRECTIVE_LOSTDIGITS,
        SUBDIRECTIVE_METACLASS,
        SUBDIRECTIVE_METHOD,
        SUBDIRECTIVE_MIXINCLASS,
        SUBDIRECTIVE_NAMESPACE,
        SUBDIRECTIVE_NOPROLOG,
        SUBDIRECTIVE_NOSTRING,
        SUBDIRECTIVE_NOTREADY,
        SUBDIRECTIVE_NOVALUE,
        SUBDIRECTIVE_PACKAGE,
        SUBDIRECTIVE_PRIVATE,
        SUBDIRECTIVE_PROLOG,
        SUBDIRECTIVE_PROTECTED,
        SUBDIRECTIVE_PUBLIC,
        SUBDIRECTIVE_ROUTINE,
        SUBDIRECTIVE_SET,
        SUBDIRECTIVE_SUBCLASS,
        SUBDIRECTIVE_SYNTAX,
        SUBDIRECTIVE_TRACE,
        SUBDIRECTIVE_UNGUARDED,
        SUBDIRECTIVE_UNPROTECTED,
)
