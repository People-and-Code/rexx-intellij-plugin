// This is a generated file. Not intended for manual editing.
package com.github.neppord.rexxintellijplugin.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RexxStem extends PsiElement {

  @NotNull
  RexxVariable getVariable();

  @NotNull
  PsiElement getDot();

  @Nullable
  PsiElement getExclamation();

  @NotNull
  PsiElement getIdentifier();

}