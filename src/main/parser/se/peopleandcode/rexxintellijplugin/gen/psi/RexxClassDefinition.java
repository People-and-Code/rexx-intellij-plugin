// This is a generated file. Not intended for manual editing.
package se.peopleandcode.rexxintellijplugin.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RexxClassDefinition extends PsiElement {

  @Nullable
  RexxDecimalConstant getDecimalConstant();

  @Nullable
  RexxGlobal getGlobal();

  @Nullable
  RexxIntegerConstant getIntegerConstant();

  @NotNull
  List<RexxLabel> getLabelList();

  @NotNull
  List<RexxMethodDefinition> getMethodDefinitionList();

  @Nullable
  RexxScientificConstant getScientificConstant();

  @Nullable
  RexxStringLiteral getStringLiteral();

  @Nullable
  RexxVariable getVariable();

  @NotNull
  PsiElement getClassToken();

}
