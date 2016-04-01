// Generated from /Users/hannah/Documents/IntelliJ Path/JavaBinks CMPILER/src/grammar/JavaBinks.g4 by ANTLR 4.5.1
package generated_codes;
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
		PRINTER=18, BOOLEAN=19, CHAR=20, FLOAT=21, INT=22, STRING=23, VOID=24, 
		VariableFuncName=25, CharLiteral=26, FloatLiteral=27, IntegerLiteral=28, 
		NegativeIntegerLiteral=29, PositiveIntegerLiteral=30, StringLiteral=31, 
		NullLiteral=32, Digits=33, Digit=34, ADD=35, SUB=36, MUL=37, DIV=38, MOD=39, 
		INCR=40, DECR=41, NOT=42, AND=43, OR=44, ASSIGN=45, GT=46, LT=47, EQUAL=48, 
		GE=49, LE=50, NOTEQUAL=51, ADD_ASSIGN=52, SUB_ASSIGN=53, MUL_ASSIGN=54, 
		DIV_ASSIGN=55, MOD_ASSIGN=56, LPAREN=57, RPAREN=58, LBRACE=59, RBRACE=60, 
		LBRACK=61, RBRACK=62, SEMI=63, COMMA=64, DOT=65, WS=66;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "BREAK", "CASE", "DEFAULT", 
		"DO", "ELSE", "ELSEIF", "FOR", "IF", "SWITCH", "WHILE", "RETURN", "PRINTER", 
		"BOOLEAN", "CHAR", "FLOAT", "INT", "STRING", "VOID", "VariableFuncName", 
		"CharLiteral", "FloatLiteral", "IntegerLiteral", "NegativeIntegerLiteral", 
		"PositiveIntegerLiteral", "StringLiteral", "NullLiteral", "Digits", "Digit", 
		"NegativeSign", "Letters", "Space", "Letter", "StringCharacters", "ADD", 
		"SUB", "MUL", "DIV", "MOD", "INCR", "DECR", "NOT", "AND", "OR", "ASSIGN", 
		"GT", "LT", "EQUAL", "GE", "LE", "NOTEQUAL", "ADD_ASSIGN", "SUB_ASSIGN", 
		"MUL_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "LPAREN", "RPAREN", "LBRACE", 
		"RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'jarjarbinks'", "'true'", "'false'", "'meesa '", "' yousa'", 
		"'fett'", "'clone'", "'kaminoans'", "'iloveyou'", "'storm'", "'stormtrooper'", 
		"'force'", "'trooper'", "'kamino'", "'iknow'", "'jedi'", "'forcePrint'", 
		"'boolean'", "'char'", "'float'", "'int'", "'String'", "'void'", null, 
		null, null, null, null, null, null, "'null'", null, null, "'+'", "'-'", 
		"'*'", "'/'", "'%'", "'++'", "'--'", "'!'", "'&&'", "'||'", "'='", "'>'", 
		"'<'", "'=='", "'>='", "'<='", "'!='", "'+='", "'-='", "'*='", "'/='", 
		"'%='", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "BREAK", "CASE", "DEFAULT", 
		"DO", "ELSE", "ELSEIF", "FOR", "IF", "SWITCH", "WHILE", "RETURN", "PRINTER", 
		"BOOLEAN", "CHAR", "FLOAT", "INT", "STRING", "VOID", "VariableFuncName", 
		"CharLiteral", "FloatLiteral", "IntegerLiteral", "NegativeIntegerLiteral", 
		"PositiveIntegerLiteral", "StringLiteral", "NullLiteral", "Digits", "Digit", 
		"ADD", "SUB", "MUL", "DIV", "MOD", "INCR", "DECR", "NOT", "AND", "OR", 
		"ASSIGN", "GT", "LT", "EQUAL", "GE", "LE", "NOTEQUAL", "ADD_ASSIGN", "SUB_ASSIGN", 
		"MUL_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "LPAREN", "RPAREN", "LBRACE", 
		"RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2D\u01d1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\5\32\u013a\n\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0148"+
		"\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0153\n\34\3\35"+
		"\3\35\3\36\3\36\3\36\3\37\5\37\u015b\n\37\3\37\3\37\3 \3 \3 \3 \3!\3!"+
		"\3!\3!\3!\3\"\6\"\u0169\n\"\r\"\16\"\u016a\3#\3#\3$\3$\3%\6%\u0172\n%"+
		"\r%\16%\u0173\3&\3&\3\'\3\'\3(\7(\u017b\n(\f(\16(\u017e\13(\3)\3)\3*\3"+
		"*\3+\3+\3,\3,\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\61\3\61\3\61\3\62\3"+
		"\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\3"+
		"8\38\38\39\39\39\3:\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3=\3>\3>\3>\3?\3?\3"+
		"@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\6H\u01cc\nH\rH\16H\u01cd"+
		"\3H\3H\2\2I\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G\2I\2K\2M\2O\2Q%S&U\'W(Y)[*]+_,a-c.e/g\60i\61k"+
		"\62m\63o\64q\65s\66u\67w8y9{:};\177<\u0081=\u0083>\u0085?\u0087@\u0089"+
		"A\u008bB\u008dC\u008fD\3\2\6\3\2\62;\4\2C\\c|\t\2\";=>@\\^^`ac|~~\5\2"+
		"\13\f\16\17\"\"\u01d4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3"+
		"\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2"+
		"\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2"+
		"\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\3\u0091\3\2\2"+
		"\2\5\u0093\3\2\2\2\7\u009f\3\2\2\2\t\u00a4\3\2\2\2\13\u00aa\3\2\2\2\r"+
		"\u00b1\3\2\2\2\17\u00b8\3\2\2\2\21\u00bd\3\2\2\2\23\u00c3\3\2\2\2\25\u00cd"+
		"\3\2\2\2\27\u00d6\3\2\2\2\31\u00dc\3\2\2\2\33\u00e9\3\2\2\2\35\u00ef\3"+
		"\2\2\2\37\u00f7\3\2\2\2!\u00fe\3\2\2\2#\u0104\3\2\2\2%\u0109\3\2\2\2\'"+
		"\u0114\3\2\2\2)\u011c\3\2\2\2+\u0121\3\2\2\2-\u0127\3\2\2\2/\u012b\3\2"+
		"\2\2\61\u0132\3\2\2\2\63\u0137\3\2\2\2\65\u0147\3\2\2\2\67\u0152\3\2\2"+
		"\29\u0154\3\2\2\2;\u0156\3\2\2\2=\u015a\3\2\2\2?\u015e\3\2\2\2A\u0162"+
		"\3\2\2\2C\u0168\3\2\2\2E\u016c\3\2\2\2G\u016e\3\2\2\2I\u0171\3\2\2\2K"+
		"\u0175\3\2\2\2M\u0177\3\2\2\2O\u017c\3\2\2\2Q\u017f\3\2\2\2S\u0181\3\2"+
		"\2\2U\u0183\3\2\2\2W\u0185\3\2\2\2Y\u0187\3\2\2\2[\u0189\3\2\2\2]\u018c"+
		"\3\2\2\2_\u018f\3\2\2\2a\u0191\3\2\2\2c\u0194\3\2\2\2e\u0197\3\2\2\2g"+
		"\u0199\3\2\2\2i\u019b\3\2\2\2k\u019d\3\2\2\2m\u01a0\3\2\2\2o\u01a3\3\2"+
		"\2\2q\u01a6\3\2\2\2s\u01a9\3\2\2\2u\u01ac\3\2\2\2w\u01af\3\2\2\2y\u01b2"+
		"\3\2\2\2{\u01b5\3\2\2\2}\u01b8\3\2\2\2\177\u01ba\3\2\2\2\u0081\u01bc\3"+
		"\2\2\2\u0083\u01be\3\2\2\2\u0085\u01c0\3\2\2\2\u0087\u01c2\3\2\2\2\u0089"+
		"\u01c4\3\2\2\2\u008b\u01c6\3\2\2\2\u008d\u01c8\3\2\2\2\u008f\u01cb\3\2"+
		"\2\2\u0091\u0092\7<\2\2\u0092\4\3\2\2\2\u0093\u0094\7l\2\2\u0094\u0095"+
		"\7c\2\2\u0095\u0096\7t\2\2\u0096\u0097\7l\2\2\u0097\u0098\7c\2\2\u0098"+
		"\u0099\7t\2\2\u0099\u009a\7d\2\2\u009a\u009b\7k\2\2\u009b\u009c\7p\2\2"+
		"\u009c\u009d\7m\2\2\u009d\u009e\7u\2\2\u009e\6\3\2\2\2\u009f\u00a0\7v"+
		"\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2\7w\2\2\u00a2\u00a3\7g\2\2\u00a3\b"+
		"\3\2\2\2\u00a4\u00a5\7h\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7n\2\2\u00a7"+
		"\u00a8\7u\2\2\u00a8\u00a9\7g\2\2\u00a9\n\3\2\2\2\u00aa\u00ab\7o\2\2\u00ab"+
		"\u00ac\7g\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7u\2\2\u00ae\u00af\7c\2\2"+
		"\u00af\u00b0\7\"\2\2\u00b0\f\3\2\2\2\u00b1\u00b2\7\"\2\2\u00b2\u00b3\7"+
		"{\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7w\2\2\u00b5\u00b6\7u\2\2\u00b6\u00b7"+
		"\7c\2\2\u00b7\16\3\2\2\2\u00b8\u00b9\7h\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb"+
		"\7v\2\2\u00bb\u00bc\7v\2\2\u00bc\20\3\2\2\2\u00bd\u00be\7e\2\2\u00be\u00bf"+
		"\7n\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1\7p\2\2\u00c1\u00c2\7g\2\2\u00c2"+
		"\22\3\2\2\2\u00c3\u00c4\7m\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7o\2\2\u00c6"+
		"\u00c7\7k\2\2\u00c7\u00c8\7p\2\2\u00c8\u00c9\7q\2\2\u00c9\u00ca\7c\2\2"+
		"\u00ca\u00cb\7p\2\2\u00cb\u00cc\7u\2\2\u00cc\24\3\2\2\2\u00cd\u00ce\7"+
		"k\2\2\u00ce\u00cf\7n\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7x\2\2\u00d1\u00d2"+
		"\7g\2\2\u00d2\u00d3\7{\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7w\2\2\u00d5"+
		"\26\3\2\2\2\u00d6\u00d7\7u\2\2\u00d7\u00d8\7v\2\2\u00d8\u00d9\7q\2\2\u00d9"+
		"\u00da\7t\2\2\u00da\u00db\7o\2\2\u00db\30\3\2\2\2\u00dc\u00dd\7u\2\2\u00dd"+
		"\u00de\7v\2\2\u00de\u00df\7q\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1\7o\2\2"+
		"\u00e1\u00e2\7v\2\2\u00e2\u00e3\7t\2\2\u00e3\u00e4\7q\2\2\u00e4\u00e5"+
		"\7q\2\2\u00e5\u00e6\7r\2\2\u00e6\u00e7\7g\2\2\u00e7\u00e8\7t\2\2\u00e8"+
		"\32\3\2\2\2\u00e9\u00ea\7h\2\2\u00ea\u00eb\7q\2\2\u00eb\u00ec\7t\2\2\u00ec"+
		"\u00ed\7e\2\2\u00ed\u00ee\7g\2\2\u00ee\34\3\2\2\2\u00ef\u00f0\7v\2\2\u00f0"+
		"\u00f1\7t\2\2\u00f1\u00f2\7q\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4\7r\2\2"+
		"\u00f4\u00f5\7g\2\2\u00f5\u00f6\7t\2\2\u00f6\36\3\2\2\2\u00f7\u00f8\7"+
		"m\2\2\u00f8\u00f9\7c\2\2\u00f9\u00fa\7o\2\2\u00fa\u00fb\7k\2\2\u00fb\u00fc"+
		"\7p\2\2\u00fc\u00fd\7q\2\2\u00fd \3\2\2\2\u00fe\u00ff\7k\2\2\u00ff\u0100"+
		"\7m\2\2\u0100\u0101\7p\2\2\u0101\u0102\7q\2\2\u0102\u0103\7y\2\2\u0103"+
		"\"\3\2\2\2\u0104\u0105\7l\2\2\u0105\u0106\7g\2\2\u0106\u0107\7f\2\2\u0107"+
		"\u0108\7k\2\2\u0108$\3\2\2\2\u0109\u010a\7h\2\2\u010a\u010b\7q\2\2\u010b"+
		"\u010c\7t\2\2\u010c\u010d\7e\2\2\u010d\u010e\7g\2\2\u010e\u010f\7R\2\2"+
		"\u010f\u0110\7t\2\2\u0110\u0111\7k\2\2\u0111\u0112\7p\2\2\u0112\u0113"+
		"\7v\2\2\u0113&\3\2\2\2\u0114\u0115\7d\2\2\u0115\u0116\7q\2\2\u0116\u0117"+
		"\7q\2\2\u0117\u0118\7n\2\2\u0118\u0119\7g\2\2\u0119\u011a\7c\2\2\u011a"+
		"\u011b\7p\2\2\u011b(\3\2\2\2\u011c\u011d\7e\2\2\u011d\u011e\7j\2\2\u011e"+
		"\u011f\7c\2\2\u011f\u0120\7t\2\2\u0120*\3\2\2\2\u0121\u0122\7h\2\2\u0122"+
		"\u0123\7n\2\2\u0123\u0124\7q\2\2\u0124\u0125\7c\2\2\u0125\u0126\7v\2\2"+
		"\u0126,\3\2\2\2\u0127\u0128\7k\2\2\u0128\u0129\7p\2\2\u0129\u012a\7v\2"+
		"\2\u012a.\3\2\2\2\u012b\u012c\7U\2\2\u012c\u012d\7v\2\2\u012d\u012e\7"+
		"t\2\2\u012e\u012f\7k\2\2\u012f\u0130\7p\2\2\u0130\u0131\7i\2\2\u0131\60"+
		"\3\2\2\2\u0132\u0133\7x\2\2\u0133\u0134\7q\2\2\u0134\u0135\7k\2\2\u0135"+
		"\u0136\7f\2\2\u0136\62\3\2\2\2\u0137\u0139\5I%\2\u0138\u013a\5C\"\2\u0139"+
		"\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a\64\3\2\2\2\u013b\u013c\7)\2\2"+
		"\u013c\u013d\5M\'\2\u013d\u013e\7)\2\2\u013e\u0148\3\2\2\2\u013f\u0140"+
		"\7)\2\2\u0140\u0141\5K&\2\u0141\u0142\7)\2\2\u0142\u0148\3\2\2\2\u0143"+
		"\u0144\7)\2\2\u0144\u0145\5E#\2\u0145\u0146\7)\2\2\u0146\u0148\3\2\2\2"+
		"\u0147\u013b\3\2\2\2\u0147\u013f\3\2\2\2\u0147\u0143\3\2\2\2\u0148\66"+
		"\3\2\2\2\u0149\u014a\5G$\2\u014a\u014b\5C\"\2\u014b\u014c\7\60\2\2\u014c"+
		"\u014d\5C\"\2\u014d\u0153\3\2\2\2\u014e\u014f\5C\"\2\u014f\u0150\7\60"+
		"\2\2\u0150\u0151\5C\"\2\u0151\u0153\3\2\2\2\u0152\u0149\3\2\2\2\u0152"+
		"\u014e\3\2\2\2\u01538\3\2\2\2\u0154\u0155\5=\37\2\u0155:\3\2\2\2\u0156"+
		"\u0157\5G$\2\u0157\u0158\5C\"\2\u0158<\3\2\2\2\u0159\u015b\7-\2\2\u015a"+
		"\u0159\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\5C"+
		"\"\2\u015d>\3\2\2\2\u015e\u015f\7$\2\2\u015f\u0160\5O(\2\u0160\u0161\7"+
		"$\2\2\u0161@\3\2\2\2\u0162\u0163\7p\2\2\u0163\u0164\7w\2\2\u0164\u0165"+
		"\7n\2\2\u0165\u0166\7n\2\2\u0166B\3\2\2\2\u0167\u0169\5E#\2\u0168\u0167"+
		"\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b"+
		"D\3\2\2\2\u016c\u016d\t\2\2\2\u016dF\3\2\2\2\u016e\u016f\7/\2\2\u016f"+
		"H\3\2\2\2\u0170\u0172\5M\'\2\u0171\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174J\3\2\2\2\u0175\u0176\7\"\2\2"+
		"\u0176L\3\2\2\2\u0177\u0178\t\3\2\2\u0178N\3\2\2\2\u0179\u017b\t\4\2\2"+
		"\u017a\u0179\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d"+
		"\3\2\2\2\u017dP\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0180\7-\2\2\u0180R"+
		"\3\2\2\2\u0181\u0182\7/\2\2\u0182T\3\2\2\2\u0183\u0184\7,\2\2\u0184V\3"+
		"\2\2\2\u0185\u0186\7\61\2\2\u0186X\3\2\2\2\u0187\u0188\7\'\2\2\u0188Z"+
		"\3\2\2\2\u0189\u018a\7-\2\2\u018a\u018b\7-\2\2\u018b\\\3\2\2\2\u018c\u018d"+
		"\7/\2\2\u018d\u018e\7/\2\2\u018e^\3\2\2\2\u018f\u0190\7#\2\2\u0190`\3"+
		"\2\2\2\u0191\u0192\7(\2\2\u0192\u0193\7(\2\2\u0193b\3\2\2\2\u0194\u0195"+
		"\7~\2\2\u0195\u0196\7~\2\2\u0196d\3\2\2\2\u0197\u0198\7?\2\2\u0198f\3"+
		"\2\2\2\u0199\u019a\7@\2\2\u019ah\3\2\2\2\u019b\u019c\7>\2\2\u019cj\3\2"+
		"\2\2\u019d\u019e\7?\2\2\u019e\u019f\7?\2\2\u019fl\3\2\2\2\u01a0\u01a1"+
		"\7@\2\2\u01a1\u01a2\7?\2\2\u01a2n\3\2\2\2\u01a3\u01a4\7>\2\2\u01a4\u01a5"+
		"\7?\2\2\u01a5p\3\2\2\2\u01a6\u01a7\7#\2\2\u01a7\u01a8\7?\2\2\u01a8r\3"+
		"\2\2\2\u01a9\u01aa\7-\2\2\u01aa\u01ab\7?\2\2\u01abt\3\2\2\2\u01ac\u01ad"+
		"\7/\2\2\u01ad\u01ae\7?\2\2\u01aev\3\2\2\2\u01af\u01b0\7,\2\2\u01b0\u01b1"+
		"\7?\2\2\u01b1x\3\2\2\2\u01b2\u01b3\7\61\2\2\u01b3\u01b4\7?\2\2\u01b4z"+
		"\3\2\2\2\u01b5\u01b6\7\'\2\2\u01b6\u01b7\7?\2\2\u01b7|\3\2\2\2\u01b8\u01b9"+
		"\7*\2\2\u01b9~\3\2\2\2\u01ba\u01bb\7+\2\2\u01bb\u0080\3\2\2\2\u01bc\u01bd"+
		"\7}\2\2\u01bd\u0082\3\2\2\2\u01be\u01bf\7\177\2\2\u01bf\u0084\3\2\2\2"+
		"\u01c0\u01c1\7]\2\2\u01c1\u0086\3\2\2\2\u01c2\u01c3\7_\2\2\u01c3\u0088"+
		"\3\2\2\2\u01c4\u01c5\7=\2\2\u01c5\u008a\3\2\2\2\u01c6\u01c7\7.\2\2\u01c7"+
		"\u008c\3\2\2\2\u01c8\u01c9\7\60\2\2\u01c9\u008e\3\2\2\2\u01ca\u01cc\t"+
		"\5\2\2\u01cb\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd"+
		"\u01ce\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\bH\2\2\u01d0\u0090\3\2"+
		"\2\2\13\2\u0139\u0147\u0152\u015a\u016a\u0173\u017c\u01cd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}