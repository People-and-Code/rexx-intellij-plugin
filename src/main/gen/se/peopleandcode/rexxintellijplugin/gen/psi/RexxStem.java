// This is a generated file. Not intended for manual editing.
package se.peopleandcode.rexxintellijplugin.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RexxStem extends PsiElement {

  @NotNull
  List<RexxExpression> getExpressionList();

  @NotNull
  List<RexxGlobal> getGlobalList();

  @NotNull
  List<RexxInvoke> getInvokeList();

  @NotNull
  List<RexxNumericConstant> getNumericConstantList();

  @NotNull
  List<RexxParentheticalExpression> getParentheticalExpressionList();

  @NotNull
  List<RexxStringLiteral> getStringLiteralList();

  @NotNull
  List<RexxVariable> getVariableList();

}
