/* The following code was generated by JFlex 1.6.1 */

package codigo;

import java_cup.runtime.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>D:/eclipse2/Nueva carpeta/ExamenFinalLP3/src/codigo/lenguaje.lex</tt>
 */
public class AnalizadorLexico {

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
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\30\1\31\1\46\1\46\1\31\22\0\1\32\1\10\1\45"+
    "\5\0\1\11\1\11\1\5\1\5\1\11\1\5\1\4\1\5\1\3"+
    "\11\2\1\0\1\11\1\6\1\7\1\6\2\0\32\1\1\11\1\0"+
    "\1\11\1\0\1\1\1\0\1\36\1\21\1\12\1\35\1\13\1\24"+
    "\1\26\1\27\1\25\1\1\1\40\1\23\1\22\1\14\1\17\1\20"+
    "\1\1\1\16\1\33\1\15\1\37\1\43\1\34\1\44\1\41\1\42"+
    "\1\11\1\0\1\11\7\0\1\46\u1fa2\0\1\46\1\46\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\2\3\1\4\1\5\1\6\1\1"+
    "\1\6\13\2\1\7\1\10\1\11\6\2\1\1\2\0"+
    "\33\2\1\12\6\2\1\13\5\2\1\0\1\14\1\15"+
    "\3\2\1\16\7\2\1\17\4\2\1\20\15\2\1\21"+
    "\2\2\1\22\23\2\1\23\1\2\1\24\1\2\1\25"+
    "\1\26\1\27\5\2\1\30\1\2\1\31\10\2\1\32"+
    "\1\33\16\2\1\34\3\2\1\35\2\2\1\36\1\37"+
    "\1\40\5\2\1\41\7\2\1\42\1\2\1\43\1\44"+
    "\5\2\1\45\1\2\1\46\4\2\1\47\4\2\1\50"+
    "\5\2\1\51\4\2\1\52\1\53\1\54\1\55\1\56"+
    "\1\57\1\60\1\61\1\62\1\2\1\63\7\2\1\64"+
    "\1\2\1\65\3\2\1\66\1\67\2\2\1\70\1\71"+
    "\1\2\1\72\1\2\1\73\1\74\1\75\1\2\1\76"+
    "\1\77\1\100\1\101\1\102";

