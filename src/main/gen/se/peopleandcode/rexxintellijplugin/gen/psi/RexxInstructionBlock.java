// This is a generated file. Not intended for manual editing.
package se.peopleandcode.rexxintellijplugin.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RexxInstructionBlock extends PsiElement {

  @NotNull
  List<RexxAddressInstruction> getAddressInstructionList();

  @NotNull
  List<RexxAssignment> getAssignmentList();

  @NotNull
  List<RexxCallInstruction> getCallInstructionList();

  @NotNull
  List<RexxExitInstruction> getExitInstructionList();

  @NotNull
  List<RexxExpression> getExpressionList();

  @NotNull
  List<RexxExpressionInstruction> getExpressionInstructionList();

  @NotNull
  List<RexxIfInstruction> getIfInstructionList();

  @NotNull
  List<RexxInstructionBlock> getInstructionBlockList();

  @NotNull
  List<RexxLabelInstruction> getLabelInstructionList();

  @Nullable
  RexxNameDeclaration getNameDeclaration();

  @Nullable
  RexxNumericConstant getNumericConstant();

  @NotNull
  List<RexxNumericInstruction> getNumericInstructionList();

  @NotNull
  List<RexxParseArgInstruction> getParseArgInstructionList();

  @NotNull
  List<RexxParsePullInstruction> getParsePullInstructionList();

  @NotNull
  List<RexxParseSourceInstruction> getParseSourceInstructionList();

  @NotNull
  List<RexxParseValueInstruction> getParseValueInstructionList();

  @NotNull
  List<RexxParseVarInstruction> getParseVarInstructionList();

  @NotNull
  List<RexxReturnInstruction> getReturnInstructionList();

  @NotNull
  List<RexxSayInstruction> getSayInstructionList();

  @NotNull
  List<RexxSignalInstruction> getSignalInstructionList();

  @NotNull
  List<RexxTraceInstruction> getTraceInstructionList();

  @NotNull
  PsiElement getKeywordDo();

  @NotNull
  PsiElement getKeywordEnd();

}
