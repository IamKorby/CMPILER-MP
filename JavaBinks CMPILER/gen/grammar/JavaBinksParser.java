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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, BREAK=7, CASE=8, DEFAULT=9, 
		DO=10, ELSE=11, ELSEIF=12, FOR=13, IF=14, SWITCH=15, WHILE=16, RETURN=17, 
		PRINTER=18, SCANNER=19, BOOLEAN=20, CHAR=21, FLOAT=22, INT=23, STRING=24, 
		VOID=25, VariableFuncName=26, CharLiteral=27, FloatLiteral=28, IntegerLiteral=29, 
		NegativeIntegerLiteral=30, PositiveIntegerLiteral=31, StringLiteral=32, 
		NullLiteral=33, Digits=34, Digit=35, SCANNERINT=36, SCANNERFLOAT=37, SCANNERBOOLEAN=38, 
		SCANNERCHAR=39, SCANNERSTRING=40, ADD=41, SUB=42, MUL=43, DIV=44, MOD=45, 
		INCR=46, DECR=47, NOT=48, AND=49, OR=50, ASSIGN=51, GT=52, LT=53, EQUAL=54, 
		GE=55, LE=56, NOTEQUAL=57, ADD_ASSIGN=58, SUB_ASSIGN=59, MUL_ASSIGN=60, 
		DIV_ASSIGN=61, MOD_ASSIGN=62, LPAREN=63, RPAREN=64, LBRACE=65, RBRACE=66, 
		LBRACK=67, RBRACK=68, SEMI=69, COMMA=70, DOT=71, WS=72;
	public static final int
		RULE_start = 0, RULE_datatype = 1, RULE_returntype = 2, RULE_operator = 3, 
		RULE_specialOperator = 4, RULE_special2Operator = 5, RULE_logicalOperator = 6, 
		RULE_value = 7, RULE_specialValue = 8, RULE_declaration = 9, RULE_multiDec = 10, 
		RULE_singleDec = 11, RULE_assignment = 12, RULE_conditionalStatement = 13, 
		RULE_ifBlock = 14, RULE_elseIfBlock = 15, RULE_ifCondition = 16, RULE_elseCondition = 17, 
		RULE_elseIf = 18, RULE_switchBlock = 19, RULE_switchCase = 20, RULE_caseBlock = 21, 
		RULE_caseCondition = 22, RULE_defaultBlock = 23, RULE_conditionalExpression = 24, 
		RULE_loopStatement = 25, RULE_whileBlock = 26, RULE_doWhileBlock = 27, 
		RULE_forBlock = 28, RULE_decValue = 29, RULE_initValue = 30, RULE_step = 31, 
		RULE_expression = 32, RULE_expr = 33, RULE_functionDeclaration = 34, RULE_declarationParameter = 35, 
		RULE_multiDeclarationParameter = 36, RULE_singleDeclarationParameter = 37, 
		RULE_returnStatement = 38, RULE_functionCall = 39, RULE_functionCallNoTerminator = 40, 
		RULE_callParameter = 41, RULE_array = 42, RULE_arrayAssignment = 43, RULE_list = 44, 
		RULE_boolList = 45, RULE_charList = 46, RULE_floatList = 47, RULE_integerList = 48, 
		RULE_stringList = 49, RULE_printer = 50, RULE_scanner = 51, RULE_codeBlock = 52, 
		RULE_main = 53, RULE_returnMain = 54, RULE_booleanLiteral = 55, RULE_comment = 56;
	public static final String[] ruleNames = {
		"start", "datatype", "returntype", "operator", "specialOperator", "special2Operator", 
		"logicalOperator", "value", "specialValue", "declaration", "multiDec", 
		"singleDec", "assignment", "conditionalStatement", "ifBlock", "elseIfBlock", 
		"ifCondition", "elseCondition", "elseIf", "switchBlock", "switchCase", 
		"caseBlock", "caseCondition", "defaultBlock", "conditionalExpression", 
		"loopStatement", "whileBlock", "doWhileBlock", "forBlock", "decValue", 
		"initValue", "step", "expression", "expr", "functionDeclaration", "declarationParameter", 
		"multiDeclarationParameter", "singleDeclarationParameter", "returnStatement", 
		"functionCall", "functionCallNoTerminator", "callParameter", "array", 
		"arrayAssignment", "list", "boolList", "charList", "floatList", "integerList", 
		"stringList", "printer", "scanner", "codeBlock", "main", "returnMain", 
		"booleanLiteral", "comment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'jarjarbinks'", "'true'", "'false'", "'meesa '", "' yousa'", 
		"'fett'", "'clone'", "'kaminoans'", "'iloveyou'", "'storm'", "'stormtrooper'", 
		"'force'", "'trooper'", "'kamino'", "'iknow'", "'jedi'", "'forcePrint'", 
		"'forceScan'", "'boolean'", "'char'", "'float'", "'int'", "'String'", 
		"'void'", null, null, null, null, null, null, null, "'null'", null, null, 
		"''%d''", "''%f''", "''%b''", "''%c''", "''%s''", "'+'", "'-'", "'*'", 
		"'/'", "'%'", "'++'", "'--'", "'!'", "'&&'", "'||'", "'='", "'>'", "'<'", 
		"'=='", "'>='", "'<='", "'!='", "'+='", "'-='", "'*='", "'/='", "'%='", 
		"'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "BREAK", "CASE", "DEFAULT", 
		"DO", "ELSE", "ELSEIF", "FOR", "IF", "SWITCH", "WHILE", "RETURN", "PRINTER", 
		"SCANNER", "BOOLEAN", "CHAR", "FLOAT", "INT", "STRING", "VOID", "VariableFuncName", 
		"CharLiteral", "FloatLiteral", "IntegerLiteral", "NegativeIntegerLiteral", 
		"PositiveIntegerLiteral", "StringLiteral", "NullLiteral", "Digits", "Digit", 
		"SCANNERINT", "SCANNERFLOAT", "SCANNERBOOLEAN", "SCANNERCHAR", "SCANNERSTRING", 
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
		public TerminalNode EOF() { return getToken(JavaBinksParser.EOF, 0); }
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			main();
			setState(116);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << VOID))) != 0)) {
				{
				setState(115);
				functionDeclaration();
				}
			}

			setState(118);
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
		enterRule(_localctx, 2, RULE_datatype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
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
		enterRule(_localctx, 4, RULE_returntype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
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
		enterRule(_localctx, 6, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
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
		enterRule(_localctx, 8, RULE_specialOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
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
		enterRule(_localctx, 10, RULE_special2Operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
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
		enterRule(_localctx, 12, RULE_logicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
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
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public TerminalNode CharLiteral() { return getToken(JavaBinksParser.CharLiteral, 0); }
		public TerminalNode FloatLiteral() { return getToken(JavaBinksParser.FloatLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(JavaBinksParser.IntegerLiteral, 0); }
		public TerminalNode NegativeIntegerLiteral() { return getToken(JavaBinksParser.NegativeIntegerLiteral, 0); }
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
		enterRule(_localctx, 14, RULE_value);
		try {
			setState(138);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				booleanLiteral();
				}
				break;
			case CharLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(CharLiteral);
				}
				break;
			case FloatLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				match(FloatLiteral);
				}
				break;
			case IntegerLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				match(IntegerLiteral);
				}
				break;
			case NegativeIntegerLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(136);
				match(NegativeIntegerLiteral);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(137);
				match(StringLiteral);
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

	public static class SpecialValueContext extends ParserRuleContext {
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
		enterRule(_localctx, 16, RULE_specialValue);
		try {
			setState(142);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
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
		public MultiDecContext multiDec() {
			return getRuleContext(MultiDecContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaBinksParser.SEMI, 0); }
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
		enterRule(_localctx, 18, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			datatype();
			setState(145);
			multiDec();
			setState(146);
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
		enterRule(_localctx, 20, RULE_multiDec);
		try {
			setState(153);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				singleDec();
				setState(149);
				match(COMMA);
				setState(150);
				multiDec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
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
		enterRule(_localctx, 22, RULE_singleDec);
		try {
			setState(159);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(VariableFuncName);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(VariableFuncName);
				setState(157);
				match(ASSIGN);
				setState(158);
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
		public SpecialOperatorContext specialOperator() {
			return getRuleContext(SpecialOperatorContext.class,0);
		}
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
		enterRule(_localctx, 24, RULE_assignment);
		try {
			setState(171);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(VariableFuncName);
				setState(162);
				match(ASSIGN);
				setState(163);
				specialValue();
				setState(164);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(VariableFuncName);
				setState(167);
				specialOperator();
				setState(168);
				specialValue();
				setState(169);
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
		enterRule(_localctx, 26, RULE_conditionalStatement);
		try {
			setState(175);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				ifBlock();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
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
		enterRule(_localctx, 28, RULE_ifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			ifCondition();
			setState(179);
			_la = _input.LA(1);
			if (_la==ELSE || _la==ELSEIF) {
				{
				setState(178);
				elseIfBlock();
				}
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
		enterRule(_localctx, 30, RULE_elseIfBlock);
		int _la;
		try {
			setState(186);
			switch (_input.LA(1)) {
			case ELSEIF:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				elseIf();
				setState(183);
				_la = _input.LA(1);
				if (_la==ELSE || _la==ELSEIF) {
					{
					setState(182);
					elseIfBlock();
					}
				}

				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				elseCondition();
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

	public static class IfConditionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(JavaBinksParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(JavaBinksParser.LPAREN, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaBinksParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(JavaBinksParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaBinksParser.RBRACE, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
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
		enterRule(_localctx, 32, RULE_ifCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(IF);
			setState(189);
			match(LPAREN);
			setState(190);
			conditionalExpression();
			setState(191);
			match(RPAREN);
			setState(192);
			match(LBRACE);
			setState(194);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << PRINTER) | (1L << SCANNER) | (1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << VariableFuncName) | (1L << CharLiteral) | (1L << FloatLiteral) | (1L << IntegerLiteral) | (1L << NegativeIntegerLiteral) | (1L << StringLiteral) | (1L << LPAREN))) != 0)) {
				{
				setState(193);
				codeBlock();
				}
			}

			setState(196);
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
		public TerminalNode RBRACE() { return getToken(JavaBinksParser.RBRACE, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
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
		enterRule(_localctx, 34, RULE_elseCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(ELSE);
			setState(199);
			match(LBRACE);
			setState(201);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << PRINTER) | (1L << SCANNER) | (1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << VariableFuncName) | (1L << CharLiteral) | (1L << FloatLiteral) | (1L << IntegerLiteral) | (1L << NegativeIntegerLiteral) | (1L << StringLiteral) | (1L << LPAREN))) != 0)) {
				{
				setState(200);
				codeBlock();
				}
			}

			setState(203);
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
		public TerminalNode RBRACE() { return getToken(JavaBinksParser.RBRACE, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
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
		enterRule(_localctx, 36, RULE_elseIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(ELSEIF);
			setState(206);
			match(LPAREN);
			setState(207);
			conditionalExpression();
			setState(208);
			match(RPAREN);
			setState(209);
			match(LBRACE);
			setState(211);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << PRINTER) | (1L << SCANNER) | (1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << VariableFuncName) | (1L << CharLiteral) | (1L << FloatLiteral) | (1L << IntegerLiteral) | (1L << NegativeIntegerLiteral) | (1L << StringLiteral) | (1L << LPAREN))) != 0)) {
				{
				setState(210);
				codeBlock();
				}
			}

			setState(213);
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
		enterRule(_localctx, 38, RULE_switchBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(SWITCH);
			setState(216);
			match(LPAREN);
			setState(217);
			conditionalExpression();
			setState(218);
			match(RPAREN);
			setState(219);
			match(LBRACE);
			setState(220);
			switchCase();
			setState(221);
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
		enterRule(_localctx, 40, RULE_switchCase);
		try {
			setState(228);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				caseBlock();
				setState(224);
				switchCase();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				caseBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
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
		enterRule(_localctx, 42, RULE_caseBlock);
		try {
			setState(234);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				caseCondition();
				setState(231);
				caseBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
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
		public TerminalNode RBRACE() { return getToken(JavaBinksParser.RBRACE, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
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
		enterRule(_localctx, 44, RULE_caseCondition);
		int _la;
		try {
			setState(256);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(CASE);
				setState(237);
				value();
				setState(238);
				match(T__0);
				setState(239);
				match(LBRACE);
				setState(241);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << PRINTER) | (1L << SCANNER) | (1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << VariableFuncName) | (1L << CharLiteral) | (1L << FloatLiteral) | (1L << IntegerLiteral) | (1L << NegativeIntegerLiteral) | (1L << StringLiteral) | (1L << LPAREN))) != 0)) {
					{
					setState(240);
					codeBlock();
					}
				}

				setState(243);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				match(CASE);
				setState(246);
				value();
				setState(247);
				match(T__0);
				setState(248);
				match(LBRACE);
				setState(250);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << PRINTER) | (1L << SCANNER) | (1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << VariableFuncName) | (1L << CharLiteral) | (1L << FloatLiteral) | (1L << IntegerLiteral) | (1L << NegativeIntegerLiteral) | (1L << StringLiteral) | (1L << LPAREN))) != 0)) {
					{
					setState(249);
					codeBlock();
					}
				}

				setState(252);
				match(RBRACE);
				setState(253);
				match(BREAK);
				setState(254);
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
		public TerminalNode RBRACE() { return getToken(JavaBinksParser.RBRACE, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
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
		enterRule(_localctx, 46, RULE_defaultBlock);
		int _la;
		try {
			setState(274);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				match(DEFAULT);
				setState(259);
				match(T__0);
				setState(260);
				match(LBRACE);
				setState(262);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << PRINTER) | (1L << SCANNER) | (1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << VariableFuncName) | (1L << CharLiteral) | (1L << FloatLiteral) | (1L << IntegerLiteral) | (1L << NegativeIntegerLiteral) | (1L << StringLiteral) | (1L << LPAREN))) != 0)) {
					{
					setState(261);
					codeBlock();
					}
				}

				setState(264);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				match(DEFAULT);
				setState(266);
				match(T__0);
				setState(267);
				match(LBRACE);
				setState(269);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << PRINTER) | (1L << SCANNER) | (1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << VariableFuncName) | (1L << CharLiteral) | (1L << FloatLiteral) | (1L << IntegerLiteral) | (1L << NegativeIntegerLiteral) | (1L << StringLiteral) | (1L << LPAREN))) != 0)) {
					{
					setState(268);
					codeBlock();
					}
				}

				setState(271);
				match(RBRACE);
				setState(272);
				match(BREAK);
				setState(273);
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
		enterRule(_localctx, 48, RULE_conditionalExpression);
		try {
			setState(281);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				specialValue();
				setState(277);
				logicalOperator();
				setState(278);
				specialValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
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
		enterRule(_localctx, 50, RULE_loopStatement);
		try {
			setState(286);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				whileBlock();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				doWhileBlock();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(285);
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
		public TerminalNode RBRACE() { return getToken(JavaBinksParser.RBRACE, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
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
		enterRule(_localctx, 52, RULE_whileBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(WHILE);
			setState(289);
			match(LPAREN);
			setState(290);
			conditionalExpression();
			setState(291);
			match(RPAREN);
			setState(292);
			match(LBRACE);
			setState(294);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << PRINTER) | (1L << SCANNER) | (1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << VariableFuncName) | (1L << CharLiteral) | (1L << FloatLiteral) | (1L << IntegerLiteral) | (1L << NegativeIntegerLiteral) | (1L << StringLiteral) | (1L << LPAREN))) != 0)) {
				{
				setState(293);
				codeBlock();
				}
			}

			setState(296);
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
		public TerminalNode RBRACE() { return getToken(JavaBinksParser.RBRACE, 0); }
		public TerminalNode WHILE() { return getToken(JavaBinksParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(JavaBinksParser.LPAREN, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaBinksParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(JavaBinksParser.SEMI, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
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
		enterRule(_localctx, 54, RULE_doWhileBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(DO);
			setState(299);
			match(LBRACE);
			setState(301);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << PRINTER) | (1L << SCANNER) | (1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << VariableFuncName) | (1L << CharLiteral) | (1L << FloatLiteral) | (1L << IntegerLiteral) | (1L << NegativeIntegerLiteral) | (1L << StringLiteral) | (1L << LPAREN))) != 0)) {
				{
				setState(300);
				codeBlock();
				}
			}

			setState(303);
			match(RBRACE);
			setState(304);
			match(WHILE);
			setState(305);
			match(LPAREN);
			setState(306);
			conditionalExpression();
			setState(307);
			match(RPAREN);
			setState(308);
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
		public TerminalNode RBRACE() { return getToken(JavaBinksParser.RBRACE, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
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
		enterRule(_localctx, 56, RULE_forBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(FOR);
			setState(311);
			match(LPAREN);
			setState(312);
			decValue();
			setState(313);
			match(SEMI);
			setState(314);
			conditionalExpression();
			setState(315);
			match(SEMI);
			setState(316);
			step();
			setState(317);
			match(RPAREN);
			setState(318);
			match(LBRACE);
			setState(320);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << PRINTER) | (1L << SCANNER) | (1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << VariableFuncName) | (1L << CharLiteral) | (1L << FloatLiteral) | (1L << IntegerLiteral) | (1L << NegativeIntegerLiteral) | (1L << StringLiteral) | (1L << LPAREN))) != 0)) {
				{
				setState(319);
				codeBlock();
				}
			}

			setState(322);
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
		enterRule(_localctx, 58, RULE_decValue);
		try {
			setState(331);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				match(INT);
				setState(325);
				match(VariableFuncName);
				setState(326);
				match(ASSIGN);
				setState(327);
				initValue();
				}
				break;
			case VariableFuncName:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				match(VariableFuncName);
				setState(329);
				match(ASSIGN);
				setState(330);
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
		public TerminalNode NegativeIntegerLiteral() { return getToken(JavaBinksParser.NegativeIntegerLiteral, 0); }
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
		enterRule(_localctx, 60, RULE_initValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VariableFuncName) | (1L << IntegerLiteral) | (1L << NegativeIntegerLiteral))) != 0)) ) {
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
		public TerminalNode NegativeIntegerLiteral() { return getToken(JavaBinksParser.NegativeIntegerLiteral, 0); }
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
		enterRule(_localctx, 62, RULE_step);
		int _la;
		try {
			setState(341);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				match(VariableFuncName);
				setState(336);
				special2Operator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				match(VariableFuncName);
				setState(338);
				specialOperator();
				setState(339);
				_la = _input.LA(1);
				if ( !(_la==IntegerLiteral || _la==NegativeIntegerLiteral) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
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
		enterRule(_localctx, 64, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
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
		public Special2OperatorContext special2Operator() {
			return getRuleContext(Special2OperatorContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaBinksParser.SEMI, 0); }
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
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(346);
				value();
				}
				break;
			case 2:
				{
				setState(347);
				match(VariableFuncName);
				}
				break;
			case 3:
				{
				setState(348);
				functionCallNoTerminator();
				}
				break;
			case 4:
				{
				setState(349);
				match(LPAREN);
				setState(350);
				expr(0);
				setState(351);
				match(RPAREN);
				}
				break;
			case 5:
				{
				setState(353);
				match(VariableFuncName);
				setState(354);
				special2Operator();
				setState(356);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(355);
					match(SEMI);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(366);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(360);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(361);
					operator();
					setState(362);
					expr(4);
					}
					} 
				}
				setState(368);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(JavaBinksParser.RBRACE, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public TerminalNode VOID() { return getToken(JavaBinksParser.VOID, 0); }
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
		int _la;
		try {
			setState(396);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case INT:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				datatype();
				setState(370);
				match(VariableFuncName);
				setState(371);
				match(LPAREN);
				setState(372);
				declarationParameter();
				setState(373);
				match(RPAREN);
				setState(374);
				match(LBRACE);
				setState(376);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << PRINTER) | (1L << SCANNER) | (1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << VariableFuncName) | (1L << CharLiteral) | (1L << FloatLiteral) | (1L << IntegerLiteral) | (1L << NegativeIntegerLiteral) | (1L << StringLiteral) | (1L << LPAREN))) != 0)) {
					{
					setState(375);
					codeBlock();
					}
				}

				setState(378);
				returnStatement();
				setState(379);
				match(RBRACE);
				setState(381);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << VOID))) != 0)) {
					{
					setState(380);
					functionDeclaration();
					}
				}

				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				match(VOID);
				setState(384);
				match(VariableFuncName);
				setState(385);
				match(LPAREN);
				setState(386);
				declarationParameter();
				setState(387);
				match(RPAREN);
				setState(388);
				match(LBRACE);
				setState(390);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << PRINTER) | (1L << SCANNER) | (1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << VariableFuncName) | (1L << CharLiteral) | (1L << FloatLiteral) | (1L << IntegerLiteral) | (1L << NegativeIntegerLiteral) | (1L << StringLiteral) | (1L << LPAREN))) != 0)) {
					{
					setState(389);
					codeBlock();
					}
				}

				setState(392);
				match(RBRACE);
				setState(394);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << VOID))) != 0)) {
					{
					setState(393);
					functionDeclaration();
					}
				}

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
		public SingleDeclarationParameterContext singleDeclarationParameter() {
			return getRuleContext(SingleDeclarationParameterContext.class,0);
		}
		public MultiDeclarationParameterContext multiDeclarationParameter() {
			return getRuleContext(MultiDeclarationParameterContext.class,0);
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
			setState(402);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				singleDeclarationParameter();
				setState(399);
				multiDeclarationParameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
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
			setState(404);
			match(COMMA);
			setState(405);
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
			setState(411);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case INT:
			case STRING:
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				returntype();
				setState(408);
				match(VariableFuncName);
				}
				break;
			case RPAREN:
			case COMMA:
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(JavaBinksParser.RETURN, 0); }
		public SpecialValueContext specialValue() {
			return getRuleContext(SpecialValueContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaBinksParser.SEMI, 0); }
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
			setState(413);
			match(RETURN);
			setState(414);
			specialValue();
			setState(415);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode VariableFuncName() { return getToken(JavaBinksParser.VariableFuncName, 0); }
		public TerminalNode LPAREN() { return getToken(JavaBinksParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaBinksParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(JavaBinksParser.SEMI, 0); }
		public CallParameterContext callParameter() {
			return getRuleContext(CallParameterContext.class,0);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(VariableFuncName);
			setState(418);
			match(LPAREN);
			setState(420);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << VariableFuncName) | (1L << CharLiteral) | (1L << FloatLiteral) | (1L << IntegerLiteral) | (1L << NegativeIntegerLiteral) | (1L << StringLiteral) | (1L << LPAREN))) != 0)) {
				{
				setState(419);
				callParameter();
				}
			}

			setState(422);
			match(RPAREN);
			setState(423);
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
		public TerminalNode RPAREN() { return getToken(JavaBinksParser.RPAREN, 0); }
		public CallParameterContext callParameter() {
			return getRuleContext(CallParameterContext.class,0);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(VariableFuncName);
			setState(426);
			match(LPAREN);
			setState(428);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << VariableFuncName) | (1L << CharLiteral) | (1L << FloatLiteral) | (1L << IntegerLiteral) | (1L << NegativeIntegerLiteral) | (1L << StringLiteral) | (1L << LPAREN))) != 0)) {
				{
				setState(427);
				callParameter();
				}
			}

			setState(430);
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
		public List<CallParameterContext> callParameter() {
			return getRuleContexts(CallParameterContext.class);
		}
		public CallParameterContext callParameter(int i) {
			return getRuleContext(CallParameterContext.class,i);
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
			setState(439);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				specialValue();
				setState(433);
				match(COMMA);
				setState(434);
				callParameter();
				setState(436);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(435);
					callParameter();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
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
		public TerminalNode VariableFuncName() { return getToken(JavaBinksParser.VariableFuncName, 0); }
		public ArrayAssignmentContext arrayAssignment() {
			return getRuleContext(ArrayAssignmentContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaBinksParser.SEMI, 0); }
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
			setState(441);
			datatype();
			setState(442);
			match(VariableFuncName);
			setState(443);
			arrayAssignment();
			setState(444);
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

	public static class ArrayAssignmentContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(JavaBinksParser.LBRACK, 0); }
		public TerminalNode IntegerLiteral() { return getToken(JavaBinksParser.IntegerLiteral, 0); }
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
			setState(456);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				match(LBRACK);
				setState(447);
				match(IntegerLiteral);
				setState(448);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				match(LBRACK);
				setState(450);
				match(RBRACK);
				setState(451);
				match(ASSIGN);
				setState(452);
				match(LBRACE);
				setState(453);
				list();
				setState(454);
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
			setState(463);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				boolList();
				}
				break;
			case CharLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
				charList();
				}
				break;
			case FloatLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(460);
				floatList();
				}
				break;
			case IntegerLiteral:
			case NegativeIntegerLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(461);
				integerList();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(462);
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
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
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
			setState(470);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(465);
				booleanLiteral();
				setState(466);
				match(COMMA);
				setState(467);
				boolList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
				booleanLiteral();
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
			setState(476);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				match(CharLiteral);
				setState(473);
				match(COMMA);
				setState(474);
				charList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(475);
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
			setState(482);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(478);
				match(FloatLiteral);
				setState(479);
				match(COMMA);
				setState(480);
				floatList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(481);
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
		public TerminalNode COMMA() { return getToken(JavaBinksParser.COMMA, 0); }
		public IntegerListContext integerList() {
			return getRuleContext(IntegerListContext.class,0);
		}
		public TerminalNode NegativeIntegerLiteral() { return getToken(JavaBinksParser.NegativeIntegerLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(JavaBinksParser.IntegerLiteral, 0); }
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
		int _la;
		try {
			setState(489);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				_la = _input.LA(1);
				if ( !(_la==IntegerLiteral || _la==NegativeIntegerLiteral) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(485);
				match(COMMA);
				setState(486);
				integerList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(487);
				match(IntegerLiteral);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(488);
				match(NegativeIntegerLiteral);
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
			setState(495);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(491);
				match(StringLiteral);
				setState(492);
				match(COMMA);
				setState(493);
				stringList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(494);
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

	public static class PrinterContext extends ParserRuleContext {
		public TerminalNode PRINTER() { return getToken(JavaBinksParser.PRINTER, 0); }
		public TerminalNode LPAREN() { return getToken(JavaBinksParser.LPAREN, 0); }
		public TerminalNode StringLiteral() { return getToken(JavaBinksParser.StringLiteral, 0); }
		public TerminalNode RPAREN() { return getToken(JavaBinksParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(JavaBinksParser.SEMI, 0); }
		public SpecialValueContext specialValue() {
			return getRuleContext(SpecialValueContext.class,0);
		}
		public PrinterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterPrinter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitPrinter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitPrinter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrinterContext printer() throws RecognitionException {
		PrinterContext _localctx = new PrinterContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_printer);
		try {
			setState(508);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				match(PRINTER);
				setState(498);
				match(LPAREN);
				setState(499);
				match(StringLiteral);
				setState(500);
				match(RPAREN);
				setState(501);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(502);
				match(PRINTER);
				setState(503);
				match(LPAREN);
				setState(504);
				specialValue();
				setState(505);
				match(RPAREN);
				setState(506);
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

	public static class ScannerContext extends ParserRuleContext {
		public TerminalNode SCANNER() { return getToken(JavaBinksParser.SCANNER, 0); }
		public TerminalNode LPAREN() { return getToken(JavaBinksParser.LPAREN, 0); }
		public TerminalNode SCANNERINT() { return getToken(JavaBinksParser.SCANNERINT, 0); }
		public TerminalNode COMMA() { return getToken(JavaBinksParser.COMMA, 0); }
		public TerminalNode VariableFuncName() { return getToken(JavaBinksParser.VariableFuncName, 0); }
		public TerminalNode RPAREN() { return getToken(JavaBinksParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(JavaBinksParser.SEMI, 0); }
		public TerminalNode SCANNERFLOAT() { return getToken(JavaBinksParser.SCANNERFLOAT, 0); }
		public TerminalNode SCANNERBOOLEAN() { return getToken(JavaBinksParser.SCANNERBOOLEAN, 0); }
		public TerminalNode SCANNERCHAR() { return getToken(JavaBinksParser.SCANNERCHAR, 0); }
		public TerminalNode SCANNERSTRING() { return getToken(JavaBinksParser.SCANNERSTRING, 0); }
		public ScannerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scanner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterScanner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitScanner(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitScanner(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScannerContext scanner() throws RecognitionException {
		ScannerContext _localctx = new ScannerContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_scanner);
		try {
			setState(545);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(510);
				match(SCANNER);
				setState(511);
				match(LPAREN);
				setState(512);
				match(SCANNERINT);
				setState(513);
				match(COMMA);
				setState(514);
				match(VariableFuncName);
				setState(515);
				match(RPAREN);
				setState(516);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(517);
				match(SCANNER);
				setState(518);
				match(LPAREN);
				setState(519);
				match(SCANNERFLOAT);
				setState(520);
				match(COMMA);
				setState(521);
				match(VariableFuncName);
				setState(522);
				match(RPAREN);
				setState(523);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(524);
				match(SCANNER);
				setState(525);
				match(LPAREN);
				setState(526);
				match(SCANNERBOOLEAN);
				setState(527);
				match(COMMA);
				setState(528);
				match(VariableFuncName);
				setState(529);
				match(RPAREN);
				setState(530);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(531);
				match(SCANNER);
				setState(532);
				match(LPAREN);
				setState(533);
				match(SCANNERCHAR);
				setState(534);
				match(COMMA);
				setState(535);
				match(VariableFuncName);
				setState(536);
				match(RPAREN);
				setState(537);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(538);
				match(SCANNER);
				setState(539);
				match(LPAREN);
				setState(540);
				match(SCANNERSTRING);
				setState(541);
				match(COMMA);
				setState(542);
				match(VariableFuncName);
				setState(543);
				match(RPAREN);
				setState(544);
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
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public PrinterContext printer() {
			return getRuleContext(PrinterContext.class,0);
		}
		public ScannerContext scanner() {
			return getRuleContext(ScannerContext.class,0);
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
		enterRule(_localctx, 104, RULE_codeBlock);
		int _la;
		try {
			setState(587);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(547);
				declaration();
				setState(549);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << PRINTER) | (1L << SCANNER) | (1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << VariableFuncName) | (1L << CharLiteral) | (1L << FloatLiteral) | (1L << IntegerLiteral) | (1L << NegativeIntegerLiteral) | (1L << StringLiteral) | (1L << LPAREN))) != 0)) {
					{
					setState(548);
					codeBlock();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(551);
				assignment();
				setState(553);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << PRINTER) | (1L << SCANNER) | (1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << VariableFuncName) | (1L << CharLiteral) | (1L << FloatLiteral) | (1L << IntegerLiteral) | (1L << NegativeIntegerLiteral) | (1L << StringLiteral) | (1L << LPAREN))) != 0)) {
					{
					setState(552);
					codeBlock();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(555);
				conditionalStatement();
				setState(557);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << PRINTER) | (1L << SCANNER) | (1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << VariableFuncName) | (1L << CharLiteral) | (1L << FloatLiteral) | (1L << IntegerLiteral) | (1L << NegativeIntegerLiteral) | (1L << StringLiteral) | (1L << LPAREN))) != 0)) {
					{
					setState(556);
					codeBlock();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(559);
				loopStatement();
				setState(561);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << PRINTER) | (1L << SCANNER) | (1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << VariableFuncName) | (1L << CharLiteral) | (1L << FloatLiteral) | (1L << IntegerLiteral) | (1L << NegativeIntegerLiteral) | (1L << StringLiteral) | (1L << LPAREN))) != 0)) {
					{
					setState(560);
					codeBlock();
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(563);
				functionCall();
				setState(565);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << PRINTER) | (1L << SCANNER) | (1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << VariableFuncName) | (1L << CharLiteral) | (1L << FloatLiteral) | (1L << IntegerLiteral) | (1L << NegativeIntegerLiteral) | (1L << StringLiteral) | (1L << LPAREN))) != 0)) {
					{
					setState(564);
					codeBlock();
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(567);
				array();
				setState(569);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << PRINTER) | (1L << SCANNER) | (1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << VariableFuncName) | (1L << CharLiteral) | (1L << FloatLiteral) | (1L << IntegerLiteral) | (1L << NegativeIntegerLiteral) | (1L << StringLiteral) | (1L << LPAREN))) != 0)) {
					{
					setState(568);
					codeBlock();
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(571);
				expression();
				setState(573);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << PRINTER) | (1L << SCANNER) | (1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << VariableFuncName) | (1L << CharLiteral) | (1L << FloatLiteral) | (1L << IntegerLiteral) | (1L << NegativeIntegerLiteral) | (1L << StringLiteral) | (1L << LPAREN))) != 0)) {
					{
					setState(572);
					codeBlock();
					}
				}

				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(575);
				comment();
				setState(577);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << PRINTER) | (1L << SCANNER) | (1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << VariableFuncName) | (1L << CharLiteral) | (1L << FloatLiteral) | (1L << IntegerLiteral) | (1L << NegativeIntegerLiteral) | (1L << StringLiteral) | (1L << LPAREN))) != 0)) {
					{
					setState(576);
					codeBlock();
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(579);
				printer();
				setState(581);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << PRINTER) | (1L << SCANNER) | (1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << VariableFuncName) | (1L << CharLiteral) | (1L << FloatLiteral) | (1L << IntegerLiteral) | (1L << NegativeIntegerLiteral) | (1L << StringLiteral) | (1L << LPAREN))) != 0)) {
					{
					setState(580);
					codeBlock();
					}
				}

				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(583);
				scanner();
				setState(585);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << PRINTER) | (1L << SCANNER) | (1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << VariableFuncName) | (1L << CharLiteral) | (1L << FloatLiteral) | (1L << IntegerLiteral) | (1L << NegativeIntegerLiteral) | (1L << StringLiteral) | (1L << LPAREN))) != 0)) {
					{
					setState(584);
					codeBlock();
					}
				}

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
		public ReturnMainContext returnMain() {
			return getRuleContext(ReturnMainContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(JavaBinksParser.RBRACE, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
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
		enterRule(_localctx, 106, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(INT);
			setState(590);
			match(T__1);
			setState(591);
			match(LPAREN);
			setState(592);
			match(RPAREN);
			setState(593);
			match(LBRACE);
			setState(595);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << PRINTER) | (1L << SCANNER) | (1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << VariableFuncName) | (1L << CharLiteral) | (1L << FloatLiteral) | (1L << IntegerLiteral) | (1L << NegativeIntegerLiteral) | (1L << StringLiteral) | (1L << LPAREN))) != 0)) {
				{
				setState(594);
				codeBlock();
				}
			}

			setState(597);
			returnMain();
			setState(598);
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
		public TerminalNode SEMI() { return getToken(JavaBinksParser.SEMI, 0); }
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
		enterRule(_localctx, 108, RULE_returnMain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(RETURN);
			setState(601);
			match(IntegerLiteral);
			setState(602);
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

	public static class BooleanLiteralContext extends ParserRuleContext {
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
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

	public static class CommentContext extends ParserRuleContext {
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBinksListener ) ((JavaBinksListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBinksVisitor ) return ((JavaBinksVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_comment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			match(T__4);
			setState(610);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(607);
					matchWildcard();
					}
					} 
				}
				setState(612);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			setState(613);
			match(T__5);
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
		case 33:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3J\u026a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\5\2w\n\2\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\5\t\u008d\n\t\3\n\3\n\5\n\u0091\n\n\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\5\f\u009c\n\f\3\r\3\r\3\r\3\r\5\r\u00a2\n\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ae\n\16\3\17\3\17\5\17"+
		"\u00b2\n\17\3\20\3\20\5\20\u00b6\n\20\3\21\3\21\5\21\u00ba\n\21\3\21\5"+
		"\21\u00bd\n\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00c5\n\22\3\22\3\22"+
		"\3\23\3\23\3\23\5\23\u00cc\n\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u00d6\n\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u00e7\n\26\3\27\3\27\3\27\3\27\5\27\u00ed\n"+
		"\27\3\30\3\30\3\30\3\30\3\30\5\30\u00f4\n\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u00fd\n\30\3\30\3\30\3\30\3\30\5\30\u0103\n\30\3\31\3"+
		"\31\3\31\3\31\5\31\u0109\n\31\3\31\3\31\3\31\3\31\3\31\5\31\u0110\n\31"+
		"\3\31\3\31\3\31\5\31\u0115\n\31\3\32\3\32\3\32\3\32\3\32\5\32\u011c\n"+
		"\32\3\33\3\33\3\33\5\33\u0121\n\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u0129\n\34\3\34\3\34\3\35\3\35\3\35\5\35\u0130\n\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5"+
		"\36\u0143\n\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u014e"+
		"\n\37\3 \3 \3!\3!\3!\3!\3!\3!\5!\u0158\n!\3\"\3\"\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\5#\u0167\n#\5#\u0169\n#\3#\3#\3#\3#\7#\u016f\n#\f#\16#\u0172"+
		"\13#\3$\3$\3$\3$\3$\3$\3$\5$\u017b\n$\3$\3$\3$\5$\u0180\n$\3$\3$\3$\3"+
		"$\3$\3$\3$\5$\u0189\n$\3$\3$\5$\u018d\n$\5$\u018f\n$\3%\3%\3%\3%\5%\u0195"+
		"\n%\3&\3&\3&\3\'\3\'\3\'\3\'\5\'\u019e\n\'\3(\3(\3(\3(\3)\3)\3)\5)\u01a7"+
		"\n)\3)\3)\3)\3*\3*\3*\5*\u01af\n*\3*\3*\3+\3+\3+\3+\5+\u01b7\n+\3+\5+"+
		"\u01ba\n+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u01cb\n-\3."+
		"\3.\3.\3.\3.\5.\u01d2\n.\3/\3/\3/\3/\3/\5/\u01d9\n/\3\60\3\60\3\60\3\60"+
		"\5\60\u01df\n\60\3\61\3\61\3\61\3\61\5\61\u01e5\n\61\3\62\3\62\3\62\3"+
		"\62\3\62\5\62\u01ec\n\62\3\63\3\63\3\63\3\63\5\63\u01f2\n\63\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u01ff\n\64\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\5\65\u0224\n\65\3\66\3\66\5\66\u0228\n\66\3"+
		"\66\3\66\5\66\u022c\n\66\3\66\3\66\5\66\u0230\n\66\3\66\3\66\5\66\u0234"+
		"\n\66\3\66\3\66\5\66\u0238\n\66\3\66\3\66\5\66\u023c\n\66\3\66\3\66\5"+
		"\66\u0240\n\66\3\66\3\66\5\66\u0244\n\66\3\66\3\66\5\66\u0248\n\66\3\66"+
		"\3\66\5\66\u024c\n\66\5\66\u024e\n\66\3\67\3\67\3\67\3\67\3\67\3\67\5"+
		"\67\u0256\n\67\3\67\3\67\3\67\38\38\38\38\39\39\3:\3:\7:\u0263\n:\f:\16"+
		":\u0266\13:\3:\3:\3:\3\u0264\3D;\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnpr\2\13\3\2\26\32\3"+
		"\2\26\33\3\2+/\3\2<@\3\2\60\61\4\2\62\64\66;\4\2\34\34\37 \3\2\37 \3\2"+
		"\5\6\u0288\2t\3\2\2\2\4z\3\2\2\2\6|\3\2\2\2\b~\3\2\2\2\n\u0080\3\2\2\2"+
		"\f\u0082\3\2\2\2\16\u0084\3\2\2\2\20\u008c\3\2\2\2\22\u0090\3\2\2\2\24"+
		"\u0092\3\2\2\2\26\u009b\3\2\2\2\30\u00a1\3\2\2\2\32\u00ad\3\2\2\2\34\u00b1"+
		"\3\2\2\2\36\u00b3\3\2\2\2 \u00bc\3\2\2\2\"\u00be\3\2\2\2$\u00c8\3\2\2"+
		"\2&\u00cf\3\2\2\2(\u00d9\3\2\2\2*\u00e6\3\2\2\2,\u00ec\3\2\2\2.\u0102"+
		"\3\2\2\2\60\u0114\3\2\2\2\62\u011b\3\2\2\2\64\u0120\3\2\2\2\66\u0122\3"+
		"\2\2\28\u012c\3\2\2\2:\u0138\3\2\2\2<\u014d\3\2\2\2>\u014f\3\2\2\2@\u0157"+
		"\3\2\2\2B\u0159\3\2\2\2D\u0168\3\2\2\2F\u018e\3\2\2\2H\u0194\3\2\2\2J"+
		"\u0196\3\2\2\2L\u019d\3\2\2\2N\u019f\3\2\2\2P\u01a3\3\2\2\2R\u01ab\3\2"+
		"\2\2T\u01b9\3\2\2\2V\u01bb\3\2\2\2X\u01ca\3\2\2\2Z\u01d1\3\2\2\2\\\u01d8"+
		"\3\2\2\2^\u01de\3\2\2\2`\u01e4\3\2\2\2b\u01eb\3\2\2\2d\u01f1\3\2\2\2f"+
		"\u01fe\3\2\2\2h\u0223\3\2\2\2j\u024d\3\2\2\2l\u024f\3\2\2\2n\u025a\3\2"+
		"\2\2p\u025e\3\2\2\2r\u0260\3\2\2\2tv\5l\67\2uw\5F$\2vu\3\2\2\2vw\3\2\2"+
		"\2wx\3\2\2\2xy\7\2\2\3y\3\3\2\2\2z{\t\2\2\2{\5\3\2\2\2|}\t\3\2\2}\7\3"+
		"\2\2\2~\177\t\4\2\2\177\t\3\2\2\2\u0080\u0081\t\5\2\2\u0081\13\3\2\2\2"+
		"\u0082\u0083\t\6\2\2\u0083\r\3\2\2\2\u0084\u0085\t\7\2\2\u0085\17\3\2"+
		"\2\2\u0086\u008d\5p9\2\u0087\u008d\7\35\2\2\u0088\u008d\7\36\2\2\u0089"+
		"\u008d\7\37\2\2\u008a\u008d\7 \2\2\u008b\u008d\7\"\2\2\u008c\u0086\3\2"+
		"\2\2\u008c\u0087\3\2\2\2\u008c\u0088\3\2\2\2\u008c\u0089\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\21\3\2\2\2\u008e\u0091\5B\"\2"+
		"\u008f\u0091\5R*\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091\23\3"+
		"\2\2\2\u0092\u0093\5\4\3\2\u0093\u0094\5\26\f\2\u0094\u0095\7G\2\2\u0095"+
		"\25\3\2\2\2\u0096\u0097\5\30\r\2\u0097\u0098\7H\2\2\u0098\u0099\5\26\f"+
		"\2\u0099\u009c\3\2\2\2\u009a\u009c\5\30\r\2\u009b\u0096\3\2\2\2\u009b"+
		"\u009a\3\2\2\2\u009c\27\3\2\2\2\u009d\u00a2\7\34\2\2\u009e\u009f\7\34"+
		"\2\2\u009f\u00a0\7\65\2\2\u00a0\u00a2\5\22\n\2\u00a1\u009d\3\2\2\2\u00a1"+
		"\u009e\3\2\2\2\u00a2\31\3\2\2\2\u00a3\u00a4\7\34\2\2\u00a4\u00a5\7\65"+
		"\2\2\u00a5\u00a6\5\22\n\2\u00a6\u00a7\7G\2\2\u00a7\u00ae\3\2\2\2\u00a8"+
		"\u00a9\7\34\2\2\u00a9\u00aa\5\n\6\2\u00aa\u00ab\5\22\n\2\u00ab\u00ac\7"+
		"G\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00a3\3\2\2\2\u00ad\u00a8\3\2\2\2\u00ae"+
		"\33\3\2\2\2\u00af\u00b2\5\36\20\2\u00b0\u00b2\5(\25\2\u00b1\u00af\3\2"+
		"\2\2\u00b1\u00b0\3\2\2\2\u00b2\35\3\2\2\2\u00b3\u00b5\5\"\22\2\u00b4\u00b6"+
		"\5 \21\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\37\3\2\2\2\u00b7"+
		"\u00b9\5&\24\2\u00b8\u00ba\5 \21\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2"+
		"\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00bd\5$\23\2\u00bc\u00b7\3\2\2\2\u00bc"+
		"\u00bb\3\2\2\2\u00bd!\3\2\2\2\u00be\u00bf\7\20\2\2\u00bf\u00c0\7A\2\2"+
		"\u00c0\u00c1\5\62\32\2\u00c1\u00c2\7B\2\2\u00c2\u00c4\7C\2\2\u00c3\u00c5"+
		"\5j\66\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c7\7D\2\2\u00c7#\3\2\2\2\u00c8\u00c9\7\r\2\2\u00c9\u00cb\7C\2\2\u00ca"+
		"\u00cc\5j\66\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2"+
		"\2\2\u00cd\u00ce\7D\2\2\u00ce%\3\2\2\2\u00cf\u00d0\7\16\2\2\u00d0\u00d1"+
		"\7A\2\2\u00d1\u00d2\5\62\32\2\u00d2\u00d3\7B\2\2\u00d3\u00d5\7C\2\2\u00d4"+
		"\u00d6\5j\66\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2"+
		"\2\2\u00d7\u00d8\7D\2\2\u00d8\'\3\2\2\2\u00d9\u00da\7\21\2\2\u00da\u00db"+
		"\7A\2\2\u00db\u00dc\5\62\32\2\u00dc\u00dd\7B\2\2\u00dd\u00de\7C\2\2\u00de"+
		"\u00df\5*\26\2\u00df\u00e0\7D\2\2\u00e0)\3\2\2\2\u00e1\u00e2\5,\27\2\u00e2"+
		"\u00e3\5*\26\2\u00e3\u00e7\3\2\2\2\u00e4\u00e7\5,\27\2\u00e5\u00e7\5\60"+
		"\31\2\u00e6\u00e1\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7"+
		"+\3\2\2\2\u00e8\u00e9\5.\30\2\u00e9\u00ea\5,\27\2\u00ea\u00ed\3\2\2\2"+
		"\u00eb\u00ed\5.\30\2\u00ec\u00e8\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed-\3"+
		"\2\2\2\u00ee\u00ef\7\n\2\2\u00ef\u00f0\5\20\t\2\u00f0\u00f1\7\3\2\2\u00f1"+
		"\u00f3\7C\2\2\u00f2\u00f4\5j\66\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\7D\2\2\u00f6\u0103\3\2\2\2\u00f7"+
		"\u00f8\7\n\2\2\u00f8\u00f9\5\20\t\2\u00f9\u00fa\7\3\2\2\u00fa\u00fc\7"+
		"C\2\2\u00fb\u00fd\5j\66\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u00ff\7D\2\2\u00ff\u0100\7\t\2\2\u0100\u0101\7G\2"+
		"\2\u0101\u0103\3\2\2\2\u0102\u00ee\3\2\2\2\u0102\u00f7\3\2\2\2\u0103/"+
		"\3\2\2\2\u0104\u0105\7\13\2\2\u0105\u0106\7\3\2\2\u0106\u0108\7C\2\2\u0107"+
		"\u0109\5j\66\2\u0108\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a\u0115\7D\2\2\u010b\u010c\7\13\2\2\u010c\u010d\7\3\2\2\u010d"+
		"\u010f\7C\2\2\u010e\u0110\5j\66\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2"+
		"\2\2\u0110\u0111\3\2\2\2\u0111\u0112\7D\2\2\u0112\u0113\7\t\2\2\u0113"+
		"\u0115\7G\2\2\u0114\u0104\3\2\2\2\u0114\u010b\3\2\2\2\u0115\61\3\2\2\2"+
		"\u0116\u0117\5\22\n\2\u0117\u0118\5\16\b\2\u0118\u0119\5\22\n\2\u0119"+
		"\u011c\3\2\2\2\u011a\u011c\5\22\n\2\u011b\u0116\3\2\2\2\u011b\u011a\3"+
		"\2\2\2\u011c\63\3\2\2\2\u011d\u0121\5\66\34\2\u011e\u0121\58\35\2\u011f"+
		"\u0121\5:\36\2\u0120\u011d\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u011f\3\2"+
		"\2\2\u0121\65\3\2\2\2\u0122\u0123\7\22\2\2\u0123\u0124\7A\2\2\u0124\u0125"+
		"\5\62\32\2\u0125\u0126\7B\2\2\u0126\u0128\7C\2\2\u0127\u0129\5j\66\2\u0128"+
		"\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\7D"+
		"\2\2\u012b\67\3\2\2\2\u012c\u012d\7\f\2\2\u012d\u012f\7C\2\2\u012e\u0130"+
		"\5j\66\2\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\u0132\7D\2\2\u0132\u0133\7\22\2\2\u0133\u0134\7A\2\2\u0134\u0135\5\62"+
		"\32\2\u0135\u0136\7B\2\2\u0136\u0137\7G\2\2\u01379\3\2\2\2\u0138\u0139"+
		"\7\17\2\2\u0139\u013a\7A\2\2\u013a\u013b\5<\37\2\u013b\u013c\7G\2\2\u013c"+
		"\u013d\5\62\32\2\u013d\u013e\7G\2\2\u013e\u013f\5@!\2\u013f\u0140\7B\2"+
		"\2\u0140\u0142\7C\2\2\u0141\u0143\5j\66\2\u0142\u0141\3\2\2\2\u0142\u0143"+
		"\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\7D\2\2\u0145;\3\2\2\2\u0146\u0147"+
		"\7\31\2\2\u0147\u0148\7\34\2\2\u0148\u0149\7\65\2\2\u0149\u014e\5> \2"+
		"\u014a\u014b\7\34\2\2\u014b\u014c\7\65\2\2\u014c\u014e\5> \2\u014d\u0146"+
		"\3\2\2\2\u014d\u014a\3\2\2\2\u014e=\3\2\2\2\u014f\u0150\t\b\2\2\u0150"+
		"?\3\2\2\2\u0151\u0152\7\34\2\2\u0152\u0158\5\f\7\2\u0153\u0154\7\34\2"+
		"\2\u0154\u0155\5\n\6\2\u0155\u0156\t\t\2\2\u0156\u0158\3\2\2\2\u0157\u0151"+
		"\3\2\2\2\u0157\u0153\3\2\2\2\u0158A\3\2\2\2\u0159\u015a\5D#\2\u015aC\3"+
		"\2\2\2\u015b\u015c\b#\1\2\u015c\u0169\5\20\t\2\u015d\u0169\7\34\2\2\u015e"+
		"\u0169\5R*\2\u015f\u0160\7A\2\2\u0160\u0161\5D#\2\u0161\u0162\7B\2\2\u0162"+
		"\u0169\3\2\2\2\u0163\u0164\7\34\2\2\u0164\u0166\5\f\7\2\u0165\u0167\7"+
		"G\2\2\u0166\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0169\3\2\2\2\u0168"+
		"\u015b\3\2\2\2\u0168\u015d\3\2\2\2\u0168\u015e\3\2\2\2\u0168\u015f\3\2"+
		"\2\2\u0168\u0163\3\2\2\2\u0169\u0170\3\2\2\2\u016a\u016b\f\5\2\2\u016b"+
		"\u016c\5\b\5\2\u016c\u016d\5D#\6\u016d\u016f\3\2\2\2\u016e\u016a\3\2\2"+
		"\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171E"+
		"\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0174\5\4\3\2\u0174\u0175\7\34\2\2"+
		"\u0175\u0176\7A\2\2\u0176\u0177\5H%\2\u0177\u0178\7B\2\2\u0178\u017a\7"+
		"C\2\2\u0179\u017b\5j\66\2\u017a\u0179\3\2\2\2\u017a\u017b\3\2\2\2\u017b"+
		"\u017c\3\2\2\2\u017c\u017d\5N(\2\u017d\u017f\7D\2\2\u017e\u0180\5F$\2"+
		"\u017f\u017e\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u018f\3\2\2\2\u0181\u0182"+
		"\7\33\2\2\u0182\u0183\7\34\2\2\u0183\u0184\7A\2\2\u0184\u0185\5H%\2\u0185"+
		"\u0186\7B\2\2\u0186\u0188\7C\2\2\u0187\u0189\5j\66\2\u0188\u0187\3\2\2"+
		"\2\u0188\u0189\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018c\7D\2\2\u018b\u018d"+
		"\5F$\2\u018c\u018b\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018f\3\2\2\2\u018e"+
		"\u0173\3\2\2\2\u018e\u0181\3\2\2\2\u018fG\3\2\2\2\u0190\u0191\5L\'\2\u0191"+
		"\u0192\5J&\2\u0192\u0195\3\2\2\2\u0193\u0195\5L\'\2\u0194\u0190\3\2\2"+
		"\2\u0194\u0193\3\2\2\2\u0195I\3\2\2\2\u0196\u0197\7H\2\2\u0197\u0198\5"+
		"H%\2\u0198K\3\2\2\2\u0199\u019a\5\6\4\2\u019a\u019b\7\34\2\2\u019b\u019e"+
		"\3\2\2\2\u019c\u019e\3\2\2\2\u019d\u0199\3\2\2\2\u019d\u019c\3\2\2\2\u019e"+
		"M\3\2\2\2\u019f\u01a0\7\23\2\2\u01a0\u01a1\5\22\n\2\u01a1\u01a2\7G\2\2"+
		"\u01a2O\3\2\2\2\u01a3\u01a4\7\34\2\2\u01a4\u01a6\7A\2\2\u01a5\u01a7\5"+
		"T+\2\u01a6\u01a5\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8"+
		"\u01a9\7B\2\2\u01a9\u01aa\7G\2\2\u01aaQ\3\2\2\2\u01ab\u01ac\7\34\2\2\u01ac"+
		"\u01ae\7A\2\2\u01ad\u01af\5T+\2\u01ae\u01ad\3\2\2\2\u01ae\u01af\3\2\2"+
		"\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\7B\2\2\u01b1S\3\2\2\2\u01b2\u01b3\5"+
		"\22\n\2\u01b3\u01b4\7H\2\2\u01b4\u01b6\5T+\2\u01b5\u01b7\5T+\2\u01b6\u01b5"+
		"\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01ba\5\22\n\2"+
		"\u01b9\u01b2\3\2\2\2\u01b9\u01b8\3\2\2\2\u01baU\3\2\2\2\u01bb\u01bc\5"+
		"\4\3\2\u01bc\u01bd\7\34\2\2\u01bd\u01be\5X-\2\u01be\u01bf\7G\2\2\u01bf"+
		"W\3\2\2\2\u01c0\u01c1\7E\2\2\u01c1\u01c2\7\37\2\2\u01c2\u01cb\7F\2\2\u01c3"+
		"\u01c4\7E\2\2\u01c4\u01c5\7F\2\2\u01c5\u01c6\7\65\2\2\u01c6\u01c7\7C\2"+
		"\2\u01c7\u01c8\5Z.\2\u01c8\u01c9\7D\2\2\u01c9\u01cb\3\2\2\2\u01ca\u01c0"+
		"\3\2\2\2\u01ca\u01c3\3\2\2\2\u01cbY\3\2\2\2\u01cc\u01d2\5\\/\2\u01cd\u01d2"+
		"\5^\60\2\u01ce\u01d2\5`\61\2\u01cf\u01d2\5b\62\2\u01d0\u01d2\5d\63\2\u01d1"+
		"\u01cc\3\2\2\2\u01d1\u01cd\3\2\2\2\u01d1\u01ce\3\2\2\2\u01d1\u01cf\3\2"+
		"\2\2\u01d1\u01d0\3\2\2\2\u01d2[\3\2\2\2\u01d3\u01d4\5p9\2\u01d4\u01d5"+
		"\7H\2\2\u01d5\u01d6\5\\/\2\u01d6\u01d9\3\2\2\2\u01d7\u01d9\5p9\2\u01d8"+
		"\u01d3\3\2\2\2\u01d8\u01d7\3\2\2\2\u01d9]\3\2\2\2\u01da\u01db\7\35\2\2"+
		"\u01db\u01dc\7H\2\2\u01dc\u01df\5^\60\2\u01dd\u01df\7\35\2\2\u01de\u01da"+
		"\3\2\2\2\u01de\u01dd\3\2\2\2\u01df_\3\2\2\2\u01e0\u01e1\7\36\2\2\u01e1"+
		"\u01e2\7H\2\2\u01e2\u01e5\5`\61\2\u01e3\u01e5\7\36\2\2\u01e4\u01e0\3\2"+
		"\2\2\u01e4\u01e3\3\2\2\2\u01e5a\3\2\2\2\u01e6\u01e7\t\t\2\2\u01e7\u01e8"+
		"\7H\2\2\u01e8\u01ec\5b\62\2\u01e9\u01ec\7\37\2\2\u01ea\u01ec\7 \2\2\u01eb"+
		"\u01e6\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ea\3\2\2\2\u01ecc\3\2\2\2"+
		"\u01ed\u01ee\7\"\2\2\u01ee\u01ef\7H\2\2\u01ef\u01f2\5d\63\2\u01f0\u01f2"+
		"\7\"\2\2\u01f1\u01ed\3\2\2\2\u01f1\u01f0\3\2\2\2\u01f2e\3\2\2\2\u01f3"+
		"\u01f4\7\24\2\2\u01f4\u01f5\7A\2\2\u01f5\u01f6\7\"\2\2\u01f6\u01f7\7B"+
		"\2\2\u01f7\u01ff\7G\2\2\u01f8\u01f9\7\24\2\2\u01f9\u01fa\7A\2\2\u01fa"+
		"\u01fb\5\22\n\2\u01fb\u01fc\7B\2\2\u01fc\u01fd\7G\2\2\u01fd\u01ff\3\2"+
		"\2\2\u01fe\u01f3\3\2\2\2\u01fe\u01f8\3\2\2\2\u01ffg\3\2\2\2\u0200\u0201"+
		"\7\25\2\2\u0201\u0202\7A\2\2\u0202\u0203\7&\2\2\u0203\u0204\7H\2\2\u0204"+
		"\u0205\7\34\2\2\u0205\u0206\7B\2\2\u0206\u0224\7G\2\2\u0207\u0208\7\25"+
		"\2\2\u0208\u0209\7A\2\2\u0209\u020a\7\'\2\2\u020a\u020b\7H\2\2\u020b\u020c"+
		"\7\34\2\2\u020c\u020d\7B\2\2\u020d\u0224\7G\2\2\u020e\u020f\7\25\2\2\u020f"+
		"\u0210\7A\2\2\u0210\u0211\7(\2\2\u0211\u0212\7H\2\2\u0212\u0213\7\34\2"+
		"\2\u0213\u0214\7B\2\2\u0214\u0224\7G\2\2\u0215\u0216\7\25\2\2\u0216\u0217"+
		"\7A\2\2\u0217\u0218\7)\2\2\u0218\u0219\7H\2\2\u0219\u021a\7\34\2\2\u021a"+
		"\u021b\7B\2\2\u021b\u0224\7G\2\2\u021c\u021d\7\25\2\2\u021d\u021e\7A\2"+
		"\2\u021e\u021f\7*\2\2\u021f\u0220\7H\2\2\u0220\u0221\7\34\2\2\u0221\u0222"+
		"\7B\2\2\u0222\u0224\7G\2\2\u0223\u0200\3\2\2\2\u0223\u0207\3\2\2\2\u0223"+
		"\u020e\3\2\2\2\u0223\u0215\3\2\2\2\u0223\u021c\3\2\2\2\u0224i\3\2\2\2"+
		"\u0225\u0227\5\24\13\2\u0226\u0228\5j\66\2\u0227\u0226\3\2\2\2\u0227\u0228"+
		"\3\2\2\2\u0228\u024e\3\2\2\2\u0229\u022b\5\32\16\2\u022a\u022c\5j\66\2"+
		"\u022b\u022a\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u024e\3\2\2\2\u022d\u022f"+
		"\5\34\17\2\u022e\u0230\5j\66\2\u022f\u022e\3\2\2\2\u022f\u0230\3\2\2\2"+
		"\u0230\u024e\3\2\2\2\u0231\u0233\5\64\33\2\u0232\u0234\5j\66\2\u0233\u0232"+
		"\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u024e\3\2\2\2\u0235\u0237\5P)\2\u0236"+
		"\u0238\5j\66\2\u0237\u0236\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u024e\3\2"+
		"\2\2\u0239\u023b\5V,\2\u023a\u023c\5j\66\2\u023b\u023a\3\2\2\2\u023b\u023c"+
		"\3\2\2\2\u023c\u024e\3\2\2\2\u023d\u023f\5B\"\2\u023e\u0240\5j\66\2\u023f"+
		"\u023e\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u024e\3\2\2\2\u0241\u0243\5r"+
		":\2\u0242\u0244\5j\66\2\u0243\u0242\3\2\2\2\u0243\u0244\3\2\2\2\u0244"+
		"\u024e\3\2\2\2\u0245\u0247\5f\64\2\u0246\u0248\5j\66\2\u0247\u0246\3\2"+
		"\2\2\u0247\u0248\3\2\2\2\u0248\u024e\3\2\2\2\u0249\u024b\5h\65\2\u024a"+
		"\u024c\5j\66\2\u024b\u024a\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024e\3\2"+
		"\2\2\u024d\u0225\3\2\2\2\u024d\u0229\3\2\2\2\u024d\u022d\3\2\2\2\u024d"+
		"\u0231\3\2\2\2\u024d\u0235\3\2\2\2\u024d\u0239\3\2\2\2\u024d\u023d\3\2"+
		"\2\2\u024d\u0241\3\2\2\2\u024d\u0245\3\2\2\2\u024d\u0249\3\2\2\2\u024e"+
		"k\3\2\2\2\u024f\u0250\7\31\2\2\u0250\u0251\7\4\2\2\u0251\u0252\7A\2\2"+
		"\u0252\u0253\7B\2\2\u0253\u0255\7C\2\2\u0254\u0256\5j\66\2\u0255\u0254"+
		"\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0258\5n8\2\u0258"+
		"\u0259\7D\2\2\u0259m\3\2\2\2\u025a\u025b\7\23\2\2\u025b\u025c\7\37\2\2"+
		"\u025c\u025d\7G\2\2\u025do\3\2\2\2\u025e\u025f\t\n\2\2\u025fq\3\2\2\2"+
		"\u0260\u0264\7\7\2\2\u0261\u0263\13\2\2\2\u0262\u0261\3\2\2\2\u0263\u0266"+
		"\3\2\2\2\u0264\u0265\3\2\2\2\u0264\u0262\3\2\2\2\u0265\u0267\3\2\2\2\u0266"+
		"\u0264\3\2\2\2\u0267\u0268\7\b\2\2\u0268s\3\2\2\2Bv\u008c\u0090\u009b"+
		"\u00a1\u00ad\u00b1\u00b5\u00b9\u00bc\u00c4\u00cb\u00d5\u00e6\u00ec\u00f3"+
		"\u00fc\u0102\u0108\u010f\u0114\u011b\u0120\u0128\u012f\u0142\u014d\u0157"+
		"\u0166\u0168\u0170\u017a\u017f\u0188\u018c\u018e\u0194\u019d\u01a6\u01ae"+
		"\u01b6\u01b9\u01ca\u01d1\u01d8\u01de\u01e4\u01eb\u01f1\u01fe\u0223\u0227"+
		"\u022b\u022f\u0233\u0237\u023b\u023f\u0243\u0247\u024b\u024d\u0255\u0264";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}