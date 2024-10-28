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

public class RexxStemImpl extends ASTWrapperPsiElement implements RexxStem {

  public RexxStemImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RexxVisitor visitor) {
    visitor.visitStem(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RexxVisitor) accept((RexxVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RexxExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxExpression.class);
  }

  @Override
  @NotNull
  public List<RexxFunctionCall> getFunctionCallList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxFunctionCall.class);
  }

  @Override
  @NotNull
  public List<RexxGlobal> getGlobalList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxGlobal.class);
  }

  @Override
  @NotNull
  public List<RexxNumericConstant> getNumericConstantList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxNumericConstant.class);
  }

  @Override
  @NotNull
  public List<RexxParentheticalExpression> getParentheticalExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxParentheticalExpression.class);
  }

  @Override
  @NotNull
  public List<RexxStringLiteral> getStringLiteralList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxStringLiteral.class);
  }

  @Override
  @NotNull
  public List<RexxVariable> getVariableList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxVariable.class);
  }

}
