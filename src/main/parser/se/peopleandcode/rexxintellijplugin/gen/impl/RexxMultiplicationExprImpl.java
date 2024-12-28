// This is a generated file. Not intended for manual editing.
package se.peopleandcode.rexxintellijplugin.gen.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static se.peopleandcode.rexxintellijplugin.gen.RexxTokens.*;
import se.peopleandcode.rexxintellijplugin.gen.psi.*;

public class RexxMultiplicationExprImpl extends RexxExprImpl implements RexxMultiplicationExpr {

  public RexxMultiplicationExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull RexxVisitor visitor) {
    visitor.visitMultiplicationExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RexxVisitor) accept((RexxVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RexxExpr> getExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxExpr.class);
  }

  @Override
  @Nullable
  public PsiElement getOperatorDivide() {
    return findChildByType(OPERATOR_DIVIDE);
  }

  @Override
  @Nullable
  public PsiElement getOperatorMultiply() {
    return findChildByType(OPERATOR_MULTIPLY);
  }

  @Override
  @Nullable
  public PsiElement getOperatorRemainder() {
    return findChildByType(OPERATOR_REMAINDER);
  }

}
