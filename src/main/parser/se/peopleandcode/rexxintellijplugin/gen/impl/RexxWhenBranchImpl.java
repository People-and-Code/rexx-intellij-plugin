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
  @Nullable
  public RexxAddressInstruction getAddressInstruction() {
    return findChildByClass(RexxAddressInstruction.class);
  }

  @Override
  @Nullable
  public RexxArgInstruction getArgInstruction() {
    return findChildByClass(RexxArgInstruction.class);
  }

  @Override
  @Nullable
  public RexxAssignmentInstruction getAssignmentInstruction() {
    return findChildByClass(RexxAssignmentInstruction.class);
  }

  @Override
  @Nullable
  public RexxCallInstruction getCallInstruction() {
    return findChildByClass(RexxCallInstruction.class);
  }

  @Override
  @Nullable
  public RexxDropInstruction getDropInstruction() {
    return findChildByClass(RexxDropInstruction.class);
  }

  @Override
  @Nullable
  public RexxExitInstruction getExitInstruction() {
    return findChildByClass(RexxExitInstruction.class);
  }

  @Override
  @NotNull
  public RexxExpr getExpr() {
    return findNotNullChildByClass(RexxExpr.class);
  }

  @Override
  @Nullable
  public RexxExpressionInstruction getExpressionInstruction() {
    return findChildByClass(RexxExpressionInstruction.class);
  }

  @Override
  @Nullable
  public RexxIfInstruction getIfInstruction() {
    return findChildByClass(RexxIfInstruction.class);
  }

  @Override
  @Nullable
  public RexxInstructionBlock getInstructionBlock() {
    return findChildByClass(RexxInstructionBlock.class);
  }

  @Override
  @Nullable
  public RexxIterateInstruction getIterateInstruction() {
    return findChildByClass(RexxIterateInstruction.class);
  }

  @Override
  @NotNull
  public List<RexxLabel> getLabelList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxLabel.class);
  }

  @Override
  @Nullable
  public RexxNopInstruction getNopInstruction() {
    return findChildByClass(RexxNopInstruction.class);
  }

  @Override
  @Nullable
  public RexxNumericInstruction getNumericInstruction() {
    return findChildByClass(RexxNumericInstruction.class);
  }

  @Override
  @Nullable
  public RexxParseInstruction getParseInstruction() {
    return findChildByClass(RexxParseInstruction.class);
  }

  @Override
  @Nullable
  public RexxProcedureInstruction getProcedureInstruction() {
    return findChildByClass(RexxProcedureInstruction.class);
  }

  @Override
  @Nullable
  public RexxPullInstruction getPullInstruction() {
    return findChildByClass(RexxPullInstruction.class);
  }

  @Override
  @Nullable
  public RexxReturnInstruction getReturnInstruction() {
    return findChildByClass(RexxReturnInstruction.class);
  }

  @Override
  @Nullable
  public RexxSayInstruction getSayInstruction() {
    return findChildByClass(RexxSayInstruction.class);
  }

  @Override
  @Nullable
  public RexxSelectInstruction getSelectInstruction() {
    return findChildByClass(RexxSelectInstruction.class);
  }

  @Override
  @Nullable
  public RexxSignalInstruction getSignalInstruction() {
    return findChildByClass(RexxSignalInstruction.class);
  }

  @Override
  @Nullable
  public RexxTraceInstruction getTraceInstruction() {
    return findChildByClass(RexxTraceInstruction.class);
  }

  @Override
  @Nullable
  public RexxUseInstruction getUseInstruction() {
    return findChildByClass(RexxUseInstruction.class);
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
