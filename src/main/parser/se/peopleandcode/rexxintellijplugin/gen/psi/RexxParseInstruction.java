// This is a generated file. Not intended for manual editing.
package se.peopleandcode.rexxintellijplugin.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RexxParseInstruction extends RexxInstruction {

  @NotNull
  List<RexxDecimalConstant> getDecimalConstantList();

  @NotNull
  List<RexxExpr> getExprList();

  @NotNull
  List<RexxIntegerConstant> getIntegerConstantList();

  @NotNull
  List<RexxNameDeclaration> getNameDeclarationList();

  @NotNull
  List<RexxScientificConstant> getScientificConstantList();

  @NotNull
  List<RexxStringLiteral> getStringLiteralList();

  @Nullable
  RexxVariable getVariable();

  @Nullable
  PsiElement getArg();

  @Nullable
  PsiElement getCaseless();

  @Nullable
  PsiElement getLower();

  @NotNull
  PsiElement getParse();

  @Nullable
  PsiElement getPull();

  @Nullable
  PsiElement getSource();

  @Nullable
  PsiElement getUpper();

  @Nullable
  PsiElement getValue();

  @Nullable
  PsiElement getVar();

  @Nullable
  PsiElement getWith();

}
