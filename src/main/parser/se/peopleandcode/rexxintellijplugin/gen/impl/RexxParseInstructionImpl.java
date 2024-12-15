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

public class RexxParseInstructionImpl extends RexxInstructionImpl implements RexxParseInstruction {

  public RexxParseInstructionImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull RexxVisitor visitor) {
    visitor.visitParseInstruction(this);
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
  public List<RexxExpr> getExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxExpr.class);
  }

  @Override
  @NotNull
  public List<RexxIntegerConstant> getIntegerConstantList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxIntegerConstant.class);
  }

  @Override
  @NotNull
  public List<RexxNameDeclaration> getNameDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxNameDeclaration.class);
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
  @Nullable
  public RexxVariable getVariable() {
    return findChildByClass(RexxVariable.class);
  }

  @Override
  @Nullable
  public PsiElement getArg() {
    return findChildByType(ARG);
  }

  @Override
  @NotNull
  public PsiElement getParse() {
    return findNotNullChildByType(PARSE);
  }

  @Override
  @Nullable
  public PsiElement getPull() {
    return findChildByType(PULL);
  }

  @Override
  @Nullable
  public PsiElement getSource() {
    return findChildByType(SOURCE);
  }

  @Override
  @Nullable
  public PsiElement getValue() {
    return findChildByType(VALUE);
  }

  @Override
  @Nullable
  public PsiElement getVar() {
    return findChildByType(VAR);
  }

  @Override
  @Nullable
  public PsiElement getWith() {
    return findChildByType(WITH);
  }

}
