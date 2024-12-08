// This is a generated file. Not intended for manual editing.
package se.peopleandcode.rexxintellijplugin.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RexxInstructionBlock extends PsiElement {

  @NotNull
  List<RexxAddressInstruction> getAddressInstructionList();

  @NotNull
  List<RexxArgInstruction> getArgInstructionList();

  @NotNull
  List<RexxAssignment> getAssignmentList();

  @NotNull
  List<RexxCallInstruction> getCallInstructionList();

  @Nullable
  RexxDecimalConstant getDecimalConstant();

  @NotNull
  List<RexxDropInstruction> getDropInstructionList();

  @NotNull
  List<RexxExitInstruction> getExitInstructionList();

  @NotNull
  List<RexxExpr> getExprList();

  @NotNull
  List<RexxExpressionInstruction> getExpressionInstructionList();

  @NotNull
  List<RexxIfInstruction> getIfInstructionList();

  @NotNull
  List<RexxInstructionBlock> getInstructionBlockList();

  @Nullable
  RexxIntegerConstant getIntegerConstant();

  @NotNull
  List<RexxIterateInstruction> getIterateInstructionList();

  @NotNull
  List<RexxLabelInstruction> getLabelInstructionList();

  @NotNull
  List<RexxNameDeclaration> getNameDeclarationList();

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

  @Nullable
  RexxScientificConstant getScientificConstant();

  @NotNull
  List<RexxSelectInstruction> getSelectInstructionList();

  @NotNull
  List<RexxSignalInstruction> getSignalInstructionList();

  @NotNull
  List<RexxTraceInstruction> getTraceInstructionList();

  @NotNull
  PsiElement getDo();

  @Nullable
  PsiElement getEnd();

}
