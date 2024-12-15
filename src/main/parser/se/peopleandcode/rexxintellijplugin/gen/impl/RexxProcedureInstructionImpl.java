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

public class RexxProcedureInstructionImpl extends RexxInstructionImpl implements RexxProcedureInstruction {

  public RexxProcedureInstructionImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull RexxVisitor visitor) {
    visitor.visitProcedureInstruction(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RexxVisitor) accept((RexxVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RexxVariable> getVariableList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxVariable.class);
  }

  @Override
  @Nullable
  public PsiElement getExpose() {
    return findChildByType(EXPOSE);
  }

  @Override
  @NotNull
  public PsiElement getProcedure() {
    return findNotNullChildByType(PROCEDURE);
  }

}
