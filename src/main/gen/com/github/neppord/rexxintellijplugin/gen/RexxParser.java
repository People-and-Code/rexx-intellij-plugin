// This is a generated file. Not intended for manual editing.
package com.github.neppord.rexxintellijplugin.gen;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.github.neppord.rexxintellijplugin.gen.RexxTokens.*;
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
  // name_declaration OPERATOR_EQUAL expressions
  public static boolean assignment(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assignment")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = name_declaration(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OPERATOR_EQUAL);
    result_ = result_ && expressions(builder_, level_ + 1);
    exit_section_(builder_, marker_, ASSIGNMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // addition (OPERATOR_EQUAL addition)?
  public static boolean compare(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "compare")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, COMPARE, "<compare>");
    result_ = addition(builder_, level_ + 1);
    result_ = result_ && compare_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (OPERATOR_EQUAL addition)?
  private static boolean compare_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "compare_1")) return false;
    compare_1_0(builder_, level_ + 1);
    return true;
  }

  // OPERATOR_EQUAL addition
  private static boolean compare_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "compare_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OPERATOR_EQUAL);
    result_ = result_ && addition(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // compare (OPERATOR_CONCATENATE compare)*
  public static boolean concatenation(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "concatenation")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CONCATENATION, "<concatenation>");
    result_ = compare(builder_, level_ + 1);
    result_ = result_ && concatenation_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (OPERATOR_CONCATENATE compare)*
  private static boolean concatenation_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "concatenation_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!concatenation_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "concatenation_1", pos_)) break;
    }
    return true;
  }

  // OPERATOR_CONCATENATE compare
  private static boolean concatenation_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "concatenation_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OPERATOR_CONCATENATE);
    result_ = result_ && compare(builder_, level_ + 1);
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
  //     | variable
  //     | parentheticalExpression
  //     | functionCall
  public static boolean expressionTerm(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expressionTerm")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, EXPRESSION_TERM, "<expression term>");
    result_ = stringLiteral(builder_, level_ + 1);
    if (!result_) result_ = numericConstant(builder_, level_ + 1);
    if (!result_) result_ = variable(builder_, level_ + 1);
    if (!result_) result_ = parentheticalExpression(builder_, level_ + 1);
    if (!result_) result_ = functionCall(builder_, level_ + 1);
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
  // variable TOKEN_LEFT expression? TOKEN_RIGHT
  public static boolean functionCall(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionCall")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, TOKEN_LEFT);
    result_ = result_ && functionCall_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, TOKEN_RIGHT);
    exit_section_(builder_, marker_, FUNCTION_CALL, result_);
    return result_;
  }

  // expression?
  private static boolean functionCall_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionCall_2")) return false;
    expression(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // KEYWORD_IF expression terminator?
  //         KEYWORD_THEN terminator?
  //             instruction
  //         (terminator? KEYWORD_ELSE terminator?
  //             instruction)?
  public static boolean if_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "if_instruction")) return false;
    if (!nextTokenIs(builder_, KEYWORD_IF)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KEYWORD_IF);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && if_instruction_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, KEYWORD_THEN);
    result_ = result_ && if_instruction_4(builder_, level_ + 1);
    result_ = result_ && instruction(builder_, level_ + 1);
    result_ = result_ && if_instruction_6(builder_, level_ + 1);
    exit_section_(builder_, marker_, IF_INSTRUCTION, result_);
    return result_;
  }

  // terminator?
  private static boolean if_instruction_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "if_instruction_2")) return false;
    terminator(builder_, level_ + 1);
    return true;
  }

  // terminator?
  private static boolean if_instruction_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "if_instruction_4")) return false;
    terminator(builder_, level_ + 1);
    return true;
  }

  // (terminator? KEYWORD_ELSE terminator?
  //             instruction)?
  private static boolean if_instruction_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "if_instruction_6")) return false;
    if_instruction_6_0(builder_, level_ + 1);
    return true;
  }

  // terminator? KEYWORD_ELSE terminator?
  //             instruction
  private static boolean if_instruction_6_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "if_instruction_6_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = if_instruction_6_0_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, KEYWORD_ELSE);
    result_ = result_ && if_instruction_6_0_2(builder_, level_ + 1);
    result_ = result_ && instruction(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // terminator?
  private static boolean if_instruction_6_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "if_instruction_6_0_0")) return false;
    terminator(builder_, level_ + 1);
    return true;
  }

  // terminator?
  private static boolean if_instruction_6_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "if_instruction_6_0_2")) return false;
    terminator(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // assignment
  //     | say_instruction
  //     | parse_arg_instruction
  //     | parse_var_instruction
  //     | parse_value_instruction
  //     | parse_source_instruction
  //     | if_instruction
  //     | instruction_block
  //     | exit_instruction
  //     | trace_instruction
  //     | signal_instruction
  static boolean instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "instruction")) return false;
    boolean result_;
    result_ = assignment(builder_, level_ + 1);
    if (!result_) result_ = say_instruction(builder_, level_ + 1);
    if (!result_) result_ = parse_arg_instruction(builder_, level_ + 1);
    if (!result_) result_ = parse_var_instruction(builder_, level_ + 1);
    if (!result_) result_ = parse_value_instruction(builder_, level_ + 1);
    if (!result_) result_ = parse_source_instruction(builder_, level_ + 1);
    if (!result_) result_ = if_instruction(builder_, level_ + 1);
    if (!result_) result_ = instruction_block(builder_, level_ + 1);
    if (!result_) result_ = exit_instruction(builder_, level_ + 1);
    if (!result_) result_ = trace_instruction(builder_, level_ + 1);
    if (!result_) result_ = signal_instruction(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // KEYWORD_DO instructions KEYWORD_END
  public static boolean instruction_block(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "instruction_block")) return false;
    if (!nextTokenIs(builder_, KEYWORD_DO)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KEYWORD_DO);
    result_ = result_ && instructions(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, KEYWORD_END);
    exit_section_(builder_, marker_, INSTRUCTION_BLOCK, result_);
    return result_;
  }

  /* ********************************************************** */
  // terminator? instruction (terminator instruction)* terminator?
  static boolean instructions(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "instructions")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = instructions_0(builder_, level_ + 1);
    result_ = result_ && instruction(builder_, level_ + 1);
    result_ = result_ && instructions_2(builder_, level_ + 1);
    result_ = result_ && instructions_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // terminator?
  private static boolean instructions_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "instructions_0")) return false;
    terminator(builder_, level_ + 1);
    return true;
  }

  // (terminator instruction)*
  private static boolean instructions_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "instructions_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!instructions_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "instructions_2", pos_)) break;
    }
    return true;
  }

  // terminator instruction
  private static boolean instructions_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "instructions_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = terminator(builder_, level_ + 1);
    result_ = result_ && instruction(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // terminator?
  private static boolean instructions_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "instructions_3")) return false;
    terminator(builder_, level_ + 1);
    return true;
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
  // IDENTIFIER
  public static boolean name_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "name_declaration")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, NAME_DECLARATION, result_);
    return result_;
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
  // KEYWORD_PARSE KEYWORD_ARG parse_target*
  public static boolean parse_arg_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parse_arg_instruction")) return false;
    if (!nextTokenIs(builder_, KEYWORD_PARSE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KEYWORD_PARSE, KEYWORD_ARG);
    result_ = result_ && parse_arg_instruction_2(builder_, level_ + 1);
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
  // name_declaration
  //     | stringLiteral
  //     | integerConstant
  //     | remainder
  static boolean parse_target(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parse_target")) return false;
    boolean result_;
    result_ = name_declaration(builder_, level_ + 1);
    if (!result_) result_ = stringLiteral(builder_, level_ + 1);
    if (!result_) result_ = integerConstant(builder_, level_ + 1);
    if (!result_) result_ = remainder(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // KEYWORD_PARSE KEYWORD_VALUE expression* KEYWORD_WITH parse_target*
  public static boolean parse_value_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parse_value_instruction")) return false;
    if (!nextTokenIs(builder_, KEYWORD_PARSE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KEYWORD_PARSE, KEYWORD_VALUE);
    result_ = result_ && parse_value_instruction_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, KEYWORD_WITH);
    result_ = result_ && parse_value_instruction_4(builder_, level_ + 1);
    exit_section_(builder_, marker_, PARSE_VALUE_INSTRUCTION, result_);
    return result_;
  }

  // expression*
  private static boolean parse_value_instruction_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parse_value_instruction_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!expression(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "parse_value_instruction_2", pos_)) break;
    }
    return true;
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
  // instructions
  static boolean rexx_file(PsiBuilder builder_, int level_) {
    return instructions(builder_, level_ + 1);
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
  // TERMINATOR+
  static boolean terminator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "terminator")) return false;
    if (!nextTokenIs(builder_, TERMINATOR)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TERMINATOR);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!consumeToken(builder_, TERMINATOR)) break;
      if (!empty_element_parsed_guard_(builder_, "terminator", pos_)) break;
    }
    exit_section_(builder_, marker_, null, result_);
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
  // IDENTIFIER
  public static boolean variable(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, VARIABLE, result_);
    return result_;
  }

}
