// This is a generated file. Not intended for manual editing.
package com.github.neppord.rexxintellijplugin.gen;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.neppord.rexxintellijplugin.RexxElementType;
import com.github.neppord.rexxintellijplugin.RexxTokenType;
import com.github.neppord.rexxintellijplugin.gen.impl.*;

public interface RexxTokens {

  IElementType ADDITION = new RexxElementType("ADDITION");
  IElementType ADDRESS_INSTRUCTION = new RexxElementType("ADDRESS_INSTRUCTION");
  IElementType ASSIGNMENT = new RexxElementType("ASSIGNMENT");
  IElementType CALL_INSTRUCTION = new RexxElementType("CALL_INSTRUCTION");
  IElementType COMPARE = new RexxElementType("COMPARE");
  IElementType CONCATENATION = new RexxElementType("CONCATENATION");
  IElementType DECIMAL_CONSTANT = new RexxElementType("DECIMAL_CONSTANT");
  IElementType DIVISION = new RexxElementType("DIVISION");
  IElementType EXIT_INSTRUCTION = new RexxElementType("EXIT_INSTRUCTION");
  IElementType EXPRESSION = new RexxElementType("EXPRESSION");
  IElementType EXPRESSION_INSTRUCTION = new RexxElementType("EXPRESSION_INSTRUCTION");
  IElementType EXPRESSION_TERM = new RexxElementType("EXPRESSION_TERM");
  IElementType FUNCTION_CALL = new RexxElementType("FUNCTION_CALL");
  IElementType GLOBAL = new RexxElementType("GLOBAL");
  IElementType IF_INSTRUCTION = new RexxElementType("IF_INSTRUCTION");
  IElementType INSTRUCTION_BLOCK = new RexxElementType("INSTRUCTION_BLOCK");
  IElementType INTEGER_CONSTANT = new RexxElementType("INTEGER_CONSTANT");
  IElementType LABEL_INSTRUCTION = new RexxElementType("LABEL_INSTRUCTION");
  IElementType METHOD_CALL = new RexxElementType("METHOD_CALL");
  IElementType MULTIPLICATION = new RexxElementType("MULTIPLICATION");
  IElementType NAME_DECLARATION = new RexxElementType("NAME_DECLARATION");
  IElementType NUMERIC_CONSTANT = new RexxElementType("NUMERIC_CONSTANT");
  IElementType PARENTHETICAL_EXPRESSION = new RexxElementType("PARENTHETICAL_EXPRESSION");
  IElementType PARSE_ARG_INSTRUCTION = new RexxElementType("PARSE_ARG_INSTRUCTION");
  IElementType PARSE_SOURCE_INSTRUCTION = new RexxElementType("PARSE_SOURCE_INSTRUCTION");
  IElementType PARSE_VALUE_INSTRUCTION = new RexxElementType("PARSE_VALUE_INSTRUCTION");
  IElementType PARSE_VAR_INSTRUCTION = new RexxElementType("PARSE_VAR_INSTRUCTION");
  IElementType REMAINDER = new RexxElementType("REMAINDER");
  IElementType RETURN_INSTRUCTION = new RexxElementType("RETURN_INSTRUCTION");
  IElementType SAY_INSTRUCTION = new RexxElementType("SAY_INSTRUCTION");
  IElementType SCIENTIFIC_CONSTANT = new RexxElementType("SCIENTIFIC_CONSTANT");
  IElementType SIGNAL_INSTRUCTION = new RexxElementType("SIGNAL_INSTRUCTION");
  IElementType STEM = new RexxElementType("STEM");
  IElementType STRING_LITERAL = new RexxElementType("STRING_LITERAL");
  IElementType SUBTRACTION = new RexxElementType("SUBTRACTION");
  IElementType TRACE_INSTRUCTION = new RexxElementType("TRACE_INSTRUCTION");
  IElementType VARIABLE = new RexxElementType("VARIABLE");

