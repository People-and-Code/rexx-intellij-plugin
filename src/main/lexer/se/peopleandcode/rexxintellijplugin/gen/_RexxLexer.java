// Generated by JFlex 1.9.2 http://jflex.de/  (tweaked for IntelliJ platform)
// source: src/main/flex/Parse.flex

package se.peopleandcode.rexxintellijplugin.gen;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static se.peopleandcode.rexxintellijplugin.gen.RexxTokens.*;


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
    "\1\0\u10ff\u0100";

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
    "\11\0\1\1\1\2\25\0\1\1\1\3\1\4\1\5"+
    "\1\0\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\10\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\0\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\2\43"+
    "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53"+
    "\1\54\1\55\1\56\1\57\1\60\1\61\1\43\1\0"+
    "\1\62\1\0\1\63\1\43\1\0\1\32\1\64\1\34"+
    "\1\35\1\36\1\37\1\40\1\41\1\42\2\43\1\44"+
    "\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
    "\1\55\1\56\1\57\1\60\1\61\1\43\1\0\1\65"+
    "\1\0\1\66\u0181\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[512];
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
    "\1\0\1\1\1\2\1\3\1\4\2\1\1\5\1\6"+
    "\1\1\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\2\17\1\20\1\21\1\22\1\23\22\4\2\1"+
    "\1\24\1\25\2\0\1\26\1\27\1\30\1\0\1\31"+
    "\1\32\3\0\1\33\6\0\1\34\1\35\1\36\1\37"+
    "\1\40\1\41\1\42\3\4\1\43\6\4\1\44\31\4"+
    "\1\45\1\46\1\47\1\50\1\51\4\0\1\52\1\53"+
    "\1\54\3\0\1\55\1\56\1\4\1\57\4\4\1\60"+
    "\11\4\1\61\13\4\1\62\6\4\1\63\1\4\1\64"+
    "\3\4\1\65\1\66\1\67\1\33\2\0\1\70\1\71"+
    "\3\0\1\4\1\72\1\4\1\73\1\74\1\75\6\4"+
    "\1\76\6\4\1\77\1\100\7\4\1\101\3\4\1\102"+
    "\1\4\1\103\4\0\4\4\1\104\2\4\1\105\1\106"+
    "\3\4\1\107\1\4\1\110\1\111\1\112\4\4\1\113"+
    "\1\114\1\115\1\116\4\0\2\4\1\117\7\4\1\120"+
    "\1\121\1\122\1\123\1\0\1\124\1\0\1\125\1\4"+
    "\1\126\1\4\1\127\1\130\1\131\2\4\1\0\1\132"+
    "\1\133\3\4\1\0\1\134\1\135\1\136\1\0\1\137";

  private static int [] zzUnpackAction() {
    int [] result = new int[282];
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
    "\0\0\0\67\0\156\0\245\0\334\0\u0113\0\u014a\0\67"+
    "\0\u0181\0\u01b8\0\67\0\67\0\u01ef\0\u0226\0\u025d\0\u0294"+
    "\0\u02cb\0\u0302\0\u0339\0\u0370\0\u03a7\0\u03de\0\u0415\0\u044c"+
    "\0\u0483\0\u04ba\0\u04f1\0\u0528\0\u055f\0\u0596\0\u05cd\0\u0604"+
    "\0\u063b\0\u0672\0\u06a9\0\u06e0\0\u0717\0\u074e\0\u0785\0\u07bc"+
    "\0\u07f3\0\u082a\0\u0861\0\u0898\0\u08cf\0\67\0\u0906\0\u0113"+
    "\0\67\0\u093d\0\67\0\u01b8\0\67\0\67\0\u0974\0\u09ab"+
    "\0\u09e2\0\u0a19\0\u0a50\0\u0a87\0\u0abe\0\u0af5\0\u0b2c\0\u0b63"+
    "\0\u0b9a\0\67\0\67\0\67\0\67\0\67\0\u0bd1\0\u0c08"+
    "\0\u0c3f\0\u0c76\0\334\0\u0cad\0\u0ce4\0\u0d1b\0\u0d52\0\u0d89"+
    "\0\u0dc0\0\334\0\u0df7\0\u0e2e\0\u0e65\0\u0e9c\0\u0ed3\0\u0f0a"+
    "\0\u0f41\0\u0f78\0\u0faf\0\u0fe6\0\u101d\0\u1054\0\u108b\0\u10c2"+
    "\0\u10f9\0\u1130\0\u1167\0\u119e\0\u11d5\0\u120c\0\u1243\0\u127a"+
    "\0\u12b1\0\u12e8\0\u131f\0\u1356\0\u138d\0\u13c4\0\67\0\67"+
    "\0\u13fb\0\u1432\0\u1469\0\u14a0\0\u14d7\0\u0af5\0\u0b2c\0\u150e"+
    "\0\u1545\0\u157c\0\67\0\67\0\u15b3\0\334\0\u15ea\0\u1621"+
    "\0\u1658\0\u168f\0\334\0\u16c6\0\u16fd\0\u1734\0\u176b\0\u17a2"+
    "\0\u17d9\0\u1810\0\u1847\0\u187e\0\334\0\u18b5\0\u18ec\0\u1923"+
    "\0\u195a\0\u1991\0\u19c8\0\u19ff\0\u1a36\0\u1a6d\0\u1aa4\0\u1adb"+
    "\0\334\0\u1b12\0\u1b49\0\u1b80\0\u1bb7\0\u1bee\0\u1c25\0\334"+
    "\0\u1c5c\0\334\0\u1c93\0\u1cca\0\u1d01\0\67\0\67\0\67"+
    "\0\67\0\u1d38\0\u1d6f\0\u1d6f\0\67\0\u1da6\0\u1ddd\0\u1e14"+
    "\0\u1e4b\0\334\0\u1e82\0\334\0\334\0\334\0\u1eb9\0\u1ef0"+
    "\0\u1f27\0\u1f5e\0\u1f95\0\u1fcc\0\334\0\u2003\0\u203a\0\u2071"+
    "\0\u20a8\0\u20df\0\u2116\0\334\0\334\0\u214d\0\u2184\0\u21bb"+
    "\0\u21f2\0\u2229\0\u2260\0\u2297\0\334\0\u22ce\0\u2305\0\u233c"+
    "\0\334\0\u2373\0\334\0\u23aa\0\u23e1\0\u2418\0\u244f\0\u2486"+
    "\0\u24bd\0\u24f4\0\u252b\0\334\0\u2562\0\u2599\0\334\0\334"+
    "\0\u25d0\0\u2607\0\u263e\0\334\0\u2675\0\334\0\334\0\334"+
    "\0\u26ac\0\u26e3\0\u271a\0\u2751\0\334\0\334\0\334\0\334"+
    "\0\u2788\0\u27bf\0\u27f6\0\u282d\0\u2864\0\u289b\0\334\0\u28d2"+
    "\0\u2909\0\u2940\0\u2977\0\u29ae\0\u29e5\0\u2a1c\0\334\0\334"+
    "\0\334\0\334\0\u2a53\0\67\0\u2a8a\0\334\0\u2ac1\0\334"+
    "\0\u2af8\0\334\0\334\0\334\0\u2b2f\0\u2b66\0\u2b9d\0\67"+
    "\0\334\0\u2bd4\0\u2c0b\0\u2c42\0\u2c79\0\334\0\334\0\334"+
    "\0\u2cb0\0\67";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[282];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\2\24\1\25\1\4\1\26\1\27\1\30"+
    "\1\5\1\31\1\5\1\32\1\33\1\34\1\35\1\36"+
    "\1\5\1\37\1\5\1\40\1\5\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\2\5"+
    "\1\53\1\54\1\5\1\55\1\56\70\0\1\3\13\0"+
    "\1\57\53\0\1\4\22\0\1\4\62\0\3\5\6\0"+
    "\30\5\2\0\1\5\2\0\2\60\1\0\1\60\1\61"+
    "\62\60\3\0\1\62\72\0\1\63\57\0\2\64\1\0"+
    "\5\64\1\61\56\64\13\0\1\65\102\0\1\66\40\0"+
    "\1\67\1\3\13\0\1\70\1\0\1\71\64\0\1\72"+
    "\71\0\3\73\56\0\1\74\72\0\1\75\1\0\3\24"+
    "\34\0\1\76\3\0\1\77\21\0\1\75\1\0\3\24"+
    "\67\0\1\100\70\0\1\101\1\102\1\103\65\0\1\104"+
    "\65\0\1\105\1\106\1\107\57\0\3\5\6\0\3\5"+
    "\1\110\14\5\1\111\7\5\2\0\1\5\23\0\3\5"+
    "\6\0\1\112\27\5\2\0\1\5\23\0\3\5\6\0"+
    "\15\5\1\113\2\5\1\114\7\5\2\0\1\5\23\0"+
    "\3\5\6\0\12\5\1\115\1\5\1\116\11\5\1\117"+
    "\1\5\2\0\1\5\23\0\3\5\6\0\15\5\1\120"+
    "\12\5\2\0\1\5\23\0\3\5\6\0\23\5\1\121"+
    "\4\5\2\0\1\5\23\0\3\5\6\0\5\5\1\122"+
    "\6\5\1\123\5\5\1\124\5\5\2\0\1\5\23\0"+
    "\3\5\6\0\4\5\1\125\10\5\1\126\12\5\2\0"+
    "\1\5\23\0\3\5\6\0\15\5\1\127\5\5\1\130"+
    "\4\5\2\0\1\5\23\0\3\5\6\0\16\5\1\131"+
    "\3\5\1\132\5\5\2\0\1\5\23\0\3\5\6\0"+
    "\1\133\17\5\1\134\2\5\1\135\4\5\2\0\1\5"+
    "\23\0\3\5\6\0\23\5\1\136\4\5\2\0\1\5"+
    "\23\0\3\5\6\0\1\137\3\5\1\140\23\5\2\0"+
    "\1\5\23\0\3\5\6\0\1\141\3\5\1\142\3\5"+
    "\1\143\4\5\1\144\12\5\2\0\1\5\23\0\3\5"+
    "\6\0\7\5\1\145\10\5\1\146\7\5\2\0\1\5"+
    "\23\0\3\5\6\0\16\5\1\147\2\5\1\150\6\5"+
    "\2\0\1\5\23\0\3\5\6\0\1\151\27\5\2\0"+
    "\1\5\23\0\3\5\6\0\7\5\1\152\1\153\17\5"+
    "\2\0\1\5\30\0\1\154\1\155\1\156\121\0\1\157"+
    "\70\0\1\160\3\0\1\3\64\0\2\62\1\0\64\62"+
    "\1\0\1\67\14\0\1\70\1\0\1\71\64\0\1\161"+
    "\63\0\1\162\53\0\2\72\1\0\64\72\21\0\3\73"+
    "\12\0\1\163\30\0\13\74\1\164\53\74\21\0\3\165"+
    "\64\0\3\166\6\0\6\166\24\0\1\166\23\0\2\167"+
    "\76\0\1\170\1\0\1\171\10\0\1\172\50\0\1\173"+
    "\66\0\1\174\60\0\3\5\6\0\3\5\1\175\24\5"+
    "\2\0\1\5\23\0\3\5\6\0\6\5\1\176\21\5"+
    "\2\0\1\5\23\0\3\5\6\0\12\5\1\177\6\5"+
    "\1\200\6\5\2\0\1\5\23\0\3\5\6\0\15\5"+
    "\1\201\12\5\2\0\1\5\23\0\3\5\6\0\21\5"+
    "\1\202\6\5\2\0\1\5\23\0\3\5\6\0\3\5"+
    "\1\203\24\5\2\0\1\5\23\0\3\5\6\0\10\5"+
    "\1\204\5\5\1\205\11\5\2\0\1\5\23\0\3\5"+
    "\6\0\20\5\1\206\7\5\2\0\1\5\23\0\3\5"+
    "\6\0\1\207\27\5\2\0\1\5\23\0\3\5\6\0"+
    "\22\5\1\210\5\5\2\0\1\5\23\0\3\5\6\0"+
    "\4\5\1\211\23\5\2\0\1\5\23\0\3\5\6\0"+
    "\1\212\27\5\2\0\1\5\23\0\3\5\6\0\15\5"+
    "\1\213\7\5\1\214\2\5\2\0\1\5\23\0\3\5"+
    "\6\0\16\5\1\215\11\5\2\0\1\5\23\0\3\5"+
    "\6\0\13\5\1\216\14\5\2\0\1\5\23\0\3\5"+
    "\6\0\22\5\1\217\5\5\2\0\1\5\23\0\3\5"+
    "\6\0\7\5\1\220\20\5\2\0\1\5\23\0\3\5"+
    "\6\0\20\5\1\221\7\5\2\0\1\5\23\0\3\5"+
    "\6\0\15\5\1\222\12\5\2\0\1\5\23\0\3\5"+
    "\6\0\12\5\1\223\6\5\1\224\6\5\2\0\1\5"+
    "\23\0\3\5\6\0\4\5\1\225\23\5\2\0\1\5"+
    "\23\0\3\5\6\0\10\5\1\226\17\5\2\0\1\5"+
    "\23\0\3\5\6\0\16\5\1\227\3\5\1\230\5\5"+
    "\2\0\1\5\23\0\3\5\6\0\27\5\1\231\2\0"+
    "\1\5\23\0\3\5\6\0\12\5\1\232\15\5\2\0"+
    "\1\5\23\0\3\5\6\0\6\5\1\233\21\5\2\0"+
    "\1\5\23\0\3\5\6\0\23\5\1\234\4\5\2\0"+
    "\1\5\23\0\3\5\6\0\4\5\1\235\23\5\2\0"+
    "\1\5\23\0\3\5\6\0\1\236\27\5\2\0\1\5"+
    "\23\0\3\5\6\0\16\5\1\237\11\5\2\0\1\5"+
    "\23\0\3\5\6\0\4\5\1\240\23\5\2\0\1\5"+
    "\23\0\3\5\6\0\12\5\1\241\5\5\1\242\7\5"+
    "\2\0\1\5\23\0\3\5\6\0\4\5\1\243\3\5"+
    "\1\244\17\5\2\0\1\5\23\0\3\5\6\0\22\5"+
    "\1\245\5\5\2\0\1\5\30\0\1\246\67\0\1\247"+
    "\67\0\1\250\36\0\2\161\1\251\64\161\13\162\1\252"+
    "\53\162\14\0\1\253\1\0\1\253\2\0\3\254\43\0"+
    "\13\74\1\164\4\74\1\255\46\74\21\0\3\165\12\0"+
    "\1\163\104\0\1\256\56\0\1\257\60\0\1\260\51\0"+
    "\3\5\6\0\20\5\1\261\7\5\2\0\1\5\23\0"+
    "\3\5\6\0\12\5\1\262\15\5\2\0\1\5\23\0"+
    "\3\5\6\0\4\5\1\263\23\5\2\0\1\5\23\0"+
    "\3\5\6\0\16\5\1\264\11\5\2\0\1\5\23\0"+
    "\3\5\6\0\4\5\1\265\23\5\2\0\1\5\23\0"+
    "\3\5\6\0\22\5\1\266\5\5\2\0\1\5\23\0"+
    "\3\5\6\0\15\5\1\267\12\5\2\0\1\5\23\0"+
    "\3\5\6\0\25\5\1\270\2\5\2\0\1\5\23\0"+
    "\3\5\6\0\20\5\1\271\7\5\2\0\1\5\23\0"+
    "\3\5\6\0\4\5\1\272\23\5\2\0\1\5\23\0"+
    "\3\5\6\0\20\5\1\273\7\5\2\0\1\5\23\0"+
    "\3\5\6\0\24\5\1\274\3\5\2\0\1\5\23\0"+
    "\3\5\6\0\16\5\1\275\11\5\2\0\1\5\23\0"+
    "\3\5\6\0\4\5\1\276\23\5\2\0\1\5\23\0"+
    "\3\5\6\0\4\5\1\277\23\5\2\0\1\5\23\0"+
    "\3\5\6\0\10\5\1\300\17\5\2\0\1\5\23\0"+
    "\3\5\6\0\4\5\1\301\23\5\2\0\1\5\23\0"+
    "\3\5\6\0\21\5\1\302\6\5\2\0\1\5\23\0"+
    "\3\5\6\0\2\5\1\303\25\5\2\0\1\5\23\0"+
    "\3\5\6\0\12\5\1\304\15\5\2\0\1\5\23\0"+
    "\3\5\6\0\7\5\1\305\20\5\2\0\1\5\23\0"+
    "\3\5\6\0\23\5\1\306\4\5\2\0\1\5\23\0"+
    "\3\5\6\0\21\5\1\307\6\5\2\0\1\5\23\0"+
    "\3\5\6\0\12\5\1\310\15\5\2\0\1\5\23\0"+
    "\3\5\6\0\23\5\1\311\4\5\2\0\1\5\23\0"+
    "\3\5\6\0\4\5\1\312\23\5\2\0\1\5\23\0"+
    "\3\5\6\0\14\5\1\313\13\5\2\0\1\5\23\0"+
    "\3\5\6\0\20\5\1\314\7\5\2\0\1\5\23\0"+
    "\3\5\6\0\14\5\1\315\13\5\2\0\1\5\23\0"+
    "\3\5\6\0\2\5\1\316\25\5\2\0\1\5\23\0"+
    "\3\5\6\0\4\5\1\317\23\5\2\0\1\5\23\0"+
    "\3\5\6\0\23\5\1\320\4\5\2\0\1\5\23\0"+
    "\3\5\6\0\14\5\1\321\13\5\2\0\1\5\23\0"+
    "\3\5\6\0\12\5\1\322\15\5\2\0\1\5\23\0"+
    "\3\5\6\0\7\5\1\323\20\5\2\0\1\5\2\0"+
    "\13\162\1\252\4\162\1\324\46\162\21\0\3\254\117\0"+
    "\1\325\44\0\1\326\110\0\1\327\33\0\3\5\6\0"+
    "\4\5\1\330\23\5\2\0\1\5\23\0\3\5\6\0"+
    "\12\5\1\331\15\5\2\0\1\5\23\0\3\5\6\0"+
    "\21\5\1\332\6\5\2\0\1\5\23\0\3\5\6\0"+
    "\1\333\27\5\2\0\1\5\23\0\3\5\6\0\3\5"+
    "\1\334\24\5\2\0\1\5\23\0\3\5\6\0\20\5"+
    "\1\335\7\5\2\0\1\5\23\0\3\5\6\0\1\336"+
    "\27\5\2\0\1\5\23\0\3\5\6\0\4\5\1\337"+
    "\23\5\2\0\1\5\23\0\3\5\6\0\20\5\1\340"+
    "\7\5\2\0\1\5\23\0\3\5\6\0\20\5\1\341"+
    "\7\5\2\0\1\5\23\0\3\5\6\0\15\5\1\342"+
    "\12\5\2\0\1\5\23\0\3\5\6\0\20\5\1\343"+
    "\7\5\2\0\1\5\23\0\3\5\6\0\4\5\1\344"+
    "\23\5\2\0\1\5\23\0\3\5\6\0\4\5\1\345"+
    "\23\5\2\0\1\5\23\0\3\5\6\0\4\5\1\346"+
    "\23\5\2\0\1\5\23\0\3\5\6\0\4\5\1\347"+
    "\23\5\2\0\1\5\23\0\3\5\6\0\27\5\1\350"+
    "\2\0\1\5\23\0\3\5\6\0\20\5\1\351\7\5"+
    "\2\0\1\5\23\0\3\5\6\0\2\5\1\352\25\5"+
    "\2\0\1\5\23\0\3\5\6\0\1\353\27\5\2\0"+
    "\1\5\23\0\3\5\6\0\2\5\1\354\25\5\2\0"+
    "\1\5\23\0\3\5\6\0\4\5\1\355\23\5\2\0"+
    "\1\5\23\0\3\5\6\0\20\5\1\356\7\5\2\0"+
    "\1\5\23\0\3\5\6\0\4\5\1\357\23\5\2\0"+
    "\1\5\23\0\3\5\6\0\4\5\1\360\23\5\2\0"+
    "\1\5\3\0\1\361\1\255\15\0\1\71\120\0\1\362"+
    "\67\0\1\363\54\0\1\364\46\0\3\5\6\0\21\5"+
    "\1\365\6\5\2\0\1\5\23\0\3\5\6\0\4\5"+
    "\1\366\23\5\2\0\1\5\23\0\3\5\6\0\4\5"+
    "\1\367\23\5\2\0\1\5\23\0\3\5\6\0\20\5"+
    "\1\370\7\5\2\0\1\5\23\0\3\5\6\0\16\5"+
    "\1\371\11\5\2\0\1\5\23\0\3\5\6\0\22\5"+
    "\1\372\5\5\2\0\1\5\23\0\3\5\6\0\10\5"+
    "\1\373\17\5\2\0\1\5\23\0\3\5\6\0\14\5"+
    "\1\374\13\5\2\0\1\5\23\0\3\5\6\0\25\5"+
    "\1\375\2\5\2\0\1\5\23\0\3\5\6\0\3\5"+
    "\1\376\24\5\2\0\1\5\23\0\3\5\6\0\14\5"+
    "\1\377\13\5\2\0\1\5\23\0\3\5\6\0\22\5"+
    "\1\u0100\5\5\2\0\1\5\23\0\3\5\6\0\12\5"+
    "\1\u0101\15\5\2\0\1\5\23\0\3\5\6\0\4\5"+
    "\1\u0102\23\5\2\0\1\5\3\0\1\361\16\0\1\71"+
    "\110\0\1\u0103\77\0\1\u0104\62\0\1\u0105\40\0\3\5"+
    "\6\0\21\5\1\u0106\6\5\2\0\1\5\23\0\3\5"+
    "\6\0\21\5\1\u0107\6\5\2\0\1\5\23\0\3\5"+
    "\6\0\3\5\1\u0108\24\5\2\0\1\5\23\0\3\5"+
    "\6\0\20\5\1\u0109\7\5\2\0\1\5\23\0\3\5"+
    "\6\0\4\5\1\u010a\23\5\2\0\1\5\23\0\3\5"+
    "\6\0\2\5\1\u010b\25\5\2\0\1\5\23\0\3\5"+
    "\6\0\21\5\1\u010c\6\5\2\0\1\5\23\0\3\5"+
    "\6\0\10\5\1\u010d\17\5\2\0\1\5\23\0\3\5"+
    "\6\0\23\5\1\u010e\4\5\2\0\1\5\35\0\1\u010f"+
    "\30\0\1\u010f\37\0\1\u0110\52\0\3\5\6\0\21\5"+
    "\1\u0111\6\5\2\0\1\5\23\0\3\5\6\0\4\5"+
    "\1\u0112\23\5\2\0\1\5\23\0\3\5\6\0\21\5"+
    "\1\u0113\6\5\2\0\1\5\23\0\3\5\6\0\20\5"+
    "\1\u0114\7\5\2\0\1\5\57\0\1\u0115\32\0\3\5"+
    "\6\0\22\5\1\u0116\5\5\2\0\1\5\23\0\3\5"+
    "\6\0\4\5\1\u0117\23\5\2\0\1\5\23\0\3\5"+
    "\6\0\4\5\1\u0118\23\5\2\0\1\5\56\0\1\u0119"+
    "\50\0\1\u011a\30\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[11495];
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
    "\1\0\1\11\5\1\1\11\2\1\2\11\41\1\1\11"+
    "\2\0\1\11\1\1\1\11\1\0\2\11\3\0\1\1"+
    "\6\0\1\1\5\11\50\1\2\11\4\0\3\1\3\0"+
    "\2\11\51\1\4\11\2\0\1\1\1\11\3\0\43\1"+
    "\4\0\31\1\4\0\16\1\1\0\1\11\1\0\11\1"+
    "\1\0\1\11\4\1\1\0\3\1\1\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[282];
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
          case 96: break;
          case 2:
            { return WHITE_SPACE;
            }
          // fall through
          case 97: break;
          case 3:
            { return TERMINATOR;
            }
          // fall through
          case 98: break;
          case 4:
            { return IDENTIFIER;
            }
          // fall through
          case 99: break;
          case 5:
            { return OPERATOR_REMAINDER;
            }
          // fall through
          case 100: break;
          case 6:
            { return OPERATOR_BITWISE_AND;
            }
          // fall through
          case 101: break;
          case 7:
            { return TOKEN_LEFT;
            }
          // fall through
          case 102: break;
          case 8:
            { return TOKEN_RIGHT;
            }
          // fall through
          case 103: break;
          case 9:
            { return OPERATOR_MULTIPLY;
            }
          // fall through
          case 104: break;
          case 10:
            { return OPERATOR_PLUS;
            }
          // fall through
          case 105: break;
          case 11:
            { return COMMA;
            }
          // fall through
          case 106: break;
          case 12:
            { return OPERATOR_SUBTRACT;
            }
          // fall through
          case 107: break;
          case 13:
            { return DOT;
            }
          // fall through
          case 108: break;
          case 14:
            { return OPERATOR_DIVIDE;
            }
          // fall through
          case 109: break;
          case 15:
            { return NUMBER_INT;
            }
          // fall through
          case 110: break;
          case 16:
            { return COLON;
            }
          // fall through
          case 111: break;
          case 17:
            { return LT;
            }
          // fall through
          case 112: break;
          case 18:
            { return EQ;
            }
          // fall through
          case 113: break;
          case 19:
            { return GT;
            }
          // fall through
          case 114: break;
          case 20:
            { return OPERATOR_OR;
            }
          // fall through
          case 115: break;
          case 21:
            { return TILDE;
            }
          // fall through
          case 116: break;
          case 22:
            { return STRING;
            }
          // fall through
          case 117: break;
          case 23:
            { return SHEBANG;
            }
          // fall through
          case 118: break;
          case 24:
            { return OPERATOR_AND;
            }
          // fall through
          case 119: break;
          case 25:
            { return OPERATOR_POWER;
            }
          // fall through
          case 120: break;
          case 26:
            { return PLUS_EQ;
            }
          // fall through
          case 121: break;
          case 27:
            { return LINE_COMMENT;
            }
          // fall through
          case 122: break;
          case 28:
            { return STRICT_LT;
            }
          // fall through
          case 123: break;
          case 29:
            { return LTE;
            }
          // fall through
          case 124: break;
          case 30:
            { return NEQ2;
            }
          // fall through
          case 125: break;
          case 31:
            { return STRICT_EQ;
            }
          // fall through
          case 126: break;
          case 32:
            { return NEQ3;
            }
          // fall through
          case 127: break;
          case 33:
            { return GTE;
            }
          // fall through
          case 128: break;
          case 34:
            { return STRICT_GT;
            }
          // fall through
          case 129: break;
          case 35:
            { return DO;
            }
          // fall through
          case 130: break;
          case 36:
            { return IF;
            }
          // fall through
          case 131: break;
          case 37:
            { return ALT_LT;
            }
          // fall through
          case 132: break;
          case 38:
            { return NEQ1;
            }
          // fall through
          case 133: break;
          case 39:
            { return ALT_GT;
            }
          // fall through
          case 134: break;
          case 40:
            { return OPERATOR_XOR;
            }
          // fall through
          case 135: break;
          case 41:
            { return OPERATOR_CONCATENATE;
            }
          // fall through
          case 136: break;
          case 42:
            { return NUMBER_DECIMAL;
            }
          // fall through
          case 137: break;
          case 43:
            { return NUMBER_HEXADECIMAL;
            }
          // fall through
          case 138: break;
          case 44:
            { return NUMBER_BINARY;
            }
          // fall through
          case 139: break;
          case 45:
            { return STRICT_LTE;
            }
          // fall through
          case 140: break;
          case 46:
            { return STRICT_GTE;
            }
          // fall through
          case 141: break;
          case 47:
            { return ARG;
            }
          // fall through
          case 142: break;
          case 48:
            { return END;
            }
          // fall through
          case 143: break;
          case 49:
            { return NOP;
            }
          // fall through
          case 144: break;
          case 50:
            { return SAY;
            }
          // fall through
          case 145: break;
          case 51:
            { return USE;
            }
          // fall through
          case 146: break;
          case 52:
            { return VAR;
            }
          // fall through
          case 147: break;
          case 53:
            { return STRICT_ESC_LT;
            }
          // fall through
          case 148: break;
          case 54:
            { return STRICT_NEQ;
            }
          // fall through
          case 149: break;
          case 55:
            { return STRICT_ESC_GT;
            }
          // fall through
          case 150: break;
          case 56:
            { return NUMBER_SCIENTIFIC;
            }
          // fall through
          case 151: break;
          case 57:
            { return MULTILINE_COMMENT;
            }
          // fall through
          case 152: break;
          case 58:
            { return CALL;
            }
          // fall through
          case 153: break;
          case 59:
            { return DROP;
            }
          // fall through
          case 154: break;
          case 60:
            { return ELSE;
            }
          // fall through
          case 155: break;
          case 61:
            { return EXIT;
            }
          // fall through
          case 156: break;
          case 62:
            { return LOOP;
            }
          // fall through
          case 157: break;
          case 63:
            { return PULL;
            }
          // fall through
          case 158: break;
          case 64:
            { return PUSH;
            }
          // fall through
          case 159: break;
          case 65:
            { return THEN;
            }
          // fall through
          case 160: break;
          case 66:
            { return WHEN;
            }
          // fall through
          case 161: break;
          case 67:
            { return WITH;
            }
          // fall through
          case 162: break;
          case 68:
            { return GUARD;
            }
          // fall through
          case 163: break;
          case 69:
            { return LEAVE;
            }
          // fall through
          case 164: break;
          case 70:
            { return LOWER;
            }
          // fall through
          case 165: break;
          case 71:
            { return PARSE;
            }
          // fall through
          case 166: break;
          case 72:
            { return QUEUE;
            }
          // fall through
          case 167: break;
          case 73:
            { return RAISE;
            }
          // fall through
          case 168: break;
          case 74:
            { return REPLY;
            }
          // fall through
          case 169: break;
          case 75:
            { return TRACE;
            }
          // fall through
          case 170: break;
          case 76:
            { return UPPER;
            }
          // fall through
          case 171: break;
          case 77:
            { return VALUE;
            }
          // fall through
          case 172: break;
          case 78:
            { return WHILE;
            }
          // fall through
          case 173: break;
          case 79:
            { return EXPOSE;
            }
          // fall through
          case 174: break;
          case 80:
            { return RETURN;
            }
          // fall through
          case 175: break;
          case 81:
            { return SELECT;
            }
          // fall through
          case 176: break;
          case 82:
            { return SIGNAL;
            }
          // fall through
          case 177: break;
          case 83:
            { return SOURCE;
            }
          // fall through
          case 178: break;
          case 84:
            { return CLASS_TOKEN;
            }
          // fall through
          case 179: break;
          case 85:
            { return ADDRESS;
            }
          // fall through
          case 180: break;
          case 86:
            { return FORWARD;
            }
          // fall through
          case 181: break;
          case 87:
            { return ITERATE;
            }
          // fall through
          case 182: break;
          case 88:
            { return NUMERIC;
            }
          // fall through
          case 183: break;
          case 89:
            { return OPTIONS;
            }
          // fall through
          case 184: break;
          case 90:
            { return METHOD;
            }
          // fall through
          case 185: break;
          case 91:
            { return CASELESS;
            }
          // fall through
          case 186: break;
          case 92:
            { return INTERPRET;
            }
          // fall through
          case 187: break;
          case 93:
            { return OTHERWISE;
            }
          // fall through
          case 188: break;
          case 94:
            { return PROCEDURE;
            }
          // fall through
          case 189: break;
          case 95:
            { return ATTRIBUTE;
            }
          // fall through
          case 190: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
