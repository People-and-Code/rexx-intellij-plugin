// This is a generated file. Not intended for manual editing.
package com.github.neppord.rexxintellijplugin;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.neppord.rexxintellijplugin.psi.*;

public interface RexxTokensKt {

  IElementType INSTRUCTION = new RexxElementType("INSTRUCTION");

  IElementType IDENTIFIER = new RexxTokenType("IDENTIFIER");
  IElementType KEYWORD_SAY = new RexxTokenType("KEYWORD_SAY");
  IElementType LINE_COMMENT = new RexxTokenType("LINE_COMMENT");
  IElementType MULTILINE_COMMENT = new RexxTokenType("MULTILINE_COMMENT");
  IElementType NUMBER_BINARY = new RexxTokenType("NUMBER_BINARY");
  IElementType NUMBER_DECIMAL = new RexxTokenType("NUMBER_DECIMAL");
  IElementType NUMBER_HEXADECIMAL = new RexxTokenType("NUMBER_HEXADECIMAL");
  IElementType NUMBER_INT = new RexxTokenType("NUMBER_INT");
  IElementType NUMBER_SCIENTIFIC = new RexxTokenType("NUMBER_SCIENTIFIC");
  IElementType SHEBANG = new RexxTokenType("SHEBANG");
  IElementType STRING = new RexxTokenType("STRING");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == INSTRUCTION) {
        return new RexxInstructionImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
