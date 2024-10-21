// This is a generated file. Not intended for manual editing.
package se.peopleandcode.rexxintellijplugin.gen.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static se.peopleandcode.rexxintellijplugin.gen.RexxTokens.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import se.peopleandcode.rexxintellijplugin.gen.psi.*;

public class RexxNumericConstantImpl extends ASTWrapperPsiElement implements RexxNumericConstant {

  public RexxNumericConstantImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RexxVisitor visitor) {
    visitor.visitNumericConstant(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RexxVisitor) accept((RexxVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RexxDecimalConstant getDecimalConstant() {
    return findChildByClass(RexxDecimalConstant.class);
  }

  @Override
  @Nullable
  public RexxIntegerConstant getIntegerConstant() {
    return findChildByClass(RexxIntegerConstant.class);
  }

  @Override
  @Nullable
  public RexxScientificConstant getScientificConstant() {
    return findChildByClass(RexxScientificConstant.class);
  }

}
