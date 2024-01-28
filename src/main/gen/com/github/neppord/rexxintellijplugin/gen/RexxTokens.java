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
  IElementType ASSIGNMENT = new RexxElementType("ASSIGNMENT");
  IElementType CONCATENATION = new RexxElementType("CONCATENATION");
  IElementType DECIMAL_CONSTANT = new RexxElementType("DECIMAL_CONSTANT");
  IElementType DIVISION = new RexxElementType("DIVISION");
  IElementType EXPRESSION = new RexxElementType("EXPRESSION");
  IElementType EXPRESSION_TERM = new RexxElementType("EXPRESSION_TERM");
  IElementType INTEGER_CONSTANT = new RexxElementType("INTEGER_CONSTANT");
  IElementType MULTIPLICATION = new RexxElementType("MULTIPLICATION");
  IElementType NAME_DECLARATION = new RexxElementType("NAME_DECLARATION");
  IElementType NUMERIC_CONSTANT = new RexxElementType("NUMERIC_CONSTANT");
  IElementType PARENTHETICAL_EXPRESSION = new RexxElementType("PARENTHETICAL_EXPRESSION");
  IElementType PARSE_INSTRUCTION = new RexxElementType("PARSE_INSTRUCTION");
  IElementType SAY_INSTRUCTION = new RexxElementType("SAY_INSTRUCTION");
  IElementType SCIENTIFIC_CONSTANT = new RexxElementType("SCIENTIFIC_CONSTANT");
  IElementType STRING_LITERAL = new RexxElementType("STRING_LITERAL");
  IElementType SUBTRACTION = new RexxElementType("SUBTRACTION");
  IElementType VARIABLE = new RexxElementType("VARIABLE");

  IElementType DOT = new RexxTokenType("DOT");
  IElementType IDENTIFIER = new RexxTokenType("IDENTIFIER");
  IElementType KEYWORD_ARG = new RexxTokenType("KEYWORD_ARG");
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
  IElementType TILDE = new RexxTokenType("TILDE");
  IElementType TOKEN_LEFT = new RexxTokenType("(");
  IElementType TOKEN_RIGHT = new RexxTokenType(")");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ADDITION) {
        return new RexxAdditionImpl(node);
      }
      else if (type == ASSIGNMENT) {
        return new RexxAssignmentImpl(node);
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
      else if (type == EXPRESSION) {
        return new RexxExpressionImpl(node);
      }
      else if (type == EXPRESSION_TERM) {
        return new RexxExpressionTermImpl(node);
      }
      else if (type == INTEGER_CONSTANT) {
        return new RexxIntegerConstantImpl(node);
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
      else if (type == PARSE_INSTRUCTION) {
        return new RexxParseInstructionImpl(node);
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
      else if (type == SUBTRACTION) {
        return new RexxSubtractionImpl(node);
      }
      else if (type == VARIABLE) {
        return new RexxVariableImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
