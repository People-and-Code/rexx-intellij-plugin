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

public class RexxMethodCallImpl extends ASTWrapperPsiElement implements RexxMethodCall {

  public RexxMethodCallImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RexxVisitor visitor) {
    visitor.visitMethodCall(this);
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
  @Nullable
  public RexxFunctionCall getFunctionCall() {
    return findChildByClass(RexxFunctionCall.class);
  }

  @Override
  @NotNull
  public List<RexxGlobal> getGlobalList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxGlobal.class);
  }

  @Override
  @Nullable
  public RexxNumericConstant getNumericConstant() {
    return findChildByClass(RexxNumericConstant.class);
  }

  @Override
  @Nullable
  public RexxParentheticalExpression getParentheticalExpression() {
    return findChildByClass(RexxParentheticalExpression.class);
  }

  @Override
  @Nullable
  public RexxStem getStem() {
    return findChildByClass(RexxStem.class);
  }

  @Override
  @Nullable
  public RexxStringLiteral getStringLiteral() {
    return findChildByClass(RexxStringLiteral.class);
  }

  @Override
  @NotNull
  public List<RexxVariable> getVariableList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxVariable.class);
  }

}
