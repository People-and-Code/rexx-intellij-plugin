// This is a generated file. Not intended for manual editing.
package se.peopleandcode.rexxintellijplugin.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RexxIfInstruction extends RexxInstruction {

  @NotNull
  RexxExpr getExpr();

  @NotNull
  List<RexxInstruction> getInstructionList();

  @NotNull
  List<RexxLabel> getLabelList();

  @Nullable
  PsiElement getElse();

  @NotNull
  PsiElement getIf();

  @NotNull
  PsiElement getThen();

}
