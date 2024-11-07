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

public class RexxOtherwiseBranchImpl extends ASTWrapperPsiElement implements RexxOtherwiseBranch {

  public RexxOtherwiseBranchImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RexxVisitor visitor) {
    visitor.visitOtherwiseBranch(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RexxVisitor) accept((RexxVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RexxAddressInstruction> getAddressInstructionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxAddressInstruction.class);
  }

  @Override
  @NotNull
  public List<RexxArgInstruction> getArgInstructionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxArgInstruction.class);
  }

  @Override
  @NotNull
  public List<RexxAssignment> getAssignmentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxAssignment.class);
  }

  @Override
  @NotNull
  public List<RexxCallInstruction> getCallInstructionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxCallInstruction.class);
  }

  @Override
  @NotNull
  public List<RexxExitInstruction> getExitInstructionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxExitInstruction.class);
  }

  @Override
  @NotNull
  public List<RexxExpressionInstruction> getExpressionInstructionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxExpressionInstruction.class);
  }

  @Override
  @NotNull
  public List<RexxIfInstruction> getIfInstructionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxIfInstruction.class);
  }

  @Override
  @NotNull
  public List<RexxInstructionBlock> getInstructionBlockList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxInstructionBlock.class);
  }

  @Override
  @NotNull
  public List<RexxIterateInstruction> getIterateInstructionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxIterateInstruction.class);
  }

  @Override
  @NotNull
  public List<RexxLabelInstruction> getLabelInstructionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxLabelInstruction.class);
  }

  @Override
  @NotNull
  public List<RexxNumericInstruction> getNumericInstructionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxNumericInstruction.class);
  }

  @Override
  @NotNull
  public List<RexxParseInstruction> getParseInstructionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxParseInstruction.class);
  }

  @Override
  @NotNull
  public List<RexxReturnInstruction> getReturnInstructionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxReturnInstruction.class);
  }

  @Override
  @NotNull
  public List<RexxSayInstruction> getSayInstructionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxSayInstruction.class);
  }

  @Override
  @NotNull
  public List<RexxSelectInstruction> getSelectInstructionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxSelectInstruction.class);
  }

  @Override
  @NotNull
  public List<RexxSignalInstruction> getSignalInstructionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxSignalInstruction.class);
  }

  @Override
  @NotNull
  public List<RexxTraceInstruction> getTraceInstructionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxTraceInstruction.class);
  }

  @Override
  @NotNull
  public PsiElement getOtherwise() {
    return findNotNullChildByType(OTHERWISE);
  }

}
