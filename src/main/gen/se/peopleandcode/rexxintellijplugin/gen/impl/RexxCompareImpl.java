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

public class RexxCompareImpl extends ASTWrapperPsiElement implements RexxCompare {

  public RexxCompareImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RexxVisitor visitor) {
    visitor.visitCompare(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RexxVisitor) accept((RexxVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RexxAddition> getAdditionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxAddition.class);
  }

  @Override
  @Nullable
  public PsiElement getOperatorEqual() {
    return findChildByType(OPERATOR_EQUAL);
  }

  @Override
  @Nullable
  public PsiElement getOperatorGreaterthan() {
    return findChildByType(OPERATOR_GREATERTHAN);
  }

  @Override
  @Nullable
  public PsiElement getOperatorGreaterthanEqual() {
    return findChildByType(OPERATOR_GREATERTHAN_EQUAL);
  }

  @Override
  @Nullable
  public PsiElement getOperatorLessthan() {
    return findChildByType(OPERATOR_LESSTHAN);
  }

  @Override
  @Nullable
  public PsiElement getOperatorLessthanEqual() {
    return findChildByType(OPERATOR_LESSTHAN_EQUAL);
  }

  @Override
  @Nullable
  public PsiElement getOperatorNotEqual() {
    return findChildByType(OPERATOR_NOT_EQUAL);
  }

}
