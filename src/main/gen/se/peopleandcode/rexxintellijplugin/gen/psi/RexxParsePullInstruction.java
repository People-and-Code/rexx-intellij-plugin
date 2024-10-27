// This is a generated file. Not intended for manual editing.
package se.peopleandcode.rexxintellijplugin.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RexxParsePullInstruction extends PsiElement {

  @NotNull
  List<RexxIntegerConstant> getIntegerConstantList();

  @NotNull
  List<RexxNameDeclaration> getNameDeclarationList();

  @NotNull
  List<RexxRemainder> getRemainderList();

  @NotNull
  List<RexxStringLiteral> getStringLiteralList();

  @NotNull
  PsiElement getParse();

  @NotNull
  PsiElement getPull();

}
