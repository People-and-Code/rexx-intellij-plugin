// This is a generated file. Not intended for manual editing.
package se.peopleandcode.rexxintellijplugin.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RexxWhenBranch extends PsiElement {

  @Nullable
  RexxAddressInstruction getAddressInstruction();

  @Nullable
  RexxArgInstruction getArgInstruction();

  @Nullable
  RexxAssignmentInstruction getAssignmentInstruction();

  @Nullable
  RexxCallInstruction getCallInstruction();

  @Nullable
  RexxDoInstruction getDoInstruction();

  @Nullable
  RexxDropInstruction getDropInstruction();

  @Nullable
  RexxExitInstruction getExitInstruction();

  @NotNull
  RexxExpr getExpr();

  @Nullable
  RexxExpressionInstruction getExpressionInstruction();

  @Nullable
  RexxIfInstruction getIfInstruction();

  @Nullable
  RexxIterateInstruction getIterateInstruction();

  @NotNull
  List<RexxLabel> getLabelList();

  @Nullable
  RexxNopInstruction getNopInstruction();

  @Nullable
  RexxNumericInstruction getNumericInstruction();

  @Nullable
  RexxParseInstruction getParseInstruction();

  @Nullable
  RexxProcedureInstruction getProcedureInstruction();

  @Nullable
  RexxPullInstruction getPullInstruction();

  @Nullable
  RexxReturnInstruction getReturnInstruction();

  @Nullable
  RexxSayInstruction getSayInstruction();

  @Nullable
  RexxSelectInstruction getSelectInstruction();

  @Nullable
  RexxSignalInstruction getSignalInstruction();

  @Nullable
  RexxTraceInstruction getTraceInstruction();

  @Nullable
  RexxUseInstruction getUseInstruction();

  @Nullable
  PsiElement getEnd();

  @NotNull
  PsiElement getThen();

  @NotNull
  PsiElement getWhen();

}
