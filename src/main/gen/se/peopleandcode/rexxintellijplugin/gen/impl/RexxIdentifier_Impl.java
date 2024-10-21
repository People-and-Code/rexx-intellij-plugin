// This is a generated file. Not intended for manual editing.
package se.peopleandcode.rexxintellijplugin.gen.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static se.peopleandcode.rexxintellijplugin.gen.RexxTokens.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import se.peopleandcode.rexxintellijplugin.gen.psi.*;

public class RexxIdentifier_Impl extends ASTWrapperPsiElement implements RexxIdentifier_ {

  public RexxIdentifier_Impl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RexxVisitor visitor) {
    visitor.visitIdentifier_(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RexxVisitor) accept((RexxVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

  @Override
  @Nullable
  public PsiElement getKeywordAddress() {
    return findChildByType(KEYWORD_ADDRESS);
  }

  @Override
  @Nullable
  public PsiElement getKeywordArg() {
    return findChildByType(KEYWORD_ARG);
  }

  @Override
  @Nullable
  public PsiElement getKeywordCall() {
    return findChildByType(KEYWORD_CALL);
  }

  @Override
  @Nullable
  public PsiElement getKeywordDo() {
    return findChildByType(KEYWORD_DO);
  }

  @Override
  @Nullable
  public PsiElement getKeywordDrop() {
    return findChildByType(KEYWORD_DROP);
  }

  @Override
  @Nullable
  public PsiElement getKeywordElse() {
    return findChildByType(KEYWORD_ELSE);
  }

  @Override
  @Nullable
  public PsiElement getKeywordEnd() {
    return findChildByType(KEYWORD_END);
  }

  @Override
  @Nullable
  public PsiElement getKeywordExit() {
    return findChildByType(KEYWORD_EXIT);
  }

  @Override
  @Nullable
  public PsiElement getKeywordExpose() {
    return findChildByType(KEYWORD_EXPOSE);
  }

  @Override
  @Nullable
  public PsiElement getKeywordForward() {
    return findChildByType(KEYWORD_FORWARD);
  }

  @Override
  @Nullable
  public PsiElement getKeywordGuard() {
    return findChildByType(KEYWORD_GUARD);
  }

  @Override
  @Nullable
  public PsiElement getKeywordIf() {
    return findChildByType(KEYWORD_IF);
  }

  @Override
  @Nullable
  public PsiElement getKeywordInterpret() {
    return findChildByType(KEYWORD_INTERPRET);
  }

  @Override
  @Nullable
  public PsiElement getKeywordIterate() {
    return findChildByType(KEYWORD_ITERATE);
  }

  @Override
  @Nullable
  public PsiElement getKeywordLeave() {
    return findChildByType(KEYWORD_LEAVE);
  }

  @Override
  @Nullable
  public PsiElement getKeywordLoop() {
    return findChildByType(KEYWORD_LOOP);
  }

  @Override
  @Nullable
  public PsiElement getKeywordNop() {
    return findChildByType(KEYWORD_NOP);
  }

  @Override
  @Nullable
  public PsiElement getKeywordNumeric() {
    return findChildByType(KEYWORD_NUMERIC);
  }

  @Override
  @Nullable
  public PsiElement getKeywordOptions() {
    return findChildByType(KEYWORD_OPTIONS);
  }

  @Override
  @Nullable
  public PsiElement getKeywordOtherwise() {
    return findChildByType(KEYWORD_OTHERWISE);
  }

  @Override
  @Nullable
  public PsiElement getKeywordParse() {
    return findChildByType(KEYWORD_PARSE);
  }

  @Override
  @Nullable
  public PsiElement getKeywordProcedure() {
    return findChildByType(KEYWORD_PROCEDURE);
  }

  @Override
  @Nullable
  public PsiElement getKeywordPull() {
    return findChildByType(KEYWORD_PULL);
  }

  @Override
  @Nullable
  public PsiElement getKeywordPush() {
    return findChildByType(KEYWORD_PUSH);
  }

  @Override
  @Nullable
  public PsiElement getKeywordQueue() {
    return findChildByType(KEYWORD_QUEUE);
  }

  @Override
  @Nullable
  public PsiElement getKeywordRaise() {
    return findChildByType(KEYWORD_RAISE);
  }

  @Override
  @Nullable
  public PsiElement getKeywordReply() {
    return findChildByType(KEYWORD_REPLY);
  }

  @Override
  @Nullable
  public PsiElement getKeywordReturn() {
    return findChildByType(KEYWORD_RETURN);
  }

  @Override
  @Nullable
  public PsiElement getKeywordSay() {
    return findChildByType(KEYWORD_SAY);
  }

  @Override
  @Nullable
  public PsiElement getKeywordSelect() {
    return findChildByType(KEYWORD_SELECT);
  }

  @Override
  @Nullable
  public PsiElement getKeywordSignal() {
    return findChildByType(KEYWORD_SIGNAL);
  }

  @Override
  @Nullable
  public PsiElement getKeywordSource() {
    return findChildByType(KEYWORD_SOURCE);
  }

  @Override
  @Nullable
  public PsiElement getKeywordThen() {
    return findChildByType(KEYWORD_THEN);
  }

  @Override
  @Nullable
  public PsiElement getKeywordTrace() {
    return findChildByType(KEYWORD_TRACE);
  }

  @Override
  @Nullable
  public PsiElement getKeywordUse() {
    return findChildByType(KEYWORD_USE);
  }

  @Override
  @Nullable
  public PsiElement getKeywordValue() {
    return findChildByType(KEYWORD_VALUE);
  }

  @Override
  @Nullable
  public PsiElement getKeywordVar() {
    return findChildByType(KEYWORD_VAR);
  }

  @Override
  @Nullable
  public PsiElement getKeywordWhile() {
    return findChildByType(KEYWORD_WHILE);
  }

  @Override
  @Nullable
  public PsiElement getKeywordWith() {
    return findChildByType(KEYWORD_WITH);
  }

}
