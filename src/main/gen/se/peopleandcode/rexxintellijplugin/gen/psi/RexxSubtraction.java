// This is a generated file. Not intended for manual editing.
package se.peopleandcode.rexxintellijplugin.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RexxSubtraction extends PsiElement {

  @NotNull
  List<RexxMultiplication> getMultiplicationList();

  @Nullable
  RexxSubtraction getSubtraction();

  @NotNull
  PsiElement getOperatorSubtract();

}