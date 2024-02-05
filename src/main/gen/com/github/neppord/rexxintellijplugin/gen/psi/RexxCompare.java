// This is a generated file. Not intended for manual editing.
package com.github.neppord.rexxintellijplugin.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RexxCompare extends PsiElement {

  @NotNull
  List<RexxAddition> getAdditionList();

  @Nullable
  PsiElement getOperatorEqual();

  @Nullable
  PsiElement getOperatorGreaterthan();

  @Nullable
  PsiElement getOperatorGreaterthanEqual();

  @Nullable
  PsiElement getOperatorLessthan();

  @Nullable
  PsiElement getOperatorLessthanEqual();

  @Nullable
  PsiElement getOperatorNotEqual();

}
