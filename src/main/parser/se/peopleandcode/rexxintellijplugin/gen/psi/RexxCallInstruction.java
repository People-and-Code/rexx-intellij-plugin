// This is a generated file. Not intended for manual editing.
package se.peopleandcode.rexxintellijplugin.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RexxCallInstruction extends PsiElement {

  @Nullable
  RexxDecimalConstant getDecimalConstant();

  @NotNull
  List<RexxExpr> getExprList();

  @Nullable
  RexxGlobal getGlobal();

  @Nullable
  RexxIntegerConstant getIntegerConstant();

  @Nullable
  RexxScientificConstant getScientificConstant();

  @Nullable
  RexxStringLiteral getStringLiteral();

  @Nullable
  RexxVariable getVariable();

  @NotNull
  PsiElement getCall();

}
