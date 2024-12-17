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
  public PsiElement getAddress() {
    return findChildByType(ADDRESS);
  }

  @Override
  @Nullable
  public PsiElement getArg() {
    return findChildByType(ARG);
  }

  @Override
  @Nullable
  public PsiElement getCall() {
    return findChildByType(CALL);
  }

  @Override
  @Nullable
  public PsiElement getCaseless() {
    return findChildByType(CASELESS);
  }

  @Override
  @Nullable
  public PsiElement getDo() {
    return findChildByType(DO);
  }

  @Override
  @Nullable
  public PsiElement getDrop() {
    return findChildByType(DROP);
  }

  @Override
  @Nullable
  public PsiElement getElse() {
    return findChildByType(ELSE);
  }

  @Override
  @Nullable
  public PsiElement getEnd() {
    return findChildByType(END);
  }

  @Override
  @Nullable
  public PsiElement getExit() {
    return findChildByType(EXIT);
  }

  @Override
  @Nullable
  public PsiElement getExpose() {
    return findChildByType(EXPOSE);
  }

  @Override
  @Nullable
  public PsiElement getForward() {
    return findChildByType(FORWARD);
  }

  @Override
  @Nullable
  public PsiElement getGuard() {
    return findChildByType(GUARD);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

  @Override
  @Nullable
  public PsiElement getIf() {
    return findChildByType(IF);
  }

  @Override
  @Nullable
  public PsiElement getInterpret() {
    return findChildByType(INTERPRET);
  }

  @Override
  @Nullable
  public PsiElement getIterate() {
    return findChildByType(ITERATE);
  }

  @Override
  @Nullable
  public PsiElement getLeave() {
    return findChildByType(LEAVE);
  }

  @Override
  @Nullable
  public PsiElement getLoop() {
    return findChildByType(LOOP);
  }

  @Override
  @Nullable
  public PsiElement getLower() {
    return findChildByType(LOWER);
  }

  @Override
  @Nullable
  public PsiElement getNop() {
    return findChildByType(NOP);
  }

  @Override
  @Nullable
  public PsiElement getNumeric() {
    return findChildByType(NUMERIC);
  }

  @Override
  @Nullable
  public PsiElement getOptions() {
    return findChildByType(OPTIONS);
  }

  @Override
  @Nullable
  public PsiElement getOtherwise() {
    return findChildByType(OTHERWISE);
  }

  @Override
  @Nullable
  public PsiElement getParse() {
    return findChildByType(PARSE);
  }

  @Override
  @Nullable
  public PsiElement getProcedure() {
    return findChildByType(PROCEDURE);
  }

  @Override
  @Nullable
  public PsiElement getPull() {
    return findChildByType(PULL);
  }

  @Override
  @Nullable
  public PsiElement getPush() {
    return findChildByType(PUSH);
  }

  @Override
  @Nullable
  public PsiElement getQueue() {
    return findChildByType(QUEUE);
  }

  @Override
  @Nullable
  public PsiElement getRaise() {
    return findChildByType(RAISE);
  }

  @Override
  @Nullable
  public PsiElement getReply() {
    return findChildByType(REPLY);
  }

  @Override
  @Nullable
  public PsiElement getReturn() {
    return findChildByType(RETURN);
  }

  @Override
  @Nullable
  public PsiElement getSay() {
    return findChildByType(SAY);
  }

  @Override
  @Nullable
  public PsiElement getSelect() {
    return findChildByType(SELECT);
  }

  @Override
  @Nullable
  public PsiElement getSignal() {
    return findChildByType(SIGNAL);
  }

  @Override
  @Nullable
  public PsiElement getSource() {
    return findChildByType(SOURCE);
  }

  @Override
  @Nullable
  public PsiElement getTrace() {
    return findChildByType(TRACE);
  }

  @Override
  @Nullable
  public PsiElement getUpper() {
    return findChildByType(UPPER);
  }

  @Override
  @Nullable
  public PsiElement getUse() {
    return findChildByType(USE);
  }

  @Override
  @Nullable
  public PsiElement getValue() {
    return findChildByType(VALUE);
  }

  @Override
  @Nullable
  public PsiElement getVar() {
    return findChildByType(VAR);
  }

  @Override
  @Nullable
  public PsiElement getWhile() {
    return findChildByType(WHILE);
  }

}
