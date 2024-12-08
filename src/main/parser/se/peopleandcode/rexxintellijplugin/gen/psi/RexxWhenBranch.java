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
  RexxAssignment getAssignment();

  @Nullable
  RexxCallInstruction getCallInstruction();

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
  RexxInstructionBlock getInstructionBlock();

  @Nullable
  RexxIterateInstruction getIterateInstruction();

  @Nullable
  RexxLabelInstruction getLabelInstruction();

  @Nullable
  RexxNopInstruction getNopInstruction();

  @Nullable
  RexxNumericInstruction getNumericInstruction();

  @Nullable
  RexxParseInstruction getParseInstruction();

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
  PsiElement getEnd();

  @NotNull
  PsiElement getThen();

  @NotNull
  PsiElement getWhen();

}
