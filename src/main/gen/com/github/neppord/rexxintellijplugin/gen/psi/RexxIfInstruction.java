// This is a generated file. Not intended for manual editing.
package com.github.neppord.rexxintellijplugin.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RexxIfInstruction extends PsiElement {

  @NotNull
  List<RexxAssignment> getAssignmentList();

  @NotNull
  List<RexxExitInstruction> getExitInstructionList();

  @NotNull
  RexxExpression getExpression();

  @NotNull
  List<RexxIfInstruction> getIfInstructionList();

  @NotNull
  List<RexxInstructionBlock> getInstructionBlockList();

  @NotNull
  List<RexxParseArgInstruction> getParseArgInstructionList();

  @NotNull
  List<RexxParseSourceInstruction> getParseSourceInstructionList();

  @NotNull
  List<RexxParseValueInstruction> getParseValueInstructionList();

  @NotNull
  List<RexxParseVarInstruction> getParseVarInstructionList();

  @NotNull
  List<RexxSayInstruction> getSayInstructionList();

  @Nullable
  PsiElement getKeywordElse();

  @NotNull
  PsiElement getKeywordIf();

  @NotNull
  PsiElement getKeywordThen();

}
