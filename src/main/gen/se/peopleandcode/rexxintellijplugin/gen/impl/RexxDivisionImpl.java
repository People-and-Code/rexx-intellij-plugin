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

public class RexxDivisionImpl extends ASTWrapperPsiElement implements RexxDivision {

  public RexxDivisionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RexxVisitor visitor) {
    visitor.visitDivision(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RexxVisitor) accept((RexxVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RexxDivision getDivision() {
    return findChildByClass(RexxDivision.class);
  }

  @Override
  @NotNull
  public List<RexxExpressionTerm> getExpressionTermList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxExpressionTerm.class);
  }

  @Override
  @NotNull
  public PsiElement getOperatorDivide() {
    return findNotNullChildByType(OPERATOR_DIVIDE);
  }

}
