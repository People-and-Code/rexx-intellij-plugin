// This is a generated file. Not intended for manual editing.
package se.peopleandcode.rexxintellijplugin.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RexxOtherwiseBranch extends PsiElement {

  @NotNull
  List<RexxInstruction> getInstructionList();

  @NotNull
  List<RexxLabel> getLabelList();

  @NotNull
  PsiElement getOtherwise();

}
