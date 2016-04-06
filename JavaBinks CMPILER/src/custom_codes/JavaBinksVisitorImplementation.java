package custom_codes;

import generated_codes.JavaBinksParser;
import generated_codes.JavaBinksVisitor;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * Created by Justin on 20/03/2016.
 */
public class JavaBinksVisitorImplementation implements JavaBinksVisitor<Integer>
{

	@Override
	public Integer visitStart(JavaBinksParser.StartContext ctx) {
		return null;
	}

	@Override
	public Integer visitDatatype(JavaBinksParser.DatatypeContext ctx) {
		return null;
	}

	@Override
	public Integer visitReturntype(JavaBinksParser.ReturntypeContext ctx) {
		return null;
	}

	@Override
	public Integer visitOperator(JavaBinksParser.OperatorContext ctx) {
		return null;
	}

	@Override
	public Integer visitSpecialOperator(JavaBinksParser.SpecialOperatorContext ctx) {
		return null;
	}

	@Override
	public Integer visitSpecial2Operator(JavaBinksParser.Special2OperatorContext ctx) {
		return null;
	}

	@Override
	public Integer visitLogicalOperator(JavaBinksParser.LogicalOperatorContext ctx) {
		return null;
	}

	@Override
	public Integer visitValue(JavaBinksParser.ValueContext ctx) {
		return null;
	}

	@Override
	public Integer visitSpecialValue(JavaBinksParser.SpecialValueContext ctx) {
		return null;
	}

	@Override
	public Integer visitDeclaration(JavaBinksParser.DeclarationContext ctx) {
		return null;
	}

	@Override
	public Integer visitMultiDec(JavaBinksParser.MultiDecContext ctx) {
		return null;
	}

	@Override
	public Integer visitSingleDec(JavaBinksParser.SingleDecContext ctx) {
		return null;
	}

	@Override
	public Integer visitAssignment(JavaBinksParser.AssignmentContext ctx) {
		return null;
	}

	@Override
	public Integer visitConditionalStatement(JavaBinksParser.ConditionalStatementContext ctx) {
		return null;
	}

	@Override
	public Integer visitIfBlock(JavaBinksParser.IfBlockContext ctx) {
		return null;
	}

	@Override
	public Integer visitElseIfBlock(JavaBinksParser.ElseIfBlockContext ctx) {
		return null;
	}

	@Override
	public Integer visitIfCondition(JavaBinksParser.IfConditionContext ctx) {
		return null;
	}

	@Override
	public Integer visitElseCondition(JavaBinksParser.ElseConditionContext ctx) {
		return null;
	}

	@Override
	public Integer visitElseIf(JavaBinksParser.ElseIfContext ctx) {
		return null;
	}

	@Override
	public Integer visitSwitchBlock(JavaBinksParser.SwitchBlockContext ctx) {
		return null;
	}

	@Override
	public Integer visitSwitchCase(JavaBinksParser.SwitchCaseContext ctx) {
		return null;
	}

	@Override
	public Integer visitCaseBlock(JavaBinksParser.CaseBlockContext ctx) {
		return null;
	}

	@Override
	public Integer visitCaseCondition(JavaBinksParser.CaseConditionContext ctx) {
		return null;
	}

	@Override
	public Integer visitDefaultBlock(JavaBinksParser.DefaultBlockContext ctx) {
		return null;
	}

	@Override
	public Integer visitConditionalExpression(JavaBinksParser.ConditionalExpressionContext ctx) {
		return null;
	}

	@Override
	public Integer visitLoopStatement(JavaBinksParser.LoopStatementContext ctx) {
		return null;
	}

	@Override
	public Integer visitWhileBlock(JavaBinksParser.WhileBlockContext ctx) {
		return null;
	}

	@Override
	public Integer visitDoWhileBlock(JavaBinksParser.DoWhileBlockContext ctx) {
		return null;
	}

	@Override
	public Integer visitForBlock(JavaBinksParser.ForBlockContext ctx) {
		return null;
	}

	@Override
	public Integer visitDecValue(JavaBinksParser.DecValueContext ctx) {
		return null;
	}

	@Override
	public Integer visitInitValue(JavaBinksParser.InitValueContext ctx) {
		return null;
	}

	@Override
	public Integer visitStep(JavaBinksParser.StepContext ctx) {
		return null;
	}

	@Override
	public Integer visitExpression(JavaBinksParser.ExpressionContext ctx) {
		return null;
	}

	@Override
	public Integer visitExpr(JavaBinksParser.ExprContext ctx) {
		return null;
	}

	@Override
	public Integer visitFunctionDeclaration(JavaBinksParser.FunctionDeclarationContext ctx) {
		return null;
	}

	@Override
	public Integer visitDeclarationParameter(JavaBinksParser.DeclarationParameterContext ctx) {
		return null;
	}

	@Override
	public Integer visitMultiDeclarationParameter(JavaBinksParser.MultiDeclarationParameterContext ctx) {
		return null;
	}

	@Override
	public Integer visitSingleDeclarationParameter(JavaBinksParser.SingleDeclarationParameterContext ctx) {
		return null;
	}

	@Override
	public Integer visitReturnStatement(JavaBinksParser.ReturnStatementContext ctx) {
		return null;
	}

	@Override
	public Integer visitFunctionCall(JavaBinksParser.FunctionCallContext ctx) {
		return null;
	}

	@Override
	public Integer visitFunctionCallNoTerminator(JavaBinksParser.FunctionCallNoTerminatorContext ctx) {
		return null;
	}

	@Override
	public Integer visitCallParameter(JavaBinksParser.CallParameterContext ctx) {
		return null;
	}

	@Override
	public Integer visitArray(JavaBinksParser.ArrayContext ctx) {
		return null;
	}

	@Override
	public Integer visitArrayAssignment(JavaBinksParser.ArrayAssignmentContext ctx) {
		return null;
	}

	@Override
	public Integer visitList(JavaBinksParser.ListContext ctx) {
		return null;
	}

	@Override
	public Integer visitBoolList(JavaBinksParser.BoolListContext ctx) {
		return null;
	}

	@Override
	public Integer visitCharList(JavaBinksParser.CharListContext ctx) {
		return null;
	}

	@Override
	public Integer visitFloatList(JavaBinksParser.FloatListContext ctx) {
		return null;
	}

	@Override
	public Integer visitIntegerList(JavaBinksParser.IntegerListContext ctx) {
		return null;
	}

	@Override
	public Integer visitStringList(JavaBinksParser.StringListContext ctx) {
		return null;
	}

	@Override
	public Integer visitPrinter(JavaBinksParser.PrinterContext ctx) {
		return null;
	}

	@Override
	public Integer visitCodeBlock(JavaBinksParser.CodeBlockContext ctx) {
		return null;
	}

	@Override
	public Integer visitMain(JavaBinksParser.MainContext ctx) {
		return null;
	}

	@Override
	public Integer visitReturnMain(JavaBinksParser.ReturnMainContext ctx) {
		return null;
	}

	@Override
	public Integer visitBooleanLiteral(JavaBinksParser.BooleanLiteralContext ctx) {
		return null;
	}

	@Override
	public Integer visitComment(JavaBinksParser.CommentContext ctx) {
		return null;
	}

	@Override
	public Integer visit(ParseTree parseTree) {
		return null;
	}

	@Override
	public Integer visitChildren(RuleNode ruleNode) {
		return null;
	}

	@Override
	public Integer visitTerminal(TerminalNode terminalNode) {
		return null;
	}

	@Override
	public Integer visitErrorNode(ErrorNode errorNode) {
		return null;
	}
}
