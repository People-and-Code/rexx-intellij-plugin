// This is a generated file. Not intended for manual editing.
package se.peopleandcode.rexxintellijplugin.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RexxDoInstruction extends RexxInstruction {

  @Nullable
  RexxDecimalConstant getDecimalConstant();

  @NotNull
  List<RexxExpr> getExprList();

  @NotNull
  List<RexxInstruction> getInstructionList();

  @Nullable
  RexxIntegerConstant getIntegerConstant();

  @NotNull
  List<RexxLabel> getLabelList();

  @NotNull
  List<RexxNameDeclaration> getNameDeclarationList();

  @Nullable
  RexxScientificConstant getScientificConstant();

  @NotNull
  PsiElement getDo();

  @Nullable
  PsiElement getEnd();

}
