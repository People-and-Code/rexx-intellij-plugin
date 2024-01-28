// This is a generated file. Not intended for manual editing.
package com.github.neppord.rexxintellijplugin;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.github.neppord.rexxintellijplugin.RexxTokensKt.*;
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
  // expressionTerm (OPERATOR_PLUS expressionTerm)*
  public static boolean addition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "addition")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ADDITION, "<addition>");
    result_ = expressionTerm(builder_, level_ + 1);
    result_ = result_ && addition_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (OPERATOR_PLUS expressionTerm)*
  private static boolean addition_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "addition_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!addition_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "addition_1", pos_)) break;
    }
    return true;
  }

  // OPERATOR_PLUS expressionTerm
  private static boolean addition_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "addition_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OPERATOR_PLUS);
    result_ = result_ && expressionTerm(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // instruction
  static boolean clause(PsiBuilder builder_, int level_) {
    return instruction(builder_, level_ + 1);
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
  // stringLiteral | numericConstant | variableExpression | parentheticalExpression
  public static boolean expressionTerm(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expressionTerm")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, EXPRESSION_TERM, "<expression term>");
    result_ = stringLiteral(builder_, level_ + 1);
    if (!result_) result_ = numericConstant(builder_, level_ + 1);
    if (!result_) result_ = variableExpression(builder_, level_ + 1);
    if (!result_) result_ = parentheticalExpression(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // say_instruction
  public static boolean instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "instruction")) return false;
    if (!nextTokenIs(builder_, KEYWORD_SAY)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = say_instruction(builder_, level_ + 1);
    exit_section_(builder_, marker_, INSTRUCTION, result_);
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
  // clause*
  static boolean rexx_file(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rexx_file")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!clause(builder_, level_ + 1)) break;
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
  // IDENTIFIER
  public static boolean variableExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variableExpression")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, VARIABLE_EXPRESSION, result_);
    return result_;
  }

}
