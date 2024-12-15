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
    builder_ = adapt_builder_(root_, builder_, this, EXTENDS_SETS_);
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

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(ADDITION_EXPR, ALIAS_EXPR, AND_EXPR, COMPARISON_EXPR,
      CONCATENATION_EXPR, EXPR, MULTIPLICATION_EXPR, POWER_EXPR,
      PREFIX_EXPR, TERM_EXPR),
  };

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
  // OPERATOR_PLUS | OPERATOR_SUBTRACT
  public static boolean additive_operator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "additive_operator")) return false;
    if (!nextTokenIs(builder_, "<additive operator>", OPERATOR_PLUS, OPERATOR_SUBTRACT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ADDITIVE_OPERATOR, "<additive operator>");
    result_ = consumeToken(builder_, OPERATOR_PLUS);
    if (!result_) result_ = consumeToken(builder_, OPERATOR_SUBTRACT);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // ADDRESS expr
  public static boolean address_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "address_instruction")) return false;
    if (!nextTokenIs(builder_, ADDRESS)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ADDRESS);
    result_ = result_ && expr(builder_, level_ + 1, -1);
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
  // name_declaration '=' expr
  public static boolean assignment(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assignment")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ASSIGNMENT, "<assignment>");
    result_ = name_declaration(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, EQ);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // CALL
  //     ( /*callon_spec
  //     |*/ (taken_constant /*| vref */) expression_list?
  //     )
  public static boolean call_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "call_instruction")) return false;
    if (!nextTokenIs(builder_, CALL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, CALL);
    result_ = result_ && call_instruction_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, CALL_INSTRUCTION, result_);
    return result_;
  }

  // (taken_constant /*| vref */) expression_list?
  private static boolean call_instruction_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "call_instruction_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = call_instruction_1_0(builder_, level_ + 1);
    result_ = result_ && call_instruction_1_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (taken_constant /*| vref */)
  private static boolean call_instruction_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "call_instruction_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = taken_constant(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expression_list?
  private static boolean call_instruction_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "call_instruction_1_1")) return false;
    expression_list(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // expression_instruction
  static boolean command(PsiBuilder builder_, int level_) {
    return expression_instruction(builder_, level_ + 1);
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
  // DROP expr
  public static boolean drop_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "drop_instruction")) return false;
    if (!nextTokenIs(builder_, DROP)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DROP);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, DROP_INSTRUCTION, result_);
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
  // EXIT expr?
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

  // expr?
  private static boolean exit_instruction_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exit_instruction_1")) return false;
    expr(builder_, level_ + 1, -1);
    return true;
  }

  /* ********************************************************** */
  // EXPOSE variable_list
  static boolean expose(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expose")) return false;
    if (!nextTokenIs(builder_, EXPOSE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, EXPOSE);
    result_ = result_ && variable_list(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // &IDENTIFIER expr
  //     | &stringLiteral expr
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

  // &IDENTIFIER expr
  private static boolean expression_instruction_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_instruction_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expression_instruction_0_0(builder_, level_ + 1);
    result_ = result_ && expr(builder_, level_ + 1, -1);
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

  // &stringLiteral expr
  private static boolean expression_instruction_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_instruction_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expression_instruction_1_0(builder_, level_ + 1);
    result_ = result_ && expr(builder_, level_ + 1, -1);
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
  // expr (COMMA expr?)*
  //     | (COMMA expr?)+
  static boolean expression_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expression_list_0(builder_, level_ + 1);
    if (!result_) result_ = expression_list_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expr (COMMA expr?)*
  private static boolean expression_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_list_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1, -1);
    result_ = result_ && expression_list_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (COMMA expr?)*
  private static boolean expression_list_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_list_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!expression_list_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "expression_list_0_1", pos_)) break;
    }
    return true;
  }

  // COMMA expr?
  private static boolean expression_list_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_list_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && expression_list_0_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expr?
  private static boolean expression_list_0_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_list_0_1_0_1")) return false;
    expr(builder_, level_ + 1, -1);
    return true;
  }

  // (COMMA expr?)+
  private static boolean expression_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_list_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expression_list_1_0(builder_, level_ + 1);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!expression_list_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "expression_list_1", pos_)) break;
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // COMMA expr?
  private static boolean expression_list_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_list_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && expression_list_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expr?
  private static boolean expression_list_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_list_1_0_1")) return false;
    expr(builder_, level_ + 1, -1);
    return true;
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
  // instruction_block | if_instruction | select_instruction
  static boolean group(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "group")) return false;
    boolean result_;
    result_ = instruction_block(builder_, level_ + 1);
    if (!result_) result_ = if_instruction(builder_, level_ + 1);
    if (!result_) result_ = select_instruction(builder_, level_ + 1);
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
  // IF expr ncl? then else?
  public static boolean if_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "if_instruction")) return false;
    if (!nextTokenIs(builder_, IF)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IF);
    result_ = result_ && expr(builder_, level_ + 1, -1);
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
  //     | drop_instruction
  //     | pull_instruction
  //     | exit_instruction
  //     /*| interop*/
  //     | iterate_instruction
  //     /*| leave*/
  //     | nop_instruction
  //     | numeric_instruction
  //     /*| options*/
  //     | parse_instruction
  //     | procedure_instruction
  //     | return_instruction
  //     | say_instruction
  //     | signal_instruction
  //     | trace_instruction
  //     | use_instruction
  static boolean keyword_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "keyword_instruction")) return false;
    boolean result_;
    result_ = address_instruction(builder_, level_ + 1);
    if (!result_) result_ = arg_instruction(builder_, level_ + 1);
    if (!result_) result_ = call_instruction(builder_, level_ + 1);
    if (!result_) result_ = drop_instruction(builder_, level_ + 1);
    if (!result_) result_ = pull_instruction(builder_, level_ + 1);
    if (!result_) result_ = exit_instruction(builder_, level_ + 1);
    if (!result_) result_ = iterate_instruction(builder_, level_ + 1);
    if (!result_) result_ = nop_instruction(builder_, level_ + 1);
    if (!result_) result_ = numeric_instruction(builder_, level_ + 1);
    if (!result_) result_ = parse_instruction(builder_, level_ + 1);
    if (!result_) result_ = procedure_instruction(builder_, level_ + 1);
    if (!result_) result_ = return_instruction(builder_, level_ + 1);
    if (!result_) result_ = say_instruction(builder_, level_ + 1);
    if (!result_) result_ = signal_instruction(builder_, level_ + 1);
    if (!result_) result_ = trace_instruction(builder_, level_ + 1);
    if (!result_) result_ = use_instruction(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // ADDRESS
  //     |  ARG
  //     |  VAR
  //     |  VALUE
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
    if (!result_) result_ = consumeToken(builder_, TRACE);
    if (!result_) result_ = consumeToken(builder_, USE);
    if (!result_) result_ = consumeToken(builder_, WHILE);
    return result_;
  }

  /* ********************************************************** */
  // name_declaration COLON
  public static boolean label(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "label")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, LABEL, "<label>");
    result_ = name_declaration(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // (label terminator?)*
  static boolean label_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "label_list")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!label_list_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "label_list", pos_)) break;
    }
    return true;
  }

  // label terminator?
  private static boolean label_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "label_list_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = label(builder_, level_ + 1);
    result_ = result_ && label_list_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // terminator?
  private static boolean label_list_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "label_list_0_1")) return false;
    terminator(builder_, level_ + 1);
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
  // OPERATOR_MULTIPLY
  //     | OPERATOR_DIVIDE
  //     | '//'
  //     | OPERATOR_REMAINDER
  public static boolean multiplicative_operator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "multiplicative_operator")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MULTIPLICATIVE_OPERATOR, "<multiplicative operator>");
    result_ = consumeToken(builder_, OPERATOR_MULTIPLY);
    if (!result_) result_ = consumeToken(builder_, OPERATOR_DIVIDE);
    if (!result_) result_ = consumeToken(builder_, "//");
    if (!result_) result_ = consumeToken(builder_, OPERATOR_REMAINDER);
    exit_section_(builder_, level_, marker_, result_, false, null);
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
  // NOP
  public static boolean nop_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nop_instruction")) return false;
    if (!nextTokenIs(builder_, NOP)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, NOP);
    exit_section_(builder_, marker_, NOP_INSTRUCTION, result_);
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
  // terminator label_list?
  static boolean null_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "null_clause")) return false;
    if (!nextTokenIs(builder_, TERMINATOR)) return false;
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
  static boolean numericConstant(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "numericConstant")) return false;
    boolean result_;
    result_ = integerConstant(builder_, level_ + 1);
    if (!result_) result_ = decimalConstant(builder_, level_ + 1);
    if (!result_) result_ = scientificConstant(builder_, level_ + 1);
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
  // OPERATOR_OR | OPERATOR_AND
  public static boolean or_operator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "or_operator")) return false;
    if (!nextTokenIs(builder_, "<or operator>", OPERATOR_AND, OPERATOR_OR)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, OR_OPERATOR, "<or operator>");
    result_ = consumeToken(builder_, OPERATOR_OR);
    if (!result_) result_ = consumeToken(builder_, OPERATOR_AND);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // OTHERWISE ncl? /*ncl not optional in spec*/ instruction*
  public static boolean otherwise_branch(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "otherwise_branch")) return false;
    if (!nextTokenIs(builder_, OTHERWISE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OTHERWISE);
    result_ = result_ && otherwise_branch_1(builder_, level_ + 1);
    result_ = result_ && otherwise_branch_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, OTHERWISE_BRANCH, result_);
    return result_;
  }

  // ncl?
  private static boolean otherwise_branch_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "otherwise_branch_1")) return false;
    ncl(builder_, level_ + 1);
    return true;
  }

  // instruction*
  private static boolean otherwise_branch_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "otherwise_branch_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!instruction(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "otherwise_branch_2", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // name_declaration 'OVER' expr
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

  // name_declaration 'OVER' expr
  private static boolean over_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "over_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = name_declaration(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "OVER");
    result_ = result_ && expr(builder_, level_ + 1, -1);
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
  // TOKEN_LEFT expr TOKEN_RIGHT
  public static boolean parentheticalExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parentheticalExpression")) return false;
    if (!nextTokenIs(builder_, TOKEN_LEFT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TOKEN_LEFT);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, TOKEN_RIGHT);
    exit_section_(builder_, marker_, PARENTHETICAL_EXPRESSION, result_);
    return result_;
  }

  /* ********************************************************** */
  // PARSE translation? parse_type template_list*
  public static boolean parse_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parse_instruction")) return false;
    if (!nextTokenIs(builder_, PARSE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PARSE);
    result_ = result_ && parse_instruction_1(builder_, level_ + 1);
    result_ = result_ && parse_type(builder_, level_ + 1);
    result_ = result_ && parse_instruction_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, PARSE_INSTRUCTION, result_);
    return result_;
  }

  // translation?
  private static boolean parse_instruction_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parse_instruction_1")) return false;
    translation(builder_, level_ + 1);
    return true;
  }

  // template_list*
  private static boolean parse_instruction_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parse_instruction_3")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!template_list(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "parse_instruction_3", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ARG
  //     | PULL
  //     | SOURCE
  //     | 'LINEIN'
  //     | 'VERSION'
  static boolean parse_key(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parse_key")) return false;
    boolean result_;
    result_ = consumeToken(builder_, ARG);
    if (!result_) result_ = consumeToken(builder_, PULL);
    if (!result_) result_ = consumeToken(builder_, SOURCE);
    if (!result_) result_ = consumeToken(builder_, "LINEIN");
    if (!result_) result_ = consumeToken(builder_, "VERSION");
    return result_;
  }

  /* ********************************************************** */
  // parse_key
  //     | parse_value
  //     | parse_var
  //     | term_expr
  static boolean parse_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parse_type")) return false;
    boolean result_;
    result_ = parse_key(builder_, level_ + 1);
    if (!result_) result_ = parse_value(builder_, level_ + 1);
    if (!result_) result_ = parse_var(builder_, level_ + 1);
    if (!result_) result_ = term_expr(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // VALUE expr? WITH
  static boolean parse_value(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parse_value")) return false;
    if (!nextTokenIs(builder_, VALUE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, VALUE);
    result_ = result_ && parse_value_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, WITH);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expr?
  private static boolean parse_value_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parse_value_1")) return false;
    expr(builder_, level_ + 1, -1);
    return true;
  }

  /* ********************************************************** */
  // VAR variable
  static boolean parse_var(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parse_var")) return false;
    if (!nextTokenIs(builder_, VAR)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, VAR);
    result_ = result_ && variable(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // stringLiteral | vrefp
  static boolean pattern(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pattern")) return false;
    if (!nextTokenIs(builder_, "", STRING, TOKEN_LEFT)) return false;
    boolean result_;
    result_ = stringLiteral(builder_, level_ + 1);
    if (!result_) result_ = vrefp(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // numericConstant  | vrefp
  static boolean position(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "position")) return false;
    boolean result_;
    result_ = numericConstant(builder_, level_ + 1);
    if (!result_) result_ = vrefp(builder_, level_ + 1);
    return result_;
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
  // OPERATOR_PLUS
  //     | OPERATOR_SUBTRACT
  //     | "\\"
  static boolean prefix(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "prefix")) return false;
    boolean result_;
    result_ = consumeToken(builder_, OPERATOR_PLUS);
    if (!result_) result_ = consumeToken(builder_, OPERATOR_SUBTRACT);
    if (!result_) result_ = consumeToken(builder_, "\\");
    return result_;
  }

  /* ********************************************************** */
  // PROCEDURE expose?
  public static boolean procedure_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "procedure_instruction")) return false;
    if (!nextTokenIs(builder_, PROCEDURE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PROCEDURE);
    result_ = result_ && procedure_instruction_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, PROCEDURE_INSTRUCTION, result_);
    return result_;
  }

  // expose?
  private static boolean procedure_instruction_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "procedure_instruction_1")) return false;
    expose(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // PULL template_list?
  public static boolean pull_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pull_instruction")) return false;
    if (!nextTokenIs(builder_, PULL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PULL);
    result_ = result_ && pull_instruction_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, PULL_INSTRUCTION, result_);
    return result_;
  }

  // template_list?
  private static boolean pull_instruction_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pull_instruction_1")) return false;
    template_list(builder_, level_ + 1);
    return true;
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
  // assignment | expr | over | 'FOREVER'
  static boolean repetitor(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "repetitor")) return false;
    boolean result_;
    result_ = assignment(builder_, level_ + 1);
    if (!result_) result_ = expr(builder_, level_ + 1, -1);
    if (!result_) result_ = over(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, "FOREVER");
    return result_;
  }

  /* ********************************************************** */
  // RETURN expr?
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

  // expr?
  private static boolean return_instruction_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "return_instruction_1")) return false;
    expr(builder_, level_ + 1, -1);
    return true;
  }

  /* ********************************************************** */
  // label_list? ncl? instruction_list? END?
  static boolean rexx_file(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rexx_file")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = rexx_file_0(builder_, level_ + 1);
    result_ = result_ && rexx_file_1(builder_, level_ + 1);
    result_ = result_ && rexx_file_2(builder_, level_ + 1);
    result_ = result_ && rexx_file_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // label_list?
  private static boolean rexx_file_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rexx_file_0")) return false;
    label_list(builder_, level_ + 1);
    return true;
  }

  // ncl?
  private static boolean rexx_file_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rexx_file_1")) return false;
    ncl(builder_, level_ + 1);
    return true;
  }

  // instruction_list?
  private static boolean rexx_file_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rexx_file_2")) return false;
    instruction_list(builder_, level_ + 1);
    return true;
  }

  // END?
  private static boolean rexx_file_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rexx_file_3")) return false;
    consumeToken(builder_, END);
    return true;
  }

  /* ********************************************************** */
  // SAY expr?
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

  // expr?
  private static boolean say_instruction_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "say_instruction_1")) return false;
    expr(builder_, level_ + 1, -1);
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
  // when_branch+ otherwise_branch?
  public static boolean select_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "select_body")) return false;
    if (!nextTokenIs(builder_, WHEN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = select_body_0(builder_, level_ + 1);
    result_ = result_ && select_body_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, SELECT_BODY, result_);
    return result_;
  }

  // when_branch+
  private static boolean select_body_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "select_body_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = when_branch(builder_, level_ + 1);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!when_branch(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "select_body_0", pos_)) break;
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // otherwise_branch?
  private static boolean select_body_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "select_body_1")) return false;
    otherwise_branch(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // SELECT /* group_option* */ ncl select_body /* group_handler? */ END ncl?
  public static boolean select_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "select_instruction")) return false;
    if (!nextTokenIs(builder_, SELECT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SELECT);
    result_ = result_ && ncl(builder_, level_ + 1);
    result_ = result_ && select_body(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END);
    result_ = result_ && select_instruction_4(builder_, level_ + 1);
    exit_section_(builder_, marker_, SELECT_INSTRUCTION, result_);
    return result_;
  }

  // ncl?
  private static boolean select_instruction_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "select_instruction_4")) return false;
    ncl(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // SIGNAL expr
  public static boolean signal_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "signal_instruction")) return false;
    if (!nextTokenIs(builder_, SIGNAL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SIGNAL);
    result_ = result_ && expr(builder_, level_ + 1, -1);
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
  // assignment
  //     | keyword_instruction
  //     | command
  static boolean single_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "single_instruction")) return false;
    boolean result_;
    result_ = assignment(builder_, level_ + 1);
    if (!result_) result_ = keyword_instruction(builder_, level_ + 1);
    if (!result_) result_ = command(builder_, level_ + 1);
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
  // TERMINATOR
  static boolean terminator(PsiBuilder builder_, int level_) {
    return consumeToken(builder_, TERMINATOR);
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
  // 'CASELESS' ['UPPER' | 'LOWER'] | ('UPPER' | 'LOWER')
  static boolean translation(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "translation")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = translation_0(builder_, level_ + 1);
    if (!result_) result_ = translation_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // 'CASELESS' ['UPPER' | 'LOWER']
  private static boolean translation_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "translation_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "CASELESS");
    result_ = result_ && translation_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ['UPPER' | 'LOWER']
  private static boolean translation_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "translation_0_1")) return false;
    translation_0_1_0(builder_, level_ + 1);
    return true;
  }

  // 'UPPER' | 'LOWER'
  private static boolean translation_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "translation_0_1_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, "UPPER");
    if (!result_) result_ = consumeToken(builder_, "LOWER");
    return result_;
  }

  // 'UPPER' | 'LOWER'
  private static boolean translation_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "translation_1")) return false;
    boolean result_;
    result_ = consumeToken(builder_, "UPPER");
    if (!result_) result_ = consumeToken(builder_, "LOWER");
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
  // expr
  static boolean untilexpr(PsiBuilder builder_, int level_) {
    return expr(builder_, level_ + 1, -1);
  }

  /* ********************************************************** */
  // USE ARG use_list
  public static boolean use_instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_instruction")) return false;
    if (!nextTokenIs(builder_, USE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, USE, ARG);
    result_ = result_ && use_list(builder_, level_ + 1);
    exit_section_(builder_, marker_, USE_INSTRUCTION, result_);
    return result_;
  }

  /* ********************************************************** */
  // var_symbol | var_symbol? (COMMA var_symbol?)+
  static boolean use_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = var_symbol(builder_, level_ + 1);
    if (!result_) result_ = use_list_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // var_symbol? (COMMA var_symbol?)+
  private static boolean use_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_list_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = use_list_1_0(builder_, level_ + 1);
    result_ = result_ && use_list_1_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // var_symbol?
  private static boolean use_list_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_list_1_0")) return false;
    var_symbol(builder_, level_ + 1);
    return true;
  }

  // (COMMA var_symbol?)+
  private static boolean use_list_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_list_1_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = use_list_1_1_0(builder_, level_ + 1);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!use_list_1_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "use_list_1_1", pos_)) break;
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // COMMA var_symbol?
  private static boolean use_list_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_list_1_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && use_list_1_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // var_symbol?
  private static boolean use_list_1_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_list_1_1_0_1")) return false;
    var_symbol(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // variable DOT?
  static boolean var_symbol(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "var_symbol")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = variable(builder_, level_ + 1);
    result_ = result_ && var_symbol_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // DOT?
  private static boolean var_symbol_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "var_symbol_1")) return false;
    consumeToken(builder_, DOT);
    return true;
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
  // (vref | var_symbol)+
  static boolean variable_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = variable_list_0(builder_, level_ + 1);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!variable_list_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "variable_list", pos_)) break;
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // vref | var_symbol
  private static boolean variable_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_list_0")) return false;
    boolean result_;
    result_ = vref(builder_, level_ + 1);
    if (!result_) result_ = var_symbol(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // TOKEN_LEFT var_symbol TOKEN_RIGHT
  static boolean vref(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "vref")) return false;
    if (!nextTokenIs(builder_, TOKEN_LEFT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TOKEN_LEFT);
    result_ = result_ && var_symbol(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, TOKEN_RIGHT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // TOKEN_LEFT expr TOKEN_RIGHT
  static boolean vrefp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "vrefp")) return false;
    if (!nextTokenIs(builder_, TOKEN_LEFT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TOKEN_LEFT);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, TOKEN_RIGHT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // WHEN expr ncl? then
  public static boolean when_branch(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "when_branch")) return false;
    if (!nextTokenIs(builder_, WHEN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, WHEN);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    result_ = result_ && when_branch_2(builder_, level_ + 1);
    result_ = result_ && then(builder_, level_ + 1);
    exit_section_(builder_, marker_, WHEN_BRANCH, result_);
    return result_;
  }

  // ncl?
  private static boolean when_branch_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "when_branch_2")) return false;
    ncl(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // expr
  static boolean whileexpr(PsiBuilder builder_, int level_) {
    return expr(builder_, level_ + 1, -1);
  }

  /* ********************************************************** */
  // Expression root: expr
  // Operator priority table:
  // 0: BINARY(alias_expr)
  // 1: BINARY(and_expr)
  // 2: BINARY(comparison_expr)
  // 3: BINARY(concatenation_expr)
  // 4: BINARY(addition_expr)
  // 5: BINARY(multiplication_expr)
  // 6: BINARY(power_expr)
  // 7: PREFIX(prefix_expr)
  // 8: ATOM(term_expr)
  public static boolean expr(PsiBuilder builder_, int level_, int priority_) {
    if (!recursion_guard_(builder_, level_, "expr")) return false;
    addVariant(builder_, "<expr>");
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<expr>");
    result_ = prefix_expr(builder_, level_ + 1);
    if (!result_) result_ = term_expr(builder_, level_ + 1);
    pinned_ = result_;
    result_ = result_ && expr_0(builder_, level_ + 1, priority_);
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  public static boolean expr_0(PsiBuilder builder_, int level_, int priority_) {
    if (!recursion_guard_(builder_, level_, "expr_0")) return false;
    boolean result_ = true;
    while (true) {
      Marker marker_ = enter_section_(builder_, level_, _LEFT_, null);
      if (priority_ < 0 && or_operator(builder_, level_ + 1)) {
        result_ = expr(builder_, level_, 0);
        exit_section_(builder_, level_, marker_, ALIAS_EXPR, result_, true, null);
      }
      else if (priority_ < 1 && consumeTokenSmart(builder_, OPERATOR_BITWISE_AND)) {
        result_ = expr(builder_, level_, 1);
        exit_section_(builder_, level_, marker_, AND_EXPR, result_, true, null);
      }
      else if (priority_ < 2 && comparison_operator(builder_, level_ + 1)) {
        result_ = expr(builder_, level_, 2);
        exit_section_(builder_, level_, marker_, COMPARISON_EXPR, result_, true, null);
      }
      else if (priority_ < 3 && concatenation_expr_0(builder_, level_ + 1)) {
        result_ = expr(builder_, level_, 3);
        exit_section_(builder_, level_, marker_, CONCATENATION_EXPR, result_, true, null);
      }
      else if (priority_ < 4 && additive_operator(builder_, level_ + 1)) {
        result_ = expr(builder_, level_, 4);
        exit_section_(builder_, level_, marker_, ADDITION_EXPR, result_, true, null);
      }
      else if (priority_ < 5 && multiplicative_operator(builder_, level_ + 1)) {
        result_ = expr(builder_, level_, 5);
        exit_section_(builder_, level_, marker_, MULTIPLICATION_EXPR, result_, true, null);
      }
      else if (priority_ < 6 && consumeTokenSmart(builder_, "**")) {
        result_ = expr(builder_, level_, 6);
        exit_section_(builder_, level_, marker_, POWER_EXPR, result_, true, null);
      }
      else {
        exit_section_(builder_, level_, marker_, null, false, false, null);
        break;
      }
    }
    return result_;
  }

  // OPERATOR_CONCATENATE | &expr
  private static boolean concatenation_expr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "concatenation_expr_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, OPERATOR_CONCATENATE);
    if (!result_) result_ = concatenation_expr_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // &expr
  private static boolean concatenation_expr_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "concatenation_expr_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = expr(builder_, level_ + 1, -1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  public static boolean prefix_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "prefix_expr")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = prefix(builder_, level_ + 1);
    pinned_ = result_;
    result_ = pinned_ && expr(builder_, level_, 7);
    exit_section_(builder_, level_, marker_, PREFIX_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  // simple_term (DOT simple_term?)* message_call*
  public static boolean term_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "term_expr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, TERM_EXPR, "<term expr>");
    result_ = simple_term(builder_, level_ + 1);
    result_ = result_ && term_expr_1(builder_, level_ + 1);
    result_ = result_ && term_expr_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (DOT simple_term?)*
  private static boolean term_expr_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "term_expr_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!term_expr_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "term_expr_1", pos_)) break;
    }
    return true;
  }

  // DOT simple_term?
  private static boolean term_expr_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "term_expr_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, DOT);
    result_ = result_ && term_expr_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // simple_term?
  private static boolean term_expr_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "term_expr_1_0_1")) return false;
    simple_term(builder_, level_ + 1);
    return true;
  }

  // message_call*
  private static boolean term_expr_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "term_expr_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!message_call(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "term_expr_2", pos_)) break;
    }
    return true;
  }

}
