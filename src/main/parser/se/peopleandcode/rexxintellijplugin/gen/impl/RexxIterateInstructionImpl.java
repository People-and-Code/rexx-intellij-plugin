// This is a generated file. Not intended for manual editing.
package se.peopleandcode.rexxintellijplugin.gen.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static se.peopleandcode.rexxintellijplugin.gen.RexxTokens.*;
import se.peopleandcode.rexxintellijplugin.gen.psi.*;

public class RexxIterateInstructionImpl extends RexxInstructionImpl implements RexxIterateInstruction {

  public RexxIterateInstructionImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull RexxVisitor visitor) {
    visitor.visitIterateInstruction(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RexxVisitor) accept((RexxVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RexxGlobal getGlobal() {
    return findChildByClass(RexxGlobal.class);
  }

  @Override
  @Nullable
  public RexxVariable getVariable() {
    return findChildByClass(RexxVariable.class);
  }

  @Override
  @NotNull
  public PsiElement getIterate() {
    return findNotNullChildByType(ITERATE);
  }

}
