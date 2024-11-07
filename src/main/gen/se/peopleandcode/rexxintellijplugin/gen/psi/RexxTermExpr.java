// This is a generated file. Not intended for manual editing.
package se.peopleandcode.rexxintellijplugin.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RexxTermExpr extends RexxExpr {

  @NotNull
  List<RexxDecimalConstant> getDecimalConstantList();

  @NotNull
  List<RexxExpr> getExprList();

  @NotNull
  List<RexxGlobal> getGlobalList();

  @NotNull
  List<RexxIntegerConstant> getIntegerConstantList();

  @NotNull
  List<RexxInvoke> getInvokeList();

  @NotNull
  List<RexxParentheticalExpression> getParentheticalExpressionList();

  @NotNull
  List<RexxScientificConstant> getScientificConstantList();

  @NotNull
  List<RexxStringLiteral> getStringLiteralList();

  @NotNull
  List<RexxVariable> getVariableList();

}
