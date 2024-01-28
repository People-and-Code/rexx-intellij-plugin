// This is a generated file. Not intended for manual editing.
package com.github.neppord.rexxintellijplugin.gen.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.neppord.rexxintellijplugin.gen.RexxTokens.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.neppord.rexxintellijplugin.gen.psi.*;

public class RexxParseSourceInstructionImpl extends ASTWrapperPsiElement implements RexxParseSourceInstruction {

  public RexxParseSourceInstructionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RexxVisitor visitor) {
    visitor.visitParseSourceInstruction(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RexxVisitor) accept((RexxVisitor)visitor);
    else super.accept(visitor);
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
  public List<RexxRemainder> getRemainderList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxRemainder.class);
  }

  @Override
  @NotNull
  public List<RexxStringLiteral> getStringLiteralList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RexxStringLiteral.class);
  }

  @Override
  @NotNull
  public PsiElement getKeywordParse() {
    return findNotNullChildByType(KEYWORD_PARSE);
  }

  @Override
  @NotNull
  public PsiElement getKeywordSource() {
    return findNotNullChildByType(KEYWORD_SOURCE);
  }

}