  IElementType COLON = new RexxTokenType("COLON");
  IElementType COMMA = new RexxTokenType("COMMA");
  IElementType DOT = new RexxTokenType("DOT");
  IElementType EXCLAMATION = new RexxTokenType("EXCLAMATION");
  IElementType IDENTIFIER = new RexxTokenType("IDENTIFIER");
  IElementType KEYWORD_ADDRESS = new RexxTokenType("KEYWORD_ADDRESS");
  IElementType KEYWORD_ARG = new RexxTokenType("KEYWORD_ARG");
  IElementType KEYWORD_ATTRIBUTE = new RexxTokenType("KEYWORD_ATTRIBUTE");
  IElementType KEYWORD_CALL = new RexxTokenType("KEYWORD_CALL");
  IElementType KEYWORD_CLASS = new RexxTokenType("KEYWORD_CLASS");
  IElementType KEYWORD_DO = new RexxTokenType("KEYWORD_DO");
  IElementType KEYWORD_DROP = new RexxTokenType("KEYWORD_DROP");
  IElementType KEYWORD_ELSE = new RexxTokenType("KEYWORD_ELSE");
  IElementType KEYWORD_END = new RexxTokenType("KEYWORD_END");
  IElementType KEYWORD_EXIT = new RexxTokenType("KEYWORD_EXIT");
  IElementType KEYWORD_EXPOSE = new RexxTokenType("KEYWORD_EXPOSE");
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
  IElementType KEYWORD_RETURN = new RexxTokenType("KEYWORD_RETURN");
  IElementType KEYWORD_SAY = new RexxTokenType("KEYWORD_SAY");
  IElementType KEYWORD_SELECT = new RexxTokenType("KEYWORD_SELECT");
  IElementType KEYWORD_SIGNAL = new RexxTokenType("KEYWORD_SIGNAL");
  IElementType KEYWORD_SOURCE = new RexxTokenType("KEYWORD_SOURCE");
  IElementType KEYWORD_THEN = new RexxTokenType("KEYWORD_THEN");
  IElementType KEYWORD_TRACE = new RexxTokenType("KEYWORD_TRACE");
  IElementType KEYWORD_USE = new RexxTokenType("KEYWORD_USE");
  IElementType KEYWORD_VALUE = new RexxTokenType("KEYWORD_VALUE");
  IElementType KEYWORD_VAR = new RexxTokenType("KEYWORD_VAR");
  IElementType KEYWORD_WITH = new RexxTokenType("KEYWORD_WITH");
  IElementType LINE_COMMENT = new RexxTokenType("LINE_COMMENT");
  IElementType MULTILINE_COMMENT = new RexxTokenType("MULTILINE_COMMENT");
  IElementType NUMBER_BINARY = new RexxTokenType("NUMBER_BINARY");
  IElementType NUMBER_DECIMAL = new RexxTokenType("NUMBER_DECIMAL");
  IElementType NUMBER_HEXADECIMAL = new RexxTokenType("NUMBER_HEXADECIMAL");
  IElementType NUMBER_INT = new RexxTokenType("NUMBER_INT");
  IElementType NUMBER_SCIENTIFIC = new RexxTokenType("NUMBER_SCIENTIFIC");
  IElementType OPERATOR_AND = new RexxTokenType("OPERATOR_AND");
  IElementType OPERATOR_BACKSLASH = new RexxTokenType("OPERATOR_BACKSLASH");
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
  IElementType OPERATOR_NOT_EQUAL = new RexxTokenType("OPERATOR_NOT_EQUAL");
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
  IElementType TERMINATOR = new RexxTokenType("TERMINATOR");
  IElementType TILDE = new RexxTokenType("TILDE");
  IElementType TOKEN_LEFT = new RexxTokenType("(");
  IElementType TOKEN_RIGHT = new RexxTokenType(")");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ADDITION) {
        return new RexxAdditionImpl(node);
      }
      else if (type == ADDRESS_INSTRUCTION) {
        return new RexxAddressInstructionImpl(node);
      }
      else if (type == ASSIGNMENT) {
        return new RexxAssignmentImpl(node);
      }
      else if (type == CALL_INSTRUCTION) {
        return new RexxCallInstructionImpl(node);
      }
      else if (type == COMPARE) {
        return new RexxCompareImpl(node);
      }
      else if (type == CONCATENATION) {
        return new RexxConcatenationImpl(node);
      }
      else if (type == DECIMAL_CONSTANT) {
        return new RexxDecimalConstantImpl(node);
      }
      else if (type == DIVISION) {
        return new RexxDivisionImpl(node);
      }
      else if (type == EXIT_INSTRUCTION) {
        return new RexxExitInstructionImpl(node);
      }
      else if (type == EXPRESSION) {
        return new RexxExpressionImpl(node);
      }
      else if (type == EXPRESSION_INSTRUCTION) {
        return new RexxExpressionInstructionImpl(node);
      }
      else if (type == EXPRESSION_TERM) {
        return new RexxExpressionTermImpl(node);
      }
      else if (type == FUNCTION_CALL) {
        return new RexxFunctionCallImpl(node);
      }
      else if (type == GLOBAL) {
        return new RexxGlobalImpl(node);
      }
      else if (type == IF_INSTRUCTION) {
        return new RexxIfInstructionImpl(node);
      }
      else if (type == INSTRUCTION_BLOCK) {
        return new RexxInstructionBlockImpl(node);
      }
      else if (type == INTEGER_CONSTANT) {
        return new RexxIntegerConstantImpl(node);
      }
      else if (type == LABEL_INSTRUCTION) {
        return new RexxLabelInstructionImpl(node);
      }
      else if (type == METHOD_CALL) {
        return new RexxMethodCallImpl(node);
      }
      else if (type == MULTIPLICATION) {
        return new RexxMultiplicationImpl(node);
      }
      else if (type == NAME_DECLARATION) {
        return new RexxNameDeclarationImpl(node);
      }
      else if (type == NUMERIC_CONSTANT) {
        return new RexxNumericConstantImpl(node);
      }
      else if (type == PARENTHETICAL_EXPRESSION) {
        return new RexxParentheticalExpressionImpl(node);
      }
      else if (type == PARSE_ARG_INSTRUCTION) {
        return new RexxParseArgInstructionImpl(node);
      }
      else if (type == PARSE_SOURCE_INSTRUCTION) {
        return new RexxParseSourceInstructionImpl(node);
      }
      else if (type == PARSE_VALUE_INSTRUCTION) {
        return new RexxParseValueInstructionImpl(node);
      }
      else if (type == PARSE_VAR_INSTRUCTION) {
        return new RexxParseVarInstructionImpl(node);
      }
      else if (type == REMAINDER) {
        return new RexxRemainderImpl(node);
      }
      else if (type == RETURN_INSTRUCTION) {
        return new RexxReturnInstructionImpl(node);
      }
      else if (type == SAY_INSTRUCTION) {
        return new RexxSayInstructionImpl(node);
      }
      else if (type == SCIENTIFIC_CONSTANT) {
        return new RexxScientificConstantImpl(node);
      }
      else if (type == SIGNAL_INSTRUCTION) {
        return new RexxSignalInstructionImpl(node);
      }
      else if (type == STEM) {
        return new RexxStemImpl(node);
      }
      else if (type == STRING_LITERAL) {
        return new RexxStringLiteralImpl(node);
      }
      else if (type == SUBTRACTION) {
        return new RexxSubtractionImpl(node);
      }
      else if (type == TRACE_INSTRUCTION) {
        return new RexxTraceInstructionImpl(node);
      }
      else if (type == VARIABLE) {
        return new RexxVariableImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
