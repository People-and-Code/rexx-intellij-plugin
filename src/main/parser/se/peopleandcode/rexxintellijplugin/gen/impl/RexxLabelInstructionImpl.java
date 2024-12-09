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

public class RexxLabelInstructionImpl extends ASTWrapperPsiElement implements RexxLabelInstruction {

  public RexxLabelInstructionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RexxVisitor visitor) {
    visitor.visitLabelInstruction(this);
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
  public RexxAssignment getAssignment() {
    return findChildByClass(RexxAssignment.class);
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
  @Nullable
  public RexxExpressionInstruction getExpressionInstruction() {
    return findChildByClass(RexxExpressionInstruction.class);
  }

  @Override
  @Nullable
  public RexxIterateInstruction getIterateInstruction() {
    return findChildByClass(RexxIterateInstruction.class);
  }

  @Override
  @Nullable
  public RexxLabelInstruction getLabelInstruction() {
    return findChildByClass(RexxLabelInstruction.class);
  }

  @Override
  @NotNull
  public RexxNameDeclaration getNameDeclaration() {
    return findNotNullChildByClass(RexxNameDeclaration.class);
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
  public RexxSignalInstruction getSignalInstruction() {
    return findChildByClass(RexxSignalInstruction.class);
  }

  @Override
  @Nullable
  public RexxTraceInstruction getTraceInstruction() {
    return findChildByClass(RexxTraceInstruction.class);
  }

  @Override
  @NotNull
  public PsiElement getColon() {
    return findNotNullChildByType(COLON);
  }

}
