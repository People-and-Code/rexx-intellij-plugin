// This is a generated file. Not intended for manual editing.
package se.peopleandcode.rexxintellijplugin.gen;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import se.peopleandcode.rexxintellijplugin.RexxElementType;
import se.peopleandcode.rexxintellijplugin.RexxTokenType;
import se.peopleandcode.rexxintellijplugin.gen.impl.*;

public interface RexxTokens {

  IElementType ADDITION = new RexxElementType("ADDITION");
  IElementType ADDRESS_INSTRUCTION = new RexxElementType("ADDRESS_INSTRUCTION");
  IElementType ARG_INSTRUCTION = new RexxElementType("ARG_INSTRUCTION");
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
  IElementType GLOBAL = new RexxElementType("GLOBAL");
  IElementType IDENTIFIER_ = new RexxElementType("IDENTIFIER_");
  IElementType IF_INSTRUCTION = new RexxElementType("IF_INSTRUCTION");
  IElementType INSTRUCTION_BLOCK = new RexxElementType("INSTRUCTION_BLOCK");
  IElementType INTEGER_CONSTANT = new RexxElementType("INTEGER_CONSTANT");
  IElementType INVOKE = new RexxElementType("INVOKE");
  IElementType ITERATE_INSTRUCTION = new RexxElementType("ITERATE_INSTRUCTION");
  IElementType LABEL_INSTRUCTION = new RexxElementType("LABEL_INSTRUCTION");
  IElementType METHOD_CALL = new RexxElementType("METHOD_CALL");
  IElementType MULTIPLICATION = new RexxElementType("MULTIPLICATION");
  IElementType NAME_DECLARATION = new RexxElementType("NAME_DECLARATION");
  IElementType NUMERIC_CONSTANT = new RexxElementType("NUMERIC_CONSTANT");
  IElementType NUMERIC_INSTRUCTION = new RexxElementType("NUMERIC_INSTRUCTION");
  IElementType PARENTHETICAL_EXPRESSION = new RexxElementType("PARENTHETICAL_EXPRESSION");
  IElementType PARSE_ARG_INSTRUCTION = new RexxElementType("PARSE_ARG_INSTRUCTION");
  IElementType PARSE_PULL_INSTRUCTION = new RexxElementType("PARSE_PULL_INSTRUCTION");
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

