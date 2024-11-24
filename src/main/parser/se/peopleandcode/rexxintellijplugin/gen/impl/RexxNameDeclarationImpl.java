// This is a generated file. Not intended for manual editing.
package se.peopleandcode.rexxintellijplugin.gen.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static se.peopleandcode.rexxintellijplugin.gen.RexxTokens.*;
import se.peopleandcode.rexxintellijplugin.instructions.NameDeclaration;
import se.peopleandcode.rexxintellijplugin.gen.psi.*;

public class RexxNameDeclarationImpl extends NameDeclaration implements RexxNameDeclaration {

  public RexxNameDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RexxVisitor visitor) {
    visitor.visitNameDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RexxVisitor) accept((RexxVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public RexxIdentifier_ getIdentifier_() {
    return findNotNullChildByClass(RexxIdentifier_.class);
  }

}
