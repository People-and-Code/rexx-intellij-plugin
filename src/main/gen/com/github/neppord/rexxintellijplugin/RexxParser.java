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
  // instruction
  static boolean clause(PsiBuilder builder_, int level_) {
    return instruction(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // KEYWORD_SAY STRING
  public static boolean instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "instruction")) return false;
    if (!nextTokenIs(builder_, KEYWORD_SAY)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KEYWORD_SAY, STRING);
    exit_section_(builder_, marker_, INSTRUCTION, result_);
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

}
