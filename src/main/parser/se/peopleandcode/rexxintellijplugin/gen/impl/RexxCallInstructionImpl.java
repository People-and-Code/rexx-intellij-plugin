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

public class RexxCallInstructionImpl extends RexxInstructionImpl implements RexxCallInstruction {

  public RexxCallInstructionImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull RexxVisitor visitor) {
    visitor.visitCallInstruction(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RexxVisitor) accept((RexxVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RexxDecimalConstant getDecimalConstant() {
    return findChildByClass(RexxDecimalConstant.class);
  }

  @Override
  @NotNull
  public List<RexxExpr> getExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxExpr.class);
  }

  @Override
  @Nullable
  public RexxGlobal getGlobal() {
    return findChildByClass(RexxGlobal.class);
  }

  @Override
  @Nullable
  public RexxIntegerConstant getIntegerConstant() {
    return findChildByClass(RexxIntegerConstant.class);
  }

  @Override
  @Nullable
  public RexxScientificConstant getScientificConstant() {
    return findChildByClass(RexxScientificConstant.class);
  }

  @Override
  @Nullable
  public RexxStringLiteral getStringLiteral() {
    return findChildByClass(RexxStringLiteral.class);
  }

  @Override
  @Nullable
  public RexxVariable getVariable() {
    return findChildByClass(RexxVariable.class);
  }

  @Override
  @NotNull
  public PsiElement getCall() {
    return findNotNullChildByType(CALL);
  }

}
