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

public class RexxClassDefinitionImpl extends ASTWrapperPsiElement implements RexxClassDefinition {

  public RexxClassDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RexxVisitor visitor) {
    visitor.visitClassDefinition(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RexxVisitor) accept((RexxVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RexxDecimalConstant> getDecimalConstantList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxDecimalConstant.class);
  }

  @Override
  @NotNull
  public List<RexxGlobal> getGlobalList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxGlobal.class);
  }

  @Override
  @NotNull
  public List<RexxIntegerConstant> getIntegerConstantList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxIntegerConstant.class);
  }

  @Override
  @NotNull
  public List<RexxLabel> getLabelList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxLabel.class);
  }

  @Override
  @NotNull
  public List<RexxMethodDefinition> getMethodDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxMethodDefinition.class);
  }

  @Override
  @NotNull
  public List<RexxScientificConstant> getScientificConstantList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxScientificConstant.class);
  }

  @Override
  @NotNull
  public List<RexxStringLiteral> getStringLiteralList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxStringLiteral.class);
  }

  @Override
  @NotNull
  public List<RexxVariable> getVariableList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxVariable.class);
  }

  @Override
  @NotNull
  public PsiElement getClassToken() {
    return findNotNullChildByType(CLASS_TOKEN);
  }

}
