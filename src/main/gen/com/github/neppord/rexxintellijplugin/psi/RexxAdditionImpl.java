// This is a generated file. Not intended for manual editing.
package com.github.neppord.rexxintellijplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.neppord.rexxintellijplugin.RexxTokensKt.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;

public class RexxAdditionImpl extends ASTWrapperPsiElement implements RexxAddition {

  public RexxAdditionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RexxVisitor visitor) {
    visitor.visitAddition(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RexxVisitor) accept((RexxVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RexxMultiplication> getMultiplicationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxMultiplication.class);
  }

  @Override
  @NotNull
  public List<RexxSubtraction> getSubtractionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxSubtraction.class);
  }

}
