// This is a generated file. Not intended for manual editing.
package se.peopleandcode.rexxintellijplugin.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RexxSelectInstruction extends PsiElement {

  @NotNull
  List<RexxLabel> getLabelList();

  @NotNull
  RexxSelectBody getSelectBody();

  @NotNull
  PsiElement getEnd();

  @NotNull
  PsiElement getSelect();

}
