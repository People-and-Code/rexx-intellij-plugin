// This is a generated file. Not intended for manual editing.
package se.peopleandcode.rexxintellijplugin.gen;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import se.peopleandcode.rexxintellijplugin.RexxElementType;
import se.peopleandcode.rexxintellijplugin.RexxTokenType;
import se.peopleandcode.rexxintellijplugin.gen.impl.*;

public interface RexxTokens {

  IElementType ADDITION_EXPR = new RexxElementType("ADDITION_EXPR");
  IElementType ADDITIVE_OPERATOR = new RexxElementType("ADDITIVE_OPERATOR");
  IElementType ADDRESS_INSTRUCTION = new RexxElementType("ADDRESS_INSTRUCTION");
  IElementType ALIAS_EXPR = new RexxElementType("ALIAS_EXPR");
  IElementType AND_EXPR = new RexxElementType("AND_EXPR");
  IElementType ARG_INSTRUCTION = new RexxElementType("ARG_INSTRUCTION");
  IElementType ASSIGNMENT_INSTRUCTION = new RexxElementType("ASSIGNMENT_INSTRUCTION");
  IElementType CALL_INSTRUCTION = new RexxElementType("CALL_INSTRUCTION");
  IElementType COMPARISON_EXPR = new RexxElementType("COMPARISON_EXPR");
  IElementType CONCATENATION_EXPR = new RexxElementType("CONCATENATION_EXPR");
  IElementType DECIMAL_CONSTANT = new RexxElementType("DECIMAL_CONSTANT");
  IElementType DO_INSTRUCTION = new RexxElementType("DO_INSTRUCTION");
  IElementType DROP_INSTRUCTION = new RexxElementType("DROP_INSTRUCTION");
  IElementType EXIT_INSTRUCTION = new RexxElementType("EXIT_INSTRUCTION");
  IElementType EXPR = new RexxElementType("EXPR");
  IElementType EXPRESSION_INSTRUCTION = new RexxElementType("EXPRESSION_INSTRUCTION");
  IElementType GLOBAL = new RexxElementType("GLOBAL");
  IElementType IDENTIFIER_ = new RexxElementType("IDENTIFIER_");
  IElementType IF_INSTRUCTION = new RexxElementType("IF_INSTRUCTION");
  IElementType INSTRUCTION = new RexxElementType("INSTRUCTION");
  IElementType INTEGER_CONSTANT = new RexxElementType("INTEGER_CONSTANT");
  IElementType INTERPRET_INSTRUCTION = new RexxElementType("INTERPRET_INSTRUCTION");
  IElementType INVOKE = new RexxElementType("INVOKE");
  IElementType ITERATE_INSTRUCTION = new RexxElementType("ITERATE_INSTRUCTION");
  IElementType LABEL = new RexxElementType("LABEL");
  IElementType LEAVE_INSTRUCTION = new RexxElementType("LEAVE_INSTRUCTION");
  IElementType MULTIPLICATION_EXPR = new RexxElementType("MULTIPLICATION_EXPR");
  IElementType MULTIPLICATIVE_OPERATOR = new RexxElementType("MULTIPLICATIVE_OPERATOR");
  IElementType NAME_DECLARATION = new RexxElementType("NAME_DECLARATION");
  IElementType NOP_INSTRUCTION = new RexxElementType("NOP_INSTRUCTION");
  IElementType NUMERIC_INSTRUCTION = new RexxElementType("NUMERIC_INSTRUCTION");
  IElementType OPTIONS_INSTRUCTION = new RexxElementType("OPTIONS_INSTRUCTION");
  IElementType OR_OPERATOR = new RexxElementType("OR_OPERATOR");
  IElementType OTHERWISE_BRANCH = new RexxElementType("OTHERWISE_BRANCH");
  IElementType PARENTHETICAL_EXPRESSION = new RexxElementType("PARENTHETICAL_EXPRESSION");
  IElementType PARSE_INSTRUCTION = new RexxElementType("PARSE_INSTRUCTION");
  IElementType POWER_EXPR = new RexxElementType("POWER_EXPR");
  IElementType PREFIX_EXPR = new RexxElementType("PREFIX_EXPR");
  IElementType PROCEDURE_INSTRUCTION = new RexxElementType("PROCEDURE_INSTRUCTION");
  IElementType PULL_INSTRUCTION = new RexxElementType("PULL_INSTRUCTION");
  IElementType RETURN_INSTRUCTION = new RexxElementType("RETURN_INSTRUCTION");
  IElementType SAY_INSTRUCTION = new RexxElementType("SAY_INSTRUCTION");
  IElementType SCIENTIFIC_CONSTANT = new RexxElementType("SCIENTIFIC_CONSTANT");
  IElementType SELECT_BODY = new RexxElementType("SELECT_BODY");
  IElementType SELECT_INSTRUCTION = new RexxElementType("SELECT_INSTRUCTION");
  IElementType SIGNAL_INSTRUCTION = new RexxElementType("SIGNAL_INSTRUCTION");
  IElementType STRING_LITERAL = new RexxElementType("STRING_LITERAL");
  IElementType TERM_EXPR = new RexxElementType("TERM_EXPR");
  IElementType TRACE_INSTRUCTION = new RexxElementType("TRACE_INSTRUCTION");
  IElementType USE_INSTRUCTION = new RexxElementType("USE_INSTRUCTION");
  IElementType VARIABLE = new RexxElementType("VARIABLE");
  IElementType WHEN_BRANCH = new RexxElementType("WHEN_BRANCH");

