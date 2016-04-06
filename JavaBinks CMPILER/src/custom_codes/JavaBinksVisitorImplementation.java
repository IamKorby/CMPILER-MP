package custom_codes;

import generated_codes.JavaBinksParser;
import generated_codes.JavaBinksVisitor;
import model.SymbolTable;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * Created by Justin on 20/03/2016.
 */
public class JavaBinksVisitorImplementation implements JavaBinksVisitor<Object>
{
	private SymbolTable symbolTable = new SymbolTable();

	@Override
	public Object visitStart( JavaBinksParser.StartContext ctx )
	{
		System.out.println(ctx.getText().toString());
		return null;
	}

	@Override
	public Object visitDatatype( JavaBinksParser.DatatypeContext ctx )
	{
		return null;
	}

	@Override
	public Object visitReturntype( JavaBinksParser.ReturntypeContext ctx )
	{
		return null;
	}

	@Override
	public Object visitOperator( JavaBinksParser.OperatorContext ctx )
	{
		return null;
	}

	@Override
	public Object visitSpecialOperator( JavaBinksParser.SpecialOperatorContext ctx )
	{
		return null;
	}

	@Override
	public Object visitSpecial2Operator( JavaBinksParser.Special2OperatorContext ctx )
	{
		return null;
	}

	@Override
	public Object visitLogicalOperator( JavaBinksParser.LogicalOperatorContext ctx )
	{
		return null;
	}

	@Override
	public Object visitValue( JavaBinksParser.ValueContext ctx )
	{
		return null;
	}

	@Override
	public Object visitSpecialValue( JavaBinksParser.SpecialValueContext ctx )
	{
		return null;
	}

	@Override
	public Object visitDeclaration( JavaBinksParser.DeclarationContext ctx )
	{
		return null;
	}

	@Override
	public Object visitMultiDec( JavaBinksParser.MultiDecContext ctx )
	{
		return null;
	}

	@Override
	public Object visitSingleDec( JavaBinksParser.SingleDecContext ctx )
	{
		return null;
	}

	@Override
	public Object visitAssignment( JavaBinksParser.AssignmentContext ctx )
	{
		return null;
	}

	@Override
	public Object visitConditionalStatement( JavaBinksParser.ConditionalStatementContext ctx )
	{
		return null;
	}

	@Override
	public Object visitIfBlock( JavaBinksParser.IfBlockContext ctx )
	{
		return null;
	}

	@Override
	public Object visitElseIfBlock( JavaBinksParser.ElseIfBlockContext ctx )
	{
		return null;
	}

	@Override
	public Object visitIfCondition( JavaBinksParser.IfConditionContext ctx )
	{
		return null;
	}

	@Override
	public Object visitElseCondition( JavaBinksParser.ElseConditionContext ctx )
	{
		return null;
	}

	@Override
	public Object visitElseIf( JavaBinksParser.ElseIfContext ctx )
	{
		return null;
	}

	@Override
	public Object visitSwitchBlock( JavaBinksParser.SwitchBlockContext ctx )
	{
		return null;
	}

	@Override
	public Object visitSwitchCase( JavaBinksParser.SwitchCaseContext ctx )
	{
		return null;
	}

	@Override
	public Object visitCaseBlock( JavaBinksParser.CaseBlockContext ctx )
	{
		return null;
	}

	@Override
	public Object visitCaseCondition( JavaBinksParser.CaseConditionContext ctx )
	{
		return null;
	}

	@Override
	public Object visitDefaultBlock( JavaBinksParser.DefaultBlockContext ctx )
	{
		return null;
	}

	@Override
	public Object visitConditionalExpression( JavaBinksParser.ConditionalExpressionContext ctx )
	{
		return null;
	}

	@Override
	public Object visitLoopStatement( JavaBinksParser.LoopStatementContext ctx )
	{
		return null;
	}

	@Override
	public Object visitWhileBlock( JavaBinksParser.WhileBlockContext ctx )
	{
		return null;
	}

	@Override
	public Object visitDoWhileBlock( JavaBinksParser.DoWhileBlockContext ctx )
	{
		return null;
	}

