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

public class RexxWhileInstructionImpl extends ASTWrapperPsiElement implements RexxWhileInstruction {

  public RexxWhileInstructionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RexxVisitor visitor) {
    visitor.visitWhileInstruction(this);
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
  public RexxExpression getExpression() {
    return findNotNullChildByClass(RexxExpression.class);
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
  public List<RexxParseArgInstruction> getParseArgInstructionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxParseArgInstruction.class);
  }

  @Override
  @NotNull
  public List<RexxParsePullInstruction> getParsePullInstructionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxParsePullInstruction.class);
  }

  @Override
  @NotNull
  public List<RexxParseSourceInstruction> getParseSourceInstructionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxParseSourceInstruction.class);
  }

  @Override
  @NotNull
  public List<RexxParseValueInstruction> getParseValueInstructionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxParseValueInstruction.class);
  }

  @Override
  @NotNull
  public List<RexxParseVarInstruction> getParseVarInstructionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxParseVarInstruction.class);
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
  public List<RexxWhileInstruction> getWhileInstructionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxWhileInstruction.class);
  }

  @Override
  @NotNull
  public PsiElement getKeywordDo() {
    return findNotNullChildByType(KEYWORD_DO);
  }

  @Override
  @NotNull
  public PsiElement getKeywordEnd() {
    return findNotNullChildByType(KEYWORD_END);
  }

  @Override
  @NotNull
  public PsiElement getKeywordWhile() {
    return findNotNullChildByType(KEYWORD_WHILE);
  }

}
