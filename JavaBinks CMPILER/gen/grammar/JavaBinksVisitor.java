// Generated from C:/Users/WilliamPC/Documents/CMPILER/MP/JavaBinks CMPILER/src/grammar\JavaBinks.g4 by ANTLR 4.5.1
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaBinksParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaBinksVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(JavaBinksParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatype(JavaBinksParser.DatatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#returntype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturntype(JavaBinksParser.ReturntypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(JavaBinksParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#specialOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialOperator(JavaBinksParser.SpecialOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#special2Operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecial2Operator(JavaBinksParser.Special2OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#logicalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOperator(JavaBinksParser.LogicalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(JavaBinksParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#specialValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialValue(JavaBinksParser.SpecialValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(JavaBinksParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#multiDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiDec(JavaBinksParser.MultiDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#singleDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleDec(JavaBinksParser.SingleDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(JavaBinksParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#conditionalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStatement(JavaBinksParser.ConditionalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(JavaBinksParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#elseIfBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfBlock(JavaBinksParser.ElseIfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#ifCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfCondition(JavaBinksParser.IfConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#elseCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseCondition(JavaBinksParser.ElseConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#elseIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIf(JavaBinksParser.ElseIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#switchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlock(JavaBinksParser.SwitchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#switchCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchCase(JavaBinksParser.SwitchCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#caseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseBlock(JavaBinksParser.CaseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#caseCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseCondition(JavaBinksParser.CaseConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#defaultBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultBlock(JavaBinksParser.DefaultBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(JavaBinksParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(JavaBinksParser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#whileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileBlock(JavaBinksParser.WhileBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#doWhileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileBlock(JavaBinksParser.DoWhileBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#forBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForBlock(JavaBinksParser.ForBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#decValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecValue(JavaBinksParser.DecValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#initValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitValue(JavaBinksParser.InitValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStep(JavaBinksParser.StepContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JavaBinksParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(JavaBinksParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(JavaBinksParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#declarationParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationParameter(JavaBinksParser.DeclarationParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#multiDeclarationParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiDeclarationParameter(JavaBinksParser.MultiDeclarationParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#singleDeclarationParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleDeclarationParameter(JavaBinksParser.SingleDeclarationParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(JavaBinksParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(JavaBinksParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#functionCallNoTerminator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallNoTerminator(JavaBinksParser.FunctionCallNoTerminatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#callParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallParameter(JavaBinksParser.CallParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(JavaBinksParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#arrayAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAssignment(JavaBinksParser.ArrayAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(JavaBinksParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#boolList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolList(JavaBinksParser.BoolListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#charList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharList(JavaBinksParser.CharListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#floatList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatList(JavaBinksParser.FloatListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#integerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerList(JavaBinksParser.IntegerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#stringList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringList(JavaBinksParser.StringListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#printer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrinter(JavaBinksParser.PrinterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#scanner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScanner(JavaBinksParser.ScannerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#codeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeBlock(JavaBinksParser.CodeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(JavaBinksParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#returnMain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnMain(JavaBinksParser.ReturnMainContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(JavaBinksParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(JavaBinksParser.CommentContext ctx);
}