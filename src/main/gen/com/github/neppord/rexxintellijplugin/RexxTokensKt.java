// This is a generated file. Not intended for manual editing.
package com.github.neppord.rexxintellijplugin;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.neppord.rexxintellijplugin.psi.*;

public interface RexxTokensKt {

  IElementType DECIMAL_CONSTANT = new RexxElementType("DECIMAL_CONSTANT");
  IElementType EXPRESSION = new RexxElementType("EXPRESSION");
  IElementType EXPRESSION_TERM = new RexxElementType("EXPRESSION_TERM");
  IElementType INSTRUCTION = new RexxElementType("INSTRUCTION");
  IElementType INTEGER_CONSTANT = new RexxElementType("INTEGER_CONSTANT");
  IElementType NUMERIC_CONSTANT = new RexxElementType("NUMERIC_CONSTANT");
  IElementType SAY_INSTRUCTION = new RexxElementType("SAY_INSTRUCTION");
  IElementType SCIENTIFIC_CONSTANT = new RexxElementType("SCIENTIFIC_CONSTANT");
  IElementType STRING_LITERAL = new RexxElementType("STRING_LITERAL");

  IElementType BUILTIN_ABBREV = new RexxTokenType("BUILTIN_ABBREV");
  IElementType BUILTIN_ABS = new RexxTokenType("BUILTIN_ABS");
  IElementType BUILTIN_ADDRESS = new RexxTokenType("BUILTIN_ADDRESS");
  IElementType BUILTIN_ARG = new RexxTokenType("BUILTIN_ARG");
  IElementType BUILTIN_B2X = new RexxTokenType("BUILTIN_B2X");
  IElementType BUILTIN_BITAND = new RexxTokenType("BUILTIN_BITAND");
  IElementType BUILTIN_BITOR = new RexxTokenType("BUILTIN_BITOR");
  IElementType BUILTIN_BITXOR = new RexxTokenType("BUILTIN_BITXOR");
  IElementType BUILTIN_C2D = new RexxTokenType("BUILTIN_C2D");
  IElementType BUILTIN_C2X = new RexxTokenType("BUILTIN_C2X");
  IElementType BUILTIN_CENTER = new RexxTokenType("BUILTIN_CENTER");
  IElementType BUILTIN_CENTRE = new RexxTokenType("BUILTIN_CENTRE");
  IElementType BUILTIN_CHANGESTR = new RexxTokenType("BUILTIN_CHANGESTR");
  IElementType BUILTIN_CHARIN = new RexxTokenType("BUILTIN_CHARIN");
  IElementType BUILTIN_CHAROUT = new RexxTokenType("BUILTIN_CHAROUT");
  IElementType BUILTIN_CHARS = new RexxTokenType("BUILTIN_CHARS");
  IElementType BUILTIN_COMPARE = new RexxTokenType("BUILTIN_COMPARE");
  IElementType BUILTIN_CONDITION = new RexxTokenType("BUILTIN_CONDITION");
  IElementType BUILTIN_COPIES = new RexxTokenType("BUILTIN_COPIES");
  IElementType BUILTIN_COUNTSTR = new RexxTokenType("BUILTIN_COUNTSTR");
  IElementType BUILTIN_D2C = new RexxTokenType("BUILTIN_D2C");
  IElementType BUILTIN_D2X = new RexxTokenType("BUILTIN_D2X");
  IElementType BUILTIN_DATATYPE = new RexxTokenType("BUILTIN_DATATYPE");
  IElementType BUILTIN_DATE = new RexxTokenType("BUILTIN_DATE");
  IElementType BUILTIN_DELSTR = new RexxTokenType("BUILTIN_DELSTR");
  IElementType BUILTIN_DELWORD = new RexxTokenType("BUILTIN_DELWORD");
  IElementType BUILTIN_DIGITS = new RexxTokenType("BUILTIN_DIGITS");
  IElementType BUILTIN_ERRORTEXT = new RexxTokenType("BUILTIN_ERRORTEXT");
  IElementType BUILTIN_FORM = new RexxTokenType("BUILTIN_FORM");
  IElementType BUILTIN_FORMAT = new RexxTokenType("BUILTIN_FORMAT");
  IElementType BUILTIN_FUZZ = new RexxTokenType("BUILTIN_FUZZ");
  IElementType DIRECTIVE_ANNOTATE = new RexxTokenType("DIRECTIVE_ANNOTATE");
  IElementType DIRECTIVE_ATTRIBUTE = new RexxTokenType("DIRECTIVE_ATTRIBUTE");
  IElementType DIRECTIVE_CONSTANT = new RexxTokenType("DIRECTIVE_CONSTANT");
  IElementType DIRECTIVE_METHOD = new RexxTokenType("DIRECTIVE_METHOD");
  IElementType DIRECTIVE_REQUIRES = new RexxTokenType("DIRECTIVE_REQUIRES");
  IElementType DIRECTIVE_RESOURCE = new RexxTokenType("DIRECTIVE_RESOURCE");
  IElementType DIRECTIVE_ROUTINE = new RexxTokenType("DIRECTIVE_ROUTINE");
  IElementType DOT = new RexxTokenType("DOT");
  IElementType IDENTIFIER = new RexxTokenType("IDENTIFIER");
  IElementType KEYWORD_ATTRIBUTE = new RexxTokenType("KEYWORD_ATTRIBUTE");
  IElementType KEYWORD_CALL = new RexxTokenType("KEYWORD_CALL");
  IElementType KEYWORD_CLASS = new RexxTokenType("KEYWORD_CLASS");
  IElementType KEYWORD_DO = new RexxTokenType("KEYWORD_DO");
  IElementType KEYWORD_DROP = new RexxTokenType("KEYWORD_DROP");
  IElementType KEYWORD_ELSE = new RexxTokenType("KEYWORD_ELSE");
  IElementType KEYWORD_END = new RexxTokenType("KEYWORD_END");
  IElementType KEYWORD_FORWARD = new RexxTokenType("KEYWORD_FORWARD");
  IElementType KEYWORD_GUARD = new RexxTokenType("KEYWORD_GUARD");
  IElementType KEYWORD_IF = new RexxTokenType("KEYWORD_IF");
  IElementType KEYWORD_INTERPRET = new RexxTokenType("KEYWORD_INTERPRET");
  IElementType KEYWORD_ITERATE = new RexxTokenType("KEYWORD_ITERATE");
  IElementType KEYWORD_LEAVE = new RexxTokenType("KEYWORD_LEAVE");
  IElementType KEYWORD_LOOP = new RexxTokenType("KEYWORD_LOOP");
  IElementType KEYWORD_METHOD = new RexxTokenType("KEYWORD_METHOD");
  IElementType KEYWORD_NOP = new RexxTokenType("KEYWORD_NOP");
  IElementType KEYWORD_NUMERIC = new RexxTokenType("KEYWORD_NUMERIC");
  IElementType KEYWORD_OPTIONS = new RexxTokenType("KEYWORD_OPTIONS");
  IElementType KEYWORD_OTHERWISE = new RexxTokenType("KEYWORD_OTHERWISE");
  IElementType KEYWORD_PARSE = new RexxTokenType("KEYWORD_PARSE");
  IElementType KEYWORD_PROCEDURE = new RexxTokenType("KEYWORD_PROCEDURE");
  IElementType KEYWORD_PUSH = new RexxTokenType("KEYWORD_PUSH");
  IElementType KEYWORD_QUEUE = new RexxTokenType("KEYWORD_QUEUE");
  IElementType KEYWORD_RAISE = new RexxTokenType("KEYWORD_RAISE");
  IElementType KEYWORD_REPLY = new RexxTokenType("KEYWORD_REPLY");
  IElementType KEYWORD_SAY = new RexxTokenType("KEYWORD_SAY");
  IElementType KEYWORD_SELECT = new RexxTokenType("KEYWORD_SELECT");
  IElementType KEYWORD_SIGNAL = new RexxTokenType("KEYWORD_SIGNAL");
  IElementType KEYWORD_TRACE = new RexxTokenType("KEYWORD_TRACE");
  IElementType KEYWORD_USE = new RexxTokenType("KEYWORD_USE");
  IElementType LINE_COMMENT = new RexxTokenType("LINE_COMMENT");
  IElementType MULTILINE_COMMENT = new RexxTokenType("MULTILINE_COMMENT");
  IElementType NUMBER_BINARY = new RexxTokenType("NUMBER_BINARY");
  IElementType NUMBER_DECIMAL = new RexxTokenType("NUMBER_DECIMAL");
  IElementType NUMBER_HEXADECIMAL = new RexxTokenType("NUMBER_HEXADECIMAL");
  IElementType NUMBER_INT = new RexxTokenType("NUMBER_INT");
  IElementType NUMBER_SCIENTIFIC = new RexxTokenType("NUMBER_SCIENTIFIC");
  IElementType OPERATOR_AND = new RexxTokenType("OPERATOR_AND");
  IElementType OPERATOR_BACKSLASH = new RexxTokenType("OPERATOR_BACKSLASH");
  IElementType OPERATOR_BACKSLASH_EQUAL = new RexxTokenType("OPERATOR_BACKSLASH_EQUAL");
  IElementType OPERATOR_BACKSLASH_GREATERTHAN = new RexxTokenType("OPERATOR_BACKSLASH_GREATERTHAN");
  IElementType OPERATOR_BACKSLASH_LESSTHAN = new RexxTokenType("OPERATOR_BACKSLASH_LESSTHAN");
  IElementType OPERATOR_BITWISE_AND = new RexxTokenType("OPERATOR_BITWISE_AND");
  IElementType OPERATOR_CONCATENATE = new RexxTokenType("OPERATOR_CONCATENATE");
  IElementType OPERATOR_DIVIDE = new RexxTokenType("OPERATOR_DIVIDE");
  IElementType OPERATOR_EQUAL = new RexxTokenType("OPERATOR_EQUAL");
  IElementType OPERATOR_GREATERTHAN = new RexxTokenType("OPERATOR_GREATERTHAN");
  IElementType OPERATOR_GREATERTHAN_EQUAL = new RexxTokenType("OPERATOR_GREATERTHAN_EQUAL");
  IElementType OPERATOR_GREATERTHAN_LESSTHAN = new RexxTokenType("OPERATOR_GREATERTHAN_LESSTHAN");
  IElementType OPERATOR_LESSTHAN = new RexxTokenType("OPERATOR_LESSTHAN");
  IElementType OPERATOR_LESSTHAN_EQUAL = new RexxTokenType("OPERATOR_LESSTHAN_EQUAL");
  IElementType OPERATOR_LESSTHAN_GREATERTHAN = new RexxTokenType("OPERATOR_LESSTHAN_GREATERTHAN");
  IElementType OPERATOR_MULTIPLY = new RexxTokenType("OPERATOR_MULTIPLY");
  IElementType OPERATOR_OR = new RexxTokenType("OPERATOR_OR");
  IElementType OPERATOR_PLUS = new RexxTokenType("OPERATOR_PLUS");
  IElementType OPERATOR_POWER = new RexxTokenType("OPERATOR_POWER");
  IElementType OPERATOR_REMAINDER = new RexxTokenType("OPERATOR_REMAINDER");
  IElementType OPERATOR_STRICT_BACKSLASH_EQUAL = new RexxTokenType("OPERATOR_STRICT_BACKSLASH_EQUAL");
  IElementType OPERATOR_STRICT_BACKSLASH_GREATERTHAN = new RexxTokenType("OPERATOR_STRICT_BACKSLASH_GREATERTHAN");
  IElementType OPERATOR_STRICT_BACKSLASH_LESSTHAN = new RexxTokenType("OPERATOR_STRICT_BACKSLASH_LESSTHAN");
  IElementType OPERATOR_STRICT_EQUAL = new RexxTokenType("OPERATOR_STRICT_EQUAL");
  IElementType OPERATOR_STRICT_GREATERTHAN_EQUAL = new RexxTokenType("OPERATOR_STRICT_GREATERTHAN_EQUAL");
  IElementType OPERATOR_STRICT_LESSTHAN = new RexxTokenType("OPERATOR_STRICT_LESSTHAN");
  IElementType OPERATOR_STRICT_LESSTHAN_EQUAL = new RexxTokenType("OPERATOR_STRICT_LESSTHAN_EQUAL");
  IElementType OPERATOR_SUBTRACT = new RexxTokenType("OPERATOR_SUBTRACT");
  IElementType OPERATOR_XOR = new RexxTokenType("OPERATOR_XOR");
  IElementType SHEBANG = new RexxTokenType("SHEBANG");
  IElementType STRING = new RexxTokenType("STRING");
  IElementType SUBKEY_ADDITIONAL = new RexxTokenType("SUBKEY_ADDITIONAL");
  IElementType SUBKEY_APPEND = new RexxTokenType("SUBKEY_APPEND");
  IElementType SUBKEY_ARGUMENTS = new RexxTokenType("SUBKEY_ARGUMENTS");
  IElementType SUBKEY_ARRAY = new RexxTokenType("SUBKEY_ARRAY");
  IElementType SUBKEY_BY = new RexxTokenType("SUBKEY_BY");
  IElementType SUBKEY_CASE = new RexxTokenType("SUBKEY_CASE");
  IElementType SUBKEY_CASELESS = new RexxTokenType("SUBKEY_CASELESS");
  IElementType SUBKEY_CLASS = new RexxTokenType("SUBKEY_CLASS");
  IElementType SUBKEY_CONTINUE = new RexxTokenType("SUBKEY_CONTINUE");
  IElementType SUBKEY_COUNTER = new RexxTokenType("SUBKEY_COUNTER");
  IElementType SUBKEY_DESCRIPTION = new RexxTokenType("SUBKEY_DESCRIPTION");
  IElementType SUBKEY_ENGINEERING = new RexxTokenType("SUBKEY_ENGINEERING");
  IElementType SUBKEY_ERROR = new RexxTokenType("SUBKEY_ERROR");
  IElementType SUBKEY_EXIT = new RexxTokenType("SUBKEY_EXIT");
  IElementType SUBKEY_EXPOSE = new RexxTokenType("SUBKEY_EXPOSE");
  IElementType SUBKEY_FALSE = new RexxTokenType("SUBKEY_FALSE");
  IElementType SUBKEY_FOR = new RexxTokenType("SUBKEY_FOR");
  IElementType SUBKEY_FOREVER = new RexxTokenType("SUBKEY_FOREVER");
  IElementType SUBKEY_INDEX = new RexxTokenType("SUBKEY_INDEX");
  IElementType SUBKEY_INPUT = new RexxTokenType("SUBKEY_INPUT");
  IElementType SUBKEY_ITEM = new RexxTokenType("SUBKEY_ITEM");
  IElementType SUBKEY_LABEL = new RexxTokenType("SUBKEY_LABEL");
  IElementType SUBKEY_LINEIN = new RexxTokenType("SUBKEY_LINEIN");
  IElementType SUBKEY_LOCAL = new RexxTokenType("SUBKEY_LOCAL");
  IElementType SUBKEY_LOWER = new RexxTokenType("SUBKEY_LOWER");
  IElementType SUBKEY_MESSAGE = new RexxTokenType("SUBKEY_MESSAGE");
  IElementType SUBKEY_NAME = new RexxTokenType("SUBKEY_NAME");
  IElementType SUBKEY_NORMAL = new RexxTokenType("SUBKEY_NORMAL");
  IElementType SUBKEY_OFF = new RexxTokenType("SUBKEY_OFF");
  IElementType SUBKEY_ON = new RexxTokenType("SUBKEY_ON");
  IElementType SUBKEY_OUTPUT = new RexxTokenType("SUBKEY_OUTPUT");
  IElementType SUBKEY_OVER = new RexxTokenType("SUBKEY_OVER");
  IElementType SUBKEY_PULL = new RexxTokenType("SUBKEY_PULL");
  IElementType SUBKEY_REPLACE = new RexxTokenType("SUBKEY_REPLACE");
  IElementType SUBKEY_RETURN = new RexxTokenType("SUBKEY_RETURN");
  IElementType SUBKEY_SCIENTIFIC = new RexxTokenType("SUBKEY_SCIENTIFIC");
  IElementType SUBKEY_SOURCE = new RexxTokenType("SUBKEY_SOURCE");
  IElementType SUBKEY_STEM = new RexxTokenType("SUBKEY_STEM");
  IElementType SUBKEY_STREAM = new RexxTokenType("SUBKEY_STREAM");
  IElementType SUBKEY_STRICT = new RexxTokenType("SUBKEY_STRICT");
  IElementType SUBKEY_THEN = new RexxTokenType("SUBKEY_THEN");
  IElementType SUBKEY_TO = new RexxTokenType("SUBKEY_TO");
  IElementType SUBKEY_TRUE = new RexxTokenType("SUBKEY_TRUE");
  IElementType SUBKEY_UNTIL = new RexxTokenType("SUBKEY_UNTIL");
  IElementType SUBKEY_UPPER = new RexxTokenType("SUBKEY_UPPER");
  IElementType SUBKEY_USING = new RexxTokenType("SUBKEY_USING");
  IElementType SUBKEY_VALUE = new RexxTokenType("SUBKEY_VALUE");
  IElementType SUBKEY_VAR = new RexxTokenType("SUBKEY_VAR");
  IElementType SUBKEY_VERSION = new RexxTokenType("SUBKEY_VERSION");
  IElementType SUBKEY_WHEN = new RexxTokenType("SUBKEY_WHEN");
  IElementType SUBKEY_WHILE = new RexxTokenType("SUBKEY_WHILE");
  IElementType SUBKEY_WITH = new RexxTokenType("SUBKEY_WITH");
  IElementType TILDE = new RexxTokenType("TILDE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == DECIMAL_CONSTANT) {
        return new RexxDecimalConstantImpl(node);
      }
      else if (type == EXPRESSION) {
        return new RexxExpressionImpl(node);
      }
      else if (type == EXPRESSION_TERM) {
        return new RexxExpressionTermImpl(node);
      }
      else if (type == INSTRUCTION) {
        return new RexxInstructionImpl(node);
      }
      else if (type == INTEGER_CONSTANT) {
        return new RexxIntegerConstantImpl(node);
      }
      else if (type == NUMERIC_CONSTANT) {
        return new RexxNumericConstantImpl(node);
      }
      else if (type == SAY_INSTRUCTION) {
        return new RexxSayInstructionImpl(node);
      }
      else if (type == SCIENTIFIC_CONSTANT) {
        return new RexxScientificConstantImpl(node);
      }
      else if (type == STRING_LITERAL) {
        return new RexxStringLiteralImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
