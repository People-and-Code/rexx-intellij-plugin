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

public class RexxWhenBranchImpl extends ASTWrapperPsiElement implements RexxWhenBranch {

  public RexxWhenBranchImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RexxVisitor visitor) {
    visitor.visitWhenBranch(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RexxVisitor) accept((RexxVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public RexxExpr getExpr() {
    return findNotNullChildByClass(RexxExpr.class);
  }

  @Override
  @Nullable
  public RexxInstruction getInstruction() {
    return findChildByClass(RexxInstruction.class);
  }

  @Override
  @NotNull
  public List<RexxLabel> getLabelList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxLabel.class);
  }

  @Override
  @Nullable
  public PsiElement getEnd() {
    return findChildByType(END);
  }

  @Override
  @NotNull
  public PsiElement getThen() {
    return findNotNullChildByType(THEN);
  }

  @Override
  @NotNull
  public PsiElement getWhen() {
    return findNotNullChildByType(WHEN);
  }

}
