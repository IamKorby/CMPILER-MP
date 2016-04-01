// Generated from /Users/hannah/Documents/IntelliJ Path/JavaBinks CMPILER/src/grammar/JavaBinks.g4 by ANTLR 4.5.1
package generated_codes;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaBinksParser}.
 */
public interface JavaBinksListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(JavaBinksParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(JavaBinksParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(JavaBinksParser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(JavaBinksParser.DatatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#returntype}.
	 * @param ctx the parse tree
	 */
	void enterReturntype(JavaBinksParser.ReturntypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#returntype}.
	 * @param ctx the parse tree
	 */
	void exitReturntype(JavaBinksParser.ReturntypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(JavaBinksParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(JavaBinksParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#specialOperator}.
	 * @param ctx the parse tree
	 */
	void enterSpecialOperator(JavaBinksParser.SpecialOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#specialOperator}.
	 * @param ctx the parse tree
	 */
	void exitSpecialOperator(JavaBinksParser.SpecialOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#special2Operator}.
	 * @param ctx the parse tree
	 */
	void enterSpecial2Operator(JavaBinksParser.Special2OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#special2Operator}.
	 * @param ctx the parse tree
	 */
	void exitSpecial2Operator(JavaBinksParser.Special2OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperator(JavaBinksParser.LogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperator(JavaBinksParser.LogicalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(JavaBinksParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(JavaBinksParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#specialValue}.
	 * @param ctx the parse tree
	 */
	void enterSpecialValue(JavaBinksParser.SpecialValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#specialValue}.
	 * @param ctx the parse tree
	 */
	void exitSpecialValue(JavaBinksParser.SpecialValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(JavaBinksParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(JavaBinksParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#multiDec}.
	 * @param ctx the parse tree
	 */
	void enterMultiDec(JavaBinksParser.MultiDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#multiDec}.
	 * @param ctx the parse tree
	 */
	void exitMultiDec(JavaBinksParser.MultiDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#singleDec}.
	 * @param ctx the parse tree
	 */
	void enterSingleDec(JavaBinksParser.SingleDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#singleDec}.
	 * @param ctx the parse tree
	 */
	void exitSingleDec(JavaBinksParser.SingleDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(JavaBinksParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(JavaBinksParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(JavaBinksParser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(JavaBinksParser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(JavaBinksParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(JavaBinksParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#elseIfBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseIfBlock(JavaBinksParser.ElseIfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#elseIfBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseIfBlock(JavaBinksParser.ElseIfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void enterIfCondition(JavaBinksParser.IfConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void exitIfCondition(JavaBinksParser.IfConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#elseCondition}.
	 * @param ctx the parse tree
	 */
	void enterElseCondition(JavaBinksParser.ElseConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#elseCondition}.
	 * @param ctx the parse tree
	 */
	void exitElseCondition(JavaBinksParser.ElseConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#elseIf}.
	 * @param ctx the parse tree
	 */
	void enterElseIf(JavaBinksParser.ElseIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#elseIf}.
	 * @param ctx the parse tree
	 */
	void exitElseIf(JavaBinksParser.ElseIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(JavaBinksParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(JavaBinksParser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCase(JavaBinksParser.SwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCase(JavaBinksParser.SwitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void enterCaseBlock(JavaBinksParser.CaseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void exitCaseBlock(JavaBinksParser.CaseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#caseCondition}.
	 * @param ctx the parse tree
	 */
	void enterCaseCondition(JavaBinksParser.CaseConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#caseCondition}.
	 * @param ctx the parse tree
	 */
	void exitCaseCondition(JavaBinksParser.CaseConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#defaultBlock}.
	 * @param ctx the parse tree
	 */
	void enterDefaultBlock(JavaBinksParser.DefaultBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#defaultBlock}.
	 * @param ctx the parse tree
	 */
	void exitDefaultBlock(JavaBinksParser.DefaultBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(JavaBinksParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(JavaBinksParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(JavaBinksParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(JavaBinksParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void enterWhileBlock(JavaBinksParser.WhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void exitWhileBlock(JavaBinksParser.WhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#doWhileBlock}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileBlock(JavaBinksParser.DoWhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#doWhileBlock}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileBlock(JavaBinksParser.DoWhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void enterForBlock(JavaBinksParser.ForBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void exitForBlock(JavaBinksParser.ForBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#decValue}.
	 * @param ctx the parse tree
	 */
	void enterDecValue(JavaBinksParser.DecValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#decValue}.
	 * @param ctx the parse tree
	 */
	void exitDecValue(JavaBinksParser.DecValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#initValue}.
	 * @param ctx the parse tree
	 */
	void enterInitValue(JavaBinksParser.InitValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#initValue}.
	 * @param ctx the parse tree
	 */
	void exitInitValue(JavaBinksParser.InitValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#step}.
	 * @param ctx the parse tree
	 */
	void enterStep(JavaBinksParser.StepContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#step}.
	 * @param ctx the parse tree
	 */
	void exitStep(JavaBinksParser.StepContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JavaBinksParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JavaBinksParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(JavaBinksParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(JavaBinksParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(JavaBinksParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(JavaBinksParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#declarationParameter}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationParameter(JavaBinksParser.DeclarationParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#declarationParameter}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationParameter(JavaBinksParser.DeclarationParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#multiDeclarationParameter}.
	 * @param ctx the parse tree
	 */
	void enterMultiDeclarationParameter(JavaBinksParser.MultiDeclarationParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#multiDeclarationParameter}.
	 * @param ctx the parse tree
	 */
	void exitMultiDeclarationParameter(JavaBinksParser.MultiDeclarationParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#singleDeclarationParameter}.
	 * @param ctx the parse tree
	 */
	void enterSingleDeclarationParameter(JavaBinksParser.SingleDeclarationParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#singleDeclarationParameter}.
	 * @param ctx the parse tree
	 */
	void exitSingleDeclarationParameter(JavaBinksParser.SingleDeclarationParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(JavaBinksParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(JavaBinksParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(JavaBinksParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(JavaBinksParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#functionCallNoTerminator}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallNoTerminator(JavaBinksParser.FunctionCallNoTerminatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#functionCallNoTerminator}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallNoTerminator(JavaBinksParser.FunctionCallNoTerminatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#callParameter}.
	 * @param ctx the parse tree
	 */
	void enterCallParameter(JavaBinksParser.CallParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#callParameter}.
	 * @param ctx the parse tree
	 */
	void exitCallParameter(JavaBinksParser.CallParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(JavaBinksParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(JavaBinksParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#arrayAssignment}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssignment(JavaBinksParser.ArrayAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#arrayAssignment}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssignment(JavaBinksParser.ArrayAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(JavaBinksParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(JavaBinksParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#boolList}.
	 * @param ctx the parse tree
	 */
	void enterBoolList(JavaBinksParser.BoolListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#boolList}.
	 * @param ctx the parse tree
	 */
	void exitBoolList(JavaBinksParser.BoolListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#charList}.
	 * @param ctx the parse tree
	 */
	void enterCharList(JavaBinksParser.CharListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#charList}.
	 * @param ctx the parse tree
	 */
	void exitCharList(JavaBinksParser.CharListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#floatList}.
	 * @param ctx the parse tree
	 */
	void enterFloatList(JavaBinksParser.FloatListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#floatList}.
	 * @param ctx the parse tree
	 */
	void exitFloatList(JavaBinksParser.FloatListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#integerList}.
	 * @param ctx the parse tree
	 */
	void enterIntegerList(JavaBinksParser.IntegerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#integerList}.
	 * @param ctx the parse tree
	 */
	void exitIntegerList(JavaBinksParser.IntegerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#stringList}.
	 * @param ctx the parse tree
	 */
	void enterStringList(JavaBinksParser.StringListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#stringList}.
	 * @param ctx the parse tree
	 */
	void exitStringList(JavaBinksParser.StringListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#printer}.
	 * @param ctx the parse tree
	 */
	void enterPrinter(JavaBinksParser.PrinterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#printer}.
	 * @param ctx the parse tree
	 */
	void exitPrinter(JavaBinksParser.PrinterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void enterCodeBlock(JavaBinksParser.CodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void exitCodeBlock(JavaBinksParser.CodeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(JavaBinksParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(JavaBinksParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#returnMain}.
	 * @param ctx the parse tree
	 */
	void enterReturnMain(JavaBinksParser.ReturnMainContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#returnMain}.
	 * @param ctx the parse tree
	 */
	void exitReturnMain(JavaBinksParser.ReturnMainContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(JavaBinksParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(JavaBinksParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(JavaBinksParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(JavaBinksParser.CommentContext ctx);
}