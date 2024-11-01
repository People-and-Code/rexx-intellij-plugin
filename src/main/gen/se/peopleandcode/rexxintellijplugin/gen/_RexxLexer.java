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
    "\1\62\1\0\1\63\1\43\1\0\1\64\1\65\1\66"+
    "\1\67\1\70\1\37\1\40\1\71\1\72\2\43\1\73"+
    "\1\74\1\46\1\75\1\50\1\51\1\76\1\77\1\100"+
    "\1\101\1\56\1\57\1\60\1\61\1\43\1\0\1\102"+
    "\1\0\1\103\u0181\0";

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
    "\1\32\6\0\1\33\1\34\1\35\1\36\1\37\1\40"+
    "\1\41\3\4\1\42\6\4\1\43\30\4\1\44\1\45"+
    "\1\46\1\47\1\50\2\0\1\51\1\52\1\53\3\0"+
    "\1\54\1\55\1\4\1\56\3\4\1\57\10\4\1\60"+
    "\13\4\1\61\5\4\1\62\1\4\1\63\2\4\1\64"+
    "\1\65\1\66\1\0\1\67\1\70\3\0\1\4\1\71"+
    "\1\72\1\73\1\74\6\4\1\75\5\4\1\76\1\77"+
    "\7\4\1\100\3\4\1\101\3\0\3\4\1\102\2\4"+
    "\1\103\3\4\1\104\1\4\1\105\1\106\1\107\4\4"+
    "\1\110\1\111\1\112\3\0\1\4\1\113\7\4\1\114"+
    "\1\115\1\116\1\117\1\0\1\120\1\0\1\121\1\122"+
    "\1\4\1\123\1\124\1\125\2\4\1\0\1\126\3\4"+
    "\1\0\1\127\1\130\1\131\1\0\1\132";

  private static int [] zzUnpackAction() {
    int [] result = new int[257];
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
    "\0\0\0\104\0\210\0\314\0\u0110\0\u0154\0\u0198\0\104"+
    "\0\u01dc\0\u0220\0\104\0\104\0\u0264\0\104\0\u02a8\0\u02ec"+
    "\0\u0330\0\u0374\0\u03b8\0\u03fc\0\u0440\0\u0484\0\u04c8\0\u050c"+
    "\0\u0550\0\u0594\0\u05d8\0\u061c\0\u0660\0\u06a4\0\u06e8\0\u072c"+
    "\0\u0770\0\u07b4\0\u07f8\0\u083c\0\u0880\0\u08c4\0\u0908\0\u094c"+
    "\0\u0990\0\u09d4\0\u0a18\0\u0a5c\0\u0aa0\0\104\0\u02a8\0\u0154"+
    "\0\104\0\u0ae4\0\104\0\u0220\0\104\0\u0b28\0\u0b6c\0\u0bb0"+
    "\0\u0bf4\0\u0c38\0\u0c7c\0\u0cc0\0\u0d04\0\104\0\104\0\104"+
    "\0\104\0\104\0\u0d48\0\u0d8c\0\u0dd0\0\u0e14\0\u0110\0\u0e58"+
    "\0\u0e9c\0\u0ee0\0\u0f24\0\u0f68\0\u0fac\0\u0110\0\u0ff0\0\u1034"+
    "\0\u1078\0\u10bc\0\u1100\0\u1144\0\u1188\0\u11cc\0\u1210\0\u1254"+
    "\0\u1298\0\u12dc\0\u1320\0\u1364\0\u13a8\0\u13ec\0\u1430\0\u1474"+
    "\0\u14b8\0\u14fc\0\u1540\0\u1584\0\u15c8\0\u160c\0\u1650\0\u1694"+
    "\0\u16d8\0\104\0\104\0\u171c\0\u1760\0\u17a4\0\u0c38\0\u0c7c"+
    "\0\u17e8\0\u182c\0\u1870\0\104\0\104\0\u18b4\0\u0110\0\u18f8"+
    "\0\u193c\0\u1980\0\u0110\0\u19c4\0\u1a08\0\u1a4c\0\u1a90\0\u1ad4"+
    "\0\u1b18\0\u1b5c\0\u1ba0\0\u0110\0\u1be4\0\u1c28\0\u1c6c\0\u1cb0"+
    "\0\u1cf4\0\u1d38\0\u1d7c\0\u1dc0\0\u1e04\0\u1e48\0\u1e8c\0\u0110"+
    "\0\u1ed0\0\u1f14\0\u1f58\0\u1f9c\0\u1fe0\0\u0110\0\u2024\0\u0110"+
    "\0\u2068\0\u20ac\0\104\0\104\0\104\0\u20f0\0\u20f0\0\104"+
    "\0\u2134\0\u2178\0\u21bc\0\u2200\0\u0110\0\u0110\0\u0110\0\u0110"+
    "\0\u2244\0\u2288\0\u22cc\0\u2310\0\u2354\0\u2398\0\u0110\0\u23dc"+
    "\0\u2420\0\u2464\0\u24a8\0\u24ec\0\u0110\0\u0110\0\u2530\0\u2574"+
    "\0\u25b8\0\u25fc\0\u2640\0\u2684\0\u26c8\0\u0110\0\u270c\0\u2750"+
    "\0\u2794\0\u0110\0\u27d8\0\u281c\0\u2860\0\u28a4\0\u28e8\0\u292c"+
    "\0\u0110\0\u2970\0\u29b4\0\u0110\0\u29f8\0\u2a3c\0\u2a80\0\u0110"+
    "\0\u2ac4\0\u0110\0\u0110\0\u0110\0\u2b08\0\u2b4c\0\u2b90\0\u2bd4"+
    "\0\u0110\0\u0110\0\u0110\0\u2c18\0\u2c5c\0\u2ca0\0\u2ce4\0\u0110"+
    "\0\u2d28\0\u2d6c\0\u2db0\0\u2df4\0\u2e38\0\u2e7c\0\u2ec0\0\u0110"+
    "\0\u0110\0\u0110\0\u0110\0\u2f04\0\104\0\u2f48\0\u0110\0\u0110"+
    "\0\u2f8c\0\u0110\0\u0110\0\u0110\0\u2fd0\0\u3014\0\u3058\0\104"+
    "\0\u309c\0\u30e0\0\u3124\0\u3168\0\u0110\0\u0110\0\u0110\0\u31ac"+
    "\0\104";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[257];
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
    "\1\53\1\54\1\31\1\5\1\32\1\33\1\34\1\5"+
    "\1\37\1\40\1\5\1\42\1\45\1\46\1\47\1\50"+
    "\1\55\1\56\105\0\1\3\13\0\1\57\70\0\1\4"+
    "\22\0\1\4\77\0\3\5\6\0\30\5\2\0\16\5"+
    "\2\0\2\60\1\0\1\60\1\61\77\60\3\0\1\62"+
    "\107\0\1\63\74\0\2\64\1\0\5\64\1\61\73\64"+
    "\13\0\1\65\72\0\1\3\117\0\1\66\106\0\3\67"+
    "\73\0\1\70\107\0\1\71\1\0\3\24\34\0\1\72"+
    "\4\0\1\73\35\0\1\71\1\0\3\24\104\0\1\74"+
    "\105\0\1\75\1\76\1\77\102\0\1\100\102\0\1\101"+
    "\1\102\1\103\74\0\3\5\6\0\3\5\1\104\14\5"+
    "\1\105\7\5\2\0\3\5\1\104\6\5\1\105\3\5"+
    "\23\0\3\5\6\0\1\106\27\5\2\0\1\106\15\5"+
    "\23\0\3\5\6\0\15\5\1\107\2\5\1\110\7\5"+
    "\2\0\11\5\1\107\1\110\3\5\23\0\3\5\6\0"+
    "\12\5\1\111\1\5\1\112\11\5\1\113\1\5\2\0"+
    "\7\5\1\111\6\5\23\0\3\5\6\0\15\5\1\114"+
    "\12\5\2\0\11\5\1\114\4\5\23\0\3\5\6\0"+
    "\23\5\1\115\4\5\2\0\15\5\1\115\23\0\3\5"+
    "\6\0\5\5\1\116\6\5\1\117\5\5\1\120\5\5"+
    "\2\0\14\5\1\120\1\5\23\0\3\5\6\0\4\5"+
    "\1\121\10\5\1\122\12\5\2\0\4\5\1\121\4\5"+
    "\1\122\4\5\23\0\3\5\6\0\15\5\1\123\5\5"+
    "\1\124\4\5\2\0\11\5\1\123\3\5\1\124\23\0"+
    "\3\5\6\0\16\5\1\125\3\5\1\126\5\5\2\0"+
    "\14\5\1\126\1\5\23\0\3\5\6\0\1\127\17\5"+
    "\1\130\2\5\1\131\4\5\2\0\1\127\11\5\1\130"+
    "\2\5\1\131\23\0\3\5\6\0\23\5\1\132\4\5"+
    "\2\0\15\5\1\132\23\0\3\5\6\0\1\133\3\5"+
    "\1\134\23\5\2\0\1\133\3\5\1\134\11\5\23\0"+
    "\3\5\6\0\1\135\3\5\1\136\3\5\1\137\4\5"+
    "\1\140\12\5\2\0\1\135\3\5\1\136\1\5\1\137"+
    "\2\5\1\140\4\5\23\0\3\5\6\0\7\5\1\141"+
    "\10\5\1\142\7\5\2\0\5\5\1\141\4\5\1\142"+
    "\3\5\23\0\3\5\6\0\21\5\1\143\6\5\2\0"+
    "\13\5\1\143\2\5\23\0\3\5\6\0\1\144\27\5"+
    "\2\0\1\144\15\5\23\0\3\5\6\0\7\5\1\145"+
    "\1\146\17\5\2\0\5\5\1\145\1\146\7\5\30\0"+
    "\1\147\1\150\1\151\136\0\1\152\122\0\1\153\1\0"+
    "\2\62\1\0\101\62\2\66\1\0\101\66\21\0\3\67"+
    "\12\0\1\154\31\0\1\154\13\0\13\70\1\155\70\70"+
    "\21\0\3\156\101\0\3\157\6\0\6\157\24\0\5\157"+
    "\34\0\2\160\145\0\1\161\1\0\1\162\5\0\1\163"+
    "\36\0\1\164\103\0\1\165\75\0\3\5\6\0\3\5"+
    "\1\166\24\5\2\0\3\5\1\166\12\5\23\0\3\5"+
    "\6\0\6\5\1\167\21\5\2\0\16\5\23\0\3\5"+
    "\6\0\12\5\1\170\15\5\2\0\7\5\1\170\6\5"+
    "\23\0\3\5\6\0\15\5\1\171\12\5\2\0\11\5"+
    "\1\171\4\5\23\0\3\5\6\0\21\5\1\172\6\5"+
    "\2\0\13\5\1\172\2\5\23\0\3\5\6\0\3\5"+
    "\1\173\24\5\2\0\3\5\1\173\12\5\23\0\3\5"+
    "\6\0\10\5\1\174\5\5\1\175\11\5\2\0\6\5"+
    "\1\174\7\5\23\0\3\5\6\0\20\5\1\176\7\5"+
    "\2\0\12\5\1\176\3\5\23\0\3\5\6\0\1\177"+
    "\27\5\2\0\1\177\15\5\23\0\3\5\6\0\22\5"+
    "\1\200\5\5\2\0\14\5\1\200\1\5\23\0\3\5"+
    "\6\0\4\5\1\201\23\5\2\0\4\5\1\201\11\5"+
    "\23\0\3\5\6\0\1\202\27\5\2\0\1\202\15\5"+
    "\23\0\3\5\6\0\15\5\1\203\12\5\2\0\11\5"+
    "\1\203\4\5\23\0\3\5\6\0\16\5\1\204\11\5"+
    "\2\0\16\5\23\0\3\5\6\0\13\5\1\205\14\5"+
    "\2\0\10\5\1\205\5\5\23\0\3\5\6\0\22\5"+
    "\1\206\5\5\2\0\14\5\1\206\1\5\23\0\3\5"+
    "\6\0\7\5\1\207\20\5\2\0\5\5\1\207\10\5"+
    "\23\0\3\5\6\0\20\5\1\210\7\5\2\0\12\5"+
    "\1\210\3\5\23\0\3\5\6\0\15\5\1\211\12\5"+
    "\2\0\11\5\1\211\4\5\23\0\3\5\6\0\12\5"+
    "\1\212\6\5\1\213\6\5\2\0\7\5\1\212\3\5"+
    "\1\213\2\5\23\0\3\5\6\0\4\5\1\214\23\5"+
    "\2\0\4\5\1\214\11\5\23\0\3\5\6\0\10\5"+
    "\1\215\17\5\2\0\6\5\1\215\7\5\23\0\3\5"+
    "\6\0\16\5\1\216\3\5\1\217\5\5\2\0\14\5"+
    "\1\217\1\5\23\0\3\5\6\0\27\5\1\220\2\0"+
    "\16\5\23\0\3\5\6\0\12\5\1\221\15\5\2\0"+
    "\7\5\1\221\6\5\23\0\3\5\6\0\6\5\1\222"+
    "\21\5\2\0\16\5\23\0\3\5\6\0\23\5\1\223"+
    "\4\5\2\0\15\5\1\223\23\0\3\5\6\0\4\5"+
    "\1\224\23\5\2\0\4\5\1\224\11\5\23\0\3\5"+
    "\6\0\1\225\27\5\2\0\1\225\15\5\23\0\3\5"+
    "\6\0\4\5\1\226\23\5\2\0\4\5\1\226\11\5"+
    "\23\0\3\5\6\0\12\5\1\227\5\5\1\230\7\5"+
    "\2\0\7\5\1\227\2\5\1\230\3\5\23\0\3\5"+
    "\6\0\10\5\1\231\17\5\2\0\6\5\1\231\7\5"+
    "\23\0\3\5\6\0\22\5\1\232\5\5\2\0\14\5"+
    "\1\232\1\5\30\0\1\233\104\0\1\234\104\0\1\235"+
    "\67\0\1\236\1\0\1\236\2\0\3\237\60\0\13\70"+
    "\1\155\4\70\1\240\63\70\21\0\3\156\12\0\1\154"+
    "\31\0\1\154\113\0\1\241\76\0\1\242\100\0\1\243"+
    "\34\0\3\5\6\0\20\5\1\244\7\5\2\0\12\5"+
    "\1\244\3\5\23\0\3\5\6\0\12\5\1\245\15\5"+
    "\2\0\7\5\1\245\6\5\23\0\3\5\6\0\16\5"+
    "\1\246\11\5\2\0\16\5\23\0\3\5\6\0\4\5"+
    "\1\247\23\5\2\0\4\5\1\247\11\5\23\0\3\5"+
    "\6\0\22\5\1\250\5\5\2\0\14\5\1\250\1\5"+
    "\23\0\3\5\6\0\15\5\1\251\12\5\2\0\11\5"+
    "\1\251\4\5\23\0\3\5\6\0\25\5\1\252\2\5"+
    "\2\0\16\5\23\0\3\5\6\0\20\5\1\253\7\5"+
    "\2\0\12\5\1\253\3\5\23\0\3\5\6\0\4\5"+
    "\1\254\23\5\2\0\4\5\1\254\11\5\23\0\3\5"+
    "\6\0\20\5\1\255\7\5\2\0\12\5\1\255\3\5"+
    "\23\0\3\5\6\0\24\5\1\256\3\5\2\0\16\5"+
    "\23\0\3\5\6\0\16\5\1\257\11\5\2\0\16\5"+
    "\23\0\3\5\6\0\4\5\1\260\23\5\2\0\4\5"+
    "\1\260\11\5\23\0\3\5\6\0\10\5\1\261\17\5"+
    "\2\0\6\5\1\261\7\5\23\0\3\5\6\0\4\5"+
    "\1\262\23\5\2\0\4\5\1\262\11\5\23\0\3\5"+
    "\6\0\21\5\1\263\6\5\2\0\13\5\1\263\2\5"+
    "\23\0\3\5\6\0\2\5\1\264\25\5\2\0\2\5"+
    "\1\264\13\5\23\0\3\5\6\0\12\5\1\265\15\5"+
    "\2\0\7\5\1\265\6\5\23\0\3\5\6\0\7\5"+
    "\1\266\20\5\2\0\5\5\1\266\10\5\23\0\3\5"+
    "\6\0\23\5\1\267\4\5\2\0\15\5\1\267\23\0"+
    "\3\5\6\0\21\5\1\270\6\5\2\0\13\5\1\270"+
    "\2\5\23\0\3\5\6\0\12\5\1\271\15\5\2\0"+
    "\7\5\1\271\6\5\23\0\3\5\6\0\23\5\1\272"+
    "\4\5\2\0\15\5\1\272\23\0\3\5\6\0\4\5"+
    "\1\273\23\5\2\0\4\5\1\273\11\5\23\0\3\5"+
    "\6\0\14\5\1\274\13\5\2\0\16\5\23\0\3\5"+
    "\6\0\20\5\1\275\7\5\2\0\12\5\1\275\3\5"+
    "\23\0\3\5\6\0\14\5\1\276\13\5\2\0\16\5"+
    "\23\0\3\5\6\0\2\5\1\277\25\5\2\0\2\5"+
    "\1\277\13\5\23\0\3\5\6\0\23\5\1\300\4\5"+
    "\2\0\15\5\1\300\23\0\3\5\6\0\12\5\1\301"+
    "\15\5\2\0\7\5\1\301\6\5\23\0\3\5\6\0"+
    "\7\5\1\302\20\5\2\0\5\5\1\302\10\5\23\0"+
    "\3\237\160\0\1\303\67\0\1\304\117\0\1\305\24\0"+
    "\3\5\6\0\4\5\1\306\23\5\2\0\4\5\1\306"+
    "\11\5\23\0\3\5\6\0\21\5\1\307\6\5\2\0"+
    "\13\5\1\307\2\5\23\0\3\5\6\0\1\310\27\5"+
    "\2\0\1\310\15\5\23\0\3\5\6\0\3\5\1\311"+
    "\24\5\2\0\3\5\1\311\12\5\23\0\3\5\6\0"+
    "\20\5\1\312\7\5\2\0\12\5\1\312\3\5\23\0"+
    "\3\5\6\0\1\313\27\5\2\0\1\313\15\5\23\0"+
    "\3\5\6\0\4\5\1\314\23\5\2\0\4\5\1\314"+
    "\11\5\23\0\3\5\6\0\20\5\1\315\7\5\2\0"+
    "\12\5\1\315\3\5\23\0\3\5\6\0\15\5\1\316"+
    "\12\5\2\0\11\5\1\316\4\5\23\0\3\5\6\0"+
    "\20\5\1\317\7\5\2\0\12\5\1\317\3\5\23\0"+
    "\3\5\6\0\4\5\1\320\23\5\2\0\4\5\1\320"+
    "\11\5\23\0\3\5\6\0\4\5\1\321\23\5\2\0"+
    "\4\5\1\321\11\5\23\0\3\5\6\0\4\5\1\322"+
    "\23\5\2\0\4\5\1\322\11\5\23\0\3\5\6\0"+
    "\4\5\1\323\23\5\2\0\4\5\1\323\11\5\23\0"+
    "\3\5\6\0\27\5\1\324\2\0\16\5\23\0\3\5"+
    "\6\0\20\5\1\325\7\5\2\0\12\5\1\325\3\5"+
    "\23\0\3\5\6\0\2\5\1\326\25\5\2\0\2\5"+
    "\1\326\13\5\23\0\3\5\6\0\1\327\27\5\2\0"+
    "\1\327\15\5\23\0\3\5\6\0\2\5\1\330\25\5"+
    "\2\0\2\5\1\330\13\5\23\0\3\5\6\0\4\5"+
    "\1\331\23\5\2\0\4\5\1\331\11\5\23\0\3\5"+
    "\6\0\4\5\1\332\23\5\2\0\4\5\1\332\11\5"+
    "\23\0\3\5\6\0\4\5\1\333\23\5\2\0\4\5"+
    "\1\333\11\5\100\0\1\334\104\0\1\335\75\0\1\336"+
    "\33\0\3\5\6\0\21\5\1\337\6\5\2\0\13\5"+
    "\1\337\2\5\23\0\3\5\6\0\4\5\1\340\23\5"+
    "\2\0\4\5\1\340\11\5\23\0\3\5\6\0\20\5"+
    "\1\341\7\5\2\0\12\5\1\341\3\5\23\0\3\5"+
    "\6\0\16\5\1\342\11\5\2\0\16\5\23\0\3\5"+
    "\6\0\22\5\1\343\5\5\2\0\14\5\1\343\1\5"+
    "\23\0\3\5\6\0\10\5\1\344\17\5\2\0\6\5"+
    "\1\344\7\5\23\0\3\5\6\0\14\5\1\345\13\5"+
    "\2\0\16\5\23\0\3\5\6\0\25\5\1\346\2\5"+
    "\2\0\16\5\23\0\3\5\6\0\3\5\1\347\24\5"+
    "\2\0\3\5\1\347\12\5\23\0\3\5\6\0\14\5"+
    "\1\350\13\5\2\0\16\5\23\0\3\5\6\0\22\5"+
    "\1\351\5\5\2\0\14\5\1\351\1\5\23\0\3\5"+
    "\6\0\12\5\1\352\15\5\2\0\7\5\1\352\6\5"+
    "\23\0\3\5\6\0\4\5\1\353\23\5\2\0\4\5"+
    "\1\353\11\5\74\0\1\354\110\0\1\355\101\0\1\356"+
    "\27\0\3\5\6\0\21\5\1\357\6\5\2\0\13\5"+
    "\1\357\2\5\23\0\3\5\6\0\3\5\1\360\24\5"+
    "\2\0\3\5\1\360\12\5\23\0\3\5\6\0\20\5"+
    "\1\361\7\5\2\0\12\5\1\361\3\5\23\0\3\5"+
    "\6\0\4\5\1\362\23\5\2\0\4\5\1\362\11\5"+
    "\23\0\3\5\6\0\2\5\1\363\25\5\2\0\2\5"+
    "\1\363\13\5\23\0\3\5\6\0\21\5\1\364\6\5"+
    "\2\0\13\5\1\364\2\5\23\0\3\5\6\0\10\5"+
    "\1\365\17\5\2\0\6\5\1\365\7\5\23\0\3\5"+
    "\6\0\23\5\1\366\4\5\2\0\15\5\1\366\67\0"+
    "\1\367\105\0\1\370\35\0\3\5\6\0\4\5\1\371"+
    "\23\5\2\0\4\5\1\371\11\5\23\0\3\5\6\0"+
    "\21\5\1\372\6\5\2\0\13\5\1\372\2\5\23\0"+
    "\3\5\6\0\20\5\1\373\7\5\2\0\12\5\1\373"+
    "\3\5\103\0\1\374\23\0\3\5\6\0\22\5\1\375"+
    "\5\5\2\0\14\5\1\375\1\5\23\0\3\5\6\0"+
    "\4\5\1\376\23\5\2\0\4\5\1\376\11\5\23\0"+
    "\3\5\6\0\4\5\1\377\23\5\2\0\4\5\1\377"+
    "\11\5\102\0\1\u0100\73\0\1\u0101\13\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[12784];
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
    "\1\0\1\11\5\1\1\11\2\1\2\11\1\1\1\11"+
    "\37\1\1\11\2\0\1\11\1\1\1\11\1\0\1\11"+
    "\1\1\6\0\1\1\5\11\47\1\2\11\2\0\3\1"+
    "\3\0\2\11\45\1\3\11\1\0\1\1\1\11\3\0"+
    "\37\1\3\0\26\1\3\0\15\1\1\0\1\11\1\0"+
    "\10\1\1\0\1\11\3\1\1\0\3\1\1\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[257];
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
          case 91: break;
          case 2:
            { return WHITE_SPACE;
            }
          // fall through
          case 92: break;
          case 3:
            { return TERMINATOR;
            }
          // fall through
          case 93: break;
          case 4:
            { return IDENTIFIER;
            }
          // fall through
          case 94: break;
          case 5:
            { return OPERATOR_REMAINDER;
            }
          // fall through
          case 95: break;
          case 6:
            { return OPERATOR_BITWISE_AND;
            }
          // fall through
          case 96: break;
          case 7:
            { return TOKEN_LEFT;
            }
          // fall through
          case 97: break;
          case 8:
            { return TOKEN_RIGHT;
            }
          // fall through
          case 98: break;
          case 9:
            { return OPERATOR_MULTIPLY;
            }
          // fall through
          case 99: break;
          case 10:
            { return OPERATOR_PLUS;
            }
          // fall through
          case 100: break;
          case 11:
            { return COMMA;
            }
          // fall through
          case 101: break;
          case 12:
            { return OPERATOR_SUBTRACT;
            }
          // fall through
          case 102: break;
          case 13:
            { return DOT;
            }
          // fall through
          case 103: break;
          case 14:
            { return OPERATOR_DIVIDE;
            }
          // fall through
          case 104: break;
          case 15:
            { return NUMBER_INT;
            }
          // fall through
          case 105: break;
          case 16:
            { return COLON;
            }
          // fall through
          case 106: break;
          case 17:
            { return LT;
            }
          // fall through
          case 107: break;
          case 18:
            { return EQ;
            }
          // fall through
          case 108: break;
          case 19:
            { return GT;
            }
          // fall through
          case 109: break;
          case 20:
            { return OPERATOR_OR;
            }
          // fall through
          case 110: break;
          case 21:
            { return TILDE;
            }
          // fall through
          case 111: break;
          case 22:
            { return STRING;
            }
          // fall through
          case 112: break;
          case 23:
            { return SHEBANG;
            }
          // fall through
          case 113: break;
          case 24:
            { return OPERATOR_AND;
            }
          // fall through
          case 114: break;
          case 25:
            { return OPERATOR_POWER;
            }
          // fall through
          case 115: break;
          case 26:
            { return LINE_COMMENT;
            }
          // fall through
          case 116: break;
          case 27:
            { return STRICT_LT;
            }
          // fall through
          case 117: break;
          case 28:
            { return LTE;
            }
          // fall through
          case 118: break;
          case 29:
            { return NEQ2;
            }
          // fall through
          case 119: break;
          case 30:
            { return STRICT_EQ;
            }
          // fall through
          case 120: break;
          case 31:
            { return NEQ3;
            }
          // fall through
          case 121: break;
          case 32:
            { return GTE;
            }
          // fall through
          case 122: break;
          case 33:
            { return STRICT_GT;
            }
          // fall through
          case 123: break;
          case 34:
            { return DO;
            }
          // fall through
          case 124: break;
          case 35:
            { return IF;
            }
          // fall through
          case 125: break;
          case 36:
            { return ALT_LT;
            }
          // fall through
          case 126: break;
          case 37:
            { return NEQ1;
            }
          // fall through
          case 127: break;
          case 38:
            { return ALT_GT;
            }
          // fall through
          case 128: break;
          case 39:
            { return OPERATOR_XOR;
            }
          // fall through
          case 129: break;
          case 40:
            { return OPERATOR_CONCATENATE;
            }
          // fall through
          case 130: break;
          case 41:
            { return NUMBER_DECIMAL;
            }
          // fall through
          case 131: break;
          case 42:
            { return NUMBER_HEXADECIMAL;
            }
          // fall through
          case 132: break;
          case 43:
            { return NUMBER_BINARY;
            }
          // fall through
          case 133: break;
          case 44:
            { return STRICT_LTE;
            }
          // fall through
          case 134: break;
          case 45:
            { return STRICT_GTE;
            }
          // fall through
          case 135: break;
          case 46:
            { return ARG;
            }
          // fall through
          case 136: break;
          case 47:
            { return END;
            }
          // fall through
          case 137: break;
          case 48:
            { return NOP;
            }
          // fall through
          case 138: break;
          case 49:
            { return SAY;
            }
          // fall through
          case 139: break;
          case 50:
            { return USE;
            }
          // fall through
          case 140: break;
          case 51:
            { return VAR;
            }
          // fall through
          case 141: break;
          case 52:
            { return STRICT_ESC_LT;
            }
          // fall through
          case 142: break;
          case 53:
            { return STRICT_NEQ;
            }
          // fall through
          case 143: break;
          case 54:
            { return STRICT_ESC_GT;
            }
          // fall through
          case 144: break;
          case 55:
            { return NUMBER_SCIENTIFIC;
            }
          // fall through
          case 145: break;
          case 56:
            { return MULTILINE_COMMENT;
            }
          // fall through
          case 146: break;
          case 57:
            { return CALL;
            }
          // fall through
          case 147: break;
          case 58:
            { return DROP;
            }
          // fall through
          case 148: break;
          case 59:
            { return ELSE;
            }
          // fall through
          case 149: break;
          case 60:
            { return EXIT;
            }
          // fall through
          case 150: break;
          case 61:
            { return LOOP;
            }
          // fall through
          case 151: break;
          case 62:
            { return PULL;
            }
          // fall through
          case 152: break;
          case 63:
            { return PUSH;
            }
          // fall through
          case 153: break;
          case 64:
            { return THEN;
            }
          // fall through
          case 154: break;
          case 65:
            { return WITH;
            }
          // fall through
          case 155: break;
          case 66:
            { return GUARD;
            }
          // fall through
          case 156: break;
          case 67:
            { return LEAVE;
            }
          // fall through
          case 157: break;
          case 68:
            { return PARSE;
            }
          // fall through
          case 158: break;
          case 69:
            { return QUEUE;
            }
          // fall through
          case 159: break;
          case 70:
            { return RAISE;
            }
          // fall through
          case 160: break;
          case 71:
            { return REPLY;
            }
          // fall through
          case 161: break;
          case 72:
            { return TRACE;
            }
          // fall through
          case 162: break;
          case 73:
            { return VALUE;
            }
          // fall through
          case 163: break;
          case 74:
            { return WHILE;
            }
          // fall through
          case 164: break;
          case 75:
            { return EXPOSE;
            }
          // fall through
          case 165: break;
          case 76:
            { return RETURN;
            }
          // fall through
          case 166: break;
          case 77:
            { return SELECT;
            }
          // fall through
          case 167: break;
          case 78:
            { return SIGNAL;
            }
          // fall through
          case 168: break;
          case 79:
            { return SOURCE;
            }
          // fall through
          case 169: break;
          case 80:
            { return CLASS;
            }
          // fall through
          case 170: break;
          case 81:
            { return ADDRESS;
            }
          // fall through
          case 171: break;
          case 82:
            { return FORWARD;
            }
          // fall through
          case 172: break;
          case 83:
            { return ITERATE;
            }
          // fall through
          case 173: break;
          case 84:
            { return NUMERIC;
            }
          // fall through
          case 174: break;
          case 85:
            { return OPTIONS;
            }
          // fall through
          case 175: break;
          case 86:
            { return METHOD;
            }
          // fall through
          case 176: break;
          case 87:
            { return INTERPRET;
            }
          // fall through
          case 177: break;
          case 88:
            { return OTHERWISE;
            }
          // fall through
          case 178: break;
          case 89:
            { return PROCEDURE;
            }
          // fall through
          case 179: break;
          case 90:
            { return ATTRIBUTE;
            }
          // fall through
          case 180: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
