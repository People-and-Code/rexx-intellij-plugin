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

public class RexxParseVarInstructionImpl extends ASTWrapperPsiElement implements RexxParseVarInstruction {

  public RexxParseVarInstructionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RexxVisitor visitor) {
    visitor.visitParseVarInstruction(this);
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
  public PsiElement getKeywordVar() {
    return findNotNullChildByType(KEYWORD_VAR);
  }

}
