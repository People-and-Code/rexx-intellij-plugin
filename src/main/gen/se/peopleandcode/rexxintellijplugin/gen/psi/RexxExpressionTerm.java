// This is a generated file. Not intended for manual editing.
package se.peopleandcode.rexxintellijplugin.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RexxExpressionTerm extends PsiElement {

  @NotNull
  List<RexxExpression> getExpressionList();

  @Nullable
  RexxGlobal getGlobal();

  @Nullable
  RexxInvoke getInvoke();

  @Nullable
  RexxMethodCall getMethodCall();

  @Nullable
  RexxNumericConstant getNumericConstant();

  @Nullable
  RexxParentheticalExpression getParentheticalExpression();

  @Nullable
  RexxStem getStem();

  @Nullable
  RexxStringLiteral getStringLiteral();

  @Nullable
  RexxVariable getVariable();

}
