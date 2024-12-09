// This is a generated file. Not intended for manual editing.
package se.peopleandcode.rexxintellijplugin.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RexxLabelInstruction extends PsiElement {

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

  @Nullable
  RexxExpressionInstruction getExpressionInstruction();

  @Nullable
  RexxIterateInstruction getIterateInstruction();

  @Nullable
  RexxLabelInstruction getLabelInstruction();

  @NotNull
  RexxNameDeclaration getNameDeclaration();

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
  RexxSignalInstruction getSignalInstruction();

  @Nullable
  RexxTraceInstruction getTraceInstruction();

  @NotNull
  PsiElement getColon();

}
