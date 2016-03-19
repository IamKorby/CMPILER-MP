// Generated from C:/Users/WilliamPC/Documents/CMPILER/MP/JavaBinks CMPILER/src/grammar\JavaBinks.g4 by ANTLR 4.5.1
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
		Digits=27, Digit=28, ADD=29, SUB=30, MUL=31, DIV=32, MOD=33, INCR=34, 
		DECR=35, NOT=36, AND=37, OR=38, ASSIGN=39, GT=40, LT=41, EQUAL=42, GE=43, 
		LE=44, NOTEQUAL=45, ADD_ASSIGN=46, SUB_ASSIGN=47, MUL_ASSIGN=48, DIV_ASSIGN=49, 
		MOD_ASSIGN=50, LPAREN=51, RPAREN=52, LBRACE=53, RBRACE=54, LBRACK=55, 
		RBRACK=56, SEMI=57, COMMA=58, DOT=59, COMMENT=60, WS=61;
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
		RULE_expression = 33, RULE_expr = 34, RULE_functionDeclaration = 35, RULE_declarationParameter = 36, 
		RULE_multiDeclarationParameter = 37, RULE_singleDeclarationParameter = 38, 
		RULE_returnStatement = 39, RULE_functionCall = 40, RULE_functionCallNoTerminator = 41, 
		RULE_callParameter = 42, RULE_array = 43, RULE_arrayAssignment = 44, RULE_list = 45, 
		RULE_boolList = 46, RULE_charList = 47, RULE_floatList = 48, RULE_integerList = 49, 
		RULE_stringList = 50, RULE_codeBlock = 51, RULE_main = 52, RULE_returnMain = 53;
	public static final String[] ruleNames = {
		"start", "r", "datatype", "returntype", "operator", "specialOperator", 
		"special2Operator", "logicalOperator", "value", "specialValue", "declaration", 
		"multiDec", "singleDec", "assignment", "conditionalStatement", "ifBlock", 
		"elseIfBlock", "ifCondition", "elseCondition", "elseIf", "switchBlock", 
		"switchCase", "caseBlock", "caseCondition", "defaultBlock", "conditionalExpression", 
		"loopStatement", "whileBlock", "doWhileBlock", "forBlock", "decValue", 
		"initValue", "step", "expression", "expr", "functionDeclaration", "declarationParameter", 
		"multiDeclarationParameter", "singleDeclarationParameter", "returnStatement", 
		"functionCall", "functionCallNoTerminator", "callParameter", "array", 
		"arrayAssignment", "list", "boolList", "charList", "floatList", "integerList", 
		"stringList", "codeBlock", "main", "returnMain"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'main'", "'fett'", "'clone'", "'kaminoans'", "'iloveyou'", 
		"'storm'", "'stormtrooper'", "'force'", "'trooper'", "'kamino'", "'iknow'", 
		"'jedi'", "'boolean'", "'char'", "'float'", "'int'", "'String'", "'void'", 
		null, null, null, null, null, null, "'null'", null, null, "'+'", "'-'", 
		"'*'", "'/'", "'%'", "'++'", "'--'", "'!'", "'&&'", "'||'", "'='", "'>'", 
		"'<'", "'=='", "'>='", "'<='", "'!='", "'+='", "'-='", "'*='", "'/='", 
		"'%='", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "BREAK", "CASE", "DEFAULT", "DO", "ELSE", "ELSEIF", 
		"FOR", "IF", "SWITCH", "WHILE", "RETURN", "BOOLEAN", "CHAR", "FLOAT", 
		"INT", "STRING", "VOID", "VariableFuncName", "BooleanLiteral", "CharLiteral", 
		"FloatLiteral", "IntegerLiteral", "StringLiteral", "NullLiteral", "Digits", 
		"Digit", "ADD", "SUB", "MUL", "DIV", "MOD", "INCR", "DECR", "NOT", "AND", 
		"OR", "ASSIGN", "GT", "LT", "EQUAL", "GE", "LE", "NOTEQUAL", "ADD_ASSIGN", 
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
			setState(108);
			main();
			setState(109);
			r();
			setState(110);
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
			setState(114);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case INT:
			case STRING:
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
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
			setState(116);
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
			setState(118);
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
			setState(120);
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
			setState(122);
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
			setState(124);
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
			setState(126);
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
			setState(128);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
			setState(134);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(VariableFuncName);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
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
			setState(144);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				datatype();
				setState(137);
				singleDec();
				setState(138);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				datatype();
				setState(141);
				multiDec();
				setState(142);
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
			setState(151);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				singleDec();
				setState(147);
				match(COMMA);
				setState(148);
				multiDec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
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
			setState(157);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(VariableFuncName);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(VariableFuncName);
				setState(155);
				match(ASSIGN);
				setState(156);
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
			setState(159);
			match(VariableFuncName);
			setState(160);
			match(ASSIGN);
			setState(161);
			specialValue();
			setState(162);
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
			setState(166);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				ifBlock();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
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
			setState(172);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				ifCondition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				ifCondition();
				setState(170);
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
			setState(179);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				elseIf();
				setState(175);
				elseIfBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				elseIf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
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
			setState(181);
			match(IF);
			setState(182);
			match(LPAREN);
			setState(183);
			conditionalExpression();
			setState(184);
			match(RPAREN);
			setState(185);
			match(LBRACE);
			setState(186);
			codeBlock();
			setState(187);
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
			setState(189);
			match(ELSE);
			setState(190);
			match(LBRACE);
			setState(191);
			codeBlock();
			setState(192);
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
			setState(194);
			match(ELSEIF);
			setState(195);
			match(LPAREN);
			setState(196);
			conditionalExpression();
			setState(197);
			match(RPAREN);
			setState(198);
			match(LBRACE);
			setState(199);
			codeBlock();
			setState(200);
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
			setState(202);
			match(SWITCH);
			setState(203);
			match(LPAREN);
			setState(204);
			conditionalExpression();
			setState(205);
			match(RPAREN);
			setState(206);
			match(LBRACE);
			setState(207);
			switchCase();
			setState(208);
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
			setState(215);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				caseBlock();
				setState(211);
				switchCase();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				caseBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
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
			setState(221);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				caseCondition();
				setState(218);
				caseBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
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
			setState(239);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(CASE);
				setState(224);
				value();
				setState(225);
				match(T__0);
				setState(226);
				match(LBRACE);
				setState(227);
				codeBlock();
				setState(228);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(CASE);
				setState(231);
				value();
				setState(232);
				match(T__0);
				setState(233);
				match(LBRACE);
				setState(234);
				codeBlock();
				setState(235);
				match(RBRACE);
				setState(236);
				match(BREAK);
				setState(237);
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
			setState(255);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(DEFAULT);
				setState(242);
				match(T__0);
				setState(243);
				match(LBRACE);
				setState(244);
				codeBlock();
				setState(245);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				match(DEFAULT);
				setState(248);
				match(T__0);
				setState(249);
				match(LBRACE);
				setState(250);
				codeBlock();
				setState(251);
				match(RBRACE);
				setState(252);
				match(BREAK);
				setState(253);
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
			setState(262);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				specialValue();
				setState(258);
				logicalOperator();
				setState(259);
				specialValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
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
			setState(267);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				whileBlock();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				doWhileBlock();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
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
			setState(269);
			match(WHILE);
			setState(270);
			match(LPAREN);
			setState(271);
			conditionalExpression();
			setState(272);
			match(RPAREN);
			setState(273);
			match(LBRACE);
			setState(274);
			codeBlock();
			setState(275);
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
		public TerminalNode RBRACE() { return getToken(JavaBinksParser.RBRACE, 0); }
		public TerminalNode WHILE() { return getToken(JavaBinksParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(JavaBinksParser.LPAREN, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaBinksParser.RPAREN, 0); }
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
			setState(277);
			match(DO);
			setState(278);
			match(LBRACE);
			setState(279);
			codeBlock();
			setState(280);
			match(RBRACE);
			setState(281);
			match(WHILE);
			setState(282);
			match(LPAREN);
			setState(283);
			conditionalExpression();
			setState(284);
			match(RPAREN);
			setState(285);
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
			setState(287);
			match(FOR);
			setState(288);
			match(LPAREN);
			setState(289);
			decValue();
			setState(290);
			match(SEMI);
			setState(291);
			conditionalExpression();
			setState(292);
			match(SEMI);
			setState(293);
			step();
			setState(294);
			match(RPAREN);
			setState(295);
			match(LBRACE);
			setState(296);
			codeBlock();
			setState(297);
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
			setState(306);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				match(INT);
				setState(300);
				match(VariableFuncName);
				setState(301);
				match(ASSIGN);
				setState(302);
				initValue();
				}
				break;
			case VariableFuncName:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				match(VariableFuncName);
				setState(304);
				match(ASSIGN);
				setState(305);
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
			setState(308);
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
			setState(316);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				match(VariableFuncName);
				setState(311);
				special2Operator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				match(VariableFuncName);
				setState(313);
				specialOperator();
				setState(314);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
			setState(318);
			expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode VariableFuncName() { return getToken(JavaBinksParser.VariableFuncName, 0); }
		public FunctionCallNoTerminatorContext functionCallNoTerminator() {
			return getRuleContext(FunctionCallNoTerminatorContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JavaBinksParser.LPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(JavaBinksParser.RPAREN, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(321);
				value();
				}
				break;
			case 2:
				{
				setState(322);
				match(VariableFuncName);
				}
				break;
			case 3:
				{
				setState(323);
				functionCallNoTerminator();
				}
				break;
			case 4:
				{
				setState(324);
				match(LPAREN);
				setState(325);
				expr(0);
				setState(326);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(336);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(330);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(331);
					operator();
					setState(332);
					expr(3);
					}
					} 
				}
				setState(338);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
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
		enterRule(_localctx, 70, RULE_functionDeclaration);
		try {
			setState(358);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case INT:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				datatype();
				setState(340);
				match(VariableFuncName);
				setState(341);
				match(LPAREN);
				setState(342);
				declarationParameter();
				setState(343);
				match(RPAREN);
				setState(344);
				match(LBRACE);
				setState(345);
				codeBlock();
				setState(346);
				match(RBRACE);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				match(VOID);
				setState(349);
				match(VariableFuncName);
				setState(350);
				match(LPAREN);
				setState(351);
				declarationParameter();
				setState(352);
				match(RPAREN);
				setState(353);
				match(LBRACE);
				setState(354);
				codeBlock();
				setState(355);
				returnStatement();
				setState(356);
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
		enterRule(_localctx, 72, RULE_declarationParameter);
		try {
			setState(365);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				returntype();
				setState(361);
				match(VariableFuncName);
				setState(362);
				multiDeclarationParameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
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
		enterRule(_localctx, 74, RULE_multiDeclarationParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(COMMA);
			setState(368);
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
		enterRule(_localctx, 76, RULE_singleDeclarationParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			returntype();
			setState(371);
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
		enterRule(_localctx, 78, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(RETURN);
			setState(374);
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
		enterRule(_localctx, 80, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(VariableFuncName);
			setState(377);
			match(LPAREN);
			setState(378);
			callParameter();
			setState(379);
			match(RPAREN);
			setState(380);
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
		enterRule(_localctx, 82, RULE_functionCallNoTerminator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(VariableFuncName);
			setState(383);
			match(LPAREN);
			setState(384);
			callParameter();
			setState(385);
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
		enterRule(_localctx, 84, RULE_callParameter);
		try {
			setState(392);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				specialValue();
				setState(388);
				match(COMMA);
				setState(389);
				callParameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
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
		enterRule(_localctx, 86, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			datatype();
			setState(395);
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
		enterRule(_localctx, 88, RULE_arrayAssignment);
		try {
			setState(409);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				match(VariableFuncName);
				setState(398);
				match(LBRACK);
				setState(399);
				match(Digits);
				setState(400);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
				match(VariableFuncName);
				setState(402);
				match(LBRACK);
				setState(403);
				match(RBRACK);
				setState(404);
				match(ASSIGN);
				setState(405);
				match(LBRACE);
				setState(406);
				list();
				setState(407);
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
		enterRule(_localctx, 90, RULE_list);
		try {
			setState(416);
			switch (_input.LA(1)) {
			case BooleanLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				boolList();
				}
				break;
			case CharLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				charList();
				}
				break;
			case FloatLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(413);
				floatList();
				}
				break;
			case IntegerLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(414);
				integerList();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(415);
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
		enterRule(_localctx, 92, RULE_boolList);
		try {
			setState(422);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				match(BooleanLiteral);
				setState(419);
				match(COMMA);
				setState(420);
				boolList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
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
		enterRule(_localctx, 94, RULE_charList);
		try {
			setState(428);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				match(CharLiteral);
				setState(425);
				match(COMMA);
				setState(426);
				charList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
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
		enterRule(_localctx, 96, RULE_floatList);
		try {
			setState(434);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				match(FloatLiteral);
				setState(431);
				match(COMMA);
				setState(432);
				floatList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
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
		enterRule(_localctx, 98, RULE_integerList);
		try {
			setState(440);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				match(IntegerLiteral);
				setState(437);
				match(COMMA);
				setState(438);
				integerList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(439);
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
		enterRule(_localctx, 100, RULE_stringList);
		try {
			setState(446);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(442);
				match(StringLiteral);
				setState(443);
				match(COMMA);
				setState(444);
				stringList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 102, RULE_codeBlock);
		try {
			setState(473);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				declaration();
				setState(449);
				codeBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				assignment();
				setState(452);
				codeBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(454);
				conditionalStatement();
				setState(455);
				codeBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(457);
				loopStatement();
				setState(458);
				codeBlock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(460);
				functionDeclaration();
				setState(461);
				codeBlock();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(463);
				functionCall();
				setState(464);
				codeBlock();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(466);
				array();
				setState(467);
				codeBlock();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(469);
				expression();
				setState(470);
				codeBlock();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
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
		enterRule(_localctx, 104, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			match(INT);
			setState(476);
			match(T__1);
			setState(477);
			match(LPAREN);
			setState(478);
			match(RPAREN);
			setState(479);
			match(LBRACE);
			setState(480);
			codeBlock();
			setState(481);
			returnMain();
			setState(482);
			match(SEMI);
			setState(483);
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
		enterRule(_localctx, 106, RULE_returnMain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(RETURN);
			setState(486);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 34:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3?\u01eb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\2\3\3\3\3\5\3u\n\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\5\13\u0089\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0093\n\f\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u009a\n\r\3\16\3\16\3\16\3\16\5\16\u00a0\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\5\20\u00a9\n\20\3\21\3\21\3\21\3\21\5\21"+
		"\u00af\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u00b6\n\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\27\5\27\u00da\n\27\3\30\3\30\3\30\3\30\5\30\u00e0\n\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u00f2\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\5\32\u0102\n\32\3\33\3\33\3\33\3\33\3\33\5\33\u0109"+
		"\n\33\3\34\3\34\3\34\5\34\u010e\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \5 "+
		"\u0135\n \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u013f\n\"\3#\3#\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\5$\u014b\n$\3$\3$\3$\3$\7$\u0151\n$\f$\16$\u0154\13$\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0169\n%\3&"+
		"\3&\3&\3&\3&\5&\u0170\n&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3*"+
		"\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\5,\u018b\n,\3-\3-\3-\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\5.\u019c\n.\3/\3/\3/\3/\3/\5/\u01a3\n/\3\60\3\60"+
		"\3\60\3\60\5\60\u01a9\n\60\3\61\3\61\3\61\3\61\5\61\u01af\n\61\3\62\3"+
		"\62\3\62\3\62\5\62\u01b5\n\62\3\63\3\63\3\63\3\63\5\63\u01bb\n\63\3\64"+
		"\3\64\3\64\3\64\5\64\u01c1\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\5\65\u01dc\n\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\67\3\67\3\67\3\67\2\3F8\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjl\2\n\3\2\20\24"+
		"\3\2\20\25\3\2\37#\3\2\60\64\3\2$%\4\2&(*/\3\2\27\33\4\2\26\26\32\32\u01e2"+
		"\2n\3\2\2\2\4t\3\2\2\2\6v\3\2\2\2\bx\3\2\2\2\nz\3\2\2\2\f|\3\2\2\2\16"+
		"~\3\2\2\2\20\u0080\3\2\2\2\22\u0082\3\2\2\2\24\u0088\3\2\2\2\26\u0092"+
		"\3\2\2\2\30\u0099\3\2\2\2\32\u009f\3\2\2\2\34\u00a1\3\2\2\2\36\u00a8\3"+
		"\2\2\2 \u00ae\3\2\2\2\"\u00b5\3\2\2\2$\u00b7\3\2\2\2&\u00bf\3\2\2\2(\u00c4"+
		"\3\2\2\2*\u00cc\3\2\2\2,\u00d9\3\2\2\2.\u00df\3\2\2\2\60\u00f1\3\2\2\2"+
		"\62\u0101\3\2\2\2\64\u0108\3\2\2\2\66\u010d\3\2\2\28\u010f\3\2\2\2:\u0117"+
		"\3\2\2\2<\u0121\3\2\2\2>\u0134\3\2\2\2@\u0136\3\2\2\2B\u013e\3\2\2\2D"+
		"\u0140\3\2\2\2F\u014a\3\2\2\2H\u0168\3\2\2\2J\u016f\3\2\2\2L\u0171\3\2"+
		"\2\2N\u0174\3\2\2\2P\u0177\3\2\2\2R\u017a\3\2\2\2T\u0180\3\2\2\2V\u018a"+
		"\3\2\2\2X\u018c\3\2\2\2Z\u019b\3\2\2\2\\\u01a2\3\2\2\2^\u01a8\3\2\2\2"+
		"`\u01ae\3\2\2\2b\u01b4\3\2\2\2d\u01ba\3\2\2\2f\u01c0\3\2\2\2h\u01db\3"+
		"\2\2\2j\u01dd\3\2\2\2l\u01e7\3\2\2\2no\5j\66\2op\5\4\3\2pq\7\2\2\3q\3"+
		"\3\2\2\2ru\5H%\2su\3\2\2\2tr\3\2\2\2ts\3\2\2\2u\5\3\2\2\2vw\t\2\2\2w\7"+
		"\3\2\2\2xy\t\3\2\2y\t\3\2\2\2z{\t\4\2\2{\13\3\2\2\2|}\t\5\2\2}\r\3\2\2"+
		"\2~\177\t\6\2\2\177\17\3\2\2\2\u0080\u0081\t\7\2\2\u0081\21\3\2\2\2\u0082"+
		"\u0083\t\b\2\2\u0083\23\3\2\2\2\u0084\u0089\5\22\n\2\u0085\u0089\7\26"+
		"\2\2\u0086\u0089\5D#\2\u0087\u0089\5T+\2\u0088\u0084\3\2\2\2\u0088\u0085"+
		"\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089\25\3\2\2\2\u008a"+
		"\u008b\5\6\4\2\u008b\u008c\5\32\16\2\u008c\u008d\7;\2\2\u008d\u0093\3"+
		"\2\2\2\u008e\u008f\5\6\4\2\u008f\u0090\5\30\r\2\u0090\u0091\7;\2\2\u0091"+
		"\u0093\3\2\2\2\u0092\u008a\3\2\2\2\u0092\u008e\3\2\2\2\u0093\27\3\2\2"+
		"\2\u0094\u0095\5\32\16\2\u0095\u0096\7<\2\2\u0096\u0097\5\30\r\2\u0097"+
		"\u009a\3\2\2\2\u0098\u009a\5\32\16\2\u0099\u0094\3\2\2\2\u0099\u0098\3"+
		"\2\2\2\u009a\31\3\2\2\2\u009b\u00a0\7\26\2\2\u009c\u009d\7\26\2\2\u009d"+
		"\u009e\7)\2\2\u009e\u00a0\5\24\13\2\u009f\u009b\3\2\2\2\u009f\u009c\3"+
		"\2\2\2\u00a0\33\3\2\2\2\u00a1\u00a2\7\26\2\2\u00a2\u00a3\7)\2\2\u00a3"+
		"\u00a4\5\24\13\2\u00a4\u00a5\7;\2\2\u00a5\35\3\2\2\2\u00a6\u00a9\5 \21"+
		"\2\u00a7\u00a9\5*\26\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\37"+
		"\3\2\2\2\u00aa\u00af\5$\23\2\u00ab\u00ac\5$\23\2\u00ac\u00ad\5\"\22\2"+
		"\u00ad\u00af\3\2\2\2\u00ae\u00aa\3\2\2\2\u00ae\u00ab\3\2\2\2\u00af!\3"+
		"\2\2\2\u00b0\u00b1\5(\25\2\u00b1\u00b2\5\"\22\2\u00b2\u00b6\3\2\2\2\u00b3"+
		"\u00b6\5(\25\2\u00b4\u00b6\5&\24\2\u00b5\u00b0\3\2\2\2\u00b5\u00b3\3\2"+
		"\2\2\u00b5\u00b4\3\2\2\2\u00b6#\3\2\2\2\u00b7\u00b8\7\f\2\2\u00b8\u00b9"+
		"\7\65\2\2\u00b9\u00ba\5\64\33\2\u00ba\u00bb\7\66\2\2\u00bb\u00bc\7\67"+
		"\2\2\u00bc\u00bd\5h\65\2\u00bd\u00be\78\2\2\u00be%\3\2\2\2\u00bf\u00c0"+
		"\7\t\2\2\u00c0\u00c1\7\67\2\2\u00c1\u00c2\5h\65\2\u00c2\u00c3\78\2\2\u00c3"+
		"\'\3\2\2\2\u00c4\u00c5\7\n\2\2\u00c5\u00c6\7\65\2\2\u00c6\u00c7\5\64\33"+
		"\2\u00c7\u00c8\7\66\2\2\u00c8\u00c9\7\67\2\2\u00c9\u00ca\5h\65\2\u00ca"+
		"\u00cb\78\2\2\u00cb)\3\2\2\2\u00cc\u00cd\7\r\2\2\u00cd\u00ce\7\65\2\2"+
		"\u00ce\u00cf\5\64\33\2\u00cf\u00d0\7\66\2\2\u00d0\u00d1\7\67\2\2\u00d1"+
		"\u00d2\5,\27\2\u00d2\u00d3\78\2\2\u00d3+\3\2\2\2\u00d4\u00d5\5.\30\2\u00d5"+
		"\u00d6\5,\27\2\u00d6\u00da\3\2\2\2\u00d7\u00da\5.\30\2\u00d8\u00da\5\62"+
		"\32\2\u00d9\u00d4\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da"+
		"-\3\2\2\2\u00db\u00dc\5\60\31\2\u00dc\u00dd\5.\30\2\u00dd\u00e0\3\2\2"+
		"\2\u00de\u00e0\5\60\31\2\u00df\u00db\3\2\2\2\u00df\u00de\3\2\2\2\u00e0"+
		"/\3\2\2\2\u00e1\u00e2\7\6\2\2\u00e2\u00e3\5\22\n\2\u00e3\u00e4\7\3\2\2"+
		"\u00e4\u00e5\7\67\2\2\u00e5\u00e6\5h\65\2\u00e6\u00e7\78\2\2\u00e7\u00f2"+
		"\3\2\2\2\u00e8\u00e9\7\6\2\2\u00e9\u00ea\5\22\n\2\u00ea\u00eb\7\3\2\2"+
		"\u00eb\u00ec\7\67\2\2\u00ec\u00ed\5h\65\2\u00ed\u00ee\78\2\2\u00ee\u00ef"+
		"\7\5\2\2\u00ef\u00f0\7;\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00e1\3\2\2\2\u00f1"+
		"\u00e8\3\2\2\2\u00f2\61\3\2\2\2\u00f3\u00f4\7\7\2\2\u00f4\u00f5\7\3\2"+
		"\2\u00f5\u00f6\7\67\2\2\u00f6\u00f7\5h\65\2\u00f7\u00f8\78\2\2\u00f8\u0102"+
		"\3\2\2\2\u00f9\u00fa\7\7\2\2\u00fa\u00fb\7\3\2\2\u00fb\u00fc\7\67\2\2"+
		"\u00fc\u00fd\5h\65\2\u00fd\u00fe\78\2\2\u00fe\u00ff\7\5\2\2\u00ff\u0100"+
		"\7;\2\2\u0100\u0102\3\2\2\2\u0101\u00f3\3\2\2\2\u0101\u00f9\3\2\2\2\u0102"+
		"\63\3\2\2\2\u0103\u0104\5\24\13\2\u0104\u0105\5\20\t\2\u0105\u0106\5\24"+
		"\13\2\u0106\u0109\3\2\2\2\u0107\u0109\5\24\13\2\u0108\u0103\3\2\2\2\u0108"+
		"\u0107\3\2\2\2\u0109\65\3\2\2\2\u010a\u010e\58\35\2\u010b\u010e\5:\36"+
		"\2\u010c\u010e\5<\37\2\u010d\u010a\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010c"+
		"\3\2\2\2\u010e\67\3\2\2\2\u010f\u0110\7\16\2\2\u0110\u0111\7\65\2\2\u0111"+
		"\u0112\5\64\33\2\u0112\u0113\7\66\2\2\u0113\u0114\7\67\2\2\u0114\u0115"+
		"\5h\65\2\u0115\u0116\78\2\2\u01169\3\2\2\2\u0117\u0118\7\b\2\2\u0118\u0119"+
		"\7\67\2\2\u0119\u011a\5h\65\2\u011a\u011b\78\2\2\u011b\u011c\7\16\2\2"+
		"\u011c\u011d\7\65\2\2\u011d\u011e\5\64\33\2\u011e\u011f\7\66\2\2\u011f"+
		"\u0120\7;\2\2\u0120;\3\2\2\2\u0121\u0122\7\13\2\2\u0122\u0123\7\65\2\2"+
		"\u0123\u0124\5> \2\u0124\u0125\7;\2\2\u0125\u0126\5\64\33\2\u0126\u0127"+
		"\7;\2\2\u0127\u0128\5B\"\2\u0128\u0129\7\66\2\2\u0129\u012a\7\67\2\2\u012a"+
		"\u012b\5h\65\2\u012b\u012c\78\2\2\u012c=\3\2\2\2\u012d\u012e\7\23\2\2"+
		"\u012e\u012f\7\26\2\2\u012f\u0130\7)\2\2\u0130\u0135\5@!\2\u0131\u0132"+
		"\7\26\2\2\u0132\u0133\7)\2\2\u0133\u0135\5@!\2\u0134\u012d\3\2\2\2\u0134"+
		"\u0131\3\2\2\2\u0135?\3\2\2\2\u0136\u0137\t\t\2\2\u0137A\3\2\2\2\u0138"+
		"\u0139\7\26\2\2\u0139\u013f\5\16\b\2\u013a\u013b\7\26\2\2\u013b\u013c"+
		"\5\f\7\2\u013c\u013d\7\32\2\2\u013d\u013f\3\2\2\2\u013e\u0138\3\2\2\2"+
		"\u013e\u013a\3\2\2\2\u013fC\3\2\2\2\u0140\u0141\5F$\2\u0141E\3\2\2\2\u0142"+
		"\u0143\b$\1\2\u0143\u014b\5\22\n\2\u0144\u014b\7\26\2\2\u0145\u014b\5"+
		"T+\2\u0146\u0147\7\65\2\2\u0147\u0148\5F$\2\u0148\u0149\7\66\2\2\u0149"+
		"\u014b\3\2\2\2\u014a\u0142\3\2\2\2\u014a\u0144\3\2\2\2\u014a\u0145\3\2"+
		"\2\2\u014a\u0146\3\2\2\2\u014b\u0152\3\2\2\2\u014c\u014d\f\4\2\2\u014d"+
		"\u014e\5\n\6\2\u014e\u014f\5F$\5\u014f\u0151\3\2\2\2\u0150\u014c\3\2\2"+
		"\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153G"+
		"\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0156\5\6\4\2\u0156\u0157\7\26\2\2"+
		"\u0157\u0158\7\65\2\2\u0158\u0159\5J&\2\u0159\u015a\7\66\2\2\u015a\u015b"+
		"\7\67\2\2\u015b\u015c\5h\65\2\u015c\u015d\78\2\2\u015d\u0169\3\2\2\2\u015e"+
		"\u015f\7\25\2\2\u015f\u0160\7\26\2\2\u0160\u0161\7\65\2\2\u0161\u0162"+
		"\5J&\2\u0162\u0163\7\66\2\2\u0163\u0164\7\67\2\2\u0164\u0165\5h\65\2\u0165"+
		"\u0166\5P)\2\u0166\u0167\78\2\2\u0167\u0169\3\2\2\2\u0168\u0155\3\2\2"+
		"\2\u0168\u015e\3\2\2\2\u0169I\3\2\2\2\u016a\u016b\5\b\5\2\u016b\u016c"+
		"\7\26\2\2\u016c\u016d\5L\'\2\u016d\u0170\3\2\2\2\u016e\u0170\5N(\2\u016f"+
		"\u016a\3\2\2\2\u016f\u016e\3\2\2\2\u0170K\3\2\2\2\u0171\u0172\7<\2\2\u0172"+
		"\u0173\5J&\2\u0173M\3\2\2\2\u0174\u0175\5\b\5\2\u0175\u0176\7\26\2\2\u0176"+
		"O\3\2\2\2\u0177\u0178\7\17\2\2\u0178\u0179\5\24\13\2\u0179Q\3\2\2\2\u017a"+
		"\u017b\7\26\2\2\u017b\u017c\7\65\2\2\u017c\u017d\5V,\2\u017d\u017e\7\66"+
		"\2\2\u017e\u017f\7;\2\2\u017fS\3\2\2\2\u0180\u0181\7\26\2\2\u0181\u0182"+
		"\7\65\2\2\u0182\u0183\5V,\2\u0183\u0184\7\66\2\2\u0184U\3\2\2\2\u0185"+
		"\u0186\5\24\13\2\u0186\u0187\7<\2\2\u0187\u0188\5V,\2\u0188\u018b\3\2"+
		"\2\2\u0189\u018b\5\24\13\2\u018a\u0185\3\2\2\2\u018a\u0189\3\2\2\2\u018b"+
		"W\3\2\2\2\u018c\u018d\5\6\4\2\u018d\u018e\5Z.\2\u018eY\3\2\2\2\u018f\u0190"+
		"\7\26\2\2\u0190\u0191\79\2\2\u0191\u0192\7\35\2\2\u0192\u019c\7:\2\2\u0193"+
		"\u0194\7\26\2\2\u0194\u0195\79\2\2\u0195\u0196\7:\2\2\u0196\u0197\7)\2"+
		"\2\u0197\u0198\7\67\2\2\u0198\u0199\5\\/\2\u0199\u019a\78\2\2\u019a\u019c"+
		"\3\2\2\2\u019b\u018f\3\2\2\2\u019b\u0193\3\2\2\2\u019c[\3\2\2\2\u019d"+
		"\u01a3\5^\60\2\u019e\u01a3\5`\61\2\u019f\u01a3\5b\62\2\u01a0\u01a3\5d"+
		"\63\2\u01a1\u01a3\5f\64\2\u01a2\u019d\3\2\2\2\u01a2\u019e\3\2\2\2\u01a2"+
		"\u019f\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a1\3\2\2\2\u01a3]\3\2\2\2"+
		"\u01a4\u01a5\7\27\2\2\u01a5\u01a6\7<\2\2\u01a6\u01a9\5^\60\2\u01a7\u01a9"+
		"\7\27\2\2\u01a8\u01a4\3\2\2\2\u01a8\u01a7\3\2\2\2\u01a9_\3\2\2\2\u01aa"+
		"\u01ab\7\30\2\2\u01ab\u01ac\7<\2\2\u01ac\u01af\5`\61\2\u01ad\u01af\7\30"+
		"\2\2\u01ae\u01aa\3\2\2\2\u01ae\u01ad\3\2\2\2\u01afa\3\2\2\2\u01b0\u01b1"+
		"\7\31\2\2\u01b1\u01b2\7<\2\2\u01b2\u01b5\5b\62\2\u01b3\u01b5\7\31\2\2"+
		"\u01b4\u01b0\3\2\2\2\u01b4\u01b3\3\2\2\2\u01b5c\3\2\2\2\u01b6\u01b7\7"+
		"\32\2\2\u01b7\u01b8\7<\2\2\u01b8\u01bb\5d\63\2\u01b9\u01bb\7\32\2\2\u01ba"+
		"\u01b6\3\2\2\2\u01ba\u01b9\3\2\2\2\u01bbe\3\2\2\2\u01bc\u01bd\7\33\2\2"+
		"\u01bd\u01be\7<\2\2\u01be\u01c1\5f\64\2\u01bf\u01c1\7\33\2\2\u01c0\u01bc"+
		"\3\2\2\2\u01c0\u01bf\3\2\2\2\u01c1g\3\2\2\2\u01c2\u01c3\5\26\f\2\u01c3"+
		"\u01c4\5h\65\2\u01c4\u01dc\3\2\2\2\u01c5\u01c6\5\34\17\2\u01c6\u01c7\5"+
		"h\65\2\u01c7\u01dc\3\2\2\2\u01c8\u01c9\5\36\20\2\u01c9\u01ca\5h\65\2\u01ca"+
		"\u01dc\3\2\2\2\u01cb\u01cc\5\66\34\2\u01cc\u01cd\5h\65\2\u01cd\u01dc\3"+
		"\2\2\2\u01ce\u01cf\5H%\2\u01cf\u01d0\5h\65\2\u01d0\u01dc\3\2\2\2\u01d1"+
		"\u01d2\5R*\2\u01d2\u01d3\5h\65\2\u01d3\u01dc\3\2\2\2\u01d4\u01d5\5X-\2"+
		"\u01d5\u01d6\5h\65\2\u01d6\u01dc\3\2\2\2\u01d7\u01d8\5D#\2\u01d8\u01d9"+
		"\5h\65\2\u01d9\u01dc\3\2\2\2\u01da\u01dc\3\2\2\2\u01db\u01c2\3\2\2\2\u01db"+
		"\u01c5\3\2\2\2\u01db\u01c8\3\2\2\2\u01db\u01cb\3\2\2\2\u01db\u01ce\3\2"+
		"\2\2\u01db\u01d1\3\2\2\2\u01db\u01d4\3\2\2\2\u01db\u01d7\3\2\2\2\u01db"+
		"\u01da\3\2\2\2\u01dci\3\2\2\2\u01dd\u01de\7\23\2\2\u01de\u01df\7\4\2\2"+
		"\u01df\u01e0\7\65\2\2\u01e0\u01e1\7\66\2\2\u01e1\u01e2\7\67\2\2\u01e2"+
		"\u01e3\5h\65\2\u01e3\u01e4\5l\67\2\u01e4\u01e5\7;\2\2\u01e5\u01e6\78\2"+
		"\2\u01e6k\3\2\2\2\u01e7\u01e8\7\17\2\2\u01e8\u01e9\7\32\2\2\u01e9m\3\2"+
		"\2\2\37t\u0088\u0092\u0099\u009f\u00a8\u00ae\u00b5\u00d9\u00df\u00f1\u0101"+
		"\u0108\u010d\u0134\u013e\u014a\u0152\u0168\u016f\u018a\u019b\u01a2\u01a8"+
		"\u01ae\u01b4\u01ba\u01c0\u01db";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}