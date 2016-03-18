// Generated from /Users/hannah/Documents/IntelliJ Path/JavaBinks CMPILER/src/grammar/JavaBinks.g4 by ANTLR 4.5.1
package grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaBinksLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BREAK=1, CASE=2, DEFAULT=3, DO=4, ELSE=5, FOR=6, IF=7, SWITCH=8, WHILE=9, 
		RETURN=10, BOOLEAN=11, CHAR=12, FLOAT=13, INT=14, STRING=15, VOID=16, 
		BooleanLiteral=17, CharLiteral=18, FloatLiteral=19, IntegerLiteral=20, 
		StringLiteral=21, NullLiteral=22, ADD=23, SUB=24, MUL=25, DIV=26, MOD=27, 
		INCR=28, DECR=29, NOT=30, AND=31, OR=32, ASSIGN=33, GT=34, LT=35, EQUAL=36, 
		GE=37, LE=38, NOTEQUAL=39, ADD_ASSIGN=40, SUB_ASSIGN=41, MUL_ASSIGN=42, 
		DIV_ASSIGN=43, MOD_ASSIGN=44, LPAREN=45, RPAREN=46, LBRACE=47, RBRACE=48, 
		LBRACK=49, RBRACK=50, SEMI=51, COMMA=52, DOT=53, COMMENT=54, WS=55;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BREAK", "CASE", "DEFAULT", "DO", "ELSE", "FOR", "IF", "SWITCH", "WHILE", 
		"RETURN", "BOOLEAN", "CHAR", "FLOAT", "INT", "STRING", "VOID", "BooleanLiteral", 
		"CharLiteral", "FloatLiteral", "IntegerLiteral", "StringLiteral", "NullLiteral", 
		"Digits", "Digit", "NegativeSign", "BooleanDigit", "BooleanWord", "Letters", 
		"Space", "Letter", "StringCharacters", "ADD", "SUB", "MUL", "DIV", "MOD", 
		"INCR", "DECR", "NOT", "AND", "OR", "ASSIGN", "GT", "LT", "EQUAL", "GE", 
		"LE", "NOTEQUAL", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
		"MOD_ASSIGN", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
		"SEMI", "COMMA", "DOT", "COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'fett'", "'clone'", "'kaminoans'", "'iloveyou'", "'storm'", "'force'", 
		"'trooper'", "'kamino'", "'iknow'", "'jedi'", "'boolean'", "'char'", "'float'", 
		"'int'", "'String'", "'void'", null, null, null, null, null, "'null'", 
		"'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", "'!'", "'&&'", "'||'", 
		"'='", "'>'", "'<'", "'=='", "'>='", "'<='", "'!='", "'+='", "'-='", "'*='", 
		"'/='", "'%='", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", 
		"'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BREAK", "CASE", "DEFAULT", "DO", "ELSE", "FOR", "IF", "SWITCH", 
		"WHILE", "RETURN", "BOOLEAN", "CHAR", "FLOAT", "INT", "STRING", "VOID", 
		"BooleanLiteral", "CharLiteral", "FloatLiteral", "IntegerLiteral", "StringLiteral", 
		"NullLiteral", "ADD", "SUB", "MUL", "DIV", "MOD", "INCR", "DECR", "NOT", 
		"AND", "OR", "ASSIGN", "GT", "LT", "EQUAL", "GE", "LE", "NOTEQUAL", "ADD_ASSIGN", 
		"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "LPAREN", "RPAREN", 
		"LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "COMMENT", 
		"WS"
	};
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


	public JavaBinksLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JavaBinks.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\29\u01a1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\5\22\u00ed\n\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00f7\n\23\3\24\5\24\u00fa"+
		"\n\24\3\24\3\24\3\24\5\24\u00ff\n\24\3\24\3\24\5\24\u0103\n\24\5\24\u0105"+
		"\n\24\3\25\5\25\u0108\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\6\30\u0116\n\30\r\30\16\30\u0117\3\31\3\31\3\32\3\32\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0129\n\34"+
		"\3\35\6\35\u012c\n\35\r\35\16\35\u012d\3\36\3\36\3\37\3\37\3 \7 \u0135"+
		"\n \f \16 \u0138\13 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3\'\3\'"+
		"\3\'\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3.\3/\3/\3/\3\60"+
		"\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64"+
		"\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3"+
		"<\3=\3=\3>\3>\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\7@\u018d\n@\f@\16@\u0190\13"+
		"@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3A\6A\u019c\nA\rA\16A\u019d\3A\3A\3\u018e"+
		"\2B\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\2\61\2\63\2\65\2\67\29\2;\2=\2"+
		"?\2A\31C\32E\33G\34I\35K\36M\37O Q!S\"U#W$Y%[&]\'_(a)c*e+g,i-k.m/o\60"+
		"q\61s\62u\63w\64y\65{\66}\67\1778\u00819\3\2\7\3\2\62;\3\2\62\63\4\2C"+
		"\\c|\t\2\";=>@\\^^`ac|~~\5\2\13\f\16\17\"\"\u01a4\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2"+
		"\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2"+
		"y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\3\u0083"+
		"\3\2\2\2\5\u0088\3\2\2\2\7\u008e\3\2\2\2\t\u0098\3\2\2\2\13\u00a1\3\2"+
		"\2\2\r\u00a7\3\2\2\2\17\u00ad\3\2\2\2\21\u00b5\3\2\2\2\23\u00bc\3\2\2"+
		"\2\25\u00c2\3\2\2\2\27\u00c7\3\2\2\2\31\u00cf\3\2\2\2\33\u00d4\3\2\2\2"+
		"\35\u00da\3\2\2\2\37\u00de\3\2\2\2!\u00e5\3\2\2\2#\u00ec\3\2\2\2%\u00f6"+
		"\3\2\2\2\'\u0104\3\2\2\2)\u0107\3\2\2\2+\u010b\3\2\2\2-\u010f\3\2\2\2"+
		"/\u0115\3\2\2\2\61\u0119\3\2\2\2\63\u011b\3\2\2\2\65\u011d\3\2\2\2\67"+
		"\u0128\3\2\2\29\u012b\3\2\2\2;\u012f\3\2\2\2=\u0131\3\2\2\2?\u0136\3\2"+
		"\2\2A\u0139\3\2\2\2C\u013b\3\2\2\2E\u013d\3\2\2\2G\u013f\3\2\2\2I\u0141"+
		"\3\2\2\2K\u0143\3\2\2\2M\u0146\3\2\2\2O\u0149\3\2\2\2Q\u014b\3\2\2\2S"+
		"\u014e\3\2\2\2U\u0151\3\2\2\2W\u0153\3\2\2\2Y\u0155\3\2\2\2[\u0157\3\2"+
		"\2\2]\u015a\3\2\2\2_\u015d\3\2\2\2a\u0160\3\2\2\2c\u0163\3\2\2\2e\u0166"+
		"\3\2\2\2g\u0169\3\2\2\2i\u016c\3\2\2\2k\u016f\3\2\2\2m\u0172\3\2\2\2o"+
		"\u0174\3\2\2\2q\u0176\3\2\2\2s\u0178\3\2\2\2u\u017a\3\2\2\2w\u017c\3\2"+
		"\2\2y\u017e\3\2\2\2{\u0180\3\2\2\2}\u0182\3\2\2\2\177\u0184\3\2\2\2\u0081"+
		"\u019b\3\2\2\2\u0083\u0084\7h\2\2\u0084\u0085\7g\2\2\u0085\u0086\7v\2"+
		"\2\u0086\u0087\7v\2\2\u0087\4\3\2\2\2\u0088\u0089\7e\2\2\u0089\u008a\7"+
		"n\2\2\u008a\u008b\7q\2\2\u008b\u008c\7p\2\2\u008c\u008d\7g\2\2\u008d\6"+
		"\3\2\2\2\u008e\u008f\7m\2\2\u008f\u0090\7c\2\2\u0090\u0091\7o\2\2\u0091"+
		"\u0092\7k\2\2\u0092\u0093\7p\2\2\u0093\u0094\7q\2\2\u0094\u0095\7c\2\2"+
		"\u0095\u0096\7p\2\2\u0096\u0097\7u\2\2\u0097\b\3\2\2\2\u0098\u0099\7k"+
		"\2\2\u0099\u009a\7n\2\2\u009a\u009b\7q\2\2\u009b\u009c\7x\2\2\u009c\u009d"+
		"\7g\2\2\u009d\u009e\7{\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7w\2\2\u00a0"+
		"\n\3\2\2\2\u00a1\u00a2\7u\2\2\u00a2\u00a3\7v\2\2\u00a3\u00a4\7q\2\2\u00a4"+
		"\u00a5\7t\2\2\u00a5\u00a6\7o\2\2\u00a6\f\3\2\2\2\u00a7\u00a8\7h\2\2\u00a8"+
		"\u00a9\7q\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7e\2\2\u00ab\u00ac\7g\2\2"+
		"\u00ac\16\3\2\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af\7t\2\2\u00af\u00b0\7"+
		"q\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2\7r\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4"+
		"\7t\2\2\u00b4\20\3\2\2\2\u00b5\u00b6\7m\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8"+
		"\7o\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7p\2\2\u00ba\u00bb\7q\2\2\u00bb"+
		"\22\3\2\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be\7m\2\2\u00be\u00bf\7p\2\2\u00bf"+
		"\u00c0\7q\2\2\u00c0\u00c1\7y\2\2\u00c1\24\3\2\2\2\u00c2\u00c3\7l\2\2\u00c3"+
		"\u00c4\7g\2\2\u00c4\u00c5\7f\2\2\u00c5\u00c6\7k\2\2\u00c6\26\3\2\2\2\u00c7"+
		"\u00c8\7d\2\2\u00c8\u00c9\7q\2\2\u00c9\u00ca\7q\2\2\u00ca\u00cb\7n\2\2"+
		"\u00cb\u00cc\7g\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7p\2\2\u00ce\30\3\2"+
		"\2\2\u00cf\u00d0\7e\2\2\u00d0\u00d1\7j\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3"+
		"\7t\2\2\u00d3\32\3\2\2\2\u00d4\u00d5\7h\2\2\u00d5\u00d6\7n\2\2\u00d6\u00d7"+
		"\7q\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9\7v\2\2\u00d9\34\3\2\2\2\u00da\u00db"+
		"\7k\2\2\u00db\u00dc\7p\2\2\u00dc\u00dd\7v\2\2\u00dd\36\3\2\2\2\u00de\u00df"+
		"\7U\2\2\u00df\u00e0\7v\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2\7k\2\2\u00e2"+
		"\u00e3\7p\2\2\u00e3\u00e4\7i\2\2\u00e4 \3\2\2\2\u00e5\u00e6\7x\2\2\u00e6"+
		"\u00e7\7q\2\2\u00e7\u00e8\7k\2\2\u00e8\u00e9\7f\2\2\u00e9\"\3\2\2\2\u00ea"+
		"\u00ed\5\65\33\2\u00eb\u00ed\5\67\34\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb"+
		"\3\2\2\2\u00ed$\3\2\2\2\u00ee\u00ef\7)\2\2\u00ef\u00f0\5=\37\2\u00f0\u00f1"+
		"\7)\2\2\u00f1\u00f7\3\2\2\2\u00f2\u00f3\7)\2\2\u00f3\u00f4\5;\36\2\u00f4"+
		"\u00f5\7)\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00ee\3\2\2\2\u00f6\u00f2\3\2"+
		"\2\2\u00f7&\3\2\2\2\u00f8\u00fa\5\63\32\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa"+
		"\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\5/\30\2\u00fc\u00fe\7\60\2\2"+
		"\u00fd\u00ff\5/\30\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0105"+
		"\3\2\2\2\u0100\u0102\7\60\2\2\u0101\u0103\5/\30\2\u0102\u0101\3\2\2\2"+
		"\u0102\u0103\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u00f9\3\2\2\2\u0104\u0100"+
		"\3\2\2\2\u0105(\3\2\2\2\u0106\u0108\5\63\32\2\u0107\u0106\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\5/\30\2\u010a*\3\2\2\2"+
		"\u010b\u010c\7$\2\2\u010c\u010d\5? \2\u010d\u010e\7$\2\2\u010e,\3\2\2"+
		"\2\u010f\u0110\7p\2\2\u0110\u0111\7w\2\2\u0111\u0112\7n\2\2\u0112\u0113"+
		"\7n\2\2\u0113.\3\2\2\2\u0114\u0116\5\61\31\2\u0115\u0114\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\60\3\2\2"+
		"\2\u0119\u011a\t\2\2\2\u011a\62\3\2\2\2\u011b\u011c\7/\2\2\u011c\64\3"+
		"\2\2\2\u011d\u011e\t\3\2\2\u011e\66\3\2\2\2\u011f\u0120\7v\2\2\u0120\u0121"+
		"\7t\2\2\u0121\u0122\7w\2\2\u0122\u0129\7g\2\2\u0123\u0124\7h\2\2\u0124"+
		"\u0125\7c\2\2\u0125\u0126\7n\2\2\u0126\u0127\7u\2\2\u0127\u0129\7g\2\2"+
		"\u0128\u011f\3\2\2\2\u0128\u0123\3\2\2\2\u01298\3\2\2\2\u012a\u012c\5"+
		"=\37\2\u012b\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012b\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012e:\3\2\2\2\u012f\u0130\7\"\2\2\u0130<\3\2\2\2\u0131"+
		"\u0132\t\4\2\2\u0132>\3\2\2\2\u0133\u0135\t\5\2\2\u0134\u0133\3\2\2\2"+
		"\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137@\3"+
		"\2\2\2\u0138\u0136\3\2\2\2\u0139\u013a\7-\2\2\u013aB\3\2\2\2\u013b\u013c"+
		"\7/\2\2\u013cD\3\2\2\2\u013d\u013e\7,\2\2\u013eF\3\2\2\2\u013f\u0140\7"+
		"\61\2\2\u0140H\3\2\2\2\u0141\u0142\7\'\2\2\u0142J\3\2\2\2\u0143\u0144"+
		"\7-\2\2\u0144\u0145\7-\2\2\u0145L\3\2\2\2\u0146\u0147\7/\2\2\u0147\u0148"+
		"\7/\2\2\u0148N\3\2\2\2\u0149\u014a\7#\2\2\u014aP\3\2\2\2\u014b\u014c\7"+
		"(\2\2\u014c\u014d\7(\2\2\u014dR\3\2\2\2\u014e\u014f\7~\2\2\u014f\u0150"+
		"\7~\2\2\u0150T\3\2\2\2\u0151\u0152\7?\2\2\u0152V\3\2\2\2\u0153\u0154\7"+
		"@\2\2\u0154X\3\2\2\2\u0155\u0156\7>\2\2\u0156Z\3\2\2\2\u0157\u0158\7?"+
		"\2\2\u0158\u0159\7?\2\2\u0159\\\3\2\2\2\u015a\u015b\7@\2\2\u015b\u015c"+
		"\7?\2\2\u015c^\3\2\2\2\u015d\u015e\7>\2\2\u015e\u015f\7?\2\2\u015f`\3"+
		"\2\2\2\u0160\u0161\7#\2\2\u0161\u0162\7?\2\2\u0162b\3\2\2\2\u0163\u0164"+
		"\7-\2\2\u0164\u0165\7?\2\2\u0165d\3\2\2\2\u0166\u0167\7/\2\2\u0167\u0168"+
		"\7?\2\2\u0168f\3\2\2\2\u0169\u016a\7,\2\2\u016a\u016b\7?\2\2\u016bh\3"+
		"\2\2\2\u016c\u016d\7\61\2\2\u016d\u016e\7?\2\2\u016ej\3\2\2\2\u016f\u0170"+
		"\7\'\2\2\u0170\u0171\7?\2\2\u0171l\3\2\2\2\u0172\u0173\7*\2\2\u0173n\3"+
		"\2\2\2\u0174\u0175\7+\2\2\u0175p\3\2\2\2\u0176\u0177\7}\2\2\u0177r\3\2"+
		"\2\2\u0178\u0179\7\177\2\2\u0179t\3\2\2\2\u017a\u017b\7]\2\2\u017bv\3"+
		"\2\2\2\u017c\u017d\7_\2\2\u017dx\3\2\2\2\u017e\u017f\7=\2\2\u017fz\3\2"+
		"\2\2\u0180\u0181\7.\2\2\u0181|\3\2\2\2\u0182\u0183\7\60\2\2\u0183~\3\2"+
		"\2\2\u0184\u0185\7o\2\2\u0185\u0186\7g\2\2\u0186\u0187\7g\2\2\u0187\u0188"+
		"\7u\2\2\u0188\u0189\7c\2\2\u0189\u018a\7\"\2\2\u018a\u018e\3\2\2\2\u018b"+
		"\u018d\13\2\2\2\u018c\u018b\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018f\3"+
		"\2\2\2\u018e\u018c\3\2\2\2\u018f\u0191\3\2\2\2\u0190\u018e\3\2\2\2\u0191"+
		"\u0192\7\"\2\2\u0192\u0193\7{\2\2\u0193\u0194\7q\2\2\u0194\u0195\7w\2"+
		"\2\u0195\u0196\7u\2\2\u0196\u0197\7c\2\2\u0197\u0198\3\2\2\2\u0198\u0199"+
		"\b@\2\2\u0199\u0080\3\2\2\2\u019a\u019c\t\6\2\2\u019b\u019a\3\2\2\2\u019c"+
		"\u019d\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\3\2"+
		"\2\2\u019f\u01a0\bA\2\2\u01a0\u0082\3\2\2\2\20\2\u00ec\u00f6\u00f9\u00fe"+
		"\u0102\u0104\u0107\u0117\u0128\u012d\u0136\u018e\u019d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}