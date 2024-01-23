// This is a generated file. Not intended for manual editing.
package com.github.neppord.rexxintellijplugin.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class RexxVisitor extends PsiElementVisitor {

  public void visitExpression(@NotNull RexxExpression o) {
    visitPsiElement(o);
  }

  public void visitInstruction(@NotNull RexxInstruction o) {
    visitPsiElement(o);
  }

  public void visitSayInstruction(@NotNull RexxSayInstruction o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
