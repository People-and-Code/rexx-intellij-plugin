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

public class RexxDoInstructionImpl extends RexxInstructionImpl implements RexxDoInstruction {

  public RexxDoInstructionImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull RexxVisitor visitor) {
    visitor.visitDoInstruction(this);
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
  @NotNull
  public List<RexxInstruction> getInstructionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxInstruction.class);
  }

  @Override
  @Nullable
  public RexxIntegerConstant getIntegerConstant() {
    return findChildByClass(RexxIntegerConstant.class);
  }

  @Override
  @NotNull
  public List<RexxLabel> getLabelList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxLabel.class);
  }

  @Override
  @NotNull
  public List<RexxNameDeclaration> getNameDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxNameDeclaration.class);
  }

  @Override
  @Nullable
  public RexxScientificConstant getScientificConstant() {
    return findChildByClass(RexxScientificConstant.class);
  }

  @Override
  @NotNull
  public PsiElement getDo() {
    return findNotNullChildByType(DO);
  }

  @Override
  @Nullable
  public PsiElement getEnd() {
    return findChildByType(END);
  }

}
