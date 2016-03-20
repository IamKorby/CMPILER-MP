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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, BREAK=7, CASE=8, DEFAULT=9, 
		DO=10, ELSE=11, ELSEIF=12, FOR=13, IF=14, SWITCH=15, WHILE=16, RETURN=17, 
		BOOLEAN=18, CHAR=19, FLOAT=20, INT=21, STRING=22, VOID=23, VariableFuncName=24, 
		CharLiteral=25, FloatLiteral=26, IntegerLiteral=27, NegativeIntegerLiteral=28, 
		PositiveIntegerLiteral=29, StringLiteral=30, NullLiteral=31, Digits=32, 
		Digit=33, ADD=34, SUB=35, MUL=36, DIV=37, MOD=38, INCR=39, DECR=40, NOT=41, 
		AND=42, OR=43, ASSIGN=44, GT=45, LT=46, EQUAL=47, GE=48, LE=49, NOTEQUAL=50, 
		ADD_ASSIGN=51, SUB_ASSIGN=52, MUL_ASSIGN=53, DIV_ASSIGN=54, MOD_ASSIGN=55, 
		LPAREN=56, RPAREN=57, LBRACE=58, RBRACE=59, LBRACK=60, RBRACK=61, SEMI=62, 
		COMMA=63, DOT=64, WS=65;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "BREAK", "CASE", "DEFAULT", 
		"DO", "ELSE", "ELSEIF", "FOR", "IF", "SWITCH", "WHILE", "RETURN", "BOOLEAN", 
		"CHAR", "FLOAT", "INT", "STRING", "VOID", "VariableFuncName", "CharLiteral", 
		"FloatLiteral", "IntegerLiteral", "NegativeIntegerLiteral", "PositiveIntegerLiteral", 
		"StringLiteral", "NullLiteral", "Digits", "Digit", "NegativeSign", "Letters", 
		"Space", "Letter", "StringCharacters", "ADD", "SUB", "MUL", "DIV", "MOD", 
		"INCR", "DECR", "NOT", "AND", "OR", "ASSIGN", "GT", "LT", "EQUAL", "GE", 
		"LE", "NOTEQUAL", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
		"MOD_ASSIGN", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
		"SEMI", "COMMA", "DOT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'main'", "'true'", "'false'", "'meesa '", "' yousa'", "'fett'", 
		"'clone'", "'kaminoans'", "'iloveyou'", "'storm'", "'stormtrooper'", "'force'", 
		"'trooper'", "'kamino'", "'iknow'", "'jedi'", "'boolean'", "'char'", "'float'", 
		"'int'", "'String'", "'void'", null, null, null, null, null, null, null, 
		"'null'", null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", 
		"'!'", "'&&'", "'||'", "'='", "'>'", "'<'", "'=='", "'>='", "'<='", "'!='", 
		"'+='", "'-='", "'*='", "'/='", "'%='", "'('", "')'", "'{'", "'}'", "'['", 
		"']'", "';'", "','", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "BREAK", "CASE", "DEFAULT", 
		"DO", "ELSE", "ELSEIF", "FOR", "IF", "SWITCH", "WHILE", "RETURN", "BOOLEAN", 
		"CHAR", "FLOAT", "INT", "STRING", "VOID", "VariableFuncName", "CharLiteral", 
		"FloatLiteral", "IntegerLiteral", "NegativeIntegerLiteral", "PositiveIntegerLiteral", 
		"StringLiteral", "NullLiteral", "Digits", "Digit", "ADD", "SUB", "MUL", 
		"DIV", "MOD", "INCR", "DECR", "NOT", "AND", "OR", "ASSIGN", "GT", "LT", 
		"EQUAL", "GE", "LE", "NOTEQUAL", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", 
		"DIV_ASSIGN", "MOD_ASSIGN", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", 
		"RBRACK", "SEMI", "COMMA", "DOT", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2C\u01bd\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\5\31\u0126\n\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0134\n\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u013f\n\33\3\34\3\34\3\35\3\35"+
		"\3\35\3\36\5\36\u0147\n\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3!\6!\u0155\n!\r!\16!\u0156\3\"\3\"\3#\3#\3$\6$\u015e\n$\r$\16$\u015f"+
		"\3%\3%\3&\3&\3\'\7\'\u0167\n\'\f\'\16\'\u016a\13\'\3(\3(\3)\3)\3*\3*\3"+
		"+\3+\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62"+
		"\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67"+
		"\38\38\38\39\39\39\3:\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3=\3>\3>\3?\3?\3@"+
		"\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\6G\u01b8\nG\rG\16G\u01b9\3"+
		"G\3G\2\2H\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E\2G\2I\2K\2M\2O$Q%S&U\'W(Y)[*]+_,a-c.e/g\60i\61k"+
		"\62m\63o\64q\65s\66u\67w8y9{:};\177<\u0081=\u0083>\u0085?\u0087@\u0089"+
		"A\u008bB\u008dC\3\2\6\3\2\62;\4\2C\\c|\t\2\";=>@\\^^`ac|~~\5\2\13\f\16"+
		"\17\"\"\u01c0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2O\3\2\2"+
		"\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2"+
		"]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3"+
		"\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2"+
		"\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3"+
		"\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2"+
		"\2\u008b\3\2\2\2\2\u008d\3\2\2\2\3\u008f\3\2\2\2\5\u0091\3\2\2\2\7\u0096"+
		"\3\2\2\2\t\u009b\3\2\2\2\13\u00a1\3\2\2\2\r\u00a8\3\2\2\2\17\u00af\3\2"+
		"\2\2\21\u00b4\3\2\2\2\23\u00ba\3\2\2\2\25\u00c4\3\2\2\2\27\u00cd\3\2\2"+
		"\2\31\u00d3\3\2\2\2\33\u00e0\3\2\2\2\35\u00e6\3\2\2\2\37\u00ee\3\2\2\2"+
		"!\u00f5\3\2\2\2#\u00fb\3\2\2\2%\u0100\3\2\2\2\'\u0108\3\2\2\2)\u010d\3"+
		"\2\2\2+\u0113\3\2\2\2-\u0117\3\2\2\2/\u011e\3\2\2\2\61\u0123\3\2\2\2\63"+
		"\u0133\3\2\2\2\65\u013e\3\2\2\2\67\u0140\3\2\2\29\u0142\3\2\2\2;\u0146"+
		"\3\2\2\2=\u014a\3\2\2\2?\u014e\3\2\2\2A\u0154\3\2\2\2C\u0158\3\2\2\2E"+
		"\u015a\3\2\2\2G\u015d\3\2\2\2I\u0161\3\2\2\2K\u0163\3\2\2\2M\u0168\3\2"+
		"\2\2O\u016b\3\2\2\2Q\u016d\3\2\2\2S\u016f\3\2\2\2U\u0171\3\2\2\2W\u0173"+
		"\3\2\2\2Y\u0175\3\2\2\2[\u0178\3\2\2\2]\u017b\3\2\2\2_\u017d\3\2\2\2a"+
		"\u0180\3\2\2\2c\u0183\3\2\2\2e\u0185\3\2\2\2g\u0187\3\2\2\2i\u0189\3\2"+
		"\2\2k\u018c\3\2\2\2m\u018f\3\2\2\2o\u0192\3\2\2\2q\u0195\3\2\2\2s\u0198"+
		"\3\2\2\2u\u019b\3\2\2\2w\u019e\3\2\2\2y\u01a1\3\2\2\2{\u01a4\3\2\2\2}"+
		"\u01a6\3\2\2\2\177\u01a8\3\2\2\2\u0081\u01aa\3\2\2\2\u0083\u01ac\3\2\2"+
		"\2\u0085\u01ae\3\2\2\2\u0087\u01b0\3\2\2\2\u0089\u01b2\3\2\2\2\u008b\u01b4"+
		"\3\2\2\2\u008d\u01b7\3\2\2\2\u008f\u0090\7<\2\2\u0090\4\3\2\2\2\u0091"+
		"\u0092\7o\2\2\u0092\u0093\7c\2\2\u0093\u0094\7k\2\2\u0094\u0095\7p\2\2"+
		"\u0095\6\3\2\2\2\u0096\u0097\7v\2\2\u0097\u0098\7t\2\2\u0098\u0099\7w"+
		"\2\2\u0099\u009a\7g\2\2\u009a\b\3\2\2\2\u009b\u009c\7h\2\2\u009c\u009d"+
		"\7c\2\2\u009d\u009e\7n\2\2\u009e\u009f\7u\2\2\u009f\u00a0\7g\2\2\u00a0"+
		"\n\3\2\2\2\u00a1\u00a2\7o\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7g\2\2\u00a4"+
		"\u00a5\7u\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7\"\2\2\u00a7\f\3\2\2\2\u00a8"+
		"\u00a9\7\"\2\2\u00a9\u00aa\7{\2\2\u00aa\u00ab\7q\2\2\u00ab\u00ac\7w\2"+
		"\2\u00ac\u00ad\7u\2\2\u00ad\u00ae\7c\2\2\u00ae\16\3\2\2\2\u00af\u00b0"+
		"\7h\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7v\2\2\u00b3"+
		"\20\3\2\2\2\u00b4\u00b5\7e\2\2\u00b5\u00b6\7n\2\2\u00b6\u00b7\7q\2\2\u00b7"+
		"\u00b8\7p\2\2\u00b8\u00b9\7g\2\2\u00b9\22\3\2\2\2\u00ba\u00bb\7m\2\2\u00bb"+
		"\u00bc\7c\2\2\u00bc\u00bd\7o\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7p\2\2"+
		"\u00bf\u00c0\7q\2\2\u00c0\u00c1\7c\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3"+
		"\7u\2\2\u00c3\24\3\2\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6\7n\2\2\u00c6\u00c7"+
		"\7q\2\2\u00c7\u00c8\7x\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca\7{\2\2\u00ca"+
		"\u00cb\7q\2\2\u00cb\u00cc\7w\2\2\u00cc\26\3\2\2\2\u00cd\u00ce\7u\2\2\u00ce"+
		"\u00cf\7v\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7t\2\2\u00d1\u00d2\7o\2\2"+
		"\u00d2\30\3\2\2\2\u00d3\u00d4\7u\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6\7"+
		"q\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7o\2\2\u00d8\u00d9\7v\2\2\u00d9\u00da"+
		"\7t\2\2\u00da\u00db\7q\2\2\u00db\u00dc\7q\2\2\u00dc\u00dd\7r\2\2\u00dd"+
		"\u00de\7g\2\2\u00de\u00df\7t\2\2\u00df\32\3\2\2\2\u00e0\u00e1\7h\2\2\u00e1"+
		"\u00e2\7q\2\2\u00e2\u00e3\7t\2\2\u00e3\u00e4\7e\2\2\u00e4\u00e5\7g\2\2"+
		"\u00e5\34\3\2\2\2\u00e6\u00e7\7v\2\2\u00e7\u00e8\7t\2\2\u00e8\u00e9\7"+
		"q\2\2\u00e9\u00ea\7q\2\2\u00ea\u00eb\7r\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed"+
		"\7t\2\2\u00ed\36\3\2\2\2\u00ee\u00ef\7m\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1"+
		"\7o\2\2\u00f1\u00f2\7k\2\2\u00f2\u00f3\7p\2\2\u00f3\u00f4\7q\2\2\u00f4"+
		" \3\2\2\2\u00f5\u00f6\7k\2\2\u00f6\u00f7\7m\2\2\u00f7\u00f8\7p\2\2\u00f8"+
		"\u00f9\7q\2\2\u00f9\u00fa\7y\2\2\u00fa\"\3\2\2\2\u00fb\u00fc\7l\2\2\u00fc"+
		"\u00fd\7g\2\2\u00fd\u00fe\7f\2\2\u00fe\u00ff\7k\2\2\u00ff$\3\2\2\2\u0100"+
		"\u0101\7d\2\2\u0101\u0102\7q\2\2\u0102\u0103\7q\2\2\u0103\u0104\7n\2\2"+
		"\u0104\u0105\7g\2\2\u0105\u0106\7c\2\2\u0106\u0107\7p\2\2\u0107&\3\2\2"+
		"\2\u0108\u0109\7e\2\2\u0109\u010a\7j\2\2\u010a\u010b\7c\2\2\u010b\u010c"+
		"\7t\2\2\u010c(\3\2\2\2\u010d\u010e\7h\2\2\u010e\u010f\7n\2\2\u010f\u0110"+
		"\7q\2\2\u0110\u0111\7c\2\2\u0111\u0112\7v\2\2\u0112*\3\2\2\2\u0113\u0114"+
		"\7k\2\2\u0114\u0115\7p\2\2\u0115\u0116\7v\2\2\u0116,\3\2\2\2\u0117\u0118"+
		"\7U\2\2\u0118\u0119\7v\2\2\u0119\u011a\7t\2\2\u011a\u011b\7k\2\2\u011b"+
		"\u011c\7p\2\2\u011c\u011d\7i\2\2\u011d.\3\2\2\2\u011e\u011f\7x\2\2\u011f"+
		"\u0120\7q\2\2\u0120\u0121\7k\2\2\u0121\u0122\7f\2\2\u0122\60\3\2\2\2\u0123"+
		"\u0125\5G$\2\u0124\u0126\5A!\2\u0125\u0124\3\2\2\2\u0125\u0126\3\2\2\2"+
		"\u0126\62\3\2\2\2\u0127\u0128\7)\2\2\u0128\u0129\5K&\2\u0129\u012a\7)"+
		"\2\2\u012a\u0134\3\2\2\2\u012b\u012c\7)\2\2\u012c\u012d\5I%\2\u012d\u012e"+
		"\7)\2\2\u012e\u0134\3\2\2\2\u012f\u0130\7)\2\2\u0130\u0131\5C\"\2\u0131"+
		"\u0132\7)\2\2\u0132\u0134\3\2\2\2\u0133\u0127\3\2\2\2\u0133\u012b\3\2"+
		"\2\2\u0133\u012f\3\2\2\2\u0134\64\3\2\2\2\u0135\u0136\5E#\2\u0136\u0137"+
		"\5A!\2\u0137\u0138\7\60\2\2\u0138\u0139\5A!\2\u0139\u013f\3\2\2\2\u013a"+
		"\u013b\5A!\2\u013b\u013c\7\60\2\2\u013c\u013d\5A!\2\u013d\u013f\3\2\2"+
		"\2\u013e\u0135\3\2\2\2\u013e\u013a\3\2\2\2\u013f\66\3\2\2\2\u0140\u0141"+
		"\5;\36\2\u01418\3\2\2\2\u0142\u0143\5E#\2\u0143\u0144\5A!\2\u0144:\3\2"+
		"\2\2\u0145\u0147\7-\2\2\u0146\u0145\3\2\2\2\u0146\u0147\3\2\2\2\u0147"+
		"\u0148\3\2\2\2\u0148\u0149\5A!\2\u0149<\3\2\2\2\u014a\u014b\7$\2\2\u014b"+
		"\u014c\5M\'\2\u014c\u014d\7$\2\2\u014d>\3\2\2\2\u014e\u014f\7p\2\2\u014f"+
		"\u0150\7w\2\2\u0150\u0151\7n\2\2\u0151\u0152\7n\2\2\u0152@\3\2\2\2\u0153"+
		"\u0155\5C\"\2\u0154\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0154\3\2"+
		"\2\2\u0156\u0157\3\2\2\2\u0157B\3\2\2\2\u0158\u0159\t\2\2\2\u0159D\3\2"+
		"\2\2\u015a\u015b\7/\2\2\u015bF\3\2\2\2\u015c\u015e\5K&\2\u015d\u015c\3"+
		"\2\2\2\u015e\u015f\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160"+
		"H\3\2\2\2\u0161\u0162\7\"\2\2\u0162J\3\2\2\2\u0163\u0164\t\3\2\2\u0164"+
		"L\3\2\2\2\u0165\u0167\t\4\2\2\u0166\u0165\3\2\2\2\u0167\u016a\3\2\2\2"+
		"\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169N\3\2\2\2\u016a\u0168\3"+
		"\2\2\2\u016b\u016c\7-\2\2\u016cP\3\2\2\2\u016d\u016e\7/\2\2\u016eR\3\2"+
		"\2\2\u016f\u0170\7,\2\2\u0170T\3\2\2\2\u0171\u0172\7\61\2\2\u0172V\3\2"+
		"\2\2\u0173\u0174\7\'\2\2\u0174X\3\2\2\2\u0175\u0176\7-\2\2\u0176\u0177"+
		"\7-\2\2\u0177Z\3\2\2\2\u0178\u0179\7/\2\2\u0179\u017a\7/\2\2\u017a\\\3"+
		"\2\2\2\u017b\u017c\7#\2\2\u017c^\3\2\2\2\u017d\u017e\7(\2\2\u017e\u017f"+
		"\7(\2\2\u017f`\3\2\2\2\u0180\u0181\7~\2\2\u0181\u0182\7~\2\2\u0182b\3"+
		"\2\2\2\u0183\u0184\7?\2\2\u0184d\3\2\2\2\u0185\u0186\7@\2\2\u0186f\3\2"+
		"\2\2\u0187\u0188\7>\2\2\u0188h\3\2\2\2\u0189\u018a\7?\2\2\u018a\u018b"+
		"\7?\2\2\u018bj\3\2\2\2\u018c\u018d\7@\2\2\u018d\u018e\7?\2\2\u018el\3"+
		"\2\2\2\u018f\u0190\7>\2\2\u0190\u0191\7?\2\2\u0191n\3\2\2\2\u0192\u0193"+
		"\7#\2\2\u0193\u0194\7?\2\2\u0194p\3\2\2\2\u0195\u0196\7-\2\2\u0196\u0197"+
		"\7?\2\2\u0197r\3\2\2\2\u0198\u0199\7/\2\2\u0199\u019a\7?\2\2\u019at\3"+
		"\2\2\2\u019b\u019c\7,\2\2\u019c\u019d\7?\2\2\u019dv\3\2\2\2\u019e\u019f"+
		"\7\61\2\2\u019f\u01a0\7?\2\2\u01a0x\3\2\2\2\u01a1\u01a2\7\'\2\2\u01a2"+
		"\u01a3\7?\2\2\u01a3z\3\2\2\2\u01a4\u01a5\7*\2\2\u01a5|\3\2\2\2\u01a6\u01a7"+
		"\7+\2\2\u01a7~\3\2\2\2\u01a8\u01a9\7}\2\2\u01a9\u0080\3\2\2\2\u01aa\u01ab"+
		"\7\177\2\2\u01ab\u0082\3\2\2\2\u01ac\u01ad\7]\2\2\u01ad\u0084\3\2\2\2"+
		"\u01ae\u01af\7_\2\2\u01af\u0086\3\2\2\2\u01b0\u01b1\7=\2\2\u01b1\u0088"+
		"\3\2\2\2\u01b2\u01b3\7.\2\2\u01b3\u008a\3\2\2\2\u01b4\u01b5\7\60\2\2\u01b5"+
		"\u008c\3\2\2\2\u01b6\u01b8\t\5\2\2\u01b7\u01b6\3\2\2\2\u01b8\u01b9\3\2"+
		"\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb"+
		"\u01bc\bG\2\2\u01bc\u008e\3\2\2\2\13\2\u0125\u0133\u013e\u0146\u0156\u015f"+
		"\u0168\u01b9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}