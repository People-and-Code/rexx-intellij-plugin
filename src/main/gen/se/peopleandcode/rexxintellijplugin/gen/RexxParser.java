// This is a generated file. Not intended for manual editing.
package se.peopleandcode.rexxintellijplugin.gen;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static se.peopleandcode.rexxintellijplugin.gen.RexxTokens.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class RexxParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    parseLight(root_, builder_);
    return builder_.getTreeBuilt();
  }

  public void parseLight(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, null);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    result_ = parse_root_(root_, builder_);
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType root_, PsiBuilder builder_) {
    return parse_root_(root_, builder_, 0);
  }

  static boolean parse_root_(IElementType root_, PsiBuilder builder_, int level_) {
    return rexx_file(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // subtraction_ (OPERATOR_PLUS subtraction_)*
  public static boolean addition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "addition")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ADDITION, "<addition>");
    result_ = subtraction_(builder_, level_ + 1);
    result_ = result_ && addition_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (OPERATOR_PLUS subtraction_)*
  private static boolean addition_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "addition_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!addition_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "addition_1", pos_)) break;
    }
    return true;
  }

  // OPERATOR_PLUS subtraction_
  private static boolean addition_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "addition_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OPERATOR_PLUS);
    result_ = result_ && subtraction_(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // KEYWORD_ADDRESS expressions
  public static boolean address_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "address_instruction")) return false;
    if (!nextTokenIs(builder_, KEYWORD_ADDRESS)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KEYWORD_ADDRESS);
    result_ = result_ && expressions(builder_, level_ + 1);
    exit_section_(builder_, marker_, ADDRESS_INSTRUCTION, result_);
    return result_;
  }

  /* ********************************************************** */
  // name_declaration OPERATOR_EQUAL expressions
  public static boolean assignment(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assignment")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ASSIGNMENT, "<assignment>");
    result_ = name_declaration(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OPERATOR_EQUAL);
    result_ = result_ && expressions(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // KEYWORD_CALL IDENTIFIER comma_seperated_arguments
  public static boolean call_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "call_instruction")) return false;
    if (!nextTokenIs(builder_, KEYWORD_CALL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KEYWORD_CALL, IDENTIFIER);
    result_ = result_ && comma_seperated_arguments(builder_, level_ + 1);
    exit_section_(builder_, marker_, CALL_INSTRUCTION, result_);
    return result_;
  }

  /* ********************************************************** */
  // expression? (COMMA expression?)*
  static boolean comma_seperated_arguments(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "comma_seperated_arguments")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = comma_seperated_arguments_0(builder_, level_ + 1);
    result_ = result_ && comma_seperated_arguments_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expression?
  private static boolean comma_seperated_arguments_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "comma_seperated_arguments_0")) return false;
    expression(builder_, level_ + 1);
    return true;
  }

  // (COMMA expression?)*
  private static boolean comma_seperated_arguments_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "comma_seperated_arguments_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!comma_seperated_arguments_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "comma_seperated_arguments_1", pos_)) break;
    }
    return true;
  }

  // COMMA expression?
  private static boolean comma_seperated_arguments_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "comma_seperated_arguments_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && comma_seperated_arguments_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expression?
  private static boolean comma_seperated_arguments_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "comma_seperated_arguments_1_0_1")) return false;
    expression(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // expression_instruction
  static boolean command(PsiBuilder builder_, int level_) {
    return expression_instruction(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // addition (compare_operators addition)?
  public static boolean compare(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "compare")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, COMPARE, "<compare>");
    result_ = addition(builder_, level_ + 1);
    result_ = result_ && compare_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (compare_operators addition)?
  private static boolean compare_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "compare_1")) return false;
    compare_1_0(builder_, level_ + 1);
    return true;
  }

  // compare_operators addition
  private static boolean compare_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "compare_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = compare_operators(builder_, level_ + 1);
    result_ = result_ && addition(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // OPERATOR_EQUAL
  //     | OPERATOR_NOT_EQUAL
  //     | OPERATOR_GREATERTHAN
  //     | OPERATOR_LESSTHAN
  //     | OPERATOR_GREATERTHAN_EQUAL
  //     | OPERATOR_LESSTHAN_EQUAL
  static boolean compare_operators(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "compare_operators")) return false;
    boolean result_;
    result_ = consumeToken(builder_, OPERATOR_EQUAL);
    if (!result_) result_ = consumeToken(builder_, OPERATOR_NOT_EQUAL);
    if (!result_) result_ = consumeToken(builder_, OPERATOR_GREATERTHAN);
    if (!result_) result_ = consumeToken(builder_, OPERATOR_LESSTHAN);
    if (!result_) result_ = consumeToken(builder_, OPERATOR_GREATERTHAN_EQUAL);
    if (!result_) result_ = consumeToken(builder_, OPERATOR_LESSTHAN_EQUAL);
    return result_;
  }

  /* ********************************************************** */
  // compare (OPERATOR_CONCATENATE? !keywords compare)*
  public static boolean concatenation(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "concatenation")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CONCATENATION, "<concatenation>");
    result_ = compare(builder_, level_ + 1);
    result_ = result_ && concatenation_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (OPERATOR_CONCATENATE? !keywords compare)*
  private static boolean concatenation_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "concatenation_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!concatenation_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "concatenation_1", pos_)) break;
    }
    return true;
  }

  // OPERATOR_CONCATENATE? !keywords compare
  private static boolean concatenation_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "concatenation_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = concatenation_1_0_0(builder_, level_ + 1);
    result_ = result_ && concatenation_1_0_1(builder_, level_ + 1);
    result_ = result_ && compare(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // OPERATOR_CONCATENATE?
  private static boolean concatenation_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "concatenation_1_0_0")) return false;
    consumeToken(builder_, OPERATOR_CONCATENATE);
    return true;
  }

  // !keywords
  private static boolean concatenation_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "concatenation_1_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !keywords(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // 'WHILE' whileexpr | 'UNTIL' untilexpr
  static boolean conditional(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "conditional")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = conditional_0(builder_, level_ + 1);
    if (!result_) result_ = conditional_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // 'WHILE' whileexpr
  private static boolean conditional_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "conditional_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "WHILE");
    result_ = result_ && whileexpr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // 'UNTIL' untilexpr
  private static boolean conditional_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "conditional_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "UNTIL");
    result_ = result_ && untilexpr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // NUMBER_DECIMAL
  public static boolean decimalConstant(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "decimalConstant")) return false;
    if (!nextTokenIs(builder_, NUMBER_DECIMAL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, NUMBER_DECIMAL);
    exit_section_(builder_, marker_, DECIMAL_CONSTANT, result_);
    return result_;
  }

  /* ********************************************************** */
  // OPERATOR_DIVIDE expressionTerm
  public static boolean division(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "division")) return false;
    if (!nextTokenIs(builder_, OPERATOR_DIVIDE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _LEFT_, DIVISION, null);
    result_ = consumeToken(builder_, OPERATOR_DIVIDE);
    result_ = result_ && expressionTerm(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // expressionTerm division*
  static boolean division_(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "division_")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expressionTerm(builder_, level_ + 1);
    result_ = result_ && division__1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // division*
  private static boolean division__1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "division__1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!division(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "division__1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KEYWORD_END name_declaration? ncl
  static boolean do_ending(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "do_ending")) return false;
    if (!nextTokenIs(builder_, KEYWORD_END)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KEYWORD_END);
    result_ = result_ && do_ending_1(builder_, level_ + 1);
    result_ = result_ && ncl(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // name_declaration?
  private static boolean do_ending_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "do_ending_1")) return false;
    name_declaration(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // KEYWORD_DO /*[group_option+]*/
  //     ( dorep
  //     | conditional
  //     | dorep conditional
  //     )?
  static boolean do_specification(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "do_specification")) return false;
    if (!nextTokenIs(builder_, KEYWORD_DO)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KEYWORD_DO);
    result_ = result_ && do_specification_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ( dorep
  //     | conditional
  //     | dorep conditional
  //     )?
  private static boolean do_specification_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "do_specification_1")) return false;
    do_specification_1_0(builder_, level_ + 1);
    return true;
  }

  // dorep
  //     | conditional
  //     | dorep conditional
  private static boolean do_specification_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "do_specification_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = dorep(builder_, level_ + 1);
    if (!result_) result_ = conditional(builder_, level_ + 1);
    if (!result_) result_ = do_specification_1_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // dorep conditional
  private static boolean do_specification_1_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "do_specification_1_0_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = dorep(builder_, level_ + 1);
    result_ = result_ && conditional(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // 'FORVER' | repetitor
  static boolean dorep(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dorep")) return false;
    boolean result_;
    result_ = consumeToken(builder_, "FORVER");
    if (!result_) result_ = repetitor(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // KEYWORD_ELSE ncl? (instruction | END)
  static boolean else_$(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "else_$")) return false;
    if (!nextTokenIs(builder_, KEYWORD_ELSE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KEYWORD_ELSE);
    result_ = result_ && else_1(builder_, level_ + 1);
    result_ = result_ && else_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ncl?
  private static boolean else_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "else_1")) return false;
    ncl(builder_, level_ + 1);
    return true;
  }

  // instruction | END
  private static boolean else_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "else_2")) return false;
    boolean result_;
    result_ = instruction(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, END);
    return result_;
  }

  /* ********************************************************** */
  // KEYWORD_EXIT expression?
  public static boolean exit_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exit_instruction")) return false;
    if (!nextTokenIs(builder_, KEYWORD_EXIT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KEYWORD_EXIT);
    result_ = result_ && exit_instruction_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, EXIT_INSTRUCTION, result_);
    return result_;
  }

  // expression?
  private static boolean exit_instruction_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exit_instruction_1")) return false;
    expression(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // concatenation
  public static boolean expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, EXPRESSION, "<expression>");
    result_ = concatenation(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // stringLiteral
  //     | numericConstant
  //     | functionCall
  //     | methodCall
  //     | stem
  //     | variable_
  //     | parentheticalExpression
  public static boolean expressionTerm(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expressionTerm")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, EXPRESSION_TERM, "<expression term>");
    result_ = stringLiteral(builder_, level_ + 1);
    if (!result_) result_ = numericConstant(builder_, level_ + 1);
    if (!result_) result_ = functionCall(builder_, level_ + 1);
    if (!result_) result_ = methodCall(builder_, level_ + 1);
    if (!result_) result_ = stem(builder_, level_ + 1);
    if (!result_) result_ = variable_(builder_, level_ + 1);
    if (!result_) result_ = parentheticalExpression(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // &IDENTIFIER expression
  //     | &stringLiteral expression
  public static boolean expression_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_instruction")) return false;
    if (!nextTokenIs(builder_, "<expression instruction>", IDENTIFIER, STRING)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, EXPRESSION_INSTRUCTION, "<expression instruction>");
    result_ = expression_instruction_0(builder_, level_ + 1);
    if (!result_) result_ = expression_instruction_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // &IDENTIFIER expression
  private static boolean expression_instruction_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_instruction_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expression_instruction_0_0(builder_, level_ + 1);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // &IDENTIFIER
  private static boolean expression_instruction_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_instruction_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // &stringLiteral expression
  private static boolean expression_instruction_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_instruction_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expression_instruction_1_0(builder_, level_ + 1);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // &stringLiteral
  private static boolean expression_instruction_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_instruction_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = stringLiteral(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // expression+
  static boolean expressions(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expressions")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expression(builder_, level_ + 1);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!expression(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "expressions", pos_)) break;
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // variable_ TOKEN_LEFT comma_seperated_arguments TOKEN_RIGHT
  public static boolean functionCall(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionCall")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FUNCTION_CALL, "<function call>");
    result_ = variable_(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, TOKEN_LEFT);
    result_ = result_ && comma_seperated_arguments(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, TOKEN_RIGHT);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // DOT IDENTIFIER
  public static boolean global(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "global")) return false;
    if (!nextTokenIs(builder_, DOT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DOT, IDENTIFIER);
    exit_section_(builder_, marker_, GLOBAL, result_);
    return result_;
  }

  /* ********************************************************** */
  // instruction_block | if_instruction
  static boolean group(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "group")) return false;
    if (!nextTokenIs(builder_, "", KEYWORD_DO, KEYWORD_IF)) return false;
    boolean result_;
    result_ = instruction_block(builder_, level_ + 1);
    if (!result_) result_ = if_instruction(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER | keywords
  public static boolean identifier_(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identifier_")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, IDENTIFIER_, "<identifier>");
    result_ = consumeToken(builder_, IDENTIFIER);
    if (!result_) result_ = keywords(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // KEYWORD_IF expression ncl? then else?
  public static boolean if_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "if_instruction")) return false;
    if (!nextTokenIs(builder_, KEYWORD_IF)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KEYWORD_IF);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && if_instruction_2(builder_, level_ + 1);
    result_ = result_ && then(builder_, level_ + 1);
    result_ = result_ && if_instruction_4(builder_, level_ + 1);
    exit_section_(builder_, marker_, IF_INSTRUCTION, result_);
    return result_;
  }

  // ncl?
  private static boolean if_instruction_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "if_instruction_2")) return false;
    ncl(builder_, level_ + 1);
    return true;
  }

  // else?
  private static boolean if_instruction_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "if_instruction_4")) return false;
    else_$(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // group | single_instruction ncl
  static boolean instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "instruction")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = group(builder_, level_ + 1);
    if (!result_) result_ = instruction_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // single_instruction ncl
  private static boolean instruction_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "instruction_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = single_instruction(builder_, level_ + 1);
    result_ = result_ && ncl(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // do_specification ncl
  //     instruction_list?
  //     do_ending
  public static boolean instruction_block(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "instruction_block")) return false;
    if (!nextTokenIs(builder_, KEYWORD_DO)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = do_specification(builder_, level_ + 1);
    result_ = result_ && ncl(builder_, level_ + 1);
    result_ = result_ && instruction_block_2(builder_, level_ + 1);
    result_ = result_ && do_ending(builder_, level_ + 1);
    exit_section_(builder_, marker_, INSTRUCTION_BLOCK, result_);
    return result_;
  }

  // instruction_list?
  private static boolean instruction_block_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "instruction_block_2")) return false;
    instruction_list(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // instruction+
  static boolean instruction_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "instruction_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = instruction(builder_, level_ + 1);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!instruction(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "instruction_list", pos_)) break;
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // NUMBER_INT
  public static boolean integerConstant(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "integerConstant")) return false;
    if (!nextTokenIs(builder_, NUMBER_INT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, NUMBER_INT);
    exit_section_(builder_, marker_, INTEGER_CONSTANT, result_);
    return result_;
  }

  /* ********************************************************** */
  // address_instruction
  //     /*| arg*/
  //     | call_instruction
  //     /*| drop*/
  //     | exit_instruction
  //     /*| interop*/
  //     /*| iterate*/
  //     /*| leave*/
  //     /*| nop*/
  //     | numeric_instruction
  //     /*| options*/
  //     | parse_instruction
  //     /*| procedure */
  //     | return_instruction
  //     | say_instruction
  //     | signal_instruction
  //     | trace_instruction
  static boolean keyword_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "keyword_instruction")) return false;
    boolean result_;
    result_ = address_instruction(builder_, level_ + 1);
    if (!result_) result_ = call_instruction(builder_, level_ + 1);
    if (!result_) result_ = exit_instruction(builder_, level_ + 1);
    if (!result_) result_ = numeric_instruction(builder_, level_ + 1);
    if (!result_) result_ = parse_instruction(builder_, level_ + 1);
    if (!result_) result_ = return_instruction(builder_, level_ + 1);
    if (!result_) result_ = say_instruction(builder_, level_ + 1);
    if (!result_) result_ = signal_instruction(builder_, level_ + 1);
    if (!result_) result_ = trace_instruction(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // KEYWORD_ADDRESS
  //     |  KEYWORD_ARG
  //     |  KEYWORD_VAR
  //     |  KEYWORD_VALUE
  //     |  KEYWORD_WITH
  //     |  KEYWORD_CALL
  //     |  KEYWORD_DO
  //     |  KEYWORD_DROP
  //     |  KEYWORD_ELSE
  //     |  KEYWORD_END
  //     |  KEYWORD_EXIT
  //     |  KEYWORD_EXPOSE
  //     |  KEYWORD_FORWARD
  //     |  KEYWORD_GUARD
  //     |  KEYWORD_IF
  //     |  KEYWORD_INTERPRET
  //     |  KEYWORD_ITERATE
  //     |  KEYWORD_LEAVE
  //     |  KEYWORD_LOOP
  //     |  KEYWORD_NOP
  //     |  KEYWORD_NUMERIC
  //     |  KEYWORD_OPTIONS
  //     |  KEYWORD_OTHERWISE
  //     |  KEYWORD_PARSE
  //     |  KEYWORD_PROCEDURE
  //     |  KEYWORD_PULL
  //     |  KEYWORD_PUSH
  //     |  KEYWORD_QUEUE
  //     |  KEYWORD_RAISE
  //     |  KEYWORD_REPLY
  //     |  KEYWORD_RETURN
  //     |  KEYWORD_SAY
  //     |  KEYWORD_SELECT
  //     |  KEYWORD_SOURCE
  //     |  KEYWORD_SIGNAL
  //     |  KEYWORD_THEN
  //     |  KEYWORD_TRACE
  //     |  KEYWORD_USE
  //     |  KEYWORD_WHILE
  static boolean keywords(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "keywords")) return false;
    boolean result_;
    result_ = consumeToken(builder_, KEYWORD_ADDRESS);
    if (!result_) result_ = consumeToken(builder_, KEYWORD_ARG);
    if (!result_) result_ = consumeToken(builder_, KEYWORD_VAR);
    if (!result_) result_ = consumeToken(builder_, KEYWORD_VALUE);
    if (!result_) result_ = consumeToken(builder_, KEYWORD_WITH);
    if (!result_) result_ = consumeToken(builder_, KEYWORD_CALL);
    if (!result_) result_ = consumeToken(builder_, KEYWORD_DO);
    if (!result_) result_ = consumeToken(builder_, KEYWORD_DROP);
    if (!result_) result_ = consumeToken(builder_, KEYWORD_ELSE);
    if (!result_) result_ = consumeToken(builder_, KEYWORD_END);
    if (!result_) result_ = consumeToken(builder_, KEYWORD_EXIT);
    if (!result_) result_ = consumeToken(builder_, KEYWORD_EXPOSE);
    if (!result_) result_ = consumeToken(builder_, KEYWORD_FORWARD);
    if (!result_) result_ = consumeToken(builder_, KEYWORD_GUARD);
    if (!result_) result_ = consumeToken(builder_, KEYWORD_IF);
    if (!result_) result_ = consumeToken(builder_, KEYWORD_INTERPRET);
    if (!result_) result_ = consumeToken(builder_, KEYWORD_ITERATE);
    if (!result_) result_ = consumeToken(builder_, KEYWORD_LEAVE);
    if (!result_) result_ = consumeToken(builder_, KEYWORD_LOOP);
    if (!result_) result_ = consumeToken(builder_, KEYWORD_NOP);
    if (!result_) result_ = consumeToken(builder_, KEYWORD_NUMERIC);
    if (!result_) result_ = consumeToken(builder_, KEYWORD_OPTIONS);
    if (!result_) result_ = consumeToken(builder_, KEYWORD_OTHERWISE);
    if (!result_) result_ = consumeToken(builder_, KEYWORD_PARSE);
    if (!result_) result_ = consumeToken(builder_, KEYWORD_PROCEDURE);
    if (!result_) result_ = consumeToken(builder_, KEYWORD_PULL);
    if (!result_) result_ = consumeToken(builder_, KEYWORD_PUSH);
    if (!result_) result_ = consumeToken(builder_, KEYWORD_QUEUE);
    if (!result_) result_ = consumeToken(builder_, KEYWORD_RAISE);
    if (!result_) result_ = consumeToken(builder_, KEYWORD_REPLY);
    if (!result_) result_ = consumeToken(builder_, KEYWORD_RETURN);
    if (!result_) result_ = consumeToken(builder_, KEYWORD_SAY);
    if (!result_) result_ = consumeToken(builder_, KEYWORD_SELECT);
    if (!result_) result_ = consumeToken(builder_, KEYWORD_SOURCE);
    if (!result_) result_ = consumeToken(builder_, KEYWORD_SIGNAL);
    if (!result_) result_ = consumeToken(builder_, KEYWORD_THEN);
    if (!result_) result_ = consumeToken(builder_, KEYWORD_TRACE);
    if (!result_) result_ = consumeToken(builder_, KEYWORD_USE);
    if (!result_) result_ = consumeToken(builder_, KEYWORD_WHILE);
    return result_;
  }

  /* ********************************************************** */
  // name_declaration COLON (KEYWORD_PROCEDURE (KEYWORD_EXPOSE IDENTIFIER)? DOT?)?
  public static boolean label_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "label_instruction")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, LABEL_INSTRUCTION, "<label instruction>");
    result_ = name_declaration(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON);
    result_ = result_ && label_instruction_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (KEYWORD_PROCEDURE (KEYWORD_EXPOSE IDENTIFIER)? DOT?)?
  private static boolean label_instruction_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "label_instruction_2")) return false;
    label_instruction_2_0(builder_, level_ + 1);
    return true;
  }

  // KEYWORD_PROCEDURE (KEYWORD_EXPOSE IDENTIFIER)? DOT?
  private static boolean label_instruction_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "label_instruction_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KEYWORD_PROCEDURE);
    result_ = result_ && label_instruction_2_0_1(builder_, level_ + 1);
    result_ = result_ && label_instruction_2_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (KEYWORD_EXPOSE IDENTIFIER)?
  private static boolean label_instruction_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "label_instruction_2_0_1")) return false;
    label_instruction_2_0_1_0(builder_, level_ + 1);
    return true;
  }

  // KEYWORD_EXPOSE IDENTIFIER
  private static boolean label_instruction_2_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "label_instruction_2_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KEYWORD_EXPOSE, IDENTIFIER);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // DOT?
  private static boolean label_instruction_2_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "label_instruction_2_0_2")) return false;
    consumeToken(builder_, DOT);
    return true;
  }

  /* ********************************************************** */
  // (LABEL terminator)+
  static boolean label_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "label_list")) return false;
    if (!nextTokenIs(builder_, LABEL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = label_list_0(builder_, level_ + 1);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!label_list_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "label_list", pos_)) break;
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LABEL terminator
  private static boolean label_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "label_list_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LABEL);
    result_ = result_ && terminator(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // variable_ TILDE IDENTIFIER TOKEN_LEFT expression? (COMMA expression?)* TOKEN_RIGHT
  public static boolean methodCall(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "methodCall")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, METHOD_CALL, "<method call>");
    result_ = variable_(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, TILDE, IDENTIFIER, TOKEN_LEFT);
    result_ = result_ && methodCall_4(builder_, level_ + 1);
    result_ = result_ && methodCall_5(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, TOKEN_RIGHT);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // expression?
  private static boolean methodCall_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "methodCall_4")) return false;
    expression(builder_, level_ + 1);
    return true;
  }

  // (COMMA expression?)*
  private static boolean methodCall_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "methodCall_5")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!methodCall_5_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "methodCall_5", pos_)) break;
    }
    return true;
  }

  // COMMA expression?
  private static boolean methodCall_5_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "methodCall_5_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && methodCall_5_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expression?
  private static boolean methodCall_5_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "methodCall_5_0_1")) return false;
    expression(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // division_ (OPERATOR_MULTIPLY division_)*
  public static boolean multiplication(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "multiplication")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MULTIPLICATION, "<multiplication>");
    result_ = division_(builder_, level_ + 1);
    result_ = result_ && multiplication_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (OPERATOR_MULTIPLY division_)*
  private static boolean multiplication_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "multiplication_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!multiplication_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "multiplication_1", pos_)) break;
    }
    return true;
  }

  // OPERATOR_MULTIPLY division_
  private static boolean multiplication_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "multiplication_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OPERATOR_MULTIPLY);
    result_ = result_ && division_(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // identifier_
  public static boolean name_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "name_declaration")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, NAME_DECLARATION, "<name declaration>");
    result_ = identifier_(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // <<eof>> | null_clause+
  static boolean ncl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ncl")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = eof(builder_, level_ + 1);
    if (!result_) result_ = ncl_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // null_clause+
  private static boolean ncl_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ncl_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = null_clause(builder_, level_ + 1);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!null_clause(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "ncl_1", pos_)) break;
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // terminator label_list?
  static boolean null_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "null_clause")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = terminator(builder_, level_ + 1);
    result_ = result_ && null_clause_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // label_list?
  private static boolean null_clause_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "null_clause_1")) return false;
    label_list(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // integerConstant | decimalConstant | scientificConstant
  public static boolean numericConstant(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "numericConstant")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, NUMERIC_CONSTANT, "<numeric constant>");
    result_ = integerConstant(builder_, level_ + 1);
    if (!result_) result_ = decimalConstant(builder_, level_ + 1);
    if (!result_) result_ = scientificConstant(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // KEYWORD_NUMERIC IDENTIFIER integerConstant
  public static boolean numeric_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "numeric_instruction")) return false;
    if (!nextTokenIs(builder_, KEYWORD_NUMERIC)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KEYWORD_NUMERIC, IDENTIFIER);
    result_ = result_ && integerConstant(builder_, level_ + 1);
    exit_section_(builder_, marker_, NUMERIC_INSTRUCTION, result_);
    return result_;
  }

  /* ********************************************************** */
  // VAR_SYMBOL 'OVER' expression
  //     | numericConstant 'OVER'
  static boolean over(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "over")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = over_0(builder_, level_ + 1);
    if (!result_) result_ = over_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // VAR_SYMBOL 'OVER' expression
  private static boolean over_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "over_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, VAR_SYMBOL);
    result_ = result_ && consumeToken(builder_, "OVER");
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // numericConstant 'OVER'
  private static boolean over_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "over_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = numericConstant(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "OVER");
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // TOKEN_LEFT expression TOKEN_RIGHT
  public static boolean parentheticalExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parentheticalExpression")) return false;
    if (!nextTokenIs(builder_, TOKEN_LEFT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TOKEN_LEFT);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, TOKEN_RIGHT);
    exit_section_(builder_, marker_, PARENTHETICAL_EXPRESSION, result_);
    return result_;
  }

  /* ********************************************************** */
  // KEYWORD_PARSE KEYWORD_ARG parse_target* (COMMA parse_target*)*
  public static boolean parse_arg_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parse_arg_instruction")) return false;
    if (!nextTokenIs(builder_, KEYWORD_PARSE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KEYWORD_PARSE, KEYWORD_ARG);
    result_ = result_ && parse_arg_instruction_2(builder_, level_ + 1);
    result_ = result_ && parse_arg_instruction_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, PARSE_ARG_INSTRUCTION, result_);
    return result_;
  }

  // parse_target*
  private static boolean parse_arg_instruction_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parse_arg_instruction_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!parse_target(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "parse_arg_instruction_2", pos_)) break;
    }
    return true;
  }

  // (COMMA parse_target*)*
  private static boolean parse_arg_instruction_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parse_arg_instruction_3")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!parse_arg_instruction_3_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "parse_arg_instruction_3", pos_)) break;
    }
    return true;
  }

  // COMMA parse_target*
  private static boolean parse_arg_instruction_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parse_arg_instruction_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && parse_arg_instruction_3_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // parse_target*
  private static boolean parse_arg_instruction_3_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parse_arg_instruction_3_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!parse_target(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "parse_arg_instruction_3_0_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // parse_arg_instruction
  //     | parse_pull_instruction
  //     | parse_var_instruction
  //     | parse_value_instruction
  //     | parse_source_instruction
  static boolean parse_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parse_instruction")) return false;
    if (!nextTokenIs(builder_, KEYWORD_PARSE)) return false;
    boolean result_;
    result_ = parse_arg_instruction(builder_, level_ + 1);
    if (!result_) result_ = parse_pull_instruction(builder_, level_ + 1);
    if (!result_) result_ = parse_var_instruction(builder_, level_ + 1);
    if (!result_) result_ = parse_value_instruction(builder_, level_ + 1);
    if (!result_) result_ = parse_source_instruction(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // KEYWORD_PARSE KEYWORD_PULL parse_target* (COMMA parse_target*)*
  public static boolean parse_pull_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parse_pull_instruction")) return false;
    if (!nextTokenIs(builder_, KEYWORD_PARSE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KEYWORD_PARSE, KEYWORD_PULL);
    result_ = result_ && parse_pull_instruction_2(builder_, level_ + 1);
    result_ = result_ && parse_pull_instruction_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, PARSE_PULL_INSTRUCTION, result_);
    return result_;
  }

  // parse_target*
  private static boolean parse_pull_instruction_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parse_pull_instruction_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!parse_target(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "parse_pull_instruction_2", pos_)) break;
    }
    return true;
  }

  // (COMMA parse_target*)*
  private static boolean parse_pull_instruction_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parse_pull_instruction_3")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!parse_pull_instruction_3_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "parse_pull_instruction_3", pos_)) break;
    }
    return true;
  }

  // COMMA parse_target*
  private static boolean parse_pull_instruction_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parse_pull_instruction_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && parse_pull_instruction_3_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // parse_target*
  private static boolean parse_pull_instruction_3_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parse_pull_instruction_3_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!parse_target(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "parse_pull_instruction_3_0_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KEYWORD_PARSE KEYWORD_SOURCE parse_target*
  public static boolean parse_source_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parse_source_instruction")) return false;
    if (!nextTokenIs(builder_, KEYWORD_PARSE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KEYWORD_PARSE, KEYWORD_SOURCE);
    result_ = result_ && parse_source_instruction_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, PARSE_SOURCE_INSTRUCTION, result_);
    return result_;
  }

  // parse_target*
  private static boolean parse_source_instruction_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parse_source_instruction_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!parse_target(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "parse_source_instruction_2", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER DOT EXCLAMATION? IDENTIFIER
  //     | name_declaration
  //     | stringLiteral
  //     | integerConstant
  //     | remainder
  static boolean parse_target(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parse_target")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = parse_target_0(builder_, level_ + 1);
    if (!result_) result_ = name_declaration(builder_, level_ + 1);
    if (!result_) result_ = stringLiteral(builder_, level_ + 1);
    if (!result_) result_ = integerConstant(builder_, level_ + 1);
    if (!result_) result_ = remainder(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // IDENTIFIER DOT EXCLAMATION? IDENTIFIER
  private static boolean parse_target_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parse_target_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IDENTIFIER, DOT);
    result_ = result_ && parse_target_0_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // EXCLAMATION?
  private static boolean parse_target_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parse_target_0_2")) return false;
    consumeToken(builder_, EXCLAMATION);
    return true;
  }

  /* ********************************************************** */
  // KEYWORD_PARSE KEYWORD_VALUE expression KEYWORD_WITH parse_target*
  public static boolean parse_value_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parse_value_instruction")) return false;
    if (!nextTokenIs(builder_, KEYWORD_PARSE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KEYWORD_PARSE, KEYWORD_VALUE);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, KEYWORD_WITH);
    result_ = result_ && parse_value_instruction_4(builder_, level_ + 1);
    exit_section_(builder_, marker_, PARSE_VALUE_INSTRUCTION, result_);
    return result_;
  }

  // parse_target*
  private static boolean parse_value_instruction_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parse_value_instruction_4")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!parse_target(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "parse_value_instruction_4", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KEYWORD_PARSE KEYWORD_VAR parse_target*
  public static boolean parse_var_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parse_var_instruction")) return false;
    if (!nextTokenIs(builder_, KEYWORD_PARSE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KEYWORD_PARSE, KEYWORD_VAR);
    result_ = result_ && parse_var_instruction_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, PARSE_VAR_INSTRUCTION, result_);
    return result_;
  }

  // parse_target*
  private static boolean parse_var_instruction_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parse_var_instruction_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!parse_target(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "parse_var_instruction_2", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // DOT
  public static boolean remainder(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "remainder")) return false;
    if (!nextTokenIs(builder_, DOT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DOT);
    exit_section_(builder_, marker_, REMAINDER, result_);
    return result_;
  }

  /* ********************************************************** */
  // assignment | expression | over | 'FOREVER'
  static boolean repetitor(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "repetitor")) return false;
    boolean result_;
    result_ = assignment(builder_, level_ + 1);
    if (!result_) result_ = expression(builder_, level_ + 1);
    if (!result_) result_ = over(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, "FOREVER");
    return result_;
  }

  /* ********************************************************** */
  // KEYWORD_RETURN expression?
  public static boolean return_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "return_instruction")) return false;
    if (!nextTokenIs(builder_, KEYWORD_RETURN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KEYWORD_RETURN);
    result_ = result_ && return_instruction_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, RETURN_INSTRUCTION, result_);
    return result_;
  }

  // expression?
  private static boolean return_instruction_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "return_instruction_1")) return false;
    expression(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // ncl? instruction_list? END?
  static boolean rexx_file(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rexx_file")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = rexx_file_0(builder_, level_ + 1);
    result_ = result_ && rexx_file_1(builder_, level_ + 1);
    result_ = result_ && rexx_file_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ncl?
  private static boolean rexx_file_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rexx_file_0")) return false;
    ncl(builder_, level_ + 1);
    return true;
  }

  // instruction_list?
  private static boolean rexx_file_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rexx_file_1")) return false;
    instruction_list(builder_, level_ + 1);
    return true;
  }

  // END?
  private static boolean rexx_file_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rexx_file_2")) return false;
    consumeToken(builder_, END);
    return true;
  }

  /* ********************************************************** */
  // KEYWORD_SAY expressions?
  public static boolean say_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "say_instruction")) return false;
    if (!nextTokenIs(builder_, KEYWORD_SAY)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KEYWORD_SAY);
    result_ = result_ && say_instruction_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, SAY_INSTRUCTION, result_);
    return result_;
  }

  // expressions?
  private static boolean say_instruction_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "say_instruction_1")) return false;
    expressions(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // NUMBER_SCIENTIFIC
  public static boolean scientificConstant(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "scientificConstant")) return false;
    if (!nextTokenIs(builder_, NUMBER_SCIENTIFIC)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, NUMBER_SCIENTIFIC);
    exit_section_(builder_, marker_, SCIENTIFIC_CONSTANT, result_);
    return result_;
  }

  /* ********************************************************** */
  // KEYWORD_SIGNAL expressions
  public static boolean signal_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "signal_instruction")) return false;
    if (!nextTokenIs(builder_, KEYWORD_SIGNAL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KEYWORD_SIGNAL);
    result_ = result_ && expressions(builder_, level_ + 1);
    exit_section_(builder_, marker_, SIGNAL_INSTRUCTION, result_);
    return result_;
  }

  /* ********************************************************** */
  // label_instruction
  //     | assignment
  //     | keyword_instruction
  //     | command
  static boolean single_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "single_instruction")) return false;
    boolean result_;
    result_ = label_instruction(builder_, level_ + 1);
    if (!result_) result_ = assignment(builder_, level_ + 1);
    if (!result_) result_ = keyword_instruction(builder_, level_ + 1);
    if (!result_) result_ = command(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // variable_ (DOT EXCLAMATION? NUMBER_INT? IDENTIFIER)+
  public static boolean stem(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "stem")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, STEM, "<stem>");
    result_ = variable_(builder_, level_ + 1);
    result_ = result_ && stem_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (DOT EXCLAMATION? NUMBER_INT? IDENTIFIER)+
  private static boolean stem_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "stem_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = stem_1_0(builder_, level_ + 1);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!stem_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "stem_1", pos_)) break;
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // DOT EXCLAMATION? NUMBER_INT? IDENTIFIER
  private static boolean stem_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "stem_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DOT);
    result_ = result_ && stem_1_0_1(builder_, level_ + 1);
    result_ = result_ && stem_1_0_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // EXCLAMATION?
  private static boolean stem_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "stem_1_0_1")) return false;
    consumeToken(builder_, EXCLAMATION);
    return true;
  }

  // NUMBER_INT?
  private static boolean stem_1_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "stem_1_0_2")) return false;
    consumeToken(builder_, NUMBER_INT);
    return true;
  }

  /* ********************************************************** */
  // STRING
  public static boolean stringLiteral(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "stringLiteral")) return false;
    if (!nextTokenIs(builder_, STRING)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, STRING);
    exit_section_(builder_, marker_, STRING_LITERAL, result_);
    return result_;
  }

  /* ********************************************************** */
  // OPERATOR_SUBTRACT multiplication
  public static boolean subtraction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "subtraction")) return false;
    if (!nextTokenIs(builder_, OPERATOR_SUBTRACT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _LEFT_, SUBTRACTION, null);
    result_ = consumeToken(builder_, OPERATOR_SUBTRACT);
    result_ = result_ && multiplication(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // multiplication (subtraction)*
  static boolean subtraction_(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "subtraction_")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = multiplication(builder_, level_ + 1);
    result_ = result_ && subtraction__1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (subtraction)*
  private static boolean subtraction__1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "subtraction__1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!subtraction__1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "subtraction__1", pos_)) break;
    }
    return true;
  }

  // (subtraction)
  private static boolean subtraction__1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "subtraction__1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = subtraction(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // <<eof>> | TERMINATOR
  static boolean terminator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "terminator")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = eof(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, TERMINATOR);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // KEYWORD_THEN ncl? (instruction | END)
  static boolean then(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "then")) return false;
    if (!nextTokenIs(builder_, KEYWORD_THEN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KEYWORD_THEN);
    result_ = result_ && then_1(builder_, level_ + 1);
    result_ = result_ && then_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ncl?
  private static boolean then_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "then_1")) return false;
    ncl(builder_, level_ + 1);
    return true;
  }

  // instruction | END
  private static boolean then_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "then_2")) return false;
    boolean result_;
    result_ = instruction(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, END);
    return result_;
  }

  /* ********************************************************** */
  // KEYWORD_TRACE ("o"|"i"|"r")
  public static boolean trace_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trace_instruction")) return false;
    if (!nextTokenIs(builder_, KEYWORD_TRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KEYWORD_TRACE);
    result_ = result_ && trace_instruction_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, TRACE_INSTRUCTION, result_);
    return result_;
  }

  // "o"|"i"|"r"
  private static boolean trace_instruction_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trace_instruction_1")) return false;
    boolean result_;
    result_ = consumeToken(builder_, "o");
    if (!result_) result_ = consumeToken(builder_, "i");
    if (!result_) result_ = consumeToken(builder_, "r");
    return result_;
  }

  /* ********************************************************** */
  // expression
  static boolean untilexpr(PsiBuilder builder_, int level_) {
    return expression(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // identifier_
  public static boolean variable(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, VARIABLE, "<variable>");
    result_ = identifier_(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // variable | global
  static boolean variable_(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_")) return false;
    boolean result_;
    result_ = variable(builder_, level_ + 1);
    if (!result_) result_ = global(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // expression
  static boolean whileexpr(PsiBuilder builder_, int level_) {
    return expression(builder_, level_ + 1);
  }

}
