// Generated from D:/Clase/DLP/Proyecto/src/parser\Pmm.g4 by ANTLR 4.9.2
package parser;

import ast.*;
import ast.Expressions.*;
import ast.Statements.*;
import ast.Definitions.*;
import ast.Types.*;
import java.util.ArrayList;
import java.util.LinkedList;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, CHAR_CONSTANT=38, 
		ID=39, INT_CONSTANT=40, REAL_CONSTANT=41, WS=42, TRASH=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "COMILLA", "ASCII_CHAR", "SPECIAL_CHAR", 
			"CHARS", "CHAR_CONSTANT", "LETTER", "ID_CHARS", "ID", "DIGIT", "DIGITS", 
			"INT_CONSTANT", "ELEVATED", "REAL_CONSTANT", "WS", "ONE_LINE_COMMENT", 
			"MULTILINE_COMMENT", "TRASH"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "','", "'def'", "'('", "')'", "'{'", "'}'", "'main'", "';'", 
			"'print'", "'input'", "'return'", "'='", "'if'", "'else'", "'while'", 
			"'['", "']'", "'.'", "'!'", "'-'", "'*'", "'/'", "'%'", "'+'", "'<'", 
			"'>'", "'<='", "'>='", "'!='", "'=='", "'&&'", "'||'", "'int'", "'double'", 
			"'char'", "'struct'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "CHAR_CONSTANT", "ID", "INT_CONSTANT", "REAL_CONSTANT", "WS", 
			"TRASH"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public PmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u0163\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3"+
		"\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3$\3"+
		"$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3(\3(\3("+
		"\3(\5(\u00ef\n(\3(\5(\u00f2\n(\3(\3(\3)\3)\3)\3)\3)\5)\u00fb\n)\3)\3)"+
		"\3*\3*\3*\3*\3+\3+\3+\5+\u0106\n+\3,\3,\3-\3-\3-\5-\u010d\n-\3.\3.\5."+
		"\u0111\n.\3.\7.\u0114\n.\f.\16.\u0117\13.\3/\3/\3\60\6\60\u011c\n\60\r"+
		"\60\16\60\u011d\3\61\3\61\7\61\u0122\n\61\f\61\16\61\u0125\13\61\3\61"+
		"\5\61\u0128\n\61\3\62\3\62\5\62\u012c\n\62\3\62\3\62\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u013a\n\63\3\63\5\63\u013d\n\63"+
		"\3\64\6\64\u0140\n\64\r\64\16\64\u0141\3\64\3\64\3\65\3\65\7\65\u0148"+
		"\n\65\f\65\16\65\u014b\13\65\3\65\5\65\u014e\n\65\3\66\3\66\3\66\3\66"+
		"\3\66\7\66\u0155\n\66\f\66\16\66\u0158\13\66\3\66\3\66\3\66\3\66\3\67"+
		"\3\67\5\67\u0160\n\67\3\67\3\67\4\u0149\u0156\28\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M\2"+
		"O\2Q\2S\2U(W\2Y\2[)]\2_\2a*c\2e+g,i\2k\2m-\3\2\n\4\2C\\c|\3\2\62;\3\2"+
		"\63;\3\2\62\62\4\2GGgg\4\2--//\5\2\13\f\17\17\"\"\3\3\f\f\2\u016c\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2U\3\2\2\2\2[\3\2\2\2\2a\3\2\2\2\2e\3\2\2\2\2g\3"+
		"\2\2\2\2m\3\2\2\2\3o\3\2\2\2\5q\3\2\2\2\7s\3\2\2\2\tw\3\2\2\2\13y\3\2"+
		"\2\2\r{\3\2\2\2\17}\3\2\2\2\21\177\3\2\2\2\23\u0084\3\2\2\2\25\u0086\3"+
		"\2\2\2\27\u008c\3\2\2\2\31\u0092\3\2\2\2\33\u0099\3\2\2\2\35\u009b\3\2"+
		"\2\2\37\u009e\3\2\2\2!\u00a3\3\2\2\2#\u00a9\3\2\2\2%\u00ab\3\2\2\2\'\u00ad"+
		"\3\2\2\2)\u00af\3\2\2\2+\u00b1\3\2\2\2-\u00b3\3\2\2\2/\u00b5\3\2\2\2\61"+
		"\u00b7\3\2\2\2\63\u00b9\3\2\2\2\65\u00bb\3\2\2\2\67\u00bd\3\2\2\29\u00bf"+
		"\3\2\2\2;\u00c2\3\2\2\2=\u00c5\3\2\2\2?\u00c8\3\2\2\2A\u00cb\3\2\2\2C"+
		"\u00ce\3\2\2\2E\u00d1\3\2\2\2G\u00d5\3\2\2\2I\u00dc\3\2\2\2K\u00e1\3\2"+
		"\2\2M\u00e8\3\2\2\2O\u00ea\3\2\2\2Q\u00f5\3\2\2\2S\u00fe\3\2\2\2U\u0105"+
		"\3\2\2\2W\u0107\3\2\2\2Y\u010c\3\2\2\2[\u0110\3\2\2\2]\u0118\3\2\2\2_"+
		"\u011b\3\2\2\2a\u0127\3\2\2\2c\u0129\3\2\2\2e\u0139\3\2\2\2g\u013f\3\2"+
		"\2\2i\u0145\3\2\2\2k\u014f\3\2\2\2m\u015f\3\2\2\2op\7<\2\2p\4\3\2\2\2"+
		"qr\7.\2\2r\6\3\2\2\2st\7f\2\2tu\7g\2\2uv\7h\2\2v\b\3\2\2\2wx\7*\2\2x\n"+
		"\3\2\2\2yz\7+\2\2z\f\3\2\2\2{|\7}\2\2|\16\3\2\2\2}~\7\177\2\2~\20\3\2"+
		"\2\2\177\u0080\7o\2\2\u0080\u0081\7c\2\2\u0081\u0082\7k\2\2\u0082\u0083"+
		"\7p\2\2\u0083\22\3\2\2\2\u0084\u0085\7=\2\2\u0085\24\3\2\2\2\u0086\u0087"+
		"\7r\2\2\u0087\u0088\7t\2\2\u0088\u0089\7k\2\2\u0089\u008a\7p\2\2\u008a"+
		"\u008b\7v\2\2\u008b\26\3\2\2\2\u008c\u008d\7k\2\2\u008d\u008e\7p\2\2\u008e"+
		"\u008f\7r\2\2\u008f\u0090\7w\2\2\u0090\u0091\7v\2\2\u0091\30\3\2\2\2\u0092"+
		"\u0093\7t\2\2\u0093\u0094\7g\2\2\u0094\u0095\7v\2\2\u0095\u0096\7w\2\2"+
		"\u0096\u0097\7t\2\2\u0097\u0098\7p\2\2\u0098\32\3\2\2\2\u0099\u009a\7"+
		"?\2\2\u009a\34\3\2\2\2\u009b\u009c\7k\2\2\u009c\u009d\7h\2\2\u009d\36"+
		"\3\2\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7n\2\2\u00a0\u00a1\7u\2\2\u00a1"+
		"\u00a2\7g\2\2\u00a2 \3\2\2\2\u00a3\u00a4\7y\2\2\u00a4\u00a5\7j\2\2\u00a5"+
		"\u00a6\7k\2\2\u00a6\u00a7\7n\2\2\u00a7\u00a8\7g\2\2\u00a8\"\3\2\2\2\u00a9"+
		"\u00aa\7]\2\2\u00aa$\3\2\2\2\u00ab\u00ac\7_\2\2\u00ac&\3\2\2\2\u00ad\u00ae"+
		"\7\60\2\2\u00ae(\3\2\2\2\u00af\u00b0\7#\2\2\u00b0*\3\2\2\2\u00b1\u00b2"+
		"\7/\2\2\u00b2,\3\2\2\2\u00b3\u00b4\7,\2\2\u00b4.\3\2\2\2\u00b5\u00b6\7"+
		"\61\2\2\u00b6\60\3\2\2\2\u00b7\u00b8\7\'\2\2\u00b8\62\3\2\2\2\u00b9\u00ba"+
		"\7-\2\2\u00ba\64\3\2\2\2\u00bb\u00bc\7>\2\2\u00bc\66\3\2\2\2\u00bd\u00be"+
		"\7@\2\2\u00be8\3\2\2\2\u00bf\u00c0\7>\2\2\u00c0\u00c1\7?\2\2\u00c1:\3"+
		"\2\2\2\u00c2\u00c3\7@\2\2\u00c3\u00c4\7?\2\2\u00c4<\3\2\2\2\u00c5\u00c6"+
		"\7#\2\2\u00c6\u00c7\7?\2\2\u00c7>\3\2\2\2\u00c8\u00c9\7?\2\2\u00c9\u00ca"+
		"\7?\2\2\u00ca@\3\2\2\2\u00cb\u00cc\7(\2\2\u00cc\u00cd\7(\2\2\u00cdB\3"+
		"\2\2\2\u00ce\u00cf\7~\2\2\u00cf\u00d0\7~\2\2\u00d0D\3\2\2\2\u00d1\u00d2"+
		"\7k\2\2\u00d2\u00d3\7p\2\2\u00d3\u00d4\7v\2\2\u00d4F\3\2\2\2\u00d5\u00d6"+
		"\7f\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8\7w\2\2\u00d8\u00d9\7d\2\2\u00d9"+
		"\u00da\7n\2\2\u00da\u00db\7g\2\2\u00dbH\3\2\2\2\u00dc\u00dd\7e\2\2\u00dd"+
		"\u00de\7j\2\2\u00de\u00df\7c\2\2\u00df\u00e0\7t\2\2\u00e0J\3\2\2\2\u00e1"+
		"\u00e2\7u\2\2\u00e2\u00e3\7v\2\2\u00e3\u00e4\7t\2\2\u00e4\u00e5\7w\2\2"+
		"\u00e5\u00e6\7e\2\2\u00e6\u00e7\7v\2\2\u00e7L\3\2\2\2\u00e8\u00e9\7)\2"+
		"\2\u00e9N\3\2\2\2\u00ea\u00eb\5M\'\2\u00eb\u00ec\7^\2\2\u00ec\u00ee\5"+
		"]/\2\u00ed\u00ef\5]/\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1"+
		"\3\2\2\2\u00f0\u00f2\5]/\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3\u00f4\5M\'\2\u00f4P\3\2\2\2\u00f5\u00fa\5M\'\2\u00f6"+
		"\u00f7\7^\2\2\u00f7\u00fb\7v\2\2\u00f8\u00f9\7^\2\2\u00f9\u00fb\7p\2\2"+
		"\u00fa\u00f6\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd"+
		"\5M\'\2\u00fdR\3\2\2\2\u00fe\u00ff\5M\'\2\u00ff\u0100\13\2\2\2\u0100\u0101"+
		"\5M\'\2\u0101T\3\2\2\2\u0102\u0106\5O(\2\u0103\u0106\5Q)\2\u0104\u0106"+
		"\5S*\2\u0105\u0102\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106"+
		"V\3\2\2\2\u0107\u0108\t\2\2\2\u0108X\3\2\2\2\u0109\u010d\5W,\2\u010a\u010d"+
		"\5]/\2\u010b\u010d\7a\2\2\u010c\u0109\3\2\2\2\u010c\u010a\3\2\2\2\u010c"+
		"\u010b\3\2\2\2\u010dZ\3\2\2\2\u010e\u0111\5W,\2\u010f\u0111\7a\2\2\u0110"+
		"\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111\u0115\3\2\2\2\u0112\u0114\5Y"+
		"-\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\\\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0119\t\3\2\2"+
		"\u0119^\3\2\2\2\u011a\u011c\5]/\2\u011b\u011a\3\2\2\2\u011c\u011d\3\2"+
		"\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e`\3\2\2\2\u011f\u0123"+
		"\t\4\2\2\u0120\u0122\5]/\2\u0121\u0120\3\2\2\2\u0122\u0125\3\2\2\2\u0123"+
		"\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0128\3\2\2\2\u0125\u0123\3\2"+
		"\2\2\u0126\u0128\t\5\2\2\u0127\u011f\3\2\2\2\u0127\u0126\3\2\2\2\u0128"+
		"b\3\2\2\2\u0129\u012b\t\6\2\2\u012a\u012c\t\7\2\2\u012b\u012a\3\2\2\2"+
		"\u012b\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\5_\60\2\u012ed\3"+
		"\2\2\2\u012f\u013a\5_\60\2\u0130\u0131\5_\60\2\u0131\u0132\7\60\2\2\u0132"+
		"\u013a\3\2\2\2\u0133\u0134\5_\60\2\u0134\u0135\7\60\2\2\u0135\u0136\5"+
		"_\60\2\u0136\u013a\3\2\2\2\u0137\u0138\7\60\2\2\u0138\u013a\5_\60\2\u0139"+
		"\u012f\3\2\2\2\u0139\u0130\3\2\2\2\u0139\u0133\3\2\2\2\u0139\u0137\3\2"+
		"\2\2\u013a\u013c\3\2\2\2\u013b\u013d\5c\62\2\u013c\u013b\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013df\3\2\2\2\u013e\u0140\t\b\2\2\u013f\u013e\3\2\2\2"+
		"\u0140\u0141\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143"+
		"\3\2\2\2\u0143\u0144\b\64\2\2\u0144h\3\2\2\2\u0145\u0149\7%\2\2\u0146"+
		"\u0148\13\2\2\2\u0147\u0146\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u014a\3"+
		"\2\2\2\u0149\u0147\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014c"+
		"\u014e\t\t\2\2\u014d\u014c\3\2\2\2\u014ej\3\2\2\2\u014f\u0150\7$\2\2\u0150"+
		"\u0151\7$\2\2\u0151\u0152\7$\2\2\u0152\u0156\3\2\2\2\u0153\u0155\13\2"+
		"\2\2\u0154\u0153\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0157\3\2\2\2\u0156"+
		"\u0154\3\2\2\2\u0157\u0159\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015a\7$"+
		"\2\2\u015a\u015b\7$\2\2\u015b\u015c\7$\2\2\u015cl\3\2\2\2\u015d\u0160"+
		"\5i\65\2\u015e\u0160\5k\66\2\u015f\u015d\3\2\2\2\u015f\u015e\3\2\2\2\u0160"+
		"\u0161\3\2\2\2\u0161\u0162\b\67\2\2\u0162n\3\2\2\2\25\2\u00ee\u00f1\u00fa"+
		"\u0105\u010c\u0110\u0115\u011d\u0123\u0127\u012b\u0139\u013c\u0141\u0149"+
		"\u014d\u0156\u015f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}