  IElementType ADDRESS = new RexxTokenType("ADDRESS");
  IElementType ALT_GT = new RexxTokenType("\\>");
  IElementType ALT_LT = new RexxTokenType("\\<");
  IElementType ARG = new RexxTokenType("ARG");
  IElementType ATTRIBUTE = new RexxTokenType("ATTRIBUTE");
  IElementType CALL = new RexxTokenType("CALL");
  IElementType CLASS = new RexxTokenType("CLASS");
  IElementType COLON = new RexxTokenType("COLON");
  IElementType COMMA = new RexxTokenType("COMMA");
  IElementType DO = new RexxTokenType("DO");
  IElementType DOT = new RexxTokenType("DOT");
  IElementType DROP = new RexxTokenType("DROP");
  IElementType ELSE = new RexxTokenType("ELSE");
  IElementType END = new RexxTokenType("END");
  IElementType EQ = new RexxTokenType("=");
  IElementType EXCLAMATION = new RexxTokenType("EXCLAMATION");
  IElementType EXIT = new RexxTokenType("EXIT");
  IElementType EXPOSE = new RexxTokenType("EXPOSE");
  IElementType FORWARD = new RexxTokenType("FORWARD");
  IElementType GT = new RexxTokenType(">");
  IElementType GTE = new RexxTokenType(">=");
  IElementType GUARD = new RexxTokenType("GUARD");
  IElementType IDENTIFIER = new RexxTokenType("IDENTIFIER");
  IElementType IF = new RexxTokenType("IF");
  IElementType INTERPRET = new RexxTokenType("INTERPRET");
  IElementType ITERATE = new RexxTokenType("ITERATE");
  IElementType LEAVE = new RexxTokenType("LEAVE");
  IElementType LINE_COMMENT = new RexxTokenType("LINE_COMMENT");
  IElementType LOOP = new RexxTokenType("LOOP");
  IElementType LT = new RexxTokenType("<");
  IElementType LTE = new RexxTokenType("<=");
  IElementType METHOD = new RexxTokenType("METHOD");
  IElementType MULTILINE_COMMENT = new RexxTokenType("MULTILINE_COMMENT");
  IElementType NEQ1 = new RexxTokenType("\\=");
  IElementType NEQ2 = new RexxTokenType("<>");
  IElementType NEQ3 = new RexxTokenType("><");
  IElementType NOP = new RexxTokenType("NOP");
  IElementType NUMBER_BINARY = new RexxTokenType("NUMBER_BINARY");
  IElementType NUMBER_DECIMAL = new RexxTokenType("NUMBER_DECIMAL");
  IElementType NUMBER_HEXADECIMAL = new RexxTokenType("NUMBER_HEXADECIMAL");
  IElementType NUMBER_INT = new RexxTokenType("NUMBER_INT");
  IElementType NUMBER_SCIENTIFIC = new RexxTokenType("NUMBER_SCIENTIFIC");
  IElementType NUMERIC = new RexxTokenType("NUMERIC");
  IElementType OPERATOR_AND = new RexxTokenType("OPERATOR_AND");
  IElementType OPERATOR_BITWISE_AND = new RexxTokenType("OPERATOR_BITWISE_AND");
  IElementType OPERATOR_CONCATENATE = new RexxTokenType("OPERATOR_CONCATENATE");
  IElementType OPERATOR_DIVIDE = new RexxTokenType("OPERATOR_DIVIDE");
  IElementType OPERATOR_MULTIPLY = new RexxTokenType("OPERATOR_MULTIPLY");
  IElementType OPERATOR_OR = new RexxTokenType("OPERATOR_OR");
  IElementType OPERATOR_PLUS = new RexxTokenType("OPERATOR_PLUS");
  IElementType OPERATOR_POWER = new RexxTokenType("OPERATOR_POWER");
  IElementType OPERATOR_REMAINDER = new RexxTokenType("OPERATOR_REMAINDER");
  IElementType OPERATOR_SUBTRACT = new RexxTokenType("OPERATOR_SUBTRACT");
  IElementType OPERATOR_XOR = new RexxTokenType("OPERATOR_XOR");
  IElementType OPTIONS = new RexxTokenType("OPTIONS");
  IElementType OTHERWISE = new RexxTokenType("OTHERWISE");
  IElementType PARSE = new RexxTokenType("PARSE");
  IElementType PROCEDURE = new RexxTokenType("PROCEDURE");
  IElementType PULL = new RexxTokenType("PULL");
  IElementType PUSH = new RexxTokenType("PUSH");
  IElementType QUEUE = new RexxTokenType("QUEUE");
  IElementType RAISE = new RexxTokenType("RAISE");
  IElementType REPLY = new RexxTokenType("REPLY");
  IElementType RETURN = new RexxTokenType("RETURN");
  IElementType SAY = new RexxTokenType("SAY");
  IElementType SELECT = new RexxTokenType("SELECT");
  IElementType SHEBANG = new RexxTokenType("SHEBANG");
  IElementType SIGNAL = new RexxTokenType("SIGNAL");
  IElementType SOURCE = new RexxTokenType("SOURCE");
  IElementType STRICT_EQ = new RexxTokenType("==");
  IElementType STRICT_ESC_GT = new RexxTokenType("\\>>");
  IElementType STRICT_ESC_LT = new RexxTokenType("\\<<");
  IElementType STRICT_GT = new RexxTokenType(">>");
  IElementType STRICT_GTE = new RexxTokenType(">>=");
  IElementType STRICT_LT = new RexxTokenType("<<");
  IElementType STRICT_LTE = new RexxTokenType("<<=");
  IElementType STRICT_NEQ = new RexxTokenType("\\==");
  IElementType STRING = new RexxTokenType("STRING");
  IElementType TERMINATOR = new RexxTokenType("TERMINATOR");
  IElementType THEN = new RexxTokenType("THEN");
  IElementType TILDE = new RexxTokenType("TILDE");
  IElementType TOKEN_LEFT = new RexxTokenType("(");
  IElementType TOKEN_RIGHT = new RexxTokenType(")");
  IElementType TRACE = new RexxTokenType("TRACE");
  IElementType USE = new RexxTokenType("USE");
  IElementType VALUE = new RexxTokenType("VALUE");
  IElementType VAR = new RexxTokenType("VAR");
  IElementType WHILE = new RexxTokenType("WHILE");
  IElementType WITH = new RexxTokenType("WITH");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ADDITION) {
        return new RexxAdditionImpl(node);
      }
      else if (type == ADDRESS_INSTRUCTION) {
        return new RexxAddressInstructionImpl(node);
      }
      else if (type == ARG_INSTRUCTION) {
        return new RexxArgInstructionImpl(node);
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
      else if (type == GLOBAL) {
        return new RexxGlobalImpl(node);
      }
      else if (type == IDENTIFIER_) {
        return new RexxIdentifier_Impl(node);
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
      else if (type == INVOKE) {
        return new RexxInvokeImpl(node);
      }
      else if (type == ITERATE_INSTRUCTION) {
        return new RexxIterateInstructionImpl(node);
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
      else if (type == NUMERIC_INSTRUCTION) {
        return new RexxNumericInstructionImpl(node);
      }
      else if (type == PARENTHETICAL_EXPRESSION) {
        return new RexxParentheticalExpressionImpl(node);
      }
      else if (type == PARSE_ARG_INSTRUCTION) {
        return new RexxParseArgInstructionImpl(node);
      }
      else if (type == PARSE_PULL_INSTRUCTION) {
        return new RexxParsePullInstructionImpl(node);
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
