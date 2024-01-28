// Generated by JFlex 1.9.2 http://jflex.de/  (tweaked for IntelliJ platform)
// source: src/main/flex/Parse.flex

package com.github.neppord.rexxintellijplugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.github.neppord.rexxintellijplugin.RexxTokensKt.*;


public class _RexxLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\1\u0100\24\u0200\1\u0300\11\u0200\1\u0400\17\u0200\1\u0500"+
    "\u10cf\u0200";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\3\1\22\0\1\1\1\3\1\4"+
    "\1\5\1\0\1\6\1\7\1\10\1\11\1\12\1\13"+
    "\1\14\1\0\1\15\1\16\1\17\1\20\1\21\10\22"+
    "\1\23\1\0\1\24\1\25\1\26\2\0\1\27\1\30"+
    "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\2\40"+
    "\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50"+
    "\1\51\1\52\1\53\1\54\1\55\1\56\1\40\1\0"+
    "\1\57\1\0\1\60\1\61\1\0\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\35\1\36\1\37\2\40\1\41"+
    "\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51"+
    "\1\52\1\53\1\54\1\55\1\56\1\40\1\0\1\62"+
    "\1\0\1\63\6\0\1\1\32\0\1\1\217\0\2\64"+
    "\115\0\1\65\u0200\0\1\1\177\0\13\1\35\0\2\1"+
    "\5\0\1\1\57\0\1\1\240\0\1\1\377\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1536];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\2\1\1\3\1\4\1\1\1\5"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\2\14\1\1"+
    "\1\15\1\16\1\17\20\20\2\1\1\21\1\22\2\1"+
    "\1\0\1\23\1\24\1\25\1\0\1\26\1\27\1\30"+
    "\5\0\1\31\1\32\1\33\1\34\1\35\1\20\1\36"+
    "\5\20\1\37\21\20\1\0\2\20\1\0\1\40\1\41"+
    "\1\42\1\43\1\44\1\45\1\37\6\0\1\46\1\47"+
    "\3\0\1\50\1\51\3\20\1\0\1\52\6\20\1\53"+
    "\6\20\1\0\2\20\1\0\1\20\1\54\2\20\1\0"+
    "\1\20\2\55\1\56\2\0\1\54\2\0\1\57\1\60"+
    "\3\0\1\61\1\62\1\63\2\64\5\20\1\65\2\20"+
    "\1\0\2\20\1\0\1\20\2\66\2\20\1\0\3\20"+
    "\1\0\1\20\1\67\1\70\6\0\1\20\1\71\2\20"+
    "\1\72\2\20\1\0\1\20\2\73\1\20\1\74\2\75"+
    "\1\76\2\20\1\0\1\77\6\0\4\20\1\0\1\20"+
    "\1\0\2\20\1\100\2\101\2\0\1\100\1\0\1\102"+
    "\1\0\1\103\1\20\1\104\2\105\2\106\1\20\1\0"+
    "\1\20\1\0\1\104\1\0\1\107\2\20\1\0\1\20"+
    "\2\0\1\110\2\111\1\112\1\110\1\0\1\113";

  private static int [] zzUnpackAction() {
    int [] result = new int[258];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\66\0\154\0\242\0\330\0\66\0\u010e\0\u0144"+
    "\0\66\0\66\0\u017a\0\66\0\u01b0\0\u01e6\0\u021c\0\u0252"+
    "\0\u0288\0\u02be\0\u02f4\0\u032a\0\u0360\0\u0396\0\u03cc\0\u0402"+
    "\0\u0438\0\u046e\0\u04a4\0\u04da\0\u0510\0\u0546\0\u057c\0\u05b2"+
    "\0\u05e8\0\u061e\0\u0654\0\u068a\0\u06c0\0\u06f6\0\u072c\0\u0762"+
    "\0\66\0\u0798\0\u07ce\0\242\0\66\0\u0804\0\66\0\u0144"+
    "\0\66\0\u083a\0\u0870\0\u08a6\0\u01e6\0\u08dc\0\u0912\0\u0948"+
    "\0\66\0\66\0\u097e\0\66\0\66\0\u09b4\0\u0396\0\u09ea"+
    "\0\u0a20\0\u0a56\0\u0a8c\0\u0ac2\0\u0396\0\u0af8\0\u0b2e\0\u0b64"+
    "\0\u0b9a\0\u0bd0\0\u0c06\0\u0c3c\0\u0c72\0\u0ca8\0\u0cde\0\u0d14"+
    "\0\u0d4a\0\u0d80\0\u0db6\0\u0dec\0\u0e22\0\u0e58\0\u0e8e\0\u0ec4"+
    "\0\u0efa\0\u0f30\0\66\0\u0f66\0\66\0\66\0\66\0\66"+
    "\0\66\0\u0f9c\0\u0fd2\0\u1008\0\u103e\0\u1074\0\u10aa\0\u08dc"+
    "\0\u0912\0\u10e0\0\u1116\0\u114c\0\u1182\0\66\0\u11b8\0\u11ee"+
    "\0\u1224\0\u125a\0\u0396\0\u1290\0\u12c6\0\u12fc\0\u1332\0\u1368"+
    "\0\u139e\0\u0396\0\u13d4\0\u140a\0\u1440\0\u1476\0\u14ac\0\u14e2"+
    "\0\u1518\0\u154e\0\u1584\0\u15ba\0\u15f0\0\u0396\0\u1626\0\u165c"+
    "\0\u1692\0\u16c8\0\u0396\0\66\0\u16fe\0\u1734\0\u176a\0\66"+
    "\0\u17a0\0\u17d6\0\u17d6\0\u08a6\0\u180c\0\u1842\0\u1878\0\66"+
    "\0\u0396\0\u0396\0\u0396\0\66\0\u18ae\0\u18e4\0\u191a\0\u1950"+
    "\0\u1986\0\u0396\0\u19bc\0\u19f2\0\u1a28\0\u1a5e\0\u1a94\0\u1aca"+
    "\0\u1b00\0\u0396\0\66\0\u1b36\0\u1b6c\0\u1ba2\0\u1bd8\0\u1c0e"+
    "\0\u1c44\0\u1c7a\0\u1cb0\0\66\0\66\0\u1ce6\0\u1d1c\0\u1d52"+
    "\0\u1d88\0\u1dbe\0\u1df4\0\u1e2a\0\u0396\0\u1e60\0\u1e96\0\u0396"+
    "\0\u1ecc\0\u1f02\0\u1f38\0\u1f6e\0\u0396\0\66\0\u1fa4\0\u0396"+
    "\0\u0396\0\66\0\u0396\0\u1fda\0\u2010\0\u2046\0\u0396\0\u207c"+
    "\0\u20b2\0\u20e8\0\u211e\0\u2154\0\u218a\0\u21c0\0\u21f6\0\u222c"+
    "\0\u2262\0\u2298\0\u22ce\0\u2304\0\u233a\0\u2370\0\u0396\0\u0396"+
    "\0\66\0\u23a6\0\u23dc\0\66\0\u2412\0\66\0\u2448\0\u0396"+
    "\0\u247e\0\u0396\0\u0396\0\66\0\u0396\0\66\0\u24b4\0\u24ea"+
    "\0\u2520\0\u2556\0\66\0\u258c\0\66\0\u25c2\0\u25f8\0\u262e"+
    "\0\u2664\0\u269a\0\u26d0\0\u0396\0\u0396\0\66\0\u0396\0\66"+
    "\0\u2706\0\66";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[258];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\2\1\4\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\2\21\1\22\1\23\1\24\1\25\2\26\1\27\1\30"+
    "\1\31\1\32\1\33\1\26\1\34\1\26\1\35\1\26"+
    "\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
    "\4\26\1\46\1\47\1\2\1\50\1\51\1\52\1\53"+
    "\67\0\2\3\63\0\2\54\1\0\1\54\1\55\61\54"+
    "\3\0\1\56\71\0\1\57\56\0\2\60\1\0\5\60"+
    "\1\55\55\60\13\0\1\61\67\0\1\62\70\0\3\63"+
    "\56\0\1\64\70\0\1\65\1\0\3\21\5\0\1\66"+
    "\24\0\1\67\26\0\1\65\1\0\3\21\66\0\1\70"+
    "\70\0\1\71\63\0\1\72\1\73\64\0\1\74\1\75"+
    "\56\0\1\26\1\0\3\26\4\0\30\26\2\0\1\26"+
    "\22\0\1\26\1\0\3\26\4\0\1\76\27\26\2\0"+
    "\1\26\22\0\1\26\1\0\3\26\4\0\15\26\1\77"+
    "\2\26\1\100\7\26\2\0\1\26\22\0\1\26\1\0"+
    "\3\26\4\0\12\26\1\101\1\26\1\102\13\26\2\0"+
    "\1\26\22\0\1\26\1\0\3\26\4\0\15\26\1\103"+
    "\12\26\2\0\1\26\22\0\1\26\1\0\3\26\4\0"+
    "\23\26\1\104\4\26\2\0\1\26\22\0\1\26\1\0"+
    "\3\26\4\0\5\26\1\105\6\26\1\106\5\26\1\107"+
    "\5\26\2\0\1\26\22\0\1\26\1\0\3\26\4\0"+
    "\4\26\1\110\10\26\1\111\12\26\2\0\1\26\22\0"+
    "\1\26\1\0\3\26\4\0\15\26\1\112\5\26\1\113"+
    "\4\26\2\0\1\26\22\0\1\26\1\0\3\26\4\0"+
    "\16\26\1\114\3\26\1\115\5\26\2\0\1\26\22\0"+
    "\1\26\1\0\3\26\4\0\1\116\17\26\1\117\2\26"+
    "\1\120\4\26\2\0\1\26\22\0\1\26\1\0\3\26"+
    "\4\0\23\26\1\121\4\26\2\0\1\26\22\0\1\26"+
    "\1\0\3\26\4\0\1\122\3\26\1\123\23\26\2\0"+
    "\1\26\22\0\1\26\1\0\3\26\4\0\1\124\3\26"+
    "\1\125\3\26\1\126\17\26\2\0\1\26\2\0\1\127"+
    "\17\0\1\26\1\0\3\26\4\0\20\26\1\130\7\26"+
    "\2\0\1\26\22\0\1\26\1\0\3\26\4\0\21\26"+
    "\1\131\6\26\2\0\1\26\3\0\1\132\24\0\1\133"+
    "\1\134\1\135\30\0\1\136\66\0\1\137\67\0\1\140"+
    "\37\0\1\141\6\0\1\142\5\0\1\143\43\0\1\144"+
    "\3\0\1\145\3\0\1\127\24\0\1\127\1\0\2\56"+
    "\1\0\63\56\2\62\1\0\63\62\20\0\3\63\10\0"+
    "\1\146\32\0\13\64\1\147\52\64\20\0\2\150\64\0"+
    "\3\151\4\0\6\151\60\0\1\152\1\0\1\153\10\0"+
    "\1\154\47\0\1\155\1\0\1\156\55\0\1\26\1\0"+
    "\3\26\4\0\12\26\1\157\15\26\2\0\1\26\22\0"+
    "\1\26\1\0\3\26\4\0\15\26\1\160\12\26\2\0"+
    "\1\26\22\0\1\26\1\0\3\26\4\0\21\26\1\161"+
    "\6\26\2\0\1\26\3\0\1\162\16\0\1\26\1\0"+
    "\3\26\4\0\3\26\1\163\24\26\2\0\1\26\22\0"+
    "\1\26\1\0\3\26\4\0\20\26\1\164\7\26\2\0"+
    "\1\26\22\0\1\26\1\0\3\26\4\0\1\165\27\26"+
    "\2\0\1\26\22\0\1\26\1\0\3\26\4\0\22\26"+
    "\1\166\5\26\2\0\1\26\22\0\1\26\1\0\3\26"+
    "\4\0\4\26\1\167\23\26\2\0\1\26\22\0\1\26"+
    "\1\0\3\26\4\0\1\170\27\26\2\0\1\26\22\0"+
    "\1\26\1\0\3\26\4\0\15\26\1\171\12\26\2\0"+
    "\1\26\22\0\1\26\1\0\3\26\4\0\16\26\1\172"+
    "\11\26\2\0\1\26\22\0\1\26\1\0\3\26\4\0"+
    "\13\26\1\173\14\26\2\0\1\26\22\0\1\26\1\0"+
    "\3\26\4\0\22\26\1\174\5\26\2\0\1\26\22\0"+
    "\1\26\1\0\3\26\4\0\7\26\1\175\20\26\2\0"+
    "\1\26\22\0\1\26\1\0\3\26\4\0\20\26\1\176"+
    "\7\26\2\0\1\26\22\0\1\26\1\0\3\26\4\0"+
    "\15\26\1\177\12\26\2\0\1\26\22\0\1\26\1\0"+
    "\3\26\4\0\21\26\1\200\6\26\2\0\1\26\3\0"+
    "\1\201\16\0\1\26\1\0\3\26\4\0\4\26\1\202"+
    "\23\26\2\0\1\26\22\0\1\26\1\0\3\26\4\0"+
    "\10\26\1\203\17\26\2\0\1\26\2\0\1\204\17\0"+
    "\1\26\1\0\3\26\4\0\16\26\1\205\11\26\2\0"+
    "\1\26\22\0\1\26\1\0\3\26\4\0\27\26\1\206"+
    "\2\0\1\26\22\0\1\26\1\0\3\26\4\0\12\26"+
    "\1\207\15\26\2\0\1\26\22\0\1\26\1\0\3\26"+
    "\4\0\6\26\1\210\21\26\2\0\1\26\41\0\1\211"+
    "\46\0\1\26\1\0\3\26\4\0\1\212\27\26\2\0"+
    "\1\26\22\0\1\26\1\0\3\26\4\0\4\26\1\213"+
    "\23\26\2\0\1\26\37\0\1\214\57\0\1\215\111\0"+
    "\1\216\47\0\1\217\110\0\1\220\50\0\1\221\40\0"+
    "\2\222\2\0\3\223\56\0\1\147\3\0\1\224\117\0"+
    "\1\225\55\0\1\226\57\0\1\227\57\0\1\230\56\0"+
    "\1\26\1\0\3\26\4\0\12\26\1\231\15\26\2\0"+
    "\1\26\22\0\1\26\1\0\3\26\4\0\16\26\1\232"+
    "\11\26\2\0\1\26\22\0\1\26\1\0\3\26\4\0"+
    "\4\26\1\233\23\26\2\0\1\26\37\0\1\234\50\0"+
    "\1\26\1\0\3\26\4\0\25\26\1\235\2\26\2\0"+
    "\1\26\22\0\1\26\1\0\3\26\4\0\20\26\1\236"+
    "\7\26\2\0\1\26\22\0\1\26\1\0\3\26\4\0"+
    "\4\26\1\237\23\26\2\0\1\26\22\0\1\26\1\0"+
    "\3\26\4\0\20\26\1\240\7\26\2\0\1\26\22\0"+
    "\1\26\1\0\3\26\4\0\24\26\1\241\3\26\2\0"+
    "\1\26\22\0\1\26\1\0\3\26\4\0\16\26\1\242"+
    "\11\26\2\0\1\26\22\0\1\26\1\0\3\26\4\0"+
    "\4\26\1\243\23\26\2\0\1\26\22\0\1\26\1\0"+
    "\3\26\4\0\10\26\1\244\17\26\2\0\1\26\2\0"+
    "\1\245\17\0\1\26\1\0\3\26\4\0\4\26\1\246"+
    "\23\26\2\0\1\26\22\0\1\26\1\0\3\26\4\0"+
    "\21\26\1\247\6\26\2\0\1\26\3\0\1\250\16\0"+
    "\1\26\1\0\3\26\4\0\2\26\1\251\25\26\2\0"+
    "\1\26\22\0\1\26\1\0\3\26\4\0\7\26\1\252"+
    "\20\26\2\0\1\26\42\0\1\253\45\0\1\26\1\0"+
    "\3\26\4\0\23\26\1\254\4\26\2\0\1\26\22\0"+
    "\1\26\1\0\3\26\4\0\21\26\1\255\6\26\2\0"+
    "\1\26\3\0\1\256\50\0\1\256\14\0\1\256\16\0"+
    "\1\26\1\0\3\26\4\0\12\26\1\257\15\26\2\0"+
    "\1\26\22\0\1\26\1\0\3\26\4\0\4\26\1\260"+
    "\23\26\2\0\1\26\22\0\1\26\1\0\3\26\4\0"+
    "\14\26\1\261\13\26\2\0\1\26\47\0\1\262\40\0"+
    "\1\26\1\0\3\26\4\0\2\26\1\263\25\26\2\0"+
    "\1\26\30\0\1\264\1\0\1\265\72\0\1\266\101\0"+
    "\1\267\51\0\1\270\52\0\3\223\114\0\1\271\43\0"+
    "\1\272\107\0\1\273\32\0\1\26\1\0\3\26\4\0"+
    "\1\274\27\26\2\0\1\26\22\0\1\26\1\0\3\26"+
    "\4\0\3\26\1\275\24\26\2\0\1\26\22\0\1\26"+
    "\1\0\3\26\4\0\20\26\1\276\7\26\2\0\1\26"+
    "\22\0\1\26\1\0\3\26\4\0\1\277\27\26\2\0"+
    "\1\26\22\0\1\26\1\0\3\26\4\0\4\26\1\300"+
    "\23\26\2\0\1\26\22\0\1\26\1\0\3\26\4\0"+
    "\20\26\1\301\7\26\2\0\1\26\22\0\1\26\1\0"+
    "\3\26\4\0\15\26\1\302\12\26\2\0\1\26\50\0"+
    "\1\303\37\0\1\26\1\0\3\26\4\0\20\26\1\304"+
    "\7\26\2\0\1\26\22\0\1\26\1\0\3\26\4\0"+
    "\4\26\1\305\23\26\2\0\1\26\37\0\1\306\50\0"+
    "\1\26\1\0\3\26\4\0\4\26\1\307\23\26\2\0"+
    "\1\26\22\0\1\26\1\0\3\26\4\0\4\26\1\310"+
    "\23\26\2\0\1\26\22\0\1\26\1\0\3\26\4\0"+
    "\4\26\1\311\23\26\2\0\1\26\37\0\1\312\50\0"+
    "\1\26\1\0\3\26\4\0\27\26\1\313\2\0\1\26"+
    "\22\0\1\26\1\0\3\26\4\0\2\26\1\314\25\26"+
    "\2\0\1\26\22\0\1\26\1\0\3\26\4\0\1\315"+
    "\27\26\2\0\1\26\33\0\1\316\54\0\1\26\1\0"+
    "\3\26\4\0\4\26\1\317\23\26\2\0\1\26\53\0"+
    "\1\320\45\0\1\321\67\0\1\322\103\0\1\323\66\0"+
    "\1\324\14\0\1\324\36\0\1\325\45\0\1\26\1\0"+
    "\3\26\4\0\20\26\1\326\7\26\2\0\1\26\22\0"+
    "\1\26\1\0\3\26\4\0\16\26\1\327\11\26\2\0"+
    "\1\26\22\0\1\26\1\0\3\26\4\0\22\26\1\330"+
    "\5\26\2\0\1\26\22\0\1\26\1\0\3\26\4\0"+
    "\10\26\1\331\17\26\2\0\1\26\2\0\1\332\17\0"+
    "\1\26\1\0\3\26\4\0\14\26\1\333\13\26\2\0"+
    "\1\26\47\0\1\334\40\0\1\26\1\0\3\26\4\0"+
    "\25\26\1\335\2\26\2\0\1\26\22\0\1\26\1\0"+
    "\3\26\4\0\3\26\1\336\24\26\2\0\1\26\22\0"+
    "\1\26\1\0\3\26\4\0\22\26\1\337\5\26\2\0"+
    "\1\26\22\0\1\26\1\0\3\26\4\0\12\26\1\340"+
    "\15\26\2\0\1\26\45\0\1\341\71\0\1\342\71\0"+
    "\1\343\65\0\1\344\53\0\1\345\24\0\1\345\51\0"+
    "\1\346\14\0\1\346\44\0\1\347\37\0\1\26\1\0"+
    "\3\26\4\0\3\26\1\350\24\26\2\0\1\26\22\0"+
    "\1\26\1\0\3\26\4\0\20\26\1\351\7\26\2\0"+
    "\1\26\22\0\1\26\1\0\3\26\4\0\4\26\1\352"+
    "\23\26\2\0\1\26\22\0\1\26\1\0\3\26\4\0"+
    "\2\26\1\353\25\26\2\0\1\26\35\0\1\354\52\0"+
    "\1\26\1\0\3\26\4\0\21\26\1\355\6\26\2\0"+
    "\1\26\3\0\1\356\50\0\1\356\14\0\1\356\16\0"+
    "\1\26\1\0\3\26\4\0\10\26\1\357\17\26\2\0"+
    "\1\26\2\0\1\360\17\0\1\26\1\0\3\26\4\0"+
    "\23\26\1\361\4\26\2\0\1\26\53\0\1\362\51\0"+
    "\1\363\62\0\1\364\67\0\1\365\51\0\1\26\1\0"+
    "\3\26\4\0\4\26\1\366\23\26\2\0\1\26\22\0"+
    "\1\26\1\0\3\26\4\0\21\26\1\367\6\26\2\0"+
    "\1\26\3\0\1\370\50\0\1\370\14\0\1\370\16\0"+
    "\1\26\1\0\3\26\4\0\20\26\1\371\7\26\2\0"+
    "\1\26\37\0\1\372\104\0\1\373\31\0\1\26\1\0"+
    "\3\26\4\0\22\26\1\374\5\26\2\0\1\26\22\0"+
    "\1\26\1\0\3\26\4\0\4\26\1\375\23\26\2\0"+
    "\1\26\37\0\1\376\50\0\1\26\1\0\3\26\4\0"+
    "\4\26\1\377\23\26\2\0\1\26\55\0\1\u0100\65\0"+
    "\1\u0101\47\0\1\u0102\32\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[10044];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\3\1\1\11\2\1\2\11\1\1\1\11"+
    "\34\1\1\11\2\1\1\0\1\11\1\1\1\11\1\0"+
    "\1\11\2\1\5\0\2\11\1\1\2\11\31\1\1\0"+
    "\2\1\1\0\1\11\1\1\5\11\6\0\2\1\3\0"+
    "\1\1\1\11\3\1\1\0\16\1\1\0\2\1\1\0"+
    "\4\1\1\0\2\1\1\11\1\1\2\0\1\11\2\0"+
    "\2\1\3\0\1\11\3\1\1\11\10\1\1\0\2\1"+
    "\1\0\2\1\1\11\2\1\1\0\3\1\1\0\1\1"+
    "\2\11\6\0\7\1\1\0\2\1\1\11\3\1\1\11"+
    "\3\1\1\0\1\1\6\0\4\1\1\0\1\1\1\0"+
    "\4\1\1\11\2\0\1\11\1\0\1\11\1\0\4\1"+
    "\1\11\1\1\1\11\1\1\1\0\1\1\1\0\1\11"+
    "\1\0\1\11\2\1\1\0\1\1\2\0\2\1\1\11"+
    "\1\1\1\11\1\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[258];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  protected int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
  public _RexxLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _RexxLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return BAD_CHARACTER;
            }
          // fall through
          case 76: break;
          case 2:
            { return WHITE_SPACE;
            }
          // fall through
          case 77: break;
          case 3:
            { return OPERATOR_REMAINDER;
            }
          // fall through
          case 78: break;
          case 4:
            { return OPERATOR_BITWISE_AND;
            }
          // fall through
          case 79: break;
          case 5:
            { return TOKEN_LEFT;
            }
          // fall through
          case 80: break;
          case 6:
            { return TOKEN_RIGHT;
            }
          // fall through
          case 81: break;
          case 7:
            { return OPERATOR_MULTIPLY;
            }
          // fall through
          case 82: break;
          case 8:
            { return OPERATOR_PLUS;
            }
          // fall through
          case 83: break;
          case 9:
            { return OPERATOR_SUBTRACT;
            }
          // fall through
          case 84: break;
          case 10:
            { return DOT;
            }
          // fall through
          case 85: break;
          case 11:
            { return OPERATOR_DIVIDE;
            }
          // fall through
          case 86: break;
          case 12:
            { return NUMBER_INT;
            }
          // fall through
          case 87: break;
          case 13:
            { return OPERATOR_LESSTHAN;
            }
          // fall through
          case 88: break;
          case 14:
            { return OPERATOR_EQUAL;
            }
          // fall through
          case 89: break;
          case 15:
            { return OPERATOR_GREATERTHAN;
            }
          // fall through
          case 90: break;
          case 16:
            { return IDENTIFIER;
            }
          // fall through
          case 91: break;
          case 17:
            { return OPERATOR_OR;
            }
          // fall through
          case 92: break;
          case 18:
            { return TILDE;
            }
          // fall through
          case 93: break;
          case 19:
            { return STRING;
            }
          // fall through
          case 94: break;
          case 20:
            { return SHEBANG;
            }
          // fall through
          case 95: break;
          case 21:
            { return OPERATOR_AND;
            }
          // fall through
          case 96: break;
          case 22:
            { return OPERATOR_POWER;
            }
          // fall through
          case 97: break;
          case 23:
            { return LINE_COMMENT;
            }
          // fall through
          case 98: break;
          case 24:
            { return NUMBER_DECIMAL;
            }
          // fall through
          case 99: break;
          case 25:
            { return OPERATOR_LESSTHAN_GREATERTHAN;
            }
          // fall through
          case 100: break;
          case 26:
            { return OPERATOR_LESSTHAN_EQUAL;
            }
          // fall through
          case 101: break;
          case 27:
            { return OPERATOR_STRICT_EQUAL;
            }
          // fall through
          case 102: break;
          case 28:
            { return OPERATOR_GREATERTHAN_LESSTHAN;
            }
          // fall through
          case 103: break;
          case 29:
            { return OPERATOR_GREATERTHAN_EQUAL;
            }
          // fall through
          case 104: break;
          case 30:
            { return KEYWORD_DO;
            }
          // fall through
          case 105: break;
          case 31:
            { return KEYWORD_IF;
            }
          // fall through
          case 106: break;
          case 32:
            { return OPERATOR_BACKSLASH_LESSTHAN;
            }
          // fall through
          case 107: break;
          case 33:
            { return OPERATOR_BACKSLASH_EQUAL;
            }
          // fall through
          case 108: break;
          case 34:
            { return OPERATOR_BACKSLASH_GREATERTHAN;
            }
          // fall through
          case 109: break;
          case 35:
            { return OPERATOR_BACKSLASH;
            }
          // fall through
          case 110: break;
          case 36:
            { return OPERATOR_XOR;
            }
          // fall through
          case 111: break;
          case 37:
            { return OPERATOR_CONCATENATE;
            }
          // fall through
          case 112: break;
          case 38:
            { return NUMBER_BINARY;
            }
          // fall through
          case 113: break;
          case 39:
            { return NUMBER_HEXADECIMAL;
            }
          // fall through
          case 114: break;
          case 40:
            { return OPERATOR_STRICT_LESSTHAN;
            }
          // fall through
          case 115: break;
          case 41:
            { return OPERATOR_STRICT_GREATERTHAN_EQUAL;
            }
          // fall through
          case 116: break;
          case 42:
            { return KEYWORD_END;
            }
          // fall through
          case 117: break;
          case 43:
            { return KEYWORD_NOP;
            }
          // fall through
          case 118: break;
          case 44:
            { return KEYWORD_SAY;
            }
          // fall through
          case 119: break;
          case 45:
            { return KEYWORD_USE;
            }
          // fall through
          case 120: break;
          case 46:
            { return OPERATOR_STRICT_BACKSLASH_EQUAL;
            }
          // fall through
          case 121: break;
          case 47:
            { return NUMBER_SCIENTIFIC;
            }
          // fall through
          case 122: break;
          case 48:
            { return MULTILINE_COMMENT;
            }
          // fall through
          case 123: break;
          case 49:
            { return OPERATOR_STRICT_LESSTHAN_EQUAL;
            }
          // fall through
          case 124: break;
          case 50:
            { return KEYWORD_CALL;
            }
          // fall through
          case 125: break;
          case 51:
            { return KEYWORD_DROP;
            }
          // fall through
          case 126: break;
          case 52:
            { return KEYWORD_ELSE;
            }
          // fall through
          case 127: break;
          case 53:
            { return KEYWORD_LOOP;
            }
          // fall through
          case 128: break;
          case 54:
            { return KEYWORD_PUSH;
            }
          // fall through
          case 129: break;
          case 55:
            { return OPERATOR_STRICT_BACKSLASH_LESSTHAN;
            }
          // fall through
          case 130: break;
          case 56:
            { return OPERATOR_STRICT_BACKSLASH_GREATERTHAN;
            }
          // fall through
          case 131: break;
          case 57:
            { return KEYWORD_GUARD;
            }
          // fall through
          case 132: break;
          case 58:
            { return KEYWORD_LEAVE;
            }
          // fall through
          case 133: break;
          case 59:
            { return KEYWORD_PARSE;
            }
          // fall through
          case 134: break;
          case 60:
            { return KEYWORD_QUEUE;
            }
          // fall through
          case 135: break;
          case 61:
            { return KEYWORD_RAISE;
            }
          // fall through
          case 136: break;
          case 62:
            { return KEYWORD_REPLY;
            }
          // fall through
          case 137: break;
          case 63:
            { return KEYWORD_TRACE;
            }
          // fall through
          case 138: break;
          case 64:
            { return KEYWORD_SELECT;
            }
          // fall through
          case 139: break;
          case 65:
            { return KEYWORD_SIGNAL;
            }
          // fall through
          case 140: break;
          case 66:
            { return KEYWORD_CLASS;
            }
          // fall through
          case 141: break;
          case 67:
            { return KEYWORD_FORWARD;
            }
          // fall through
          case 142: break;
          case 68:
            { return KEYWORD_ITERATE;
            }
          // fall through
          case 143: break;
          case 69:
            { return KEYWORD_NUMERIC;
            }
          // fall through
          case 144: break;
          case 70:
            { return KEYWORD_OPTIONS;
            }
          // fall through
          case 145: break;
          case 71:
            { return KEYWORD_METHOD;
            }
          // fall through
          case 146: break;
          case 72:
            { return KEYWORD_INTERPRET;
            }
          // fall through
          case 147: break;
          case 73:
            { return KEYWORD_OTHERWISE;
            }
          // fall through
          case 148: break;
          case 74:
            { return KEYWORD_PROCEDURE;
            }
          // fall through
          case 149: break;
          case 75:
            { return KEYWORD_ATTRIBUTE;
            }
          // fall through
          case 150: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
