// This is a generated file. Not intended for manual editing.
package se.peopleandcode.rexxintellijplugin.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RexxProcedureInstruction extends RexxInstruction {

  @NotNull
  List<RexxVariable> getVariableList();

  @Nullable
  PsiElement getExpose();

  @NotNull
  PsiElement getProcedure();

}
