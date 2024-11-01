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
  // numericConstant | EQ position
  static boolean absolute_positional(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "absolute_positional")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = numericConstant(builder_, level_ + 1);
    if (!result_) result_ = absolute_positional_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // EQ position
  private static boolean absolute_positional_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "absolute_positional_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, EQ);
    result_ = result_ && position(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
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
  // ADDRESS expressions
  public static boolean address_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "address_instruction")) return false;
    if (!nextTokenIs(builder_, ADDRESS)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ADDRESS);
    result_ = result_ && expressions(builder_, level_ + 1);
    exit_section_(builder_, marker_, ADDRESS_INSTRUCTION, result_);
    return result_;
  }

  /* ********************************************************** */
  // ARG template_list?
  public static boolean arg_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arg_instruction")) return false;
    if (!nextTokenIs(builder_, ARG)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ARG);
    result_ = result_ && arg_instruction_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, ARG_INSTRUCTION, result_);
    return result_;
  }

  // template_list?
  private static boolean arg_instruction_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arg_instruction_1")) return false;
    template_list(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // TOKEN_LEFT expression_list? TOKEN_RIGHT
  static boolean arguments(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arguments")) return false;
    if (!nextTokenIs(builder_, TOKEN_LEFT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TOKEN_LEFT);
    result_ = result_ && arguments_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, TOKEN_RIGHT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expression_list?
  private static boolean arguments_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arguments_1")) return false;
    expression_list(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // name_declaration '=' expressions
  public static boolean assignment(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assignment")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ASSIGNMENT, "<assignment>");
    result_ = name_declaration(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, EQ);
    result_ = result_ && expressions(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // CALL IDENTIFIER comma_seperated_arguments
  public static boolean call_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "call_instruction")) return false;
    if (!nextTokenIs(builder_, CALL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, CALL, IDENTIFIER);
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
  // addition (comparison_operator addition)?
  public static boolean compare(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "compare")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, COMPARE, "<compare>");
    result_ = addition(builder_, level_ + 1);
    result_ = result_ && compare_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (comparison_operator addition)?
  private static boolean compare_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "compare_1")) return false;
    compare_1_0(builder_, level_ + 1);
    return true;
  }

  // comparison_operator addition
  private static boolean compare_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "compare_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = comparison_operator(builder_, level_ + 1);
    result_ = result_ && addition(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // normal_compare | strict_compare
  static boolean comparison_operator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "comparison_operator")) return false;
    boolean result_;
    result_ = normal_compare(builder_, level_ + 1);
    if (!result_) result_ = strict_compare(builder_, level_ + 1);
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
  // END name_declaration? ncl
  static boolean do_ending(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "do_ending")) return false;
    if (!nextTokenIs(builder_, END)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, END);
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
  // DO /*[group_option+]*/
  //     ( dorep
  //     | conditional
  //     | dorep conditional
  //     )?
  static boolean do_specification(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "do_specification")) return false;
    if (!nextTokenIs(builder_, DO)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DO);
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
  // ELSE ncl? (instruction | END)
  static boolean else_$(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "else_$")) return false;
    if (!nextTokenIs(builder_, ELSE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ELSE);
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
  // EXIT expression?
  public static boolean exit_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exit_instruction")) return false;
    if (!nextTokenIs(builder_, EXIT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, EXIT);
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
  // methodCall | stem | simple_term
  public static boolean expressionTerm(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expressionTerm")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, EXPRESSION_TERM, "<expression term>");
    result_ = methodCall(builder_, level_ + 1);
    if (!result_) result_ = stem(builder_, level_ + 1);
    if (!result_) result_ = simple_term(builder_, level_ + 1);
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
  // expression? (COMMA expression?)*
  static boolean expression_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expression_list_0(builder_, level_ + 1);
    result_ = result_ && expression_list_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expression?
  private static boolean expression_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_list_0")) return false;
    expression(builder_, level_ + 1);
    return true;
  }

  // (COMMA expression?)*
  private static boolean expression_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_list_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!expression_list_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "expression_list_1", pos_)) break;
    }
    return true;
  }

  // COMMA expression?
  private static boolean expression_list_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_list_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && expression_list_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expression?
  private static boolean expression_list_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_list_1_0_1")) return false;
    expression(builder_, level_ + 1);
    return true;
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
    if (!nextTokenIs(builder_, "", DO, IF)) return false;
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
  // IF expression ncl? then else?
  public static boolean if_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "if_instruction")) return false;
    if (!nextTokenIs(builder_, IF)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IF);
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
  // symbol | stringLiteral indices
  static boolean indexed(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "indexed")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = symbol(builder_, level_ + 1);
    if (!result_) result_ = indexed_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // stringLiteral indices
  private static boolean indexed_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "indexed_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = stringLiteral(builder_, level_ + 1);
    result_ = result_ && indices(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '[' expression_list? ']'
  static boolean indices(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "indices")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "[");
    result_ = result_ && indices_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "]");
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expression_list?
  private static boolean indices_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "indices_1")) return false;
    expression_list(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // '[' expression_list ']'
  static boolean initializer(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "initializer")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "[");
    result_ = result_ && expression_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "]");
    exit_section_(builder_, marker_, null, result_);
    return result_;
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
    if (!nextTokenIs(builder_, DO)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, INSTRUCTION_BLOCK, null);
    result_ = do_specification(builder_, level_ + 1);
    pinned_ = result_; // pin = do_specification
    result_ = result_ && report_error_(builder_, ncl(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, instruction_block_2(builder_, level_ + 1)) && result_;
    result_ = pinned_ && do_ending(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
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
  // (symbol | stringLiteral) arguments
  public static boolean invoke(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "invoke")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, INVOKE, "<invoke>");
    result_ = invoke_0(builder_, level_ + 1);
    result_ = result_ && arguments(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // symbol | stringLiteral
  private static boolean invoke_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "invoke_0")) return false;
    boolean result_;
    result_ = symbol(builder_, level_ + 1);
    if (!result_) result_ = stringLiteral(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // ITERATE variable_?
  public static boolean iterate_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "iterate_instruction")) return false;
    if (!nextTokenIs(builder_, ITERATE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ITERATE);
    result_ = result_ && iterate_instruction_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, ITERATE_INSTRUCTION, result_);
    return result_;
  }

  // variable_?
  private static boolean iterate_instruction_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "iterate_instruction_1")) return false;
    variable_(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // address_instruction
  //     | arg_instruction
  //     | call_instruction
  //     /*| drop*/
  //     | exit_instruction
  //     /*| interop*/
  //     | iterate_instruction
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
    if (!result_) result_ = arg_instruction(builder_, level_ + 1);
    if (!result_) result_ = call_instruction(builder_, level_ + 1);
    if (!result_) result_ = exit_instruction(builder_, level_ + 1);
    if (!result_) result_ = iterate_instruction(builder_, level_ + 1);
    if (!result_) result_ = numeric_instruction(builder_, level_ + 1);
    if (!result_) result_ = parse_instruction(builder_, level_ + 1);
    if (!result_) result_ = return_instruction(builder_, level_ + 1);
    if (!result_) result_ = say_instruction(builder_, level_ + 1);
    if (!result_) result_ = signal_instruction(builder_, level_ + 1);
    if (!result_) result_ = trace_instruction(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // ADDRESS
  //     |  ARG
  //     |  VAR
  //     |  VALUE
  //     |  WITH
  //     |  CALL
  //     |  DO
  //     |  DROP
  //     |  ELSE
  //     |  END
  //     |  EXIT
  //     |  EXPOSE
  //     |  FORWARD
  //     |  GUARD
  //     |  IF
  //     |  INTERPRET
  //     |  ITERATE
  //     |  LEAVE
  //     |  LOOP
  //     |  NOP
  //     |  NUMERIC
  //     |  OPTIONS
  //     |  OTHERWISE
  //     |  PARSE
  //     |  PROCEDURE
  //     |  PULL
  //     |  PUSH
  //     |  QUEUE
  //     |  RAISE
  //     |  REPLY
  //     |  RETURN
  //     |  SAY
  //     |  SELECT
  //     |  SOURCE
  //     |  SIGNAL
  //     |  THEN
  //     |  TRACE
  //     |  USE
  //     |  WHILE
  static boolean keywords(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "keywords")) return false;
    boolean result_;
    result_ = consumeToken(builder_, ADDRESS);
    if (!result_) result_ = consumeToken(builder_, ARG);
    if (!result_) result_ = consumeToken(builder_, VAR);
    if (!result_) result_ = consumeToken(builder_, VALUE);
    if (!result_) result_ = consumeToken(builder_, WITH);
    if (!result_) result_ = consumeToken(builder_, CALL);
    if (!result_) result_ = consumeToken(builder_, DO);
    if (!result_) result_ = consumeToken(builder_, DROP);
    if (!result_) result_ = consumeToken(builder_, ELSE);
    if (!result_) result_ = consumeToken(builder_, END);
    if (!result_) result_ = consumeToken(builder_, EXIT);
    if (!result_) result_ = consumeToken(builder_, EXPOSE);
    if (!result_) result_ = consumeToken(builder_, FORWARD);
    if (!result_) result_ = consumeToken(builder_, GUARD);
    if (!result_) result_ = consumeToken(builder_, IF);
    if (!result_) result_ = consumeToken(builder_, INTERPRET);
    if (!result_) result_ = consumeToken(builder_, ITERATE);
    if (!result_) result_ = consumeToken(builder_, LEAVE);
    if (!result_) result_ = consumeToken(builder_, LOOP);
    if (!result_) result_ = consumeToken(builder_, NOP);
    if (!result_) result_ = consumeToken(builder_, NUMERIC);
    if (!result_) result_ = consumeToken(builder_, OPTIONS);
    if (!result_) result_ = consumeToken(builder_, OTHERWISE);
    if (!result_) result_ = consumeToken(builder_, PARSE);
    if (!result_) result_ = consumeToken(builder_, PROCEDURE);
    if (!result_) result_ = consumeToken(builder_, PULL);
    if (!result_) result_ = consumeToken(builder_, PUSH);
    if (!result_) result_ = consumeToken(builder_, QUEUE);
    if (!result_) result_ = consumeToken(builder_, RAISE);
    if (!result_) result_ = consumeToken(builder_, REPLY);
    if (!result_) result_ = consumeToken(builder_, RETURN);
    if (!result_) result_ = consumeToken(builder_, SAY);
    if (!result_) result_ = consumeToken(builder_, SELECT);
    if (!result_) result_ = consumeToken(builder_, SOURCE);
    if (!result_) result_ = consumeToken(builder_, SIGNAL);
    if (!result_) result_ = consumeToken(builder_, THEN);
    if (!result_) result_ = consumeToken(builder_, TRACE);
    if (!result_) result_ = consumeToken(builder_, USE);
    if (!result_) result_ = consumeToken(builder_, WHILE);
    return result_;
  }

  /* ********************************************************** */
  // name_declaration COLON (PROCEDURE (EXPOSE IDENTIFIER)? DOT?)?
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

  // (PROCEDURE (EXPOSE IDENTIFIER)? DOT?)?
  private static boolean label_instruction_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "label_instruction_2")) return false;
    label_instruction_2_0(builder_, level_ + 1);
    return true;
  }

  // PROCEDURE (EXPOSE IDENTIFIER)? DOT?
  private static boolean label_instruction_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "label_instruction_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PROCEDURE);
    result_ = result_ && label_instruction_2_0_1(builder_, level_ + 1);
    result_ = result_ && label_instruction_2_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (EXPOSE IDENTIFIER)?
  private static boolean label_instruction_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "label_instruction_2_0_1")) return false;
    label_instruction_2_0_1_0(builder_, level_ + 1);
    return true;
  }

  // EXPOSE IDENTIFIER
  private static boolean label_instruction_2_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "label_instruction_2_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, EXPOSE, IDENTIFIER);
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
  // TILDE TILDE? method_name arguments?
  static boolean message_call(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "message_call")) return false;
    if (!nextTokenIs(builder_, TILDE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TILDE);
    result_ = result_ && message_call_1(builder_, level_ + 1);
    result_ = result_ && method_name(builder_, level_ + 1);
    result_ = result_ && message_call_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // TILDE?
  private static boolean message_call_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "message_call_1")) return false;
    consumeToken(builder_, TILDE);
    return true;
  }

  // arguments?
  private static boolean message_call_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "message_call_3")) return false;
    arguments(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // (stem | simple_term) message_call+
  public static boolean methodCall(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "methodCall")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, METHOD_CALL, "<method call>");
    result_ = methodCall_0(builder_, level_ + 1);
    result_ = result_ && methodCall_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // stem | simple_term
  private static boolean methodCall_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "methodCall_0")) return false;
    boolean result_;
    result_ = stem(builder_, level_ + 1);
    if (!result_) result_ = simple_term(builder_, level_ + 1);
    return result_;
  }

  // message_call+
  private static boolean methodCall_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "methodCall_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = message_call(builder_, level_ + 1);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!message_call(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "methodCall_1", pos_)) break;
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER (COLON variable_)?
  static boolean method_name(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_name")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    result_ = result_ && method_name_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (COLON variable_)?
  private static boolean method_name_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_name_1")) return false;
    method_name_1_0(builder_, level_ + 1);
    return true;
  }

  // COLON variable_
  private static boolean method_name_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_name_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COLON);
    result_ = result_ && variable_(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
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
  // EQ | NEQ1 | NEQ2 | NEQ3 | GT | LT | GTE | LTE | ALT_GT | ALT_LT
  static boolean normal_compare(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "normal_compare")) return false;
    boolean result_;
    result_ = consumeToken(builder_, EQ);
    if (!result_) result_ = consumeToken(builder_, NEQ1);
    if (!result_) result_ = consumeToken(builder_, NEQ2);
    if (!result_) result_ = consumeToken(builder_, NEQ3);
    if (!result_) result_ = consumeToken(builder_, GT);
    if (!result_) result_ = consumeToken(builder_, LT);
    if (!result_) result_ = consumeToken(builder_, GTE);
    if (!result_) result_ = consumeToken(builder_, LTE);
    if (!result_) result_ = consumeToken(builder_, ALT_GT);
    if (!result_) result_ = consumeToken(builder_, ALT_LT);
    return result_;
  }

  /* ********************************************************** */
  // terminator
  static boolean null_clause(PsiBuilder builder_, int level_) {
    return terminator(builder_, level_ + 1);
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
  // NUMERIC IDENTIFIER integerConstant
  public static boolean numeric_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "numeric_instruction")) return false;
    if (!nextTokenIs(builder_, NUMERIC)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, NUMERIC, IDENTIFIER);
    result_ = result_ && integerConstant(builder_, level_ + 1);
    exit_section_(builder_, marker_, NUMERIC_INSTRUCTION, result_);
    return result_;
  }

  /* ********************************************************** */
  // name_declaration 'OVER' expression
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

  // name_declaration 'OVER' expression
  private static boolean over_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "over_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = name_declaration(builder_, level_ + 1);
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
  // PARSE ARG parse_target* (COMMA parse_target*)*
  public static boolean parse_arg_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parse_arg_instruction")) return false;
    if (!nextTokenIs(builder_, PARSE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, PARSE, ARG);
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
    if (!nextTokenIs(builder_, PARSE)) return false;
    boolean result_;
    result_ = parse_arg_instruction(builder_, level_ + 1);
    if (!result_) result_ = parse_pull_instruction(builder_, level_ + 1);
    if (!result_) result_ = parse_var_instruction(builder_, level_ + 1);
    if (!result_) result_ = parse_value_instruction(builder_, level_ + 1);
    if (!result_) result_ = parse_source_instruction(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // PARSE PULL parse_target* (COMMA parse_target*)*
  public static boolean parse_pull_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parse_pull_instruction")) return false;
    if (!nextTokenIs(builder_, PARSE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, PARSE, PULL);
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
  // PARSE SOURCE parse_target*
  public static boolean parse_source_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parse_source_instruction")) return false;
    if (!nextTokenIs(builder_, PARSE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, PARSE, SOURCE);
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
  // PARSE VALUE expression WITH parse_target*
  public static boolean parse_value_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parse_value_instruction")) return false;
    if (!nextTokenIs(builder_, PARSE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, PARSE, VALUE);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, WITH);
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
  // PARSE VAR parse_target*
  public static boolean parse_var_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parse_var_instruction")) return false;
    if (!nextTokenIs(builder_, PARSE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, PARSE, VAR);
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
  // stringLiteral
  static boolean pattern(PsiBuilder builder_, int level_) {
    return stringLiteral(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // numericConstant
  static boolean position(PsiBuilder builder_, int level_) {
    return numericConstant(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // absolute_positional | relative_positional
  static boolean positional(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "positional")) return false;
    boolean result_;
    result_ = absolute_positional(builder_, level_ + 1);
    if (!result_) result_ = relative_positional(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // (OPERATOR_PLUS | OPERATOR_SUBTRACT) position
  static boolean relative_positional(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "relative_positional")) return false;
    if (!nextTokenIs(builder_, "", OPERATOR_PLUS, OPERATOR_SUBTRACT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = relative_positional_0(builder_, level_ + 1);
    result_ = result_ && position(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // OPERATOR_PLUS | OPERATOR_SUBTRACT
  private static boolean relative_positional_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "relative_positional_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, OPERATOR_PLUS);
    if (!result_) result_ = consumeToken(builder_, OPERATOR_SUBTRACT);
    return result_;
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
  // RETURN expression?
  public static boolean return_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "return_instruction")) return false;
    if (!nextTokenIs(builder_, RETURN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, RETURN);
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
  // SAY expressions?
  public static boolean say_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "say_instruction")) return false;
    if (!nextTokenIs(builder_, SAY)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SAY);
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
  // SIGNAL expressions
  public static boolean signal_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "signal_instruction")) return false;
    if (!nextTokenIs(builder_, SIGNAL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SIGNAL);
    result_ = result_ && expressions(builder_, level_ + 1);
    exit_section_(builder_, marker_, SIGNAL_INSTRUCTION, result_);
    return result_;
  }

  /* ********************************************************** */
  // stringLiteral
  //     | invoke
  //     | symbol
  //     | indexed
  //     | parentheticalExpression
  //     | initializer
  static boolean simple_term(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "simple_term")) return false;
    boolean result_;
    result_ = stringLiteral(builder_, level_ + 1);
    if (!result_) result_ = invoke(builder_, level_ + 1);
    if (!result_) result_ = symbol(builder_, level_ + 1);
    if (!result_) result_ = indexed(builder_, level_ + 1);
    if (!result_) result_ = parentheticalExpression(builder_, level_ + 1);
    if (!result_) result_ = initializer(builder_, level_ + 1);
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
  // simple_term (DOT simple_term)+
  public static boolean stem(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "stem")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, STEM, "<stem>");
    result_ = simple_term(builder_, level_ + 1);
    result_ = result_ && stem_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (DOT simple_term)+
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

  // DOT simple_term
  private static boolean stem_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "stem_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DOT);
    result_ = result_ && simple_term(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // STRICT_EQ | STRICT_NEQ | STRICT_GT | STRICT_LT | STRICT_GTE | STRICT_LTE | STRICT_ESC_GT | STRICT_ESC_LT
  static boolean strict_compare(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "strict_compare")) return false;
    boolean result_;
    result_ = consumeToken(builder_, STRICT_EQ);
    if (!result_) result_ = consumeToken(builder_, STRICT_NEQ);
    if (!result_) result_ = consumeToken(builder_, STRICT_GT);
    if (!result_) result_ = consumeToken(builder_, STRICT_LT);
    if (!result_) result_ = consumeToken(builder_, STRICT_GTE);
    if (!result_) result_ = consumeToken(builder_, STRICT_LTE);
    if (!result_) result_ = consumeToken(builder_, STRICT_ESC_GT);
    if (!result_) result_ = consumeToken(builder_, STRICT_ESC_LT);
    return result_;
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
  // variable | global /* == const_symbol */ | numericConstant
  static boolean symbol(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "symbol")) return false;
    boolean result_;
    result_ = variable(builder_, level_ + 1);
    if (!result_) result_ = global(builder_, level_ + 1);
    if (!result_) result_ = numericConstant(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // symbol | stringLiteral
  static boolean taken_constant(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "taken_constant")) return false;
    boolean result_;
    result_ = symbol(builder_, level_ + 1);
    if (!result_) result_ = stringLiteral(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // name_declaration | DOT
  static boolean target(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "target")) return false;
    boolean result_;
    result_ = name_declaration(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, DOT);
    return result_;
  }

  /* ********************************************************** */
  // trigger | target
  static boolean template(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "template")) return false;
    boolean result_;
    result_ = trigger(builder_, level_ + 1);
    if (!result_) result_ = target(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // template (COMMA template?)*
  //     | (COMMA template?)+
  static boolean template_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "template_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = template_list_0(builder_, level_ + 1);
    if (!result_) result_ = template_list_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // template (COMMA template?)*
  private static boolean template_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "template_list_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = template(builder_, level_ + 1);
    result_ = result_ && template_list_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (COMMA template?)*
  private static boolean template_list_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "template_list_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!template_list_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "template_list_0_1", pos_)) break;
    }
    return true;
  }

  // COMMA template?
  private static boolean template_list_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "template_list_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && template_list_0_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // template?
  private static boolean template_list_0_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "template_list_0_1_0_1")) return false;
    template(builder_, level_ + 1);
    return true;
  }

  // (COMMA template?)+
  private static boolean template_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "template_list_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = template_list_1_0(builder_, level_ + 1);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!template_list_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "template_list_1", pos_)) break;
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // COMMA template?
  private static boolean template_list_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "template_list_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && template_list_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // template?
  private static boolean template_list_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "template_list_1_0_1")) return false;
    template(builder_, level_ + 1);
    return true;
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
  // THEN ncl? (instruction | END)
  static boolean then(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "then")) return false;
    if (!nextTokenIs(builder_, THEN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, THEN);
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
  // TRACE ("o"|"i"|"r")
  public static boolean trace_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trace_instruction")) return false;
    if (!nextTokenIs(builder_, TRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TRACE);
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
  // pattern | positional
  static boolean trigger(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trigger")) return false;
    boolean result_;
    result_ = pattern(builder_, level_ + 1);
    if (!result_) result_ = positional(builder_, level_ + 1);
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
