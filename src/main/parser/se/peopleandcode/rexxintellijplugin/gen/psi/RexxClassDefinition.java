// This is a generated file. Not intended for manual editing.
package se.peopleandcode.rexxintellijplugin.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RexxClassDefinition extends PsiElement {

  @NotNull
  List<RexxDecimalConstant> getDecimalConstantList();

  @NotNull
  List<RexxGlobal> getGlobalList();

  @NotNull
  List<RexxIntegerConstant> getIntegerConstantList();

  @NotNull
  List<RexxLabel> getLabelList();

  @NotNull
  List<RexxMethodDefinition> getMethodDefinitionList();

  @NotNull
  List<RexxScientificConstant> getScientificConstantList();

  @NotNull
  List<RexxStringLiteral> getStringLiteralList();

  @NotNull
  List<RexxVariable> getVariableList();

  @NotNull
  PsiElement getClassToken();

}
