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
  // name_declaration OPERATOR_EQUAL expression
  public static boolean assignment(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assignment")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = name_declaration(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OPERATOR_EQUAL);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, ASSIGNMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // addition (OPERATOR_CONCATENATE addition)*
  public static boolean concatenation(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "concatenation")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CONCATENATION, "<concatenation>");
    result_ = addition(builder_, level_ + 1);
    result_ = result_ && concatenation_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (OPERATOR_CONCATENATE addition)*
  private static boolean concatenation_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "concatenation_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!concatenation_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "concatenation_1", pos_)) break;
    }
    return true;
  }

  // OPERATOR_CONCATENATE addition
  private static boolean concatenation_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "concatenation_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OPERATOR_CONCATENATE);
    result_ = result_ && addition(builder_, level_ + 1);
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
  // assignment | say_instruction | parse_arg_instruction| parse_value_instruction
  static boolean instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "instruction")) return false;
    boolean result_;
    result_ = assignment(builder_, level_ + 1);
    if (!result_) result_ = say_instruction(builder_, level_ + 1);
    if (!result_) result_ = parse_arg_instruction(builder_, level_ + 1);
    if (!result_) result_ = parse_value_instruction(builder_, level_ + 1);
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
  // instruction*
  static boolean rexx_file(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rexx_file")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!instruction(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "rexx_file", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KEYWORD_SAY expression*
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

  // expression*
  private static boolean say_instruction_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "say_instruction_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!expression(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "say_instruction_1", pos_)) break;
    }
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
