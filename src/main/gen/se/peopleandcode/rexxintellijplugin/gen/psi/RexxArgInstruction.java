// This is a generated file. Not intended for manual editing.
package se.peopleandcode.rexxintellijplugin.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RexxArgInstruction extends PsiElement {

  @NotNull
  List<RexxNameDeclaration> getNameDeclarationList();

  @NotNull
  List<RexxNumericConstant> getNumericConstantList();

  @NotNull
  List<RexxStringLiteral> getStringLiteralList();

  @NotNull
  PsiElement getArg();

}
