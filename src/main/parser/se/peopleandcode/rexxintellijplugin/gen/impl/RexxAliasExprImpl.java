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

public class RexxAliasExprImpl extends RexxExprImpl implements RexxAliasExpr {

  public RexxAliasExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull RexxVisitor visitor) {
    visitor.visitAliasExpr(this);
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
  public PsiElement getOperatorAnd() {
    return findChildByType(OPERATOR_AND);
  }

  @Override
  @Nullable
  public PsiElement getOperatorOr() {
    return findChildByType(OPERATOR_OR);
  }

}
