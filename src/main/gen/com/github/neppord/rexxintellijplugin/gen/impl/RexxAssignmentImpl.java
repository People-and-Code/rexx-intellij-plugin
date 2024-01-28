// This is a generated file. Not intended for manual editing.
package com.github.neppord.rexxintellijplugin.gen.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.neppord.rexxintellijplugin.gen.RexxTokens.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.neppord.rexxintellijplugin.gen.psi.*;

public class RexxAssignmentImpl extends ASTWrapperPsiElement implements RexxAssignment {

  public RexxAssignmentImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RexxVisitor visitor) {
    visitor.visitAssignment(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RexxVisitor) accept((RexxVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public RexxExpression getExpression() {
    return findNotNullChildByClass(RexxExpression.class);
  }

  @Override
  @NotNull
  public RexxNameDeclaration getNameDeclaration() {
    return findNotNullChildByClass(RexxNameDeclaration.class);
  }

  @Override
  @NotNull
  public PsiElement getOperatorEqual() {
    return findNotNullChildByType(OPERATOR_EQUAL);
  }

}
