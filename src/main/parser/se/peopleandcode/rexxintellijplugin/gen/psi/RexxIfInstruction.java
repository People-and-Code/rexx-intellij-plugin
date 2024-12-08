// This is a generated file. Not intended for manual editing.
package se.peopleandcode.rexxintellijplugin.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RexxIfInstruction extends PsiElement {

  @NotNull
  List<RexxAddressInstruction> getAddressInstructionList();

  @NotNull
  List<RexxArgInstruction> getArgInstructionList();

  @NotNull
  List<RexxAssignment> getAssignmentList();

  @NotNull
  List<RexxCallInstruction> getCallInstructionList();

  @NotNull
  List<RexxDropInstruction> getDropInstructionList();

  @NotNull
  List<RexxExitInstruction> getExitInstructionList();

  @NotNull
  RexxExpr getExpr();

  @NotNull
  List<RexxExpressionInstruction> getExpressionInstructionList();

  @NotNull
  List<RexxIfInstruction> getIfInstructionList();

  @NotNull
  List<RexxInstructionBlock> getInstructionBlockList();

  @NotNull
  List<RexxIterateInstruction> getIterateInstructionList();

  @NotNull
  List<RexxLabelInstruction> getLabelInstructionList();

  @NotNull
  List<RexxNopInstruction> getNopInstructionList();

  @NotNull
  List<RexxNumericInstruction> getNumericInstructionList();

  @NotNull
  List<RexxParseInstruction> getParseInstructionList();

  @NotNull
  List<RexxPullInstruction> getPullInstructionList();

  @NotNull
  List<RexxReturnInstruction> getReturnInstructionList();

  @NotNull
  List<RexxSayInstruction> getSayInstructionList();

  @NotNull
  List<RexxSelectInstruction> getSelectInstructionList();

  @NotNull
  List<RexxSignalInstruction> getSignalInstructionList();

  @NotNull
  List<RexxTraceInstruction> getTraceInstructionList();

  @Nullable
  PsiElement getElse();

  @NotNull
  PsiElement getIf();

  @NotNull
  PsiElement getThen();

}