  IElementType ADDRESS = new RexxTokenType("ADDRESS");
  IElementType ALT_GT = new RexxTokenType("\\>");
  IElementType ALT_LT = new RexxTokenType("\\<");
  IElementType ARG = new RexxTokenType("ARG");
  IElementType ATTRIBUTE = new RexxTokenType("ATTRIBUTE");
  IElementType CALL = new RexxTokenType("CALL");
  IElementType CASELESS = new RexxTokenType("CASELESS");
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
  IElementType LOWER = new RexxTokenType("LOWER");
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
  IElementType PLUS_EQ = new RexxTokenType("+=");
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
  IElementType UPPER = new RexxTokenType("UPPER");
  IElementType USE = new RexxTokenType("USE");
  IElementType VALUE = new RexxTokenType("VALUE");
  IElementType VAR = new RexxTokenType("VAR");
  IElementType WHEN = new RexxTokenType("WHEN");
  IElementType WHILE = new RexxTokenType("WHILE");
  IElementType WITH = new RexxTokenType("WITH");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ADDITION_EXPR) {
        return new RexxAdditionExprImpl(node);
      }
      else if (type == ADDITIVE_OPERATOR) {
        return new RexxAdditiveOperatorImpl(node);
      }
      else if (type == ADDRESS_INSTRUCTION) {
        return new RexxAddressInstructionImpl(node);
      }
      else if (type == ALIAS_EXPR) {
        return new RexxAliasExprImpl(node);
      }
      else if (type == AND_EXPR) {
        return new RexxAndExprImpl(node);
      }
      else if (type == ARG_INSTRUCTION) {
        return new RexxArgInstructionImpl(node);
      }
      else if (type == ASSIGNMENT_INSTRUCTION) {
        return new RexxAssignmentInstructionImpl(node);
      }
      else if (type == CALL_INSTRUCTION) {
        return new RexxCallInstructionImpl(node);
      }
      else if (type == COMPARISON_EXPR) {
        return new RexxComparisonExprImpl(node);
      }
      else if (type == CONCATENATION_EXPR) {
        return new RexxConcatenationExprImpl(node);
      }
      else if (type == DECIMAL_CONSTANT) {
        return new RexxDecimalConstantImpl(node);
      }
      else if (type == DO_INSTRUCTION) {
        return new RexxDoInstructionImpl(node);
      }
      else if (type == DROP_INSTRUCTION) {
        return new RexxDropInstructionImpl(node);
      }
      else if (type == EXIT_INSTRUCTION) {
        return new RexxExitInstructionImpl(node);
      }
      else if (type == EXPRESSION_INSTRUCTION) {
        return new RexxExpressionInstructionImpl(node);
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
      else if (type == INTEGER_CONSTANT) {
        return new RexxIntegerConstantImpl(node);
      }
      else if (type == INTERPRET_INSTRUCTION) {
        return new RexxInterpretInstructionImpl(node);
      }
      else if (type == INVOKE) {
        return new RexxInvokeImpl(node);
      }
      else if (type == ITERATE_INSTRUCTION) {
        return new RexxIterateInstructionImpl(node);
      }
      else if (type == LABEL) {
        return new RexxLabelImpl(node);
      }
      else if (type == LEAVE_INSTRUCTION) {
        return new RexxLeaveInstructionImpl(node);
      }
      else if (type == MULTIPLICATION_EXPR) {
        return new RexxMultiplicationExprImpl(node);
      }
      else if (type == MULTIPLICATIVE_OPERATOR) {
        return new RexxMultiplicativeOperatorImpl(node);
      }
      else if (type == NAME_DECLARATION) {
        return new RexxNameDeclarationImpl(node);
      }
      else if (type == NOP_INSTRUCTION) {
        return new RexxNopInstructionImpl(node);
      }
      else if (type == NUMERIC_INSTRUCTION) {
        return new RexxNumericInstructionImpl(node);
      }
      else if (type == OPTIONS_INSTRUCTION) {
        return new RexxOptionsInstructionImpl(node);
      }
      else if (type == OR_OPERATOR) {
        return new RexxOrOperatorImpl(node);
      }
      else if (type == OTHERWISE_BRANCH) {
        return new RexxOtherwiseBranchImpl(node);
      }
      else if (type == PARENTHETICAL_EXPRESSION) {
        return new RexxParentheticalExpressionImpl(node);
      }
      else if (type == PARSE_INSTRUCTION) {
        return new RexxParseInstructionImpl(node);
      }
      else if (type == POWER_EXPR) {
        return new RexxPowerExprImpl(node);
      }
      else if (type == PREFIX_EXPR) {
        return new RexxPrefixExprImpl(node);
      }
      else if (type == PROCEDURE_INSTRUCTION) {
        return new RexxProcedureInstructionImpl(node);
      }
      else if (type == PULL_INSTRUCTION) {
        return new RexxPullInstructionImpl(node);
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
      else if (type == SELECT_BODY) {
        return new RexxSelectBodyImpl(node);
      }
      else if (type == SELECT_INSTRUCTION) {
        return new RexxSelectInstructionImpl(node);
      }
      else if (type == SIGNAL_INSTRUCTION) {
        return new RexxSignalInstructionImpl(node);
      }
      else if (type == STRING_LITERAL) {
        return new RexxStringLiteralImpl(node);
      }
      else if (type == TERM_EXPR) {
        return new RexxTermExprImpl(node);
      }
      else if (type == TRACE_INSTRUCTION) {
        return new RexxTraceInstructionImpl(node);
      }
      else if (type == USE_INSTRUCTION) {
        return new RexxUseInstructionImpl(node);
      }
      else if (type == VARIABLE) {
        return new RexxVariableImpl(node);
      }
      else if (type == WHEN_BRANCH) {
        return new RexxWhenBranchImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
