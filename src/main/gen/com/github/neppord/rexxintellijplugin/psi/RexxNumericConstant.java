// This is a generated file. Not intended for manual editing.
package com.github.neppord.rexxintellijplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RexxNumericConstant extends PsiElement {

  @Nullable
  RexxDecimalConstant getDecimalConstant();

  @Nullable
  RexxIntegerConstant getIntegerConstant();

  @Nullable
  RexxScientificConstant getScientificConstant();

}
