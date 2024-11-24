// This is a generated file. Not intended for manual editing.
package se.peopleandcode.rexxintellijplugin.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RexxParseInstruction extends PsiElement {

  @NotNull
  List<RexxDecimalConstant> getDecimalConstantList();

  @Nullable
  RexxExpr getExpr();

  @NotNull
  List<RexxIntegerConstant> getIntegerConstantList();

  @NotNull
  List<RexxNameDeclaration> getNameDeclarationList();

  @NotNull
  List<RexxScientificConstant> getScientificConstantList();

  @NotNull
  List<RexxStringLiteral> getStringLiteralList();

  @Nullable
  PsiElement getArg();

  @NotNull
  PsiElement getParse();

  @Nullable
  PsiElement getPull();

  @Nullable
  PsiElement getSource();

  @Nullable
  PsiElement getValue();

  @Nullable
  PsiElement getVar();

  @Nullable
  PsiElement getWith();

}
