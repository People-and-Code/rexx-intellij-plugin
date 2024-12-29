// This is a generated file. Not intended for manual editing.
package se.peopleandcode.rexxintellijplugin.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RexxMethodDefinition extends PsiElement {

  @Nullable
  RexxDecimalConstant getDecimalConstant();

  @Nullable
  RexxGlobal getGlobal();

  @NotNull
  List<RexxInstruction> getInstructionList();

  @Nullable
  RexxIntegerConstant getIntegerConstant();

  @NotNull
  List<RexxLabel> getLabelList();

  @Nullable
  RexxScientificConstant getScientificConstant();

  @Nullable
  RexxStringLiteral getStringLiteral();

  @NotNull
  List<RexxVariable> getVariableList();

  @Nullable
  PsiElement getExpose();

  @NotNull
  PsiElement getMethod();

}
