// This is a generated file. Not intended for manual editing.
package se.peopleandcode.rexxintellijplugin.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RexxAdditionExpr extends RexxExpr {

  @NotNull
  List<RexxExpr> getExprList();

  @Nullable
  PsiElement getOperatorPlus();

  @Nullable
  PsiElement getOperatorSubtract();

}