  private static int [] zzUnpackAction() {
    int [] result = new int[265];
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
    "\0\0\0\47\0\116\0\165\0\234\0\47\0\47\0\303"+
    "\0\303\0\47\0\352\0\u0111\0\u0138\0\u015f\0\u0186\0\u01ad"+
    "\0\u01d4\0\u01fb\0\u0222\0\u0249\0\u0270\0\u0297\0\u02be\0\u0297"+
    "\0\u02e5\0\u030c\0\u0333\0\u035a\0\u0381\0\u03a8\0\u03cf\0\u03f6"+
    "\0\234\0\u041d\0\u0444\0\u046b\0\u0492\0\u04b9\0\u04e0\0\u0507"+
    "\0\u052e\0\u0555\0\u057c\0\u05a3\0\u05ca\0\u05f1\0\u0618\0\u063f"+
    "\0\u0666\0\u068d\0\u06b4\0\u06db\0\u0702\0\u0729\0\u0750\0\u0777"+
    "\0\u079e\0\u07c5\0\u07ec\0\u0813\0\116\0\u083a\0\u0861\0\u0888"+
    "\0\u08af\0\u08d6\0\u08fd\0\u0924\0\u094b\0\u0972\0\u0999\0\u09c0"+
    "\0\u09e7\0\u03cf\0\47\0\u03f6\0\u0a0e\0\u0a35\0\u0a5c\0\116"+
    "\0\u0a83\0\u0aaa\0\u0ad1\0\u0af8\0\u0b1f\0\u0b46\0\u0b6d\0\116"+
    "\0\u0b94\0\u0bbb\0\u0be2\0\u0c09\0\116\0\u0c30\0\u0c57\0\u0c7e"+
    "\0\u0ca5\0\u0ccc\0\u0cf3\0\u0d1a\0\u0d41\0\u0d68\0\u0d8f\0\u0db6"+
    "\0\u0ddd\0\u0e04\0\116\0\u0e2b\0\u0e52\0\116\0\u0e79\0\u0ea0"+
    "\0\u0ec7\0\u0eee\0\u0f15\0\u0f3c\0\u0f63\0\u0f8a\0\u0fb1\0\u0fd8"+
    "\0\u0fff\0\u1026\0\u104d\0\u1074\0\u109b\0\u10c2\0\u10e9\0\u1110"+
    "\0\u1137\0\116\0\u115e\0\116\0\u1185\0\116\0\116\0\116"+
    "\0\u11ac\0\u11d3\0\u11fa\0\u1221\0\u1248\0\116\0\u126f\0\116"+
    "\0\u1296\0\u12bd\0\u12e4\0\u130b\0\u1332\0\u1359\0\u1380\0\u13a7"+
    "\0\116\0\116\0\u13ce\0\u13f5\0\u141c\0\u1443\0\u146a\0\u1491"+
    "\0\u14b8\0\u14df\0\u1506\0\u152d\0\u1554\0\u157b\0\u15a2\0\u15c9"+
    "\0\116\0\u15f0\0\u1617\0\u163e\0\116\0\u1665\0\u168c\0\u16b3"+
    "\0\116\0\116\0\u16da\0\u1701\0\u1728\0\u174f\0\u1776\0\116"+
    "\0\u179d\0\u17c4\0\u17eb\0\u1812\0\u1839\0\u1860\0\u1887\0\116"+
    "\0\u18ae\0\116\0\116\0\u18d5\0\u18fc\0\u1923\0\u194a\0\u1971"+
    "\0\116\0\u1998\0\116\0\u19bf\0\u19e6\0\u1a0d\0\u1a34\0\116"+
    "\0\u1a5b\0\u1a82\0\u1aa9\0\u1ad0\0\116\0\u1af7\0\u1b1e\0\u1b45"+
    "\0\u1b6c\0\u1b93\0\116\0\u1bba\0\u1be1\0\u1c08\0\u1c2f\0\116"+
    "\0\116\0\116\0\116\0\116\0\116\0\116\0\116\0\116"+
    "\0\u1c56\0\116\0\u1c7d\0\u1ca4\0\u1ccb\0\u1cf2\0\u1d19\0\u1d40"+
    "\0\u1d67\0\116\0\u1d8e\0\116\0\u1db5\0\u1ddc\0\u1e03\0\116"+
    "\0\116\0\u1e2a\0\u1e51\0\116\0\116\0\u1e78\0\116\0\u1e9f"+
    "\0\116\0\116\0\116\0\u1ec6\0\116\0\116\0\116\0\116"+
    "\0\116";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[265];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\2\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\3\1\23\1\24\1\25\2\3\1\26\1\27"+
    "\1\30\1\31\1\32\1\33\1\34\1\35\3\3\1\36"+
    "\1\3\1\37\51\0\3\3\6\0\16\3\3\0\12\3"+
    "\4\0\2\4\1\40\44\0\2\41\1\40\51\0\1\12"+
    "\40\0\3\3\6\0\5\3\1\42\3\3\1\43\1\3"+
    "\1\44\1\3\1\45\3\0\3\3\1\46\6\3\3\0"+
    "\3\3\6\0\2\3\1\47\6\3\1\50\4\3\3\0"+
    "\11\3\1\51\3\0\3\3\6\0\1\3\1\52\14\3"+
    "\3\0\3\3\1\53\1\54\5\3\3\0\3\3\6\0"+
    "\1\3\1\55\2\3\1\56\10\3\1\57\3\0\6\3"+
    "\1\60\3\3\3\0\3\3\6\0\1\3\1\61\14\3"+
    "\3\0\12\3\3\0\3\3\6\0\6\3\1\62\7\3"+
    "\3\0\12\3\3\0\3\3\6\0\4\3\1\63\11\3"+
    "\3\0\4\3\1\64\5\3\3\0\3\3\6\0\4\3"+
    "\1\65\1\66\10\3\3\0\12\3\3\0\3\3\6\0"+
    "\5\3\1\67\10\3\3\0\12\3\3\0\3\3\6\0"+
    "\4\3\1\70\1\71\3\3\1\72\4\3\3\0\3\3"+
    "\1\73\6\3\3\0\3\3\6\0\2\3\1\74\7\3"+
    "\1\75\3\3\3\0\12\3\32\0\1\26\1\27\1\26"+
    "\44\0\3\27\15\0\3\3\6\0\3\3\1\76\7\3"+
    "\1\77\1\3\1\100\3\0\1\3\1\101\10\3\3\0"+
    "\3\3\6\0\15\3\1\102\3\0\12\3\3\0\3\3"+
    "\6\0\1\3\1\103\3\3\1\104\10\3\3\0\12\3"+
    "\3\0\3\3\6\0\16\3\3\0\4\3\1\105\5\3"+
    "\3\0\3\3\6\0\2\3\1\106\13\3\3\0\1\107"+
    "\11\3\3\0\3\3\6\0\5\3\1\110\5\3\1\111"+
    "\2\3\3\0\12\3\2\0\45\112\1\113\1\112\2\0"+
    "\2\114\44\0\3\3\6\0\2\3\1\115\13\3\3\0"+
    "\4\3\1\116\5\3\3\0\3\3\6\0\16\3\3\0"+
    "\3\3\1\117\6\3\3\0\3\3\6\0\2\3\1\120"+
    "\13\3\3\0\12\3\3\0\3\3\6\0\16\3\3\0"+
    "\3\3\1\121\6\3\3\0\3\3\6\0\3\3\1\122"+
    "\12\3\3\0\1\123\11\3\3\0\3\3\6\0\16\3"+
    "\3\0\2\3\1\124\7\3\3\0\3\3\6\0\16\3"+
    "\3\0\1\125\11\3\3\0\3\3\6\0\3\3\1\126"+
    "\2\3\1\127\7\3\3\0\12\3\3\0\3\3\6\0"+
    "\16\3\3\0\1\3\1\130\10\3\3\0\3\3\6\0"+
    "\10\3\1\131\5\3\3\0\12\3\3\0\3\3\6\0"+
    "\11\3\1\132\4\3\3\0\12\3\3\0\3\3\6\0"+
    "\10\3\1\133\5\3\3\0\12\3\3\0\3\3\6\0"+
    "\16\3\3\0\4\3\1\134\1\3\1\135\3\3\3\0"+
    "\3\3\6\0\4\3\1\136\6\3\1\137\2\3\3\0"+
    "\12\3\3\0\3\3\6\0\6\3\1\140\7\3\3\0"+
    "\12\3\3\0\3\3\6\0\3\3\1\141\10\3\1\142"+
    "\1\3\3\0\12\3\3\0\3\3\6\0\1\3\1\143"+
    "\14\3\3\0\12\3\3\0\3\3\6\0\5\3\1\144"+
    "\5\3\1\145\2\3\3\0\12\3\3\0\3\3\6\0"+
    "\7\3\1\146\6\3\3\0\12\3\3\0\3\3\6\0"+
    "\1\3\1\147\14\3\3\0\12\3\3\0\3\3\6\0"+
    "\5\3\1\150\10\3\3\0\12\3\3\0\3\3\6\0"+
    "\2\3\1\151\13\3\3\0\12\3\3\0\3\3\6\0"+
    "\13\3\1\152\2\3\3\0\12\3\3\0\3\3\6\0"+
    "\4\3\1\153\11\3\3\0\12\3\3\0\3\3\6\0"+
    "\5\3\1\154\10\3\3\0\12\3\3\0\3\3\6\0"+
    "\11\3\1\155\4\3\3\0\12\3\3\0\3\3\6\0"+
    "\3\3\1\156\5\3\1\157\4\3\3\0\12\3\3\0"+
    "\3\3\6\0\4\3\1\160\11\3\3\0\3\3\1\161"+
    "\6\3\3\0\3\3\6\0\14\3\1\162\1\3\3\0"+
    "\7\3\1\163\2\3\3\0\3\3\6\0\5\3\1\164"+
    "\10\3\3\0\12\3\3\0\3\3\6\0\13\3\1\165"+
    "\2\3\3\0\12\3\3\0\3\3\6\0\13\3\1\166"+
    "\2\3\3\0\12\3\3\0\3\3\6\0\11\3\1\167"+
    "\1\170\3\3\3\0\12\3\3\0\3\3\6\0\16\3"+
    "\3\0\4\3\1\171\5\3\3\0\3\3\6\0\3\3"+
    "\1\172\12\3\3\0\12\3\3\0\3\3\6\0\16\3"+
    "\3\0\1\173\11\3\3\0\3\3\6\0\13\3\1\174"+
    "\2\3\3\0\12\3\3\0\3\3\6\0\11\3\1\175"+
    "\1\3\1\176\2\3\3\0\12\3\3\0\3\3\6\0"+
    "\4\3\1\177\11\3\3\0\12\3\3\0\3\3\6\0"+
    "\3\3\1\200\12\3\3\0\1\201\11\3\3\0\3\3"+
    "\6\0\3\3\1\202\12\3\3\0\12\3\3\0\3\3"+
    "\6\0\16\3\3\0\1\203\11\3\3\0\3\3\6\0"+
    "\4\3\1\204\11\3\3\0\12\3\3\0\3\3\6\0"+
    "\1\205\15\3\3\0\12\3\3\0\3\3\6\0\1\3"+
    "\1\206\14\3\3\0\12\3\3\0\3\3\6\0\11\3"+
    "\1\207\4\3\3\0\12\3\3\0\3\3\6\0\1\3"+
    "\1\210\14\3\3\0\12\3\3\0\3\3\6\0\1\3"+
    "\1\211\14\3\3\0\12\3\3\0\3\3\6\0\11\3"+
    "\1\212\4\3\3\0\12\3\3\0\3\3\6\0\1\3"+
    "\1\213\14\3\3\0\12\3\3\0\3\3\6\0\11\3"+
    "\1\214\4\3\3\0\12\3\3\0\3\3\6\0\6\3"+
    "\1\215\7\3\3\0\12\3\3\0\3\3\6\0\1\3"+
    "\1\216\14\3\3\0\12\3\3\0\3\3\6\0\5\3"+
    "\1\217\10\3\3\0\12\3\3\0\3\3\6\0\16\3"+
    "\3\0\1\220\11\3\3\0\3\3\6\0\1\3\1\221"+
    "\14\3\3\0\12\3\3\0\3\3\6\0\16\3\3\0"+
    "\4\3\1\222\5\3\3\0\3\3\6\0\13\3\1\223"+
    "\2\3\3\0\12\3\3\0\3\3\6\0\4\3\1\224"+
    "\11\3\3\0\12\3\3\0\3\3\6\0\3\3\1\225"+
    "\12\3\3\0\12\3\3\0\3\3\6\0\16\3\3\0"+
    "\10\3\1\226\1\3\3\0\3\3\6\0\11\3\1\227"+
    "\4\3\3\0\12\3\3\0\3\3\6\0\16\3\3\0"+
    "\3\3\1\230\6\3\3\0\3\3\6\0\11\3\1\231"+
    "\4\3\3\0\12\3\3\0\3\3\6\0\14\3\1\232"+
    "\1\3\3\0\12\3\3\0\3\3\6\0\1\3\1\233"+
    "\14\3\3\0\12\3\3\0\3\3\6\0\16\3\3\0"+
    "\3\3\1\234\6\3\3\0\3\3\6\0\16\3\3\0"+
    "\1\235\11\3\3\0\3\3\6\0\13\3\1\236\2\3"+
    "\3\0\12\3\3\0\3\3\6\0\16\3\3\0\4\3"+
    "\1\237\5\3\3\0\3\3\6\0\3\3\1\240\12\3"+
    "\3\0\12\3\3\0\3\3\6\0\2\3\1\241\13\3"+
    "\3\0\12\3\3\0\3\3\6\0\1\3\1\242\14\3"+
    "\3\0\12\3\3\0\3\3\6\0\4\3\1\243\11\3"+
    "\3\0\12\3\3\0\3\3\6\0\3\3\1\244\12\3"+
    "\3\0\12\3\3\0\3\3\6\0\11\3\1\245\4\3"+
    "\3\0\12\3\3\0\3\3\6\0\1\3\1\246\14\3"+
    "\3\0\12\3\3\0\3\3\6\0\16\3\3\0\3\3"+
    "\1\247\6\3\3\0\3\3\6\0\7\3\1\250\6\3"+
    "\3\0\12\3\3\0\3\3\6\0\5\3\1\251\10\3"+
    "\3\0\12\3\3\0\3\3\6\0\13\3\1\252\2\3"+
    "\3\0\12\3\3\0\3\3\6\0\2\3\1\253\13\3"+
    "\3\0\12\3\3\0\3\3\6\0\16\3\3\0\3\3"+
    "\1\254\6\3\3\0\3\3\6\0\16\3\3\0\2\3"+
    "\1\255\7\3\3\0\3\3\6\0\3\3\1\256\12\3"+
    "\3\0\12\3\3\0\3\3\6\0\13\3\1\257\2\3"+
    "\3\0\12\3\3\0\3\3\6\0\3\3\1\260\12\3"+
    "\3\0\12\3\3\0\3\3\6\0\16\3\3\0\1\261"+
    "\11\3\3\0\3\3\6\0\15\3\1\262\3\0\12\3"+
    "\3\0\3\3\6\0\4\3\1\263\11\3\3\0\12\3"+
    "\3\0\3\3\6\0\13\3\1\264\2\3\3\0\12\3"+
    "\3\0\3\3\6\0\16\3\3\0\1\265\11\3\3\0"+
    "\3\3\6\0\6\3\1\266\7\3\3\0\12\3\3\0"+
    "\3\3\6\0\11\3\1\267\4\3\3\0\12\3\3\0"+
    "\3\3\6\0\16\3\3\0\1\3\1\270\10\3\3\0"+
    "\3\3\6\0\16\3\3\0\2\3\1\271\7\3\3\0"+
    "\3\3\6\0\4\3\1\272\11\3\3\0\12\3\3\0"+
    "\3\3\6\0\16\3\3\0\1\273\11\3\3\0\3\3"+
    "\6\0\16\3\3\0\3\3\1\274\6\3\3\0\3\3"+
    "\6\0\1\3\1\275\14\3\3\0\12\3\3\0\3\3"+
    "\6\0\16\3\3\0\3\3\1\276\6\3\3\0\3\3"+
    "\6\0\13\3\1\277\2\3\3\0\12\3\3\0\3\3"+
    "\6\0\16\3\3\0\5\3\1\300\4\3\3\0\3\3"+
    "\6\0\2\3\1\301\13\3\3\0\12\3\3\0\3\3"+
    "\6\0\3\3\1\302\12\3\3\0\12\3\3\0\3\3"+
    "\6\0\1\3\1\303\14\3\3\0\12\3\3\0\3\3"+
    "\6\0\2\3\1\304\13\3\3\0\12\3\3\0\3\3"+
    "\6\0\1\305\15\3\3\0\12\3\3\0\3\3\6\0"+
    "\13\3\1\306\2\3\3\0\12\3\3\0\3\3\6\0"+
    "\1\3\1\307\14\3\3\0\12\3\3\0\3\3\6\0"+
    "\5\3\1\310\10\3\3\0\12\3\3\0\3\3\6\0"+
    "\3\3\1\311\12\3\3\0\12\3\3\0\3\3\6\0"+
    "\1\312\15\3\3\0\12\3\3\0\3\3\6\0\1\3"+
    "\1\313\14\3\3\0\12\3\3\0\3\3\6\0\3\3"+
    "\1\314\12\3\3\0\12\3\3\0\3\3\6\0\16\3"+
    "\3\0\4\3\1\315\5\3\3\0\3\3\6\0\11\3"+
    "\1\316\4\3\3\0\12\3\3\0\3\3\6\0\14\3"+
    "\1\317\1\3\3\0\12\3\3\0\3\3\6\0\14\3"+
    "\1\320\1\3\3\0\12\3\3\0\3\3\6\0\3\3"+
    "\1\321\12\3\3\0\12\3\3\0\3\3\6\0\16\3"+
    "\3\0\4\3\1\322\5\3\3\0\3\3\6\0\2\3"+
    "\1\323\13\3\3\0\12\3\3\0\3\3\6\0\1\3"+
    "\1\324\14\3\3\0\12\3\3\0\3\3\6\0\2\3"+
    "\1\325\13\3\3\0\12\3\3\0\3\3\6\0\1\326"+
    "\15\3\3\0\12\3\3\0\3\3\6\0\6\3\1\327"+
    "\7\3\3\0\12\3\3\0\3\3\6\0\3\3\1\330"+
    "\12\3\3\0\12\3\3\0\3\3\6\0\16\3\3\0"+
    "\3\3\1\331\6\3\3\0\3\3\6\0\1\3\1\332"+
    "\14\3\3\0\12\3\3\0\3\3\6\0\2\3\1\333"+
    "\13\3\3\0\12\3\3\0\3\3\6\0\3\3\1\334"+
    "\12\3\3\0\12\3\3\0\3\3\6\0\3\3\1\335"+
    "\12\3\3\0\12\3\3\0\3\3\6\0\1\336\15\3"+
    "\3\0\12\3\3\0\3\3\6\0\3\3\1\337\12\3"+
    "\3\0\12\3\3\0\3\3\6\0\1\340\15\3\3\0"+
    "\12\3\3\0\3\3\6\0\16\3\3\0\2\3\1\341"+
    "\7\3\3\0\3\3\6\0\1\3\1\342\14\3\3\0"+
    "\12\3\3\0\3\3\6\0\3\3\1\343\12\3\3\0"+
    "\12\3\3\0\3\3\6\0\1\344\15\3\3\0\12\3"+
    "\3\0\3\3\6\0\16\3\3\0\2\3\1\345\7\3"+
    "\3\0\3\3\6\0\12\3\1\346\3\3\3\0\12\3"+
    "\3\0\3\3\6\0\15\3\1\347\3\0\12\3\3\0"+
    "\3\3\6\0\1\3\1\350\14\3\3\0\12\3\3\0"+
    "\3\3\6\0\11\3\1\351\4\3\3\0\12\3\3\0"+
    "\3\3\6\0\1\3\1\352\14\3\3\0\12\3\3\0"+
    "\3\3\6\0\2\3\1\353\13\3\3\0\12\3\3\0"+
    "\3\3\6\0\13\3\1\354\2\3\3\0\12\3\3\0"+
    "\3\3\6\0\16\3\3\0\3\3\1\355\6\3\3\0"+
    "\3\3\6\0\16\3\3\0\4\3\1\356\5\3\3\0"+
    "\3\3\6\0\16\3\3\0\11\3\1\357\3\0\3\3"+
    "\6\0\13\3\1\360\2\3\3\0\12\3\3\0\3\3"+
    "\6\0\16\3\3\0\3\3\1\361\6\3\3\0\3\3"+
    "\6\0\4\3\1\362\11\3\3\0\12\3\3\0\3\3"+
    "\6\0\3\3\1\363\12\3\3\0\12\3\3\0\3\3"+
    "\6\0\12\3\1\364\3\3\3\0\12\3\3\0\3\3"+
    "\6\0\1\3\1\365\14\3\3\0\12\3\3\0\3\3"+
    "\6\0\5\3\1\366\10\3\3\0\12\3\3\0\3\3"+
    "\6\0\3\3\1\367\12\3\3\0\12\3\3\0\3\3"+
    "\6\0\1\3\1\370\14\3\3\0\12\3\3\0\3\3"+
    "\6\0\3\3\1\371\12\3\3\0\12\3\3\0\3\3"+
    "\6\0\1\3\1\372\14\3\3\0\12\3\3\0\3\3"+
    "\6\0\11\3\1\373\4\3\3\0\12\3\3\0\3\3"+
    "\6\0\11\3\1\374\4\3\3\0\12\3\3\0\3\3"+
    "\6\0\1\3\1\375\14\3\3\0\12\3\3\0\3\3"+
    "\6\0\6\3\1\376\7\3\3\0\12\3\3\0\3\3"+
    "\6\0\3\3\1\377\12\3\3\0\12\3\3\0\3\3"+
    "\6\0\1\u0100\15\3\3\0\12\3\3\0\3\3\6\0"+
    "\1\3\1\u0101\14\3\3\0\12\3\3\0\3\3\6\0"+
    "\4\3\1\u0102\11\3\3\0\12\3\3\0\3\3\6\0"+
    "\4\3\1\u0103\11\3\3\0\12\3\3\0\3\3\6\0"+
    "\1\3\1\u0104\14\3\3\0\12\3\3\0\3\3\6\0"+
    "\16\3\3\0\2\3\1\u0105\7\3\3\0\3\3\6\0"+
    "\1\3\1\u0106\14\3\3\0\12\3\3\0\3\3\6\0"+
    "\4\3\1\u0107\11\3\3\0\12\3\3\0\3\3\6\0"+
    "\1\3\1\u0108\14\3\3\0\12\3\3\0\3\3\6\0"+
    "\16\3\3\0\2\3\1\u0109\7\3\2\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7917];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
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
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\3\1\2\11\2\1\1\11\25\1\2\0"+
    "\50\1\1\0\1\11\276\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[265];
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
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
/*-*
* funciones y variables
*/
private void imprimir(String descripcion, String lexema) {
    System.out.println(lexema + " - " + descripcion);
}


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public AnalizadorLexico(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 170) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
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
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
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
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
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
  public void yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

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
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
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
        return;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { if (!yytext().matches("\\s")) {
        throw new RuntimeException("Caracter inválido \"" + yytext() +
        "\" en la línea " + yyline + ", columna " + yycolumn);
    }
            }
          case 67: break;
          case 2: 
            { imprimir("Identificador", yytext());
            }
          case 68: break;
          case 3: 
            { imprimir("Número entero", yytext());
            }
          case 69: break;
          case 4: 
            { imprimir("Signo", yytext());
            }
          case 70: break;
          case 5: 
            { imprimir("Operadores matemáticos", yytext());
            }
          case 71: break;
          case 6: 
            { imprimir("Símbolo", yytext());
            }
          case 72: break;
          case 7: 
            { /* Ignorar espacio en blanco */
            }
          case 73: break;
          case 8: 
            { /* Ignorar espacios */
            }
          case 74: break;
          case 9: 
            { imprimir("Espacio Blanco", yytext());
            }
          case 75: break;
          case 10: 
            { imprimir("Instrucción if", yytext());
            }
          case 76: break;
          case 11: 
            { imprimir("Instrucción do", yytext());
            }
          case 77: break;
          case 12: 
            { imprimir("Cadena", yytext());
            }
          case 78: break;
          case 13: 
            { imprimir("Número de punto flotante", yytext());
            }
          case 79: break;
          case 14: 
            { imprimir("Entrada estándar cin", yytext());
            }
          case 80: break;
          case 15: 
            { imprimir("Operador new", yytext());
            }
          case 81: break;
          case 16: 
            { imprimir("Palabra clave try", yytext());
            }
          case 82: break;
          case 17: 
            { imprimir("Instrucción for", yytext());
            }
          case 83: break;
          case 18: 
            { imprimir("Tipo de dato int", yytext());
            }
          case 84: break;
          case 19: 
            { imprimir("Salida estándar cout", yytext());
            }
          case 85: break;
          case 20: 
            { imprimir("Tipo de dato char", yytext());
            }
          case 86: break;
          case 21: 
            { imprimir("Instrucción case", yytext());
            }
          case 87: break;
          case 22: 
            { imprimir("Fin de línea endl", yytext());
            }
          case 88: break;
          case 23: 
            { imprimir("Instrucción else", yytext());
            }
          case 89: break;
          case 24: 
            { imprimir("Valor booleano true", yytext());
            }
          case 90: break;
          case 25: 
            { imprimir("Puntero 'this'", yytext());
            }
          case 91: break;
          case 26: 
            { imprimir("Tipo de dato bool", yytext());
            }
          case 92: break;
          case 27: 
            { imprimir("Tipo de dato long", yytext());
            }
          case 93: break;
          case 28: 
            { imprimir("Palabra clave auto", yytext());
            }
          case 94: break;
          case 29: 
            { imprimir("Tipo de dato void", yytext());
            }
          case 95: break;
          case 30: 
            { imprimir("Palabra clave const", yytext());
            }
          case 96: break;
          case 31: 
            { imprimir("Palabra clave class", yytext());
            }
          case 97: break;
          case 32: 
            { imprimir("Palabra clave catch", yytext());
            }
          case 98: break;
          case 33: 
            { imprimir("Palabra clave throw", yytext());
            }
          case 99: break;
          case 34: 
            { imprimir("Instrucción break", yytext());
            }
          case 100: break;
          case 35: 
            { imprimir("Tipo de dato float", yytext());
            }
          case 101: break;
          case 36: 
            { imprimir("Valor booleano false", yytext());
            }
          case 102: break;
          case 37: 
            { imprimir("Tipo de dato short", yytext());
            }
          case 103: break;
          case 38: 
            { imprimir("Instrucción while", yytext());
            }
          case 104: break;
          case 39: 
            { imprimir("Palabra clave using", yytext());
            }
          case 105: break;
          case 40: 
            { imprimir("Palabra clave extern", yytext());
            }
          case 106: break;
          case 41: 
            { imprimir("Instrucción return", yytext());
            }
          case 107: break;
          case 42: 
            { imprimir("Palabra clave public", yytext());
            }
          case 108: break;
          case 43: 
            { imprimir("Palabra clave friend", yytext());
            }
          case 109: break;
          case 44: 
            { imprimir("Palabra clave inline", yytext());
            }
          case 110: break;
          case 45: 
            { imprimir("Palabra clave struct", yytext());
            }
          case 111: break;
          case 46: 
            { imprimir("Palabra clave static", yytext());
            }
          case 112: break;
          case 47: 
            { imprimir("Tipo de dato signed", yytext());
            }
          case 113: break;
          case 48: 
            { imprimir("Operador sizeof", yytext());
            }
          case 114: break;
          case 49: 
            { imprimir("Instrucción switch", yytext());
            }
          case 115: break;
          case 50: 
            { imprimir("Operador delete", yytext());
            }
          case 116: break;
          case 51: 
            { imprimir("Tipo de dato double", yytext());
            }
          case 117: break;
          case 52: 
            { imprimir("Puntero nulo nullptr", yytext());
            }
          case 118: break;
          case 53: 
            { imprimir("Palabra clave typedef", yytext());
            }
          case 119: break;
          case 54: 
            { imprimir("Palabra clave private", yytext());
            }
          case 120: break;
          case 55: 
            { imprimir("Instrucción default", yytext());
            }
          case 121: break;
          case 56: 
            { imprimir("Palabra clave virtual", yytext());
            }
          case 122: break;
          case 57: 
            { imprimir("Instrucción continue", yytext());
            }
          case 123: break;
          case 58: 
            { imprimir("Palabra clave explicit", yytext());
            }
          case 124: break;
          case 59: 
            { imprimir("Palabra clave template", yytext());
            }
          case 125: break;
          case 60: 
            { imprimir("Palabra clave register", yytext());
            }
          case 126: break;
          case 61: 
            { imprimir("Palabra clave operator", yytext());
            }
          case 127: break;
          case 62: 
            { imprimir("Tipo de dato unsigned", yytext());
            }
          case 128: break;
          case 63: 
            { imprimir("Palabra clave volatile", yytext());
            }
          case 129: break;
          case 64: 
            { imprimir("Palabra clave constexpr", yytext());
            }
          case 130: break;
          case 65: 
            { imprimir("Palabra clave namespace", yytext());
            }
          case 131: break;
          case 66: 
            { imprimir("Palabra clave protected", yytext());
            }
          case 132: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