	@Override
	public Object visitForBlock( JavaBinksParser.ForBlockContext ctx )
	{
		return null;
	}

	@Override
	public Object visitDecValue( JavaBinksParser.DecValueContext ctx )
	{
		return null;
	}

	@Override
	public Object visitInitValue( JavaBinksParser.InitValueContext ctx )
	{
		return null;
	}

	@Override
	public Object visitStep( JavaBinksParser.StepContext ctx )
	{
		return null;
	}

	@Override
	public Object visitExpression( JavaBinksParser.ExpressionContext ctx )
	{
		return null;
	}

	@Override
	public Object visitExpr( JavaBinksParser.ExprContext ctx )
	{
		return null;
	}

	@Override
	public Object visitFunctionDeclaration( JavaBinksParser.FunctionDeclarationContext ctx )
	{
		return null;
	}

	@Override
	public Object visitDeclarationParameter( JavaBinksParser.DeclarationParameterContext ctx )
	{
		return null;
	}

	@Override
	public Object visitMultiDeclarationParameter( JavaBinksParser.MultiDeclarationParameterContext ctx )
	{
		return null;
	}

	@Override
	public Object visitSingleDeclarationParameter( JavaBinksParser.SingleDeclarationParameterContext ctx )
	{
		return null;
	}

	@Override
	public Object visitReturnStatement( JavaBinksParser.ReturnStatementContext ctx )
	{
		return null;
	}

	@Override
	public Object visitFunctionCall( JavaBinksParser.FunctionCallContext ctx )
	{
		return null;
	}

	@Override
	public Object visitFunctionCallNoTerminator( JavaBinksParser.FunctionCallNoTerminatorContext ctx )
	{
		return null;
	}

	@Override
	public Object visitCallParameter( JavaBinksParser.CallParameterContext ctx )
	{
		return null;
	}

	@Override
	public Object visitArray( JavaBinksParser.ArrayContext ctx )
	{
		return null;
	}

	@Override
	public Object visitArrayAssignment( JavaBinksParser.ArrayAssignmentContext ctx )
	{
		return null;
	}

	@Override
	public Object visitList( JavaBinksParser.ListContext ctx )
	{
		return null;
	}

	@Override
	public Object visitBoolList( JavaBinksParser.BoolListContext ctx )
	{
		return null;
	}

	@Override
	public Object visitCharList( JavaBinksParser.CharListContext ctx )
	{
		return null;
	}

	@Override
	public Object visitFloatList( JavaBinksParser.FloatListContext ctx )
	{
		return null;
	}

	@Override
	public Object visitIntegerList( JavaBinksParser.IntegerListContext ctx )
	{
		return null;
	}

	@Override
	public Object visitStringList( JavaBinksParser.StringListContext ctx )
	{
		return null;
	}

	@Override
	public Object visitPrinter( JavaBinksParser.PrinterContext ctx )
	{
		return null;
	}

	@Override
	public Object visitScanner( JavaBinksParser.ScannerContext ctx )
	{
		return null;
	}

	@Override
	public Object visitCodeBlock( JavaBinksParser.CodeBlockContext ctx )
	{
		return null;
	}

	@Override
	public Object visitMain( JavaBinksParser.MainContext ctx )
	{
		return null;
	}

	@Override
	public Object visitReturnMain( JavaBinksParser.ReturnMainContext ctx )
	{
		return null;
	}

	@Override
	public Object visitBooleanLiteral( JavaBinksParser.BooleanLiteralContext ctx )
	{
		return null;
	}

	@Override
	public Object visitComment( JavaBinksParser.CommentContext ctx )
	{
		return null;
	}

	@Override
	public Object visit( ParseTree parseTree )
	{
		return null;
	}

	@Override
	public Object visitChildren( RuleNode ruleNode )
	{
		return null;
	}

	@Override
	public Object visitTerminal( TerminalNode terminalNode )
	{
		return null;
	}

	@Override
	public Object visitErrorNode( ErrorNode errorNode )
	{
		return null;
	}
}
