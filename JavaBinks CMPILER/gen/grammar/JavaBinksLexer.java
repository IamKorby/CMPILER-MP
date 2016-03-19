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
		T__0=1, T__1=2, BREAK=3, CASE=4, DEFAULT=5, DO=6, ELSE=7, ELSEIF=8, FOR=9, 
		IF=10, SWITCH=11, WHILE=12, RETURN=13, BOOLEAN=14, CHAR=15, FLOAT=16, 
		INT=17, STRING=18, VOID=19, VariableFuncName=20, BooleanLiteral=21, CharLiteral=22, 
		FloatLiteral=23, IntegerLiteral=24, StringLiteral=25, NullLiteral=26, 
		Digits=27, Digit=28, NegativeSign=29, ADD=30, SUB=31, MUL=32, DIV=33, 
		MOD=34, INCR=35, DECR=36, NOT=37, AND=38, OR=39, ASSIGN=40, GT=41, LT=42, 
		EQUAL=43, GE=44, LE=45, NOTEQUAL=46, ADD_ASSIGN=47, SUB_ASSIGN=48, MUL_ASSIGN=49, 
		DIV_ASSIGN=50, MOD_ASSIGN=51, LPAREN=52, RPAREN=53, LBRACE=54, RBRACE=55, 
		LBRACK=56, RBRACK=57, SEMI=58, COMMA=59, DOT=60, COMMENT=61, WS=62;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "BREAK", "CASE", "DEFAULT", "DO", "ELSE", "ELSEIF", "FOR", 
		"IF", "SWITCH", "WHILE", "RETURN", "BOOLEAN", "CHAR", "FLOAT", "INT", 
		"STRING", "VOID", "VariableFuncName", "BooleanLiteral", "CharLiteral", 
		"FloatLiteral", "IntegerLiteral", "StringLiteral", "NullLiteral", "Digits", 
		"Digit", "NegativeSign", "BooleanDigit", "BooleanWord", "Letters", "Space", 
		"Letter", "StringCharacters", "ADD", "SUB", "MUL", "DIV", "MOD", "INCR", 
		"DECR", "NOT", "AND", "OR", "ASSIGN", "GT", "LT", "EQUAL", "GE", "LE", 
		"NOTEQUAL", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", 
		"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
		"DOT", "COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'main'", "'fett'", "'clone'", "'kaminoans'", "'iloveyou'", 
		"'storm'", "'stormtrooper'", "'force'", "'trooper'", "'kamino'", "'iknow'", 
		"'jedi'", "'boolean'", "'char'", "'float'", "'int'", "'String'", "'void'", 
		null, null, null, null, null, null, "'null'", null, null, null, "'+'", 
		null, "'*'", "'/'", "'%'", "'++'", "'--'", "'!'", "'&&'", "'||'", "'='", 
		"'>'", "'<'", "'=='", "'>='", "'<='", "'!='", "'+='", "'-='", "'*='", 
		"'/='", "'%='", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", 
		"'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "BREAK", "CASE", "DEFAULT", "DO", "ELSE", "ELSEIF", 
		"FOR", "IF", "SWITCH", "WHILE", "RETURN", "BOOLEAN", "CHAR", "FLOAT", 
		"INT", "STRING", "VOID", "VariableFuncName", "BooleanLiteral", "CharLiteral", 
		"FloatLiteral", "IntegerLiteral", "StringLiteral", "NullLiteral", "Digits", 
		"Digit", "NegativeSign", "ADD", "SUB", "MUL", "DIV", "MOD", "INCR", "DECR", 
		"NOT", "AND", "OR", "ASSIGN", "GT", "LT", "EQUAL", "GE", "LE", "NOTEQUAL", 
		"ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", 
		"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
		"DOT", "COMMENT", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2@\u01c8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\7\25\u0109\n\25\f\25\16\25\u010c"+
		"\13\25\3\26\3\26\5\26\u0110\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\5\27\u011e\n\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\5\30\u012a\n\30\3\31\3\31\3\31\3\31\3\31\5\31\u0131"+
		"\n\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\6\34\u013d\n\34"+
		"\r\34\16\34\u013e\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \5 \u0150\n \3!\6!\u0153\n!\r!\16!\u0154\3\"\3\"\3#\3#\3$\7$\u015c"+
		"\n$\f$\16$\u015f\13$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3+\3+\3"+
		"+\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\63"+
		"\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67"+
		"\38\38\38\39\39\39\3:\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A"+
		"\3B\3B\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\7D\u01b4\nD\fD\16D\u01b7\13D\3D\3"+
		"D\3D\3D\3D\3D\3D\3D\3D\3E\6E\u01c3\nE\rE\16E\u01c4\3E\3E\3\u01b5\2F\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		"\2?\2A\2C\2E\2G\2I K!M\"O#Q$S%U&W\'Y([)]*_+a,c-e.g/i\60k\61m\62o\63q\64"+
		"s\65u\66w\67y8{9}:\177;\u0081<\u0083=\u0085>\u0087?\u0089@\3\2\7\3\2\62"+
		";\3\2\62\63\4\2C\\c|\t\2\";=>@\\^^`ac|~~\5\2\13\f\16\17\"\"\u01cf\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2"+
		"{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\3\u008b\3\2\2\2\5\u008d\3\2\2"+
		"\2\7\u0092\3\2\2\2\t\u0097\3\2\2\2\13\u009d\3\2\2\2\r\u00a7\3\2\2\2\17"+
		"\u00b0\3\2\2\2\21\u00b6\3\2\2\2\23\u00c3\3\2\2\2\25\u00c9\3\2\2\2\27\u00d1"+
		"\3\2\2\2\31\u00d8\3\2\2\2\33\u00de\3\2\2\2\35\u00e3\3\2\2\2\37\u00eb\3"+
		"\2\2\2!\u00f0\3\2\2\2#\u00f6\3\2\2\2%\u00fa\3\2\2\2\'\u0101\3\2\2\2)\u0106"+
		"\3\2\2\2+\u010f\3\2\2\2-\u011d\3\2\2\2/\u0129\3\2\2\2\61\u0130\3\2\2\2"+
		"\63\u0132\3\2\2\2\65\u0136\3\2\2\2\67\u013c\3\2\2\29\u0140\3\2\2\2;\u0142"+
		"\3\2\2\2=\u0144\3\2\2\2?\u014f\3\2\2\2A\u0152\3\2\2\2C\u0156\3\2\2\2E"+
		"\u0158\3\2\2\2G\u015d\3\2\2\2I\u0160\3\2\2\2K\u0162\3\2\2\2M\u0164\3\2"+
		"\2\2O\u0166\3\2\2\2Q\u0168\3\2\2\2S\u016a\3\2\2\2U\u016d\3\2\2\2W\u0170"+
		"\3\2\2\2Y\u0172\3\2\2\2[\u0175\3\2\2\2]\u0178\3\2\2\2_\u017a\3\2\2\2a"+
		"\u017c\3\2\2\2c\u017e\3\2\2\2e\u0181\3\2\2\2g\u0184\3\2\2\2i\u0187\3\2"+
		"\2\2k\u018a\3\2\2\2m\u018d\3\2\2\2o\u0190\3\2\2\2q\u0193\3\2\2\2s\u0196"+
		"\3\2\2\2u\u0199\3\2\2\2w\u019b\3\2\2\2y\u019d\3\2\2\2{\u019f\3\2\2\2}"+
		"\u01a1\3\2\2\2\177\u01a3\3\2\2\2\u0081\u01a5\3\2\2\2\u0083\u01a7\3\2\2"+
		"\2\u0085\u01a9\3\2\2\2\u0087\u01ab\3\2\2\2\u0089\u01c2\3\2\2\2\u008b\u008c"+
		"\7<\2\2\u008c\4\3\2\2\2\u008d\u008e\7o\2\2\u008e\u008f\7c\2\2\u008f\u0090"+
		"\7k\2\2\u0090\u0091\7p\2\2\u0091\6\3\2\2\2\u0092\u0093\7h\2\2\u0093\u0094"+
		"\7g\2\2\u0094\u0095\7v\2\2\u0095\u0096\7v\2\2\u0096\b\3\2\2\2\u0097\u0098"+
		"\7e\2\2\u0098\u0099\7n\2\2\u0099\u009a\7q\2\2\u009a\u009b\7p\2\2\u009b"+
		"\u009c\7g\2\2\u009c\n\3\2\2\2\u009d\u009e\7m\2\2\u009e\u009f\7c\2\2\u009f"+
		"\u00a0\7o\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3\7q\2\2"+
		"\u00a3\u00a4\7c\2\2\u00a4\u00a5\7p\2\2\u00a5\u00a6\7u\2\2\u00a6\f\3\2"+
		"\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7n\2\2\u00a9\u00aa\7q\2\2\u00aa\u00ab"+
		"\7x\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7{\2\2\u00ad\u00ae\7q\2\2\u00ae"+
		"\u00af\7w\2\2\u00af\16\3\2\2\2\u00b0\u00b1\7u\2\2\u00b1\u00b2\7v\2\2\u00b2"+
		"\u00b3\7q\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b5\7o\2\2\u00b5\20\3\2\2\2\u00b6"+
		"\u00b7\7u\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7t\2\2"+
		"\u00ba\u00bb\7o\2\2\u00bb\u00bc\7v\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be"+
		"\7q\2\2\u00be\u00bf\7q\2\2\u00bf\u00c0\7r\2\2\u00c0\u00c1\7g\2\2\u00c1"+
		"\u00c2\7t\2\2\u00c2\22\3\2\2\2\u00c3\u00c4\7h\2\2\u00c4\u00c5\7q\2\2\u00c5"+
		"\u00c6\7t\2\2\u00c6\u00c7\7e\2\2\u00c7\u00c8\7g\2\2\u00c8\24\3\2\2\2\u00c9"+
		"\u00ca\7v\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cc\7q\2\2\u00cc\u00cd\7q\2\2"+
		"\u00cd\u00ce\7r\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7t\2\2\u00d0\26\3\2"+
		"\2\2\u00d1\u00d2\7m\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7o\2\2\u00d4\u00d5"+
		"\7k\2\2\u00d5\u00d6\7p\2\2\u00d6\u00d7\7q\2\2\u00d7\30\3\2\2\2\u00d8\u00d9"+
		"\7k\2\2\u00d9\u00da\7m\2\2\u00da\u00db\7p\2\2\u00db\u00dc\7q\2\2\u00dc"+
		"\u00dd\7y\2\2\u00dd\32\3\2\2\2\u00de\u00df\7l\2\2\u00df\u00e0\7g\2\2\u00e0"+
		"\u00e1\7f\2\2\u00e1\u00e2\7k\2\2\u00e2\34\3\2\2\2\u00e3\u00e4\7d\2\2\u00e4"+
		"\u00e5\7q\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7\7n\2\2\u00e7\u00e8\7g\2\2"+
		"\u00e8\u00e9\7c\2\2\u00e9\u00ea\7p\2\2\u00ea\36\3\2\2\2\u00eb\u00ec\7"+
		"e\2\2\u00ec\u00ed\7j\2\2\u00ed\u00ee\7c\2\2\u00ee\u00ef\7t\2\2\u00ef "+
		"\3\2\2\2\u00f0\u00f1\7h\2\2\u00f1\u00f2\7n\2\2\u00f2\u00f3\7q\2\2\u00f3"+
		"\u00f4\7c\2\2\u00f4\u00f5\7v\2\2\u00f5\"\3\2\2\2\u00f6\u00f7\7k\2\2\u00f7"+
		"\u00f8\7p\2\2\u00f8\u00f9\7v\2\2\u00f9$\3\2\2\2\u00fa\u00fb\7U\2\2\u00fb"+
		"\u00fc\7v\2\2\u00fc\u00fd\7t\2\2\u00fd\u00fe\7k\2\2\u00fe\u00ff\7p\2\2"+
		"\u00ff\u0100\7i\2\2\u0100&\3\2\2\2\u0101\u0102\7x\2\2\u0102\u0103\7q\2"+
		"\2\u0103\u0104\7k\2\2\u0104\u0105\7f\2\2\u0105(\3\2\2\2\u0106\u010a\5"+
		"A!\2\u0107\u0109\59\35\2\u0108\u0107\3\2\2\2\u0109\u010c\3\2\2\2\u010a"+
		"\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b*\3\2\2\2\u010c\u010a\3\2\2\2"+
		"\u010d\u0110\5=\37\2\u010e\u0110\5? \2\u010f\u010d\3\2\2\2\u010f\u010e"+
		"\3\2\2\2\u0110,\3\2\2\2\u0111\u0112\7)\2\2\u0112\u0113\5E#\2\u0113\u0114"+
		"\7)\2\2\u0114\u011e\3\2\2\2\u0115\u0116\7)\2\2\u0116\u0117\5C\"\2\u0117"+
		"\u0118\7)\2\2\u0118\u011e\3\2\2\2\u0119\u011a\7)\2\2\u011a\u011b\59\35"+
		"\2\u011b\u011c\7)\2\2\u011c\u011e\3\2\2\2\u011d\u0111\3\2\2\2\u011d\u0115"+
		"\3\2\2\2\u011d\u0119\3\2\2\2\u011e.\3\2\2\2\u011f\u0120\5;\36\2\u0120"+
		"\u0121\5\67\34\2\u0121\u0122\7\60\2\2\u0122\u0123\5\67\34\2\u0123\u012a"+
		"\3\2\2\2\u0124\u0125\5\67\34\2\u0125\u0126\7\60\2\2\u0126\u0127\5\67\34"+
		"\2\u0127\u012a\3\2\2\2\u0128\u012a\5\61\31\2\u0129\u011f\3\2\2\2\u0129"+
		"\u0124\3\2\2\2\u0129\u0128\3\2\2\2\u012a\60\3\2\2\2\u012b\u0131\59\35"+
		"\2\u012c\u0131\5\67\34\2\u012d\u012e\5;\36\2\u012e\u012f\5\67\34\2\u012f"+
		"\u0131\3\2\2\2\u0130\u012b\3\2\2\2\u0130\u012c\3\2\2\2\u0130\u012d\3\2"+
		"\2\2\u0131\62\3\2\2\2\u0132\u0133\7$\2\2\u0133\u0134\5G$\2\u0134\u0135"+
		"\7$\2\2\u0135\64\3\2\2\2\u0136\u0137\7p\2\2\u0137\u0138\7w\2\2\u0138\u0139"+
		"\7n\2\2\u0139\u013a\7n\2\2\u013a\66\3\2\2\2\u013b\u013d\t\2\2\2\u013c"+
		"\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2"+
		"\2\2\u013f8\3\2\2\2\u0140\u0141\t\2\2\2\u0141:\3\2\2\2\u0142\u0143\7/"+
		"\2\2\u0143<\3\2\2\2\u0144\u0145\t\3\2\2\u0145>\3\2\2\2\u0146\u0147\7v"+
		"\2\2\u0147\u0148\7t\2\2\u0148\u0149\7w\2\2\u0149\u0150\7g\2\2\u014a\u014b"+
		"\7h\2\2\u014b\u014c\7c\2\2\u014c\u014d\7n\2\2\u014d\u014e\7u\2\2\u014e"+
		"\u0150\7g\2\2\u014f\u0146\3\2\2\2\u014f\u014a\3\2\2\2\u0150@\3\2\2\2\u0151"+
		"\u0153\5E#\2\u0152\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0152\3\2\2"+
		"\2\u0154\u0155\3\2\2\2\u0155B\3\2\2\2\u0156\u0157\7\"\2\2\u0157D\3\2\2"+
		"\2\u0158\u0159\t\4\2\2\u0159F\3\2\2\2\u015a\u015c\t\5\2\2\u015b\u015a"+
		"\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e"+
		"H\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0161\7-\2\2\u0161J\3\2\2\2\u0162"+
		"\u0163\7/\2\2\u0163L\3\2\2\2\u0164\u0165\7,\2\2\u0165N\3\2\2\2\u0166\u0167"+
		"\7\61\2\2\u0167P\3\2\2\2\u0168\u0169\7\'\2\2\u0169R\3\2\2\2\u016a\u016b"+
		"\7-\2\2\u016b\u016c\7-\2\2\u016cT\3\2\2\2\u016d\u016e\7/\2\2\u016e\u016f"+
		"\7/\2\2\u016fV\3\2\2\2\u0170\u0171\7#\2\2\u0171X\3\2\2\2\u0172\u0173\7"+
		"(\2\2\u0173\u0174\7(\2\2\u0174Z\3\2\2\2\u0175\u0176\7~\2\2\u0176\u0177"+
		"\7~\2\2\u0177\\\3\2\2\2\u0178\u0179\7?\2\2\u0179^\3\2\2\2\u017a\u017b"+
		"\7@\2\2\u017b`\3\2\2\2\u017c\u017d\7>\2\2\u017db\3\2\2\2\u017e\u017f\7"+
		"?\2\2\u017f\u0180\7?\2\2\u0180d\3\2\2\2\u0181\u0182\7@\2\2\u0182\u0183"+
		"\7?\2\2\u0183f\3\2\2\2\u0184\u0185\7>\2\2\u0185\u0186\7?\2\2\u0186h\3"+
		"\2\2\2\u0187\u0188\7#\2\2\u0188\u0189\7?\2\2\u0189j\3\2\2\2\u018a\u018b"+
		"\7-\2\2\u018b\u018c\7?\2\2\u018cl\3\2\2\2\u018d\u018e\7/\2\2\u018e\u018f"+
		"\7?\2\2\u018fn\3\2\2\2\u0190\u0191\7,\2\2\u0191\u0192\7?\2\2\u0192p\3"+
		"\2\2\2\u0193\u0194\7\61\2\2\u0194\u0195\7?\2\2\u0195r\3\2\2\2\u0196\u0197"+
		"\7\'\2\2\u0197\u0198\7?\2\2\u0198t\3\2\2\2\u0199\u019a\7*\2\2\u019av\3"+
		"\2\2\2\u019b\u019c\7+\2\2\u019cx\3\2\2\2\u019d\u019e\7}\2\2\u019ez\3\2"+
		"\2\2\u019f\u01a0\7\177\2\2\u01a0|\3\2\2\2\u01a1\u01a2\7]\2\2\u01a2~\3"+
		"\2\2\2\u01a3\u01a4\7_\2\2\u01a4\u0080\3\2\2\2\u01a5\u01a6\7=\2\2\u01a6"+
		"\u0082\3\2\2\2\u01a7\u01a8\7.\2\2\u01a8\u0084\3\2\2\2\u01a9\u01aa\7\60"+
		"\2\2\u01aa\u0086\3\2\2\2\u01ab\u01ac\7o\2\2\u01ac\u01ad\7g\2\2\u01ad\u01ae"+
		"\7g\2\2\u01ae\u01af\7u\2\2\u01af\u01b0\7c\2\2\u01b0\u01b1\7\"\2\2\u01b1"+
		"\u01b5\3\2\2\2\u01b2\u01b4\13\2\2\2\u01b3\u01b2\3\2\2\2\u01b4\u01b7\3"+
		"\2\2\2\u01b5\u01b6\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01b8\3\2\2\2\u01b7"+
		"\u01b5\3\2\2\2\u01b8\u01b9\7\"\2\2\u01b9\u01ba\7{\2\2\u01ba\u01bb\7q\2"+
		"\2\u01bb\u01bc\7w\2\2\u01bc\u01bd\7u\2\2\u01bd\u01be\7c\2\2\u01be\u01bf"+
		"\3\2\2\2\u01bf\u01c0\bD\2\2\u01c0\u0088\3\2\2\2\u01c1\u01c3\t\6\2\2\u01c2"+
		"\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2"+
		"\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\bE\2\2\u01c7\u008a\3\2\2\2\16\2\u010a"+
		"\u010f\u011d\u0129\u0130\u013e\u014f\u0154\u015d\u01b5\u01c4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}