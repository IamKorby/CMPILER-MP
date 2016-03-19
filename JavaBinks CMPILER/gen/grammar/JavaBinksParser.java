// Generated from /Users/hannah/Documents/IntelliJ Path/JavaBinks CMPILER/src/grammar/JavaBinks.g4 by ANTLR 4.5.1
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaBinksParser extends Parser {
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
	public static final int
		RULE_start = 0, RULE_r = 1, RULE_datatype = 2, RULE_returntype = 3, RULE_operator = 4, 
		RULE_specialOperator = 5, RULE_special2Operator = 6, RULE_logicalOperator = 7, 
		RULE_value = 8, RULE_specialValue = 9, RULE_declaration = 10, RULE_multiDec = 11, 
		RULE_singleDec = 12, RULE_assignment = 13, RULE_conditionalStatement = 14, 
		RULE_ifBlock = 15, RULE_elseIfBlock = 16, RULE_ifCondition = 17, RULE_elseCondition = 18, 
		RULE_elseIf = 19, RULE_switchBlock = 20, RULE_switchCase = 21, RULE_caseBlock = 22, 
		RULE_caseCondition = 23, RULE_defaultBlock = 24, RULE_conditionalExpression = 25, 
		RULE_loopStatement = 26, RULE_whileBlock = 27, RULE_doWhileBlock = 28, 
		RULE_forBlock = 29, RULE_decValue = 30, RULE_initValue = 31, RULE_step = 32, 
		RULE_expression = 33, RULE_functionDeclaration = 34, RULE_declarationParameter = 35, 
		RULE_multiDeclarationParameter = 36, RULE_singleDeclarationParameter = 37, 
		RULE_returnStatement = 38, RULE_functionCall = 39, RULE_functionCallNoTerminator = 40, 
		RULE_callParameter = 41, RULE_array = 42, RULE_arrayAssignment = 43, RULE_list = 44, 
		RULE_boolList = 45, RULE_charList = 46, RULE_floatList = 47, RULE_integerList = 48, 
		RULE_stringList = 49, RULE_codeBlock = 50, RULE_main = 51, RULE_returnMain = 52;
	public static final String[] ruleNames = {
		"start", "r", "datatype", "returntype", "operator", "specialOperator", 
		"special2Operator", "logicalOperator", "value", "specialValue", "declaration", 
		"multiDec", "singleDec", "assignment", "conditionalStatement", "ifBlock", 
		"elseIfBlock", "ifCondition", "elseCondition", "elseIf", "switchBlock", 
		"switchCase", "caseBlock", "caseCondition", "defaultBlock", "conditionalExpression", 
		"loopStatement", "whileBlock", "doWhileBlock", "forBlock", "decValue", 
		"initValue", "step", "expression", "functionDeclaration", "declarationParameter", 
		"multiDeclarationParameter", "singleDeclarationParameter", "returnStatement", 
		"functionCall", "functionCallNoTerminator", "callParameter", "array", 
		"arrayAssignment", "list", "boolList", "charList", "floatList", "integerList", 
		"stringList", "codeBlock", "main", "returnMain"
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

	@Override
	public String getGrammarFileName() { return "JavaBinks.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaBinksParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public RContext r() {
			return getRuleContext(RContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JavaBinksParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			main();
			setState(107);
			r();
			setState(108);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RContext extends ParserRuleContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_r);
		try {
			setState(112);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case INT:
			case STRING:
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				functionDeclaration();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatatypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(JavaBinksParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(JavaBinksParser.CHAR, 0); }
		public TerminalNode FLOAT() { return getToken(JavaBinksParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(JavaBinksParser.INT, 0); }
		public TerminalNode STRING() { return getToken(JavaBinksParser.STRING, 0); }
		public DatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterDatatype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitDatatype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitDatatype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_datatype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturntypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(JavaBinksParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(JavaBinksParser.CHAR, 0); }
		public TerminalNode FLOAT() { return getToken(JavaBinksParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(JavaBinksParser.INT, 0); }
		public TerminalNode STRING() { return getToken(JavaBinksParser.STRING, 0); }
		public TerminalNode VOID() { return getToken(JavaBinksParser.VOID, 0); }
		public ReturntypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returntype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterReturntype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitReturntype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitReturntype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturntypeContext returntype() throws RecognitionException {
		ReturntypeContext _localctx = new ReturntypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_returntype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << VOID))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(JavaBinksParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(JavaBinksParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(JavaBinksParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(JavaBinksParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(JavaBinksParser.MOD, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecialOperatorContext extends ParserRuleContext {
		public TerminalNode ADD_ASSIGN() { return getToken(JavaBinksParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(JavaBinksParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(JavaBinksParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(JavaBinksParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(JavaBinksParser.MOD_ASSIGN, 0); }
		public SpecialOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterSpecialOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitSpecialOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitSpecialOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialOperatorContext specialOperator() throws RecognitionException {
		SpecialOperatorContext _localctx = new SpecialOperatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_specialOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD_ASSIGN) | (1L << SUB_ASSIGN) | (1L << MUL_ASSIGN) | (1L << DIV_ASSIGN) | (1L << MOD_ASSIGN))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Special2OperatorContext extends ParserRuleContext {
		public TerminalNode INCR() { return getToken(JavaBinksParser.INCR, 0); }
		public TerminalNode DECR() { return getToken(JavaBinksParser.DECR, 0); }
		public Special2OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special2Operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterSpecial2Operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitSpecial2Operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitSpecial2Operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Special2OperatorContext special2Operator() throws RecognitionException {
		Special2OperatorContext _localctx = new Special2OperatorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_special2Operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_la = _input.LA(1);
			if ( !(_la==INCR || _la==DECR) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalOperatorContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(JavaBinksParser.NOT, 0); }
		public TerminalNode AND() { return getToken(JavaBinksParser.AND, 0); }
		public TerminalNode OR() { return getToken(JavaBinksParser.OR, 0); }
		public TerminalNode GT() { return getToken(JavaBinksParser.GT, 0); }
		public TerminalNode LT() { return getToken(JavaBinksParser.LT, 0); }
		public TerminalNode EQUAL() { return getToken(JavaBinksParser.EQUAL, 0); }
		public TerminalNode GE() { return getToken(JavaBinksParser.GE, 0); }
		public TerminalNode LE() { return getToken(JavaBinksParser.LE, 0); }
		public TerminalNode NOTEQUAL() { return getToken(JavaBinksParser.NOTEQUAL, 0); }
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterLogicalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitLogicalOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitLogicalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_logicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << AND) | (1L << OR) | (1L << GT) | (1L << LT) | (1L << EQUAL) | (1L << GE) | (1L << LE) | (1L << NOTEQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode BooleanLiteral() { return getToken(JavaBinksParser.BooleanLiteral, 0); }
		public TerminalNode CharLiteral() { return getToken(JavaBinksParser.CharLiteral, 0); }
		public TerminalNode FloatLiteral() { return getToken(JavaBinksParser.FloatLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(JavaBinksParser.IntegerLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(JavaBinksParser.StringLiteral, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BooleanLiteral) | (1L << CharLiteral) | (1L << FloatLiteral) | (1L << IntegerLiteral) | (1L << StringLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecialValueContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode VariableFuncName() { return getToken(JavaBinksParser.VariableFuncName, 0); }
		public FunctionCallNoTerminatorContext functionCallNoTerminator() {
			return getRuleContext(FunctionCallNoTerminatorContext.class,0);
		}
		public SpecialValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterSpecialValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitSpecialValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitSpecialValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialValueContext specialValue() throws RecognitionException {
		SpecialValueContext _localctx = new SpecialValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_specialValue);
		try {
			setState(131);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(VariableFuncName);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				functionCallNoTerminator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public SingleDecContext singleDec() {
			return getRuleContext(SingleDecContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaBinksParser.SEMI, 0); }
		public MultiDecContext multiDec() {
			return getRuleContext(MultiDecContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaration);
		try {
			setState(141);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				datatype();
				setState(134);
				singleDec();
				setState(135);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				datatype();
				setState(138);
				multiDec();
				setState(139);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiDecContext extends ParserRuleContext {
		public SingleDecContext singleDec() {
			return getRuleContext(SingleDecContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(JavaBinksParser.COMMA, 0); }
		public MultiDecContext multiDec() {
			return getRuleContext(MultiDecContext.class,0);
		}
		public MultiDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterMultiDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitMultiDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitMultiDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiDecContext multiDec() throws RecognitionException {
		MultiDecContext _localctx = new MultiDecContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_multiDec);
		try {
			setState(148);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				singleDec();
				setState(144);
				match(COMMA);
				setState(145);
				multiDec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				singleDec();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleDecContext extends ParserRuleContext {
		public TerminalNode VariableFuncName() { return getToken(JavaBinksParser.VariableFuncName, 0); }
		public TerminalNode ASSIGN() { return getToken(JavaBinksParser.ASSIGN, 0); }
		public SpecialValueContext specialValue() {
			return getRuleContext(SpecialValueContext.class,0);
		}
		public SingleDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterSingleDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitSingleDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitSingleDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleDecContext singleDec() throws RecognitionException {
		SingleDecContext _localctx = new SingleDecContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_singleDec);
		try {
			setState(154);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(VariableFuncName);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(VariableFuncName);
				setState(152);
				match(ASSIGN);
				setState(153);
				specialValue();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode VariableFuncName() { return getToken(JavaBinksParser.VariableFuncName, 0); }
		public TerminalNode ASSIGN() { return getToken(JavaBinksParser.ASSIGN, 0); }
		public SpecialValueContext specialValue() {
			return getRuleContext(SpecialValueContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaBinksParser.SEMI, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(VariableFuncName);
			setState(157);
			match(ASSIGN);
			setState(158);
			specialValue();
			setState(159);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalStatementContext extends ParserRuleContext {
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public ConditionalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterConditionalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitConditionalStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitConditionalStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalStatementContext conditionalStatement() throws RecognitionException {
		ConditionalStatementContext _localctx = new ConditionalStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_conditionalStatement);
		try {
			setState(163);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				ifBlock();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				switchBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfBlockContext extends ParserRuleContext {
		public IfConditionContext ifCondition() {
			return getRuleContext(IfConditionContext.class,0);
		}
		public ElseIfBlockContext elseIfBlock() {
			return getRuleContext(ElseIfBlockContext.class,0);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ifBlock);
		try {
			setState(169);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				ifCondition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				ifCondition();
				setState(167);
				elseIfBlock();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseIfBlockContext extends ParserRuleContext {
		public ElseIfContext elseIf() {
			return getRuleContext(ElseIfContext.class,0);
		}
		public ElseIfBlockContext elseIfBlock() {
			return getRuleContext(ElseIfBlockContext.class,0);
		}
		public ElseConditionContext elseCondition() {
			return getRuleContext(ElseConditionContext.class,0);
		}
		public ElseIfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterElseIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitElseIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitElseIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfBlockContext elseIfBlock() throws RecognitionException {
		ElseIfBlockContext _localctx = new ElseIfBlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_elseIfBlock);
		try {
			setState(176);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				elseIf();
				setState(172);
				elseIfBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				elseIf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				elseCondition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfConditionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(JavaBinksParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(JavaBinksParser.LPAREN, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaBinksParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(JavaBinksParser.LBRACE, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(JavaBinksParser.RBRACE, 0); }
		public IfConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterIfCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitIfCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitIfCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfConditionContext ifCondition() throws RecognitionException {
		IfConditionContext _localctx = new IfConditionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ifCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(IF);
			setState(179);
			match(LPAREN);
			setState(180);
			conditionalExpression();
			setState(181);
			match(RPAREN);
			setState(182);
			match(LBRACE);
			setState(183);
			codeBlock();
			setState(184);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseConditionContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(JavaBinksParser.ELSE, 0); }
		public TerminalNode LBRACE() { return getToken(JavaBinksParser.LBRACE, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(JavaBinksParser.RBRACE, 0); }
		public ElseConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterElseCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitElseCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitElseCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseConditionContext elseCondition() throws RecognitionException {
		ElseConditionContext _localctx = new ElseConditionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_elseCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(ELSE);
			setState(187);
			match(LBRACE);
			setState(188);
			codeBlock();
			setState(189);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseIfContext extends ParserRuleContext {
		public TerminalNode ELSEIF() { return getToken(JavaBinksParser.ELSEIF, 0); }
		public TerminalNode LPAREN() { return getToken(JavaBinksParser.LPAREN, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaBinksParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(JavaBinksParser.LBRACE, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(JavaBinksParser.RBRACE, 0); }
		public ElseIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterElseIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitElseIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitElseIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfContext elseIf() throws RecognitionException {
		ElseIfContext _localctx = new ElseIfContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_elseIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(ELSEIF);
			setState(192);
			match(LPAREN);
			setState(193);
			conditionalExpression();
			setState(194);
			match(RPAREN);
			setState(195);
			match(LBRACE);
			setState(196);
			codeBlock();
			setState(197);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(JavaBinksParser.SWITCH, 0); }
		public TerminalNode LPAREN() { return getToken(JavaBinksParser.LPAREN, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaBinksParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(JavaBinksParser.LBRACE, 0); }
		public SwitchCaseContext switchCase() {
			return getRuleContext(SwitchCaseContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(JavaBinksParser.RBRACE, 0); }
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitSwitchBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitSwitchBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_switchBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(SWITCH);
			setState(200);
			match(LPAREN);
			setState(201);
			conditionalExpression();
			setState(202);
			match(RPAREN);
			setState(203);
			match(LBRACE);
			setState(204);
			switchCase();
			setState(205);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchCaseContext extends ParserRuleContext {
		public CaseBlockContext caseBlock() {
			return getRuleContext(CaseBlockContext.class,0);
		}
		public SwitchCaseContext switchCase() {
			return getRuleContext(SwitchCaseContext.class,0);
		}
		public DefaultBlockContext defaultBlock() {
			return getRuleContext(DefaultBlockContext.class,0);
		}
		public SwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitSwitchCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitSwitchCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchCaseContext switchCase() throws RecognitionException {
		SwitchCaseContext _localctx = new SwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_switchCase);
		try {
			setState(212);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				caseBlock();
				setState(208);
				switchCase();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				caseBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				defaultBlock();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseBlockContext extends ParserRuleContext {
		public CaseConditionContext caseCondition() {
			return getRuleContext(CaseConditionContext.class,0);
		}
		public CaseBlockContext caseBlock() {
			return getRuleContext(CaseBlockContext.class,0);
		}
		public CaseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterCaseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitCaseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitCaseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseBlockContext caseBlock() throws RecognitionException {
		CaseBlockContext _localctx = new CaseBlockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_caseBlock);
		try {
			setState(218);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				caseCondition();
				setState(215);
				caseBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				caseCondition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseConditionContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(JavaBinksParser.CASE, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(JavaBinksParser.LBRACE, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(JavaBinksParser.RBRACE, 0); }
		public TerminalNode BREAK() { return getToken(JavaBinksParser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(JavaBinksParser.SEMI, 0); }
		public CaseConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterCaseCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitCaseCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitCaseCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseConditionContext caseCondition() throws RecognitionException {
		CaseConditionContext _localctx = new CaseConditionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_caseCondition);
		try {
			setState(236);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(CASE);
				setState(221);
				value();
				setState(222);
				match(T__0);
				setState(223);
				match(LBRACE);
				setState(224);
				codeBlock();
				setState(225);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(CASE);
				setState(228);
				value();
				setState(229);
				match(T__0);
				setState(230);
				match(LBRACE);
				setState(231);
				codeBlock();
				setState(232);
				match(RBRACE);
				setState(233);
				match(BREAK);
				setState(234);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultBlockContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(JavaBinksParser.DEFAULT, 0); }
		public TerminalNode LBRACE() { return getToken(JavaBinksParser.LBRACE, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(JavaBinksParser.RBRACE, 0); }
		public TerminalNode BREAK() { return getToken(JavaBinksParser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(JavaBinksParser.SEMI, 0); }
		public DefaultBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterDefaultBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitDefaultBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitDefaultBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultBlockContext defaultBlock() throws RecognitionException {
		DefaultBlockContext _localctx = new DefaultBlockContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_defaultBlock);
		try {
			setState(252);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(DEFAULT);
				setState(239);
				match(T__0);
				setState(240);
				match(LBRACE);
				setState(241);
				codeBlock();
				setState(242);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				match(DEFAULT);
				setState(245);
				match(T__0);
				setState(246);
				match(LBRACE);
				setState(247);
				codeBlock();
				setState(248);
				match(RBRACE);
				setState(249);
				match(BREAK);
				setState(250);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public List<SpecialValueContext> specialValue() {
			return getRuleContexts(SpecialValueContext.class);
		}
		public SpecialValueContext specialValue(int i) {
			return getRuleContext(SpecialValueContext.class,i);
		}
		public LogicalOperatorContext logicalOperator() {
			return getRuleContext(LogicalOperatorContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_conditionalExpression);
		try {
			setState(259);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				specialValue();
				setState(255);
				logicalOperator();
				setState(256);
				specialValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				specialValue();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopStatementContext extends ParserRuleContext {
		public WhileBlockContext whileBlock() {
			return getRuleContext(WhileBlockContext.class,0);
		}
		public DoWhileBlockContext doWhileBlock() {
			return getRuleContext(DoWhileBlockContext.class,0);
		}
		public ForBlockContext forBlock() {
			return getRuleContext(ForBlockContext.class,0);
		}
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_loopStatement);
		try {
			setState(264);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				whileBlock();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				doWhileBlock();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
				forBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileBlockContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(JavaBinksParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(JavaBinksParser.LPAREN, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaBinksParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(JavaBinksParser.LBRACE, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(JavaBinksParser.RBRACE, 0); }
		public WhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterWhileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitWhileBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitWhileBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileBlockContext whileBlock() throws RecognitionException {
		WhileBlockContext _localctx = new WhileBlockContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_whileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(WHILE);
			setState(267);
			match(LPAREN);
			setState(268);
			conditionalExpression();
			setState(269);
			match(RPAREN);
			setState(270);
			match(LBRACE);
			setState(271);
			codeBlock();
			setState(272);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoWhileBlockContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(JavaBinksParser.DO, 0); }
		public TerminalNode LBRACE() { return getToken(JavaBinksParser.LBRACE, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public List<TerminalNode> RBRACE() { return getTokens(JavaBinksParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(JavaBinksParser.RBRACE, i);
		}
		public TerminalNode WHILE() { return getToken(JavaBinksParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(JavaBinksParser.LPAREN, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaBinksParser.SEMI, 0); }
		public DoWhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterDoWhileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitDoWhileBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitDoWhileBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileBlockContext doWhileBlock() throws RecognitionException {
		DoWhileBlockContext _localctx = new DoWhileBlockContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_doWhileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(DO);
			setState(275);
			match(LBRACE);
			setState(276);
			codeBlock();
			setState(277);
			match(RBRACE);
			setState(278);
			match(WHILE);
			setState(279);
			match(LPAREN);
			setState(280);
			conditionalExpression();
			setState(281);
			match(RBRACE);
			setState(282);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForBlockContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(JavaBinksParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(JavaBinksParser.LPAREN, 0); }
		public DecValueContext decValue() {
			return getRuleContext(DecValueContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(JavaBinksParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(JavaBinksParser.SEMI, i);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public StepContext step() {
			return getRuleContext(StepContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaBinksParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(JavaBinksParser.LBRACE, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(JavaBinksParser.RBRACE, 0); }
		public ForBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterForBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitForBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitForBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForBlockContext forBlock() throws RecognitionException {
		ForBlockContext _localctx = new ForBlockContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_forBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(FOR);
			setState(285);
			match(LPAREN);
			setState(286);
			decValue();
			setState(287);
			match(SEMI);
			setState(288);
			conditionalExpression();
			setState(289);
			match(SEMI);
			setState(290);
			step();
			setState(291);
			match(RPAREN);
			setState(292);
			match(LBRACE);
			setState(293);
			codeBlock();
			setState(294);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(JavaBinksParser.INT, 0); }
		public TerminalNode VariableFuncName() { return getToken(JavaBinksParser.VariableFuncName, 0); }
		public TerminalNode ASSIGN() { return getToken(JavaBinksParser.ASSIGN, 0); }
		public InitValueContext initValue() {
			return getRuleContext(InitValueContext.class,0);
		}
		public DecValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterDecValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitDecValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitDecValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecValueContext decValue() throws RecognitionException {
		DecValueContext _localctx = new DecValueContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_decValue);
		try {
			setState(303);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				match(INT);
				setState(297);
				match(VariableFuncName);
				setState(298);
				match(ASSIGN);
				setState(299);
				initValue();
				}
				break;
			case VariableFuncName:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				match(VariableFuncName);
				setState(301);
				match(ASSIGN);
				setState(302);
				initValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitValueContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(JavaBinksParser.IntegerLiteral, 0); }
		public TerminalNode VariableFuncName() { return getToken(JavaBinksParser.VariableFuncName, 0); }
		public InitValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterInitValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitInitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitInitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitValueContext initValue() throws RecognitionException {
		InitValueContext _localctx = new InitValueContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_initValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_la = _input.LA(1);
			if ( !(_la==VariableFuncName || _la==IntegerLiteral) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StepContext extends ParserRuleContext {
		public TerminalNode VariableFuncName() { return getToken(JavaBinksParser.VariableFuncName, 0); }
		public Special2OperatorContext special2Operator() {
			return getRuleContext(Special2OperatorContext.class,0);
		}
		public SpecialOperatorContext specialOperator() {
			return getRuleContext(SpecialOperatorContext.class,0);
		}
		public TerminalNode IntegerLiteral() { return getToken(JavaBinksParser.IntegerLiteral, 0); }
		public StepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StepContext step() throws RecognitionException {
		StepContext _localctx = new StepContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_step);
		try {
			setState(313);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				match(VariableFuncName);
				setState(308);
				special2Operator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				match(VariableFuncName);
				setState(310);
				specialOperator();
				setState(311);
				match(IntegerLiteral);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode VariableFuncName() { return getToken(JavaBinksParser.VariableFuncName, 0); }
		public TerminalNode LPAREN() { return getToken(JavaBinksParser.LPAREN, 0); }
		public DeclarationParameterContext declarationParameter() {
			return getRuleContext(DeclarationParameterContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaBinksParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(JavaBinksParser.LBRACE, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(JavaBinksParser.RBRACE, 0); }
		public TerminalNode VOID() { return getToken(JavaBinksParser.VOID, 0); }
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_functionDeclaration);
		try {
			setState(336);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case INT:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				datatype();
				setState(318);
				match(VariableFuncName);
				setState(319);
				match(LPAREN);
				setState(320);
				declarationParameter();
				setState(321);
				match(RPAREN);
				setState(322);
				match(LBRACE);
				setState(323);
				codeBlock();
				setState(324);
				match(RBRACE);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				match(VOID);
				setState(327);
				match(VariableFuncName);
				setState(328);
				match(LPAREN);
				setState(329);
				declarationParameter();
				setState(330);
				match(RPAREN);
				setState(331);
				match(LBRACE);
				setState(332);
				codeBlock();
				setState(333);
				returnStatement();
				setState(334);
				match(RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationParameterContext extends ParserRuleContext {
		public ReturntypeContext returntype() {
			return getRuleContext(ReturntypeContext.class,0);
		}
		public TerminalNode VariableFuncName() { return getToken(JavaBinksParser.VariableFuncName, 0); }
		public MultiDeclarationParameterContext multiDeclarationParameter() {
			return getRuleContext(MultiDeclarationParameterContext.class,0);
		}
		public SingleDeclarationParameterContext singleDeclarationParameter() {
			return getRuleContext(SingleDeclarationParameterContext.class,0);
		}
		public DeclarationParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterDeclarationParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitDeclarationParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitDeclarationParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationParameterContext declarationParameter() throws RecognitionException {
		DeclarationParameterContext _localctx = new DeclarationParameterContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_declarationParameter);
		try {
			setState(343);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				returntype();
				setState(339);
				match(VariableFuncName);
				setState(340);
				multiDeclarationParameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				singleDeclarationParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiDeclarationParameterContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(JavaBinksParser.COMMA, 0); }
		public DeclarationParameterContext declarationParameter() {
			return getRuleContext(DeclarationParameterContext.class,0);
		}
		public MultiDeclarationParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiDeclarationParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterMultiDeclarationParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitMultiDeclarationParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitMultiDeclarationParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiDeclarationParameterContext multiDeclarationParameter() throws RecognitionException {
		MultiDeclarationParameterContext _localctx = new MultiDeclarationParameterContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_multiDeclarationParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(COMMA);
			setState(346);
			declarationParameter();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleDeclarationParameterContext extends ParserRuleContext {
		public ReturntypeContext returntype() {
			return getRuleContext(ReturntypeContext.class,0);
		}
		public TerminalNode VariableFuncName() { return getToken(JavaBinksParser.VariableFuncName, 0); }
		public SingleDeclarationParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDeclarationParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterSingleDeclarationParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitSingleDeclarationParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitSingleDeclarationParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleDeclarationParameterContext singleDeclarationParameter() throws RecognitionException {
		SingleDeclarationParameterContext _localctx = new SingleDeclarationParameterContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_singleDeclarationParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			returntype();
			setState(349);
			match(VariableFuncName);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(JavaBinksParser.RETURN, 0); }
		public SpecialValueContext specialValue() {
			return getRuleContext(SpecialValueContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(RETURN);
			setState(352);
			specialValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode VariableFuncName() { return getToken(JavaBinksParser.VariableFuncName, 0); }
		public TerminalNode LPAREN() { return getToken(JavaBinksParser.LPAREN, 0); }
		public CallParameterContext callParameter() {
			return getRuleContext(CallParameterContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaBinksParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(JavaBinksParser.SEMI, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(VariableFuncName);
			setState(355);
			match(LPAREN);
			setState(356);
			callParameter();
			setState(357);
			match(RPAREN);
			setState(358);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallNoTerminatorContext extends ParserRuleContext {
		public TerminalNode VariableFuncName() { return getToken(JavaBinksParser.VariableFuncName, 0); }
		public TerminalNode LPAREN() { return getToken(JavaBinksParser.LPAREN, 0); }
		public CallParameterContext callParameter() {
			return getRuleContext(CallParameterContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaBinksParser.RPAREN, 0); }
		public FunctionCallNoTerminatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallNoTerminator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterFunctionCallNoTerminator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitFunctionCallNoTerminator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitFunctionCallNoTerminator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallNoTerminatorContext functionCallNoTerminator() throws RecognitionException {
		FunctionCallNoTerminatorContext _localctx = new FunctionCallNoTerminatorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_functionCallNoTerminator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(VariableFuncName);
			setState(361);
			match(LPAREN);
			setState(362);
			callParameter();
			setState(363);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallParameterContext extends ParserRuleContext {
		public SpecialValueContext specialValue() {
			return getRuleContext(SpecialValueContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(JavaBinksParser.COMMA, 0); }
		public CallParameterContext callParameter() {
			return getRuleContext(CallParameterContext.class,0);
		}
		public CallParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterCallParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitCallParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitCallParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallParameterContext callParameter() throws RecognitionException {
		CallParameterContext _localctx = new CallParameterContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_callParameter);
		try {
			setState(370);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				specialValue();
				setState(366);
				match(COMMA);
				setState(367);
				callParameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				specialValue();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public ArrayAssignmentContext arrayAssignment() {
			return getRuleContext(ArrayAssignmentContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			datatype();
			setState(373);
			arrayAssignment();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAssignmentContext extends ParserRuleContext {
		public TerminalNode VariableFuncName() { return getToken(JavaBinksParser.VariableFuncName, 0); }
		public TerminalNode LBRACK() { return getToken(JavaBinksParser.LBRACK, 0); }
		public TerminalNode Digits() { return getToken(JavaBinksParser.Digits, 0); }
		public TerminalNode RBRACK() { return getToken(JavaBinksParser.RBRACK, 0); }
		public TerminalNode ASSIGN() { return getToken(JavaBinksParser.ASSIGN, 0); }
		public TerminalNode LBRACE() { return getToken(JavaBinksParser.LBRACE, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(JavaBinksParser.RBRACE, 0); }
		public ArrayAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterArrayAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitArrayAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitArrayAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAssignmentContext arrayAssignment() throws RecognitionException {
		ArrayAssignmentContext _localctx = new ArrayAssignmentContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_arrayAssignment);
		try {
			setState(387);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				match(VariableFuncName);
				setState(376);
				match(LBRACK);
				setState(377);
				match(Digits);
				setState(378);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				match(VariableFuncName);
				setState(380);
				match(LBRACK);
				setState(381);
				match(RBRACK);
				setState(382);
				match(ASSIGN);
				setState(383);
				match(LBRACE);
				setState(384);
				list();
				setState(385);
				match(RBRACE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListContext extends ParserRuleContext {
		public BoolListContext boolList() {
			return getRuleContext(BoolListContext.class,0);
		}
		public CharListContext charList() {
			return getRuleContext(CharListContext.class,0);
		}
		public FloatListContext floatList() {
			return getRuleContext(FloatListContext.class,0);
		}
		public IntegerListContext integerList() {
			return getRuleContext(IntegerListContext.class,0);
		}
		public StringListContext stringList() {
			return getRuleContext(StringListContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_list);
		try {
			setState(394);
			switch (_input.LA(1)) {
			case BooleanLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				boolList();
				}
				break;
			case CharLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				charList();
				}
				break;
			case FloatLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(391);
				floatList();
				}
				break;
			case IntegerLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(392);
				integerList();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(393);
				stringList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolListContext extends ParserRuleContext {
		public TerminalNode BooleanLiteral() { return getToken(JavaBinksParser.BooleanLiteral, 0); }
		public TerminalNode COMMA() { return getToken(JavaBinksParser.COMMA, 0); }
		public BoolListContext boolList() {
			return getRuleContext(BoolListContext.class,0);
		}
		public BoolListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterBoolList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitBoolList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitBoolList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolListContext boolList() throws RecognitionException {
		BoolListContext _localctx = new BoolListContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_boolList);
		try {
			setState(400);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				match(BooleanLiteral);
				setState(397);
				match(COMMA);
				setState(398);
				boolList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				match(BooleanLiteral);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharListContext extends ParserRuleContext {
		public TerminalNode CharLiteral() { return getToken(JavaBinksParser.CharLiteral, 0); }
		public TerminalNode COMMA() { return getToken(JavaBinksParser.COMMA, 0); }
		public CharListContext charList() {
			return getRuleContext(CharListContext.class,0);
		}
		public CharListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterCharList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitCharList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitCharList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharListContext charList() throws RecognitionException {
		CharListContext _localctx = new CharListContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_charList);
		try {
			setState(406);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				match(CharLiteral);
				setState(403);
				match(COMMA);
				setState(404);
				charList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(405);
				match(CharLiteral);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatListContext extends ParserRuleContext {
		public TerminalNode FloatLiteral() { return getToken(JavaBinksParser.FloatLiteral, 0); }
		public TerminalNode COMMA() { return getToken(JavaBinksParser.COMMA, 0); }
		public FloatListContext floatList() {
			return getRuleContext(FloatListContext.class,0);
		}
		public FloatListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterFloatList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitFloatList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitFloatList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatListContext floatList() throws RecognitionException {
		FloatListContext _localctx = new FloatListContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_floatList);
		try {
			setState(412);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				match(FloatLiteral);
				setState(409);
				match(COMMA);
				setState(410);
				floatList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				match(FloatLiteral);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerListContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(JavaBinksParser.IntegerLiteral, 0); }
		public TerminalNode COMMA() { return getToken(JavaBinksParser.COMMA, 0); }
		public IntegerListContext integerList() {
			return getRuleContext(IntegerListContext.class,0);
		}
		public IntegerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterIntegerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitIntegerList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitIntegerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerListContext integerList() throws RecognitionException {
		IntegerListContext _localctx = new IntegerListContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_integerList);
		try {
			setState(418);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				match(IntegerLiteral);
				setState(415);
				match(COMMA);
				setState(416);
				integerList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(417);
				match(IntegerLiteral);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringListContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(JavaBinksParser.StringLiteral, 0); }
		public TerminalNode COMMA() { return getToken(JavaBinksParser.COMMA, 0); }
		public StringListContext stringList() {
			return getRuleContext(StringListContext.class,0);
		}
		public StringListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterStringList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitStringList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitStringList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringListContext stringList() throws RecognitionException {
		StringListContext _localctx = new StringListContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_stringList);
		try {
			setState(424);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				match(StringLiteral);
				setState(421);
				match(COMMA);
				setState(422);
				stringList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				match(StringLiteral);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeBlockContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ConditionalStatementContext conditionalStatement() {
			return getRuleContext(ConditionalStatementContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public CodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterCodeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitCodeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitCodeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeBlockContext codeBlock() throws RecognitionException {
		CodeBlockContext _localctx = new CodeBlockContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_codeBlock);
		try {
			setState(448);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				declaration();
				setState(427);
				codeBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				assignment();
				setState(430);
				codeBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(432);
				conditionalStatement();
				setState(433);
				codeBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(435);
				loopStatement();
				setState(436);
				codeBlock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(438);
				functionDeclaration();
				setState(439);
				codeBlock();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(441);
				functionCall();
				setState(442);
				codeBlock();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(444);
				array();
				setState(445);
				codeBlock();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(JavaBinksParser.INT, 0); }
		public TerminalNode LPAREN() { return getToken(JavaBinksParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaBinksParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(JavaBinksParser.LBRACE, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public ReturnMainContext returnMain() {
			return getRuleContext(ReturnMainContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaBinksParser.SEMI, 0); }
		public TerminalNode RBRACE() { return getToken(JavaBinksParser.RBRACE, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(INT);
			setState(451);
			match(T__1);
			setState(452);
			match(LPAREN);
			setState(453);
			match(RPAREN);
			setState(454);
			match(LBRACE);
			setState(455);
			codeBlock();
			setState(456);
			returnMain();
			setState(457);
			match(SEMI);
			setState(458);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnMainContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(JavaBinksParser.RETURN, 0); }
		public TerminalNode IntegerLiteral() { return getToken(JavaBinksParser.IntegerLiteral, 0); }
		public ReturnMainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnMain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterReturnMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitReturnMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitReturnMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnMainContext returnMain() throws RecognitionException {
		ReturnMainContext _localctx = new ReturnMainContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_returnMain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(RETURN);
			setState(461);
			match(IntegerLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3@\u01d2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\3\2\3\2\3\2\3\2\3\3\3\3\5\3s\n\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\5\13\u0086\n"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0090\n\f\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u0097\n\r\3\16\3\16\3\16\3\16\5\16\u009d\n\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\5\20\u00a6\n\20\3\21\3\21\3\21\3\21\5\21\u00ac\n\21\3"+
		"\22\3\22\3\22\3\22\3\22\5\22\u00b3\n\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u00d7\n\27\3\30\3\30\3\30\3\30\5\30\u00dd\n\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00ef"+
		"\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u00ff\n\32\3\33\3\33\3\33\3\33\3\33\5\33\u0106\n\33\3\34\3"+
		"\34\3\34\5\34\u010b\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \5 \u0132\n \3"+
		"!\3!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u013c\n\"\3#\3#\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0153\n$\3%\3%\3%\3%\3%\5%\u015a"+
		"\n%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+"+
		"\3+\3+\3+\3+\5+\u0175\n+\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\5-\u0186\n-\3.\3.\3.\3.\3.\5.\u018d\n.\3/\3/\3/\3/\5/\u0193\n/\3\60\3"+
		"\60\3\60\3\60\5\60\u0199\n\60\3\61\3\61\3\61\3\61\5\61\u019f\n\61\3\62"+
		"\3\62\3\62\3\62\5\62\u01a5\n\62\3\63\3\63\3\63\3\63\5\63\u01ab\n\63\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u01c3\n\64\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\2\2\67\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^`bdfhj\2\n\3\2\20\24\3\2\20\25\3\2 $\3\2\61\65\3\2%&\4\2\')+\60\3"+
		"\2\27\33\4\2\26\26\32\32\u01c4\2l\3\2\2\2\4r\3\2\2\2\6t\3\2\2\2\bv\3\2"+
		"\2\2\nx\3\2\2\2\fz\3\2\2\2\16|\3\2\2\2\20~\3\2\2\2\22\u0080\3\2\2\2\24"+
		"\u0085\3\2\2\2\26\u008f\3\2\2\2\30\u0096\3\2\2\2\32\u009c\3\2\2\2\34\u009e"+
		"\3\2\2\2\36\u00a5\3\2\2\2 \u00ab\3\2\2\2\"\u00b2\3\2\2\2$\u00b4\3\2\2"+
		"\2&\u00bc\3\2\2\2(\u00c1\3\2\2\2*\u00c9\3\2\2\2,\u00d6\3\2\2\2.\u00dc"+
		"\3\2\2\2\60\u00ee\3\2\2\2\62\u00fe\3\2\2\2\64\u0105\3\2\2\2\66\u010a\3"+
		"\2\2\28\u010c\3\2\2\2:\u0114\3\2\2\2<\u011e\3\2\2\2>\u0131\3\2\2\2@\u0133"+
		"\3\2\2\2B\u013b\3\2\2\2D\u013d\3\2\2\2F\u0152\3\2\2\2H\u0159\3\2\2\2J"+
		"\u015b\3\2\2\2L\u015e\3\2\2\2N\u0161\3\2\2\2P\u0164\3\2\2\2R\u016a\3\2"+
		"\2\2T\u0174\3\2\2\2V\u0176\3\2\2\2X\u0185\3\2\2\2Z\u018c\3\2\2\2\\\u0192"+
		"\3\2\2\2^\u0198\3\2\2\2`\u019e\3\2\2\2b\u01a4\3\2\2\2d\u01aa\3\2\2\2f"+
		"\u01c2\3\2\2\2h\u01c4\3\2\2\2j\u01ce\3\2\2\2lm\5h\65\2mn\5\4\3\2no\7\2"+
		"\2\3o\3\3\2\2\2ps\5F$\2qs\3\2\2\2rp\3\2\2\2rq\3\2\2\2s\5\3\2\2\2tu\t\2"+
		"\2\2u\7\3\2\2\2vw\t\3\2\2w\t\3\2\2\2xy\t\4\2\2y\13\3\2\2\2z{\t\5\2\2{"+
		"\r\3\2\2\2|}\t\6\2\2}\17\3\2\2\2~\177\t\7\2\2\177\21\3\2\2\2\u0080\u0081"+
		"\t\b\2\2\u0081\23\3\2\2\2\u0082\u0086\5\22\n\2\u0083\u0086\7\26\2\2\u0084"+
		"\u0086\5R*\2\u0085\u0082\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2"+
		"\2\u0086\25\3\2\2\2\u0087\u0088\5\6\4\2\u0088\u0089\5\32\16\2\u0089\u008a"+
		"\7<\2\2\u008a\u0090\3\2\2\2\u008b\u008c\5\6\4\2\u008c\u008d\5\30\r\2\u008d"+
		"\u008e\7<\2\2\u008e\u0090\3\2\2\2\u008f\u0087\3\2\2\2\u008f\u008b\3\2"+
		"\2\2\u0090\27\3\2\2\2\u0091\u0092\5\32\16\2\u0092\u0093\7=\2\2\u0093\u0094"+
		"\5\30\r\2\u0094\u0097\3\2\2\2\u0095\u0097\5\32\16\2\u0096\u0091\3\2\2"+
		"\2\u0096\u0095\3\2\2\2\u0097\31\3\2\2\2\u0098\u009d\7\26\2\2\u0099\u009a"+
		"\7\26\2\2\u009a\u009b\7*\2\2\u009b\u009d\5\24\13\2\u009c\u0098\3\2\2\2"+
		"\u009c\u0099\3\2\2\2\u009d\33\3\2\2\2\u009e\u009f\7\26\2\2\u009f\u00a0"+
		"\7*\2\2\u00a0\u00a1\5\24\13\2\u00a1\u00a2\7<\2\2\u00a2\35\3\2\2\2\u00a3"+
		"\u00a6\5 \21\2\u00a4\u00a6\5*\26\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2"+
		"\2\2\u00a6\37\3\2\2\2\u00a7\u00ac\5$\23\2\u00a8\u00a9\5$\23\2\u00a9\u00aa"+
		"\5\"\22\2\u00aa\u00ac\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ab\u00a8\3\2\2\2"+
		"\u00ac!\3\2\2\2\u00ad\u00ae\5(\25\2\u00ae\u00af\5\"\22\2\u00af\u00b3\3"+
		"\2\2\2\u00b0\u00b3\5(\25\2\u00b1\u00b3\5&\24\2\u00b2\u00ad\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3#\3\2\2\2\u00b4\u00b5\7\f\2\2"+
		"\u00b5\u00b6\7\66\2\2\u00b6\u00b7\5\64\33\2\u00b7\u00b8\7\67\2\2\u00b8"+
		"\u00b9\78\2\2\u00b9\u00ba\5f\64\2\u00ba\u00bb\79\2\2\u00bb%\3\2\2\2\u00bc"+
		"\u00bd\7\t\2\2\u00bd\u00be\78\2\2\u00be\u00bf\5f\64\2\u00bf\u00c0\79\2"+
		"\2\u00c0\'\3\2\2\2\u00c1\u00c2\7\n\2\2\u00c2\u00c3\7\66\2\2\u00c3\u00c4"+
		"\5\64\33\2\u00c4\u00c5\7\67\2\2\u00c5\u00c6\78\2\2\u00c6\u00c7\5f\64\2"+
		"\u00c7\u00c8\79\2\2\u00c8)\3\2\2\2\u00c9\u00ca\7\r\2\2\u00ca\u00cb\7\66"+
		"\2\2\u00cb\u00cc\5\64\33\2\u00cc\u00cd\7\67\2\2\u00cd\u00ce\78\2\2\u00ce"+
		"\u00cf\5,\27\2\u00cf\u00d0\79\2\2\u00d0+\3\2\2\2\u00d1\u00d2\5.\30\2\u00d2"+
		"\u00d3\5,\27\2\u00d3\u00d7\3\2\2\2\u00d4\u00d7\5.\30\2\u00d5\u00d7\5\62"+
		"\32\2\u00d6\u00d1\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7"+
		"-\3\2\2\2\u00d8\u00d9\5\60\31\2\u00d9\u00da\5.\30\2\u00da\u00dd\3\2\2"+
		"\2\u00db\u00dd\5\60\31\2\u00dc\u00d8\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd"+
		"/\3\2\2\2\u00de\u00df\7\6\2\2\u00df\u00e0\5\22\n\2\u00e0\u00e1\7\3\2\2"+
		"\u00e1\u00e2\78\2\2\u00e2\u00e3\5f\64\2\u00e3\u00e4\79\2\2\u00e4\u00ef"+
		"\3\2\2\2\u00e5\u00e6\7\6\2\2\u00e6\u00e7\5\22\n\2\u00e7\u00e8\7\3\2\2"+
		"\u00e8\u00e9\78\2\2\u00e9\u00ea\5f\64\2\u00ea\u00eb\79\2\2\u00eb\u00ec"+
		"\7\5\2\2\u00ec\u00ed\7<\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00de\3\2\2\2\u00ee"+
		"\u00e5\3\2\2\2\u00ef\61\3\2\2\2\u00f0\u00f1\7\7\2\2\u00f1\u00f2\7\3\2"+
		"\2\u00f2\u00f3\78\2\2\u00f3\u00f4\5f\64\2\u00f4\u00f5\79\2\2\u00f5\u00ff"+
		"\3\2\2\2\u00f6\u00f7\7\7\2\2\u00f7\u00f8\7\3\2\2\u00f8\u00f9\78\2\2\u00f9"+
		"\u00fa\5f\64\2\u00fa\u00fb\79\2\2\u00fb\u00fc\7\5\2\2\u00fc\u00fd\7<\2"+
		"\2\u00fd\u00ff\3\2\2\2\u00fe\u00f0\3\2\2\2\u00fe\u00f6\3\2\2\2\u00ff\63"+
		"\3\2\2\2\u0100\u0101\5\24\13\2\u0101\u0102\5\20\t\2\u0102\u0103\5\24\13"+
		"\2\u0103\u0106\3\2\2\2\u0104\u0106\5\24\13\2\u0105\u0100\3\2\2\2\u0105"+
		"\u0104\3\2\2\2\u0106\65\3\2\2\2\u0107\u010b\58\35\2\u0108\u010b\5:\36"+
		"\2\u0109\u010b\5<\37\2\u010a\u0107\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u0109"+
		"\3\2\2\2\u010b\67\3\2\2\2\u010c\u010d\7\16\2\2\u010d\u010e\7\66\2\2\u010e"+
		"\u010f\5\64\33\2\u010f\u0110\7\67\2\2\u0110\u0111\78\2\2\u0111\u0112\5"+
		"f\64\2\u0112\u0113\79\2\2\u01139\3\2\2\2\u0114\u0115\7\b\2\2\u0115\u0116"+
		"\78\2\2\u0116\u0117\5f\64\2\u0117\u0118\79\2\2\u0118\u0119\7\16\2\2\u0119"+
		"\u011a\7\66\2\2\u011a\u011b\5\64\33\2\u011b\u011c\79\2\2\u011c\u011d\7"+
		"<\2\2\u011d;\3\2\2\2\u011e\u011f\7\13\2\2\u011f\u0120\7\66\2\2\u0120\u0121"+
		"\5> \2\u0121\u0122\7<\2\2\u0122\u0123\5\64\33\2\u0123\u0124\7<\2\2\u0124"+
		"\u0125\5B\"\2\u0125\u0126\7\67\2\2\u0126\u0127\78\2\2\u0127\u0128\5f\64"+
		"\2\u0128\u0129\79\2\2\u0129=\3\2\2\2\u012a\u012b\7\23\2\2\u012b\u012c"+
		"\7\26\2\2\u012c\u012d\7*\2\2\u012d\u0132\5@!\2\u012e\u012f\7\26\2\2\u012f"+
		"\u0130\7*\2\2\u0130\u0132\5@!\2\u0131\u012a\3\2\2\2\u0131\u012e\3\2\2"+
		"\2\u0132?\3\2\2\2\u0133\u0134\t\t\2\2\u0134A\3\2\2\2\u0135\u0136\7\26"+
		"\2\2\u0136\u013c\5\16\b\2\u0137\u0138\7\26\2\2\u0138\u0139\5\f\7\2\u0139"+
		"\u013a\7\32\2\2\u013a\u013c\3\2\2\2\u013b\u0135\3\2\2\2\u013b\u0137\3"+
		"\2\2\2\u013cC\3\2\2\2\u013d\u013e\3\2\2\2\u013eE\3\2\2\2\u013f\u0140\5"+
		"\6\4\2\u0140\u0141\7\26\2\2\u0141\u0142\7\66\2\2\u0142\u0143\5H%\2\u0143"+
		"\u0144\7\67\2\2\u0144\u0145\78\2\2\u0145\u0146\5f\64\2\u0146\u0147\79"+
		"\2\2\u0147\u0153\3\2\2\2\u0148\u0149\7\25\2\2\u0149\u014a\7\26\2\2\u014a"+
		"\u014b\7\66\2\2\u014b\u014c\5H%\2\u014c\u014d\7\67\2\2\u014d\u014e\78"+
		"\2\2\u014e\u014f\5f\64\2\u014f\u0150\5N(\2\u0150\u0151\79\2\2\u0151\u0153"+
		"\3\2\2\2\u0152\u013f\3\2\2\2\u0152\u0148\3\2\2\2\u0153G\3\2\2\2\u0154"+
		"\u0155\5\b\5\2\u0155\u0156\7\26\2\2\u0156\u0157\5J&\2\u0157\u015a\3\2"+
		"\2\2\u0158\u015a\5L\'\2\u0159\u0154\3\2\2\2\u0159\u0158\3\2\2\2\u015a"+
		"I\3\2\2\2\u015b\u015c\7=\2\2\u015c\u015d\5H%\2\u015dK\3\2\2\2\u015e\u015f"+
		"\5\b\5\2\u015f\u0160\7\26\2\2\u0160M\3\2\2\2\u0161\u0162\7\17\2\2\u0162"+
		"\u0163\5\24\13\2\u0163O\3\2\2\2\u0164\u0165\7\26\2\2\u0165\u0166\7\66"+
		"\2\2\u0166\u0167\5T+\2\u0167\u0168\7\67\2\2\u0168\u0169\7<\2\2\u0169Q"+
		"\3\2\2\2\u016a\u016b\7\26\2\2\u016b\u016c\7\66\2\2\u016c\u016d\5T+\2\u016d"+
		"\u016e\7\67\2\2\u016eS\3\2\2\2\u016f\u0170\5\24\13\2\u0170\u0171\7=\2"+
		"\2\u0171\u0172\5T+\2\u0172\u0175\3\2\2\2\u0173\u0175\5\24\13\2\u0174\u016f"+
		"\3\2\2\2\u0174\u0173\3\2\2\2\u0175U\3\2\2\2\u0176\u0177\5\6\4\2\u0177"+
		"\u0178\5X-\2\u0178W\3\2\2\2\u0179\u017a\7\26\2\2\u017a\u017b\7:\2\2\u017b"+
		"\u017c\7\35\2\2\u017c\u0186\7;\2\2\u017d\u017e\7\26\2\2\u017e\u017f\7"+
		":\2\2\u017f\u0180\7;\2\2\u0180\u0181\7*\2\2\u0181\u0182\78\2\2\u0182\u0183"+
		"\5Z.\2\u0183\u0184\79\2\2\u0184\u0186\3\2\2\2\u0185\u0179\3\2\2\2\u0185"+
		"\u017d\3\2\2\2\u0186Y\3\2\2\2\u0187\u018d\5\\/\2\u0188\u018d\5^\60\2\u0189"+
		"\u018d\5`\61\2\u018a\u018d\5b\62\2\u018b\u018d\5d\63\2\u018c\u0187\3\2"+
		"\2\2\u018c\u0188\3\2\2\2\u018c\u0189\3\2\2\2\u018c\u018a\3\2\2\2\u018c"+
		"\u018b\3\2\2\2\u018d[\3\2\2\2\u018e\u018f\7\27\2\2\u018f\u0190\7=\2\2"+
		"\u0190\u0193\5\\/\2\u0191\u0193\7\27\2\2\u0192\u018e\3\2\2\2\u0192\u0191"+
		"\3\2\2\2\u0193]\3\2\2\2\u0194\u0195\7\30\2\2\u0195\u0196\7=\2\2\u0196"+
		"\u0199\5^\60\2\u0197\u0199\7\30\2\2\u0198\u0194\3\2\2\2\u0198\u0197\3"+
		"\2\2\2\u0199_\3\2\2\2\u019a\u019b\7\31\2\2\u019b\u019c\7=\2\2\u019c\u019f"+
		"\5`\61\2\u019d\u019f\7\31\2\2\u019e\u019a\3\2\2\2\u019e\u019d\3\2\2\2"+
		"\u019fa\3\2\2\2\u01a0\u01a1\7\32\2\2\u01a1\u01a2\7=\2\2\u01a2\u01a5\5"+
		"b\62\2\u01a3\u01a5\7\32\2\2\u01a4\u01a0\3\2\2\2\u01a4\u01a3\3\2\2\2\u01a5"+
		"c\3\2\2\2\u01a6\u01a7\7\33\2\2\u01a7\u01a8\7=\2\2\u01a8\u01ab\5d\63\2"+
		"\u01a9\u01ab\7\33\2\2\u01aa\u01a6\3\2\2\2\u01aa\u01a9\3\2\2\2\u01abe\3"+
		"\2\2\2\u01ac\u01ad\5\26\f\2\u01ad\u01ae\5f\64\2\u01ae\u01c3\3\2\2\2\u01af"+
		"\u01b0\5\34\17\2\u01b0\u01b1\5f\64\2\u01b1\u01c3\3\2\2\2\u01b2\u01b3\5"+
		"\36\20\2\u01b3\u01b4\5f\64\2\u01b4\u01c3\3\2\2\2\u01b5\u01b6\5\66\34\2"+
		"\u01b6\u01b7\5f\64\2\u01b7\u01c3\3\2\2\2\u01b8\u01b9\5F$\2\u01b9\u01ba"+
		"\5f\64\2\u01ba\u01c3\3\2\2\2\u01bb\u01bc\5P)\2\u01bc\u01bd\5f\64\2\u01bd"+
		"\u01c3\3\2\2\2\u01be\u01bf\5V,\2\u01bf\u01c0\5f\64\2\u01c0\u01c3\3\2\2"+
		"\2\u01c1\u01c3\3\2\2\2\u01c2\u01ac\3\2\2\2\u01c2\u01af\3\2\2\2\u01c2\u01b2"+
		"\3\2\2\2\u01c2\u01b5\3\2\2\2\u01c2\u01b8\3\2\2\2\u01c2\u01bb\3\2\2\2\u01c2"+
		"\u01be\3\2\2\2\u01c2\u01c1\3\2\2\2\u01c3g\3\2\2\2\u01c4\u01c5\7\23\2\2"+
		"\u01c5\u01c6\7\4\2\2\u01c6\u01c7\7\66\2\2\u01c7\u01c8\7\67\2\2\u01c8\u01c9"+
		"\78\2\2\u01c9\u01ca\5f\64\2\u01ca\u01cb\5j\66\2\u01cb\u01cc\7<\2\2\u01cc"+
		"\u01cd\79\2\2\u01cdi\3\2\2\2\u01ce\u01cf\7\17\2\2\u01cf\u01d0\7\32\2\2"+
		"\u01d0k\3\2\2\2\35r\u0085\u008f\u0096\u009c\u00a5\u00ab\u00b2\u00d6\u00dc"+
		"\u00ee\u00fe\u0105\u010a\u0131\u013b\u0152\u0159\u0174\u0185\u018c\u0192"+
		"\u0198\u019e\u01a4\u01aa\u01c2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}