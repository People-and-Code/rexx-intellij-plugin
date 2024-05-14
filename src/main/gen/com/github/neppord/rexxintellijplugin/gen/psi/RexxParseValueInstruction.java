// This is a generated file. Not intended for manual editing.
package com.github.neppord.rexxintellijplugin.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RexxParseValueInstruction extends PsiElement {

  @NotNull
  RexxExpression getExpression();

  @NotNull
  List<RexxIntegerConstant> getIntegerConstantList();

  @NotNull
  List<RexxNameDeclaration> getNameDeclarationList();

  @NotNull
  List<RexxRemainder> getRemainderList();

  @NotNull
  List<RexxStringLiteral> getStringLiteralList();

  @NotNull
  PsiElement getKeywordParse();

  @NotNull
  PsiElement getKeywordValue();

  @NotNull
  PsiElement getKeywordWith();

}
