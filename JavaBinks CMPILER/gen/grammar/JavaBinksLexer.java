// Generated from C:/Users/WilliamPC/Documents/CMPILER/MP/JavaBinks CMPILER/src/grammar\JavaBinks.g4 by ANTLR 4.5.1
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
		null, "':'", "'jarjarbinks'", "'true'", "'false'", "'meesa '", "' yousa'", 
		"'fett'", "'clone'", "'kaminoans'", "'iloveyou'", "'storm'", "'stormtrooper'", 
		"'force'", "'trooper'", "'kamino'", "'iknow'", "'jedi'", "'boolean'", 
		"'char'", "'float'", "'int'", "'String'", "'void'", null, null, null, 
		null, null, null, null, "'null'", null, null, "'+'", "'-'", "'*'", "'/'", 
		"'%'", "'++'", "'--'", "'!'", "'&&'", "'||'", "'='", "'>'", "'<'", "'=='", 
		"'>='", "'<='", "'!='", "'+='", "'-='", "'*='", "'/='", "'%='", "'('", 
		"')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2C\u01c4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\5"+
		"\31\u012d\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u013b\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33"+
		"\u0146\n\33\3\34\3\34\3\35\3\35\3\35\3\36\5\36\u014e\n\36\3\36\3\36\3"+
		"\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\6!\u015c\n!\r!\16!\u015d\3\"\3\""+
		"\3#\3#\3$\6$\u0165\n$\r$\16$\u0166\3%\3%\3&\3&\3\'\7\'\u016e\n\'\f\'\16"+
		"\'\u0171\13\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3"+
		"\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3"+
		"\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\39\39\39\3:\3:\3:\3;\3;\3;"+
		"\3<\3<\3<\3=\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F"+
		"\3F\3G\6G\u01bf\nG\rG\16G\u01c0\3G\3G\2\2H\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E\2G\2I\2K\2M\2O$"+
		"Q%S&U\'W(Y)[*]+_,a-c.e/g\60i\61k\62m\63o\64q\65s\66u\67w8y9{:};\177<\u0081"+
		"=\u0083>\u0085?\u0087@\u0089A\u008bB\u008dC\3\2\6\3\2\62;\4\2C\\c|\t\2"+
		"\";=>@\\^^`ac|~~\5\2\13\f\16\17\"\"\u01c7\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2"+
		"\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2"+
		"\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}"+
		"\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2"+
		"\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\3\u008f"+
		"\3\2\2\2\5\u0091\3\2\2\2\7\u009d\3\2\2\2\t\u00a2\3\2\2\2\13\u00a8\3\2"+
		"\2\2\r\u00af\3\2\2\2\17\u00b6\3\2\2\2\21\u00bb\3\2\2\2\23\u00c1\3\2\2"+
		"\2\25\u00cb\3\2\2\2\27\u00d4\3\2\2\2\31\u00da\3\2\2\2\33\u00e7\3\2\2\2"+
		"\35\u00ed\3\2\2\2\37\u00f5\3\2\2\2!\u00fc\3\2\2\2#\u0102\3\2\2\2%\u0107"+
		"\3\2\2\2\'\u010f\3\2\2\2)\u0114\3\2\2\2+\u011a\3\2\2\2-\u011e\3\2\2\2"+
		"/\u0125\3\2\2\2\61\u012a\3\2\2\2\63\u013a\3\2\2\2\65\u0145\3\2\2\2\67"+
		"\u0147\3\2\2\29\u0149\3\2\2\2;\u014d\3\2\2\2=\u0151\3\2\2\2?\u0155\3\2"+
		"\2\2A\u015b\3\2\2\2C\u015f\3\2\2\2E\u0161\3\2\2\2G\u0164\3\2\2\2I\u0168"+
		"\3\2\2\2K\u016a\3\2\2\2M\u016f\3\2\2\2O\u0172\3\2\2\2Q\u0174\3\2\2\2S"+
		"\u0176\3\2\2\2U\u0178\3\2\2\2W\u017a\3\2\2\2Y\u017c\3\2\2\2[\u017f\3\2"+
		"\2\2]\u0182\3\2\2\2_\u0184\3\2\2\2a\u0187\3\2\2\2c\u018a\3\2\2\2e\u018c"+
		"\3\2\2\2g\u018e\3\2\2\2i\u0190\3\2\2\2k\u0193\3\2\2\2m\u0196\3\2\2\2o"+
		"\u0199\3\2\2\2q\u019c\3\2\2\2s\u019f\3\2\2\2u\u01a2\3\2\2\2w\u01a5\3\2"+
		"\2\2y\u01a8\3\2\2\2{\u01ab\3\2\2\2}\u01ad\3\2\2\2\177\u01af\3\2\2\2\u0081"+
		"\u01b1\3\2\2\2\u0083\u01b3\3\2\2\2\u0085\u01b5\3\2\2\2\u0087\u01b7\3\2"+
		"\2\2\u0089\u01b9\3\2\2\2\u008b\u01bb\3\2\2\2\u008d\u01be\3\2\2\2\u008f"+
		"\u0090\7<\2\2\u0090\4\3\2\2\2\u0091\u0092\7l\2\2\u0092\u0093\7c\2\2\u0093"+
		"\u0094\7t\2\2\u0094\u0095\7l\2\2\u0095\u0096\7c\2\2\u0096\u0097\7t\2\2"+
		"\u0097\u0098\7d\2\2\u0098\u0099\7k\2\2\u0099\u009a\7p\2\2\u009a\u009b"+
		"\7m\2\2\u009b\u009c\7u\2\2\u009c\6\3\2\2\2\u009d\u009e\7v\2\2\u009e\u009f"+
		"\7t\2\2\u009f\u00a0\7w\2\2\u00a0\u00a1\7g\2\2\u00a1\b\3\2\2\2\u00a2\u00a3"+
		"\7h\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7n\2\2\u00a5\u00a6\7u\2\2\u00a6"+
		"\u00a7\7g\2\2\u00a7\n\3\2\2\2\u00a8\u00a9\7o\2\2\u00a9\u00aa\7g\2\2\u00aa"+
		"\u00ab\7g\2\2\u00ab\u00ac\7u\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae\7\"\2"+
		"\2\u00ae\f\3\2\2\2\u00af\u00b0\7\"\2\2\u00b0\u00b1\7{\2\2\u00b1\u00b2"+
		"\7q\2\2\u00b2\u00b3\7w\2\2\u00b3\u00b4\7u\2\2\u00b4\u00b5\7c\2\2\u00b5"+
		"\16\3\2\2\2\u00b6\u00b7\7h\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7v\2\2\u00b9"+
		"\u00ba\7v\2\2\u00ba\20\3\2\2\2\u00bb\u00bc\7e\2\2\u00bc\u00bd\7n\2\2\u00bd"+
		"\u00be\7q\2\2\u00be\u00bf\7p\2\2\u00bf\u00c0\7g\2\2\u00c0\22\3\2\2\2\u00c1"+
		"\u00c2\7m\2\2\u00c2\u00c3\7c\2\2\u00c3\u00c4\7o\2\2\u00c4\u00c5\7k\2\2"+
		"\u00c5\u00c6\7p\2\2\u00c6\u00c7\7q\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9"+
		"\7p\2\2\u00c9\u00ca\7u\2\2\u00ca\24\3\2\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd"+
		"\7n\2\2\u00cd\u00ce\7q\2\2\u00ce\u00cf\7x\2\2\u00cf\u00d0\7g\2\2\u00d0"+
		"\u00d1\7{\2\2\u00d1\u00d2\7q\2\2\u00d2\u00d3\7w\2\2\u00d3\26\3\2\2\2\u00d4"+
		"\u00d5\7u\2\2\u00d5\u00d6\7v\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8\7t\2\2"+
		"\u00d8\u00d9\7o\2\2\u00d9\30\3\2\2\2\u00da\u00db\7u\2\2\u00db\u00dc\7"+
		"v\2\2\u00dc\u00dd\7q\2\2\u00dd\u00de\7t\2\2\u00de\u00df\7o\2\2\u00df\u00e0"+
		"\7v\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2\7q\2\2\u00e2\u00e3\7q\2\2\u00e3"+
		"\u00e4\7r\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7t\2\2\u00e6\32\3\2\2\2\u00e7"+
		"\u00e8\7h\2\2\u00e8\u00e9\7q\2\2\u00e9\u00ea\7t\2\2\u00ea\u00eb\7e\2\2"+
		"\u00eb\u00ec\7g\2\2\u00ec\34\3\2\2\2\u00ed\u00ee\7v\2\2\u00ee\u00ef\7"+
		"t\2\2\u00ef\u00f0\7q\2\2\u00f0\u00f1\7q\2\2\u00f1\u00f2\7r\2\2\u00f2\u00f3"+
		"\7g\2\2\u00f3\u00f4\7t\2\2\u00f4\36\3\2\2\2\u00f5\u00f6\7m\2\2\u00f6\u00f7"+
		"\7c\2\2\u00f7\u00f8\7o\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa\7p\2\2\u00fa"+
		"\u00fb\7q\2\2\u00fb \3\2\2\2\u00fc\u00fd\7k\2\2\u00fd\u00fe\7m\2\2\u00fe"+
		"\u00ff\7p\2\2\u00ff\u0100\7q\2\2\u0100\u0101\7y\2\2\u0101\"\3\2\2\2\u0102"+
		"\u0103\7l\2\2\u0103\u0104\7g\2\2\u0104\u0105\7f\2\2\u0105\u0106\7k\2\2"+
		"\u0106$\3\2\2\2\u0107\u0108\7d\2\2\u0108\u0109\7q\2\2\u0109\u010a\7q\2"+
		"\2\u010a\u010b\7n\2\2\u010b\u010c\7g\2\2\u010c\u010d\7c\2\2\u010d\u010e"+
		"\7p\2\2\u010e&\3\2\2\2\u010f\u0110\7e\2\2\u0110\u0111\7j\2\2\u0111\u0112"+
		"\7c\2\2\u0112\u0113\7t\2\2\u0113(\3\2\2\2\u0114\u0115\7h\2\2\u0115\u0116"+
		"\7n\2\2\u0116\u0117\7q\2\2\u0117\u0118\7c\2\2\u0118\u0119\7v\2\2\u0119"+
		"*\3\2\2\2\u011a\u011b\7k\2\2\u011b\u011c\7p\2\2\u011c\u011d\7v\2\2\u011d"+
		",\3\2\2\2\u011e\u011f\7U\2\2\u011f\u0120\7v\2\2\u0120\u0121\7t\2\2\u0121"+
		"\u0122\7k\2\2\u0122\u0123\7p\2\2\u0123\u0124\7i\2\2\u0124.\3\2\2\2\u0125"+
		"\u0126\7x\2\2\u0126\u0127\7q\2\2\u0127\u0128\7k\2\2\u0128\u0129\7f\2\2"+
		"\u0129\60\3\2\2\2\u012a\u012c\5G$\2\u012b\u012d\5A!\2\u012c\u012b\3\2"+
		"\2\2\u012c\u012d\3\2\2\2\u012d\62\3\2\2\2\u012e\u012f\7)\2\2\u012f\u0130"+
		"\5K&\2\u0130\u0131\7)\2\2\u0131\u013b\3\2\2\2\u0132\u0133\7)\2\2\u0133"+
		"\u0134\5I%\2\u0134\u0135\7)\2\2\u0135\u013b\3\2\2\2\u0136\u0137\7)\2\2"+
		"\u0137\u0138\5C\"\2\u0138\u0139\7)\2\2\u0139\u013b\3\2\2\2\u013a\u012e"+
		"\3\2\2\2\u013a\u0132\3\2\2\2\u013a\u0136\3\2\2\2\u013b\64\3\2\2\2\u013c"+
		"\u013d\5E#\2\u013d\u013e\5A!\2\u013e\u013f\7\60\2\2\u013f\u0140\5A!\2"+
		"\u0140\u0146\3\2\2\2\u0141\u0142\5A!\2\u0142\u0143\7\60\2\2\u0143\u0144"+
		"\5A!\2\u0144\u0146\3\2\2\2\u0145\u013c\3\2\2\2\u0145\u0141\3\2\2\2\u0146"+
		"\66\3\2\2\2\u0147\u0148\5;\36\2\u01488\3\2\2\2\u0149\u014a\5E#\2\u014a"+
		"\u014b\5A!\2\u014b:\3\2\2\2\u014c\u014e\7-\2\2\u014d\u014c\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\5A!\2\u0150<\3\2\2\2\u0151"+
		"\u0152\7$\2\2\u0152\u0153\5M\'\2\u0153\u0154\7$\2\2\u0154>\3\2\2\2\u0155"+
		"\u0156\7p\2\2\u0156\u0157\7w\2\2\u0157\u0158\7n\2\2\u0158\u0159\7n\2\2"+
		"\u0159@\3\2\2\2\u015a\u015c\5C\"\2\u015b\u015a\3\2\2\2\u015c\u015d\3\2"+
		"\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015eB\3\2\2\2\u015f\u0160"+
		"\t\2\2\2\u0160D\3\2\2\2\u0161\u0162\7/\2\2\u0162F\3\2\2\2\u0163\u0165"+
		"\5K&\2\u0164\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0164\3\2\2\2\u0166"+
		"\u0167\3\2\2\2\u0167H\3\2\2\2\u0168\u0169\7\"\2\2\u0169J\3\2\2\2\u016a"+
		"\u016b\t\3\2\2\u016bL\3\2\2\2\u016c\u016e\t\4\2\2\u016d\u016c\3\2\2\2"+
		"\u016e\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170N\3"+
		"\2\2\2\u0171\u016f\3\2\2\2\u0172\u0173\7-\2\2\u0173P\3\2\2\2\u0174\u0175"+
		"\7/\2\2\u0175R\3\2\2\2\u0176\u0177\7,\2\2\u0177T\3\2\2\2\u0178\u0179\7"+
		"\61\2\2\u0179V\3\2\2\2\u017a\u017b\7\'\2\2\u017bX\3\2\2\2\u017c\u017d"+
		"\7-\2\2\u017d\u017e\7-\2\2\u017eZ\3\2\2\2\u017f\u0180\7/\2\2\u0180\u0181"+
		"\7/\2\2\u0181\\\3\2\2\2\u0182\u0183\7#\2\2\u0183^\3\2\2\2\u0184\u0185"+
		"\7(\2\2\u0185\u0186\7(\2\2\u0186`\3\2\2\2\u0187\u0188\7~\2\2\u0188\u0189"+
		"\7~\2\2\u0189b\3\2\2\2\u018a\u018b\7?\2\2\u018bd\3\2\2\2\u018c\u018d\7"+
		"@\2\2\u018df\3\2\2\2\u018e\u018f\7>\2\2\u018fh\3\2\2\2\u0190\u0191\7?"+
		"\2\2\u0191\u0192\7?\2\2\u0192j\3\2\2\2\u0193\u0194\7@\2\2\u0194\u0195"+
		"\7?\2\2\u0195l\3\2\2\2\u0196\u0197\7>\2\2\u0197\u0198\7?\2\2\u0198n\3"+
		"\2\2\2\u0199\u019a\7#\2\2\u019a\u019b\7?\2\2\u019bp\3\2\2\2\u019c\u019d"+
		"\7-\2\2\u019d\u019e\7?\2\2\u019er\3\2\2\2\u019f\u01a0\7/\2\2\u01a0\u01a1"+
		"\7?\2\2\u01a1t\3\2\2\2\u01a2\u01a3\7,\2\2\u01a3\u01a4\7?\2\2\u01a4v\3"+
		"\2\2\2\u01a5\u01a6\7\61\2\2\u01a6\u01a7\7?\2\2\u01a7x\3\2\2\2\u01a8\u01a9"+
		"\7\'\2\2\u01a9\u01aa\7?\2\2\u01aaz\3\2\2\2\u01ab\u01ac\7*\2\2\u01ac|\3"+
		"\2\2\2\u01ad\u01ae\7+\2\2\u01ae~\3\2\2\2\u01af\u01b0\7}\2\2\u01b0\u0080"+
		"\3\2\2\2\u01b1\u01b2\7\177\2\2\u01b2\u0082\3\2\2\2\u01b3\u01b4\7]\2\2"+
		"\u01b4\u0084\3\2\2\2\u01b5\u01b6\7_\2\2\u01b6\u0086\3\2\2\2\u01b7\u01b8"+
		"\7=\2\2\u01b8\u0088\3\2\2\2\u01b9\u01ba\7.\2\2\u01ba\u008a\3\2\2\2\u01bb"+
		"\u01bc\7\60\2\2\u01bc\u008c\3\2\2\2\u01bd\u01bf\t\5\2\2\u01be\u01bd\3"+
		"\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1"+
		"\u01c2\3\2\2\2\u01c2\u01c3\bG\2\2\u01c3\u008e\3\2\2\2\13\2\u012c\u013a"+
		"\u0145\u014d\u015d\u0166\u016f\u01c0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}