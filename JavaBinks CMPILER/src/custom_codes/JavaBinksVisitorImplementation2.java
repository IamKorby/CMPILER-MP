package custom_codes;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;
import controller.Evaluator;
import controller.ExprTokenizer;
import controller.PrecedenceParser;
import generated_codes.JavaBinksBaseVisitor;
import generated_codes.JavaBinksParser;
import model.*;
import org.antlr.v4.runtime.atn.SemanticContext;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by Justin on 20/03/2016.
 */
public class JavaBinksVisitorImplementation2 extends JavaBinksBaseVisitor implements Runnable
{
	private SymbolTable symbolTable;
	private ParseTree tree;
	private JTextArea textareaLog;

	public JavaBinksVisitorImplementation2(JTextArea log, ParseTree tree )
	{
		this.symbolTable = new SymbolTable();
		this.tree = tree;
		this.textareaLog = log;
	}

	@Override
	public void run() {
		this.visit(tree);
	}

	@Override
	public Object visitStart(JavaBinksParser.StartContext ctx) {
		System.out.println("visitStart : " + ctx.getText());

		if( !ctx.main().getText().isEmpty() )
		{
			super.visit(ctx.main());
		}

		return null;
	}

	@Override
	public Object visitDatatype(JavaBinksParser.DatatypeContext ctx) {

		if( ctx.getText() != null )
		{
			System.out.println("visitDatatype : " + ctx.getText());

			if (ctx.getText().equalsIgnoreCase(DataType.BOOLEAN.toString()))
			{
				return DataType.BOOLEAN;
			}
			else if (ctx.getText().equalsIgnoreCase(DataType.CHAR.toString()))
			{
				return DataType.CHAR;
			}
			else if (ctx.getText().equalsIgnoreCase(DataType.FLOAT.toString()))
			{
				return DataType.FLOAT;
			}
			else if (ctx.getText().equalsIgnoreCase(DataType.INT.toString()))
			{
				return DataType.INT;
			}
			else if (ctx.getText().equalsIgnoreCase(DataType.STRING.toString()))
			{
				return DataType.STRING;
			}
		}

		return null;
	}

	@Override
	public Object visitReturntype(JavaBinksParser.ReturntypeContext ctx) {

		if( ctx.getText() != null )
		{
			System.out.println("visitReturntype : " + ctx.getText());

			if (ctx.getText().equalsIgnoreCase(ReturnType.BOOLEAN.toString()))
			{
				return ReturnType.BOOLEAN;
			}
			else if (ctx.getText().equalsIgnoreCase(ReturnType.CHAR.toString()))
			{
				return ReturnType.CHAR;
			}
			else if (ctx.getText().equalsIgnoreCase(ReturnType.FLOAT.toString()))
			{
				return ReturnType.FLOAT;
			}
			else if (ctx.getText().equalsIgnoreCase(ReturnType.INT.toString()))
			{
				return ReturnType.INT;
			}
			else if (ctx.getText().equalsIgnoreCase(ReturnType.STRING.toString()))
			{
				return ReturnType.STRING;
			}
			else if (ctx.getText().equalsIgnoreCase(ReturnType.VOID.toString()))
			{
				return ReturnType.VOID;
			}
		}
		return null;
	}

	@Override
	public Object visitOperator(JavaBinksParser.OperatorContext ctx) {

		if(ctx.getText() != null)
		{
			System.out.println("visitOperator : " + ctx.getText());

			if(ctx.getText().equalsIgnoreCase(Operator.ADD.toString()))
			{
				return Operator.ADD;
			}
			else if(ctx.getText().equalsIgnoreCase(Operator.SUB.toString()))
			{
				return Operator.SUB;
			}
			else if(ctx.getText().equalsIgnoreCase(Operator.MUL.toString()))
			{
				return Operator.MUL;
			}
			else if(ctx.getText().equalsIgnoreCase(Operator.DIV.toString()))
			{
				return Operator.DIV;
			}
			else if(ctx.getText().equalsIgnoreCase(Operator.MOD.toString()))
			{
				return Operator.MOD;
			}
		}
		return null;
	}

	@Override
	public Object visitSpecialOperator(JavaBinksParser.SpecialOperatorContext ctx) {
		return super.visitSpecialOperator(ctx);
	}

	@Override
	public Object visitSpecial2Operator(JavaBinksParser.Special2OperatorContext ctx) {
		return super.visitSpecial2Operator(ctx);
	}

	@Override
	public Object visitLogicalOperator(JavaBinksParser.LogicalOperatorContext ctx) {
		return super.visitLogicalOperator(ctx);
	}

	@Override
	public Object visitValue(JavaBinksParser.ValueContext ctx) {
		return super.visitValue(ctx);
	}

	@Override
	public Object visitSpecialValue(JavaBinksParser.SpecialValueContext ctx) {

		if(ctx.expression() != null)
		{
			System.out.println("visitSpecialValue : " + ctx.getText());

			if(ctx.expression().getText() != null)
			{
				super.visit(ctx.expression());
			}
		}
		return null;
	}

	@Override
	public Object visitDeclaration(JavaBinksParser.DeclarationContext ctx) {
		if( ctx.getText() != null )
		{
			System.out.println("visitDeclaration : " + ctx.getText());

			DataType dataType;
			String[] variables;

			dataType = (DataType) super.visit(ctx.datatype());
			variables = (String[]) super.visit(ctx.multiDec());

			for( int i = 0; i < variables.length; i++ )
			{
				if( variables[i].contains("=") )
				{
					String[] v = variables[i].split("=");

					System.out.println("VALUE :" + v[0] + " " + v[1]);

					symbolTable.getCurrentScope().declare(new Symbol(dataType, v[0], v[1]));

					System.out.println("SYMBOL VALUE: " + new Symbol(dataType, v[0], v[1]));

					System.out.println("Symbol =: " + symbolTable.getCurrentScope().retrieve(v[0]));
				}
				else
				{
					symbolTable.getCurrentScope().declare(new Symbol(dataType, variables[i]));

					System.out.println("Symbol: " + symbolTable.getCurrentScope().retrieve(variables[i]));
				}
			}
		}

		return null;
	}

	@Override
	public Object visitMultiDec(JavaBinksParser.MultiDecContext ctx) {
		if( ctx.getText() != null )
		{
			System.out.println("visitMultiDec : " + ctx.getText());

			return ctx.getText().split(",");
		}

		return null;
	}

	/*@Override
	public Object visitSingleDec(JavaBinksParser.SingleDecContext ctx) {
		return null;
	}*/

	@Override
	public Object visitAssignment(JavaBinksParser.AssignmentContext ctx) {
		if( ctx.getText() != null )
		{
			System.out.println("visitAssignment :" + ctx.getText());

			if( ctx.getText().contains("="))
			{
				Symbol symbol = symbolTable.getCurrentScope().retrieve(ctx.VariableFuncName().getText());
				Object o = null;

				if( ctx.specialValue().expression() != null )
				{
					o = super.visit(ctx.specialValue().expression());
				}

				symbol.setValue(o);
				System.out.println("Symbol =: " + symbol.getDatatype() + " " + symbol.getName() + " " + symbol.getValue());

				symbolTable.getCurrentScope().update(symbol);

				/*Object o = null;
				//BOOLEAN, CHAR, FLOAT, FUNCTION, INT, STRING
				if( symbol.getDatatype() == DataType.BOOLEAN )
				{
					o = Boolean.parseBoolean(ctx.specialValue().getText());
				}
				else if( symbol.getDatatype() == DataType.CHAR )
				{
					o = ctx.specialValue().getText().charAt(0);
				}
				else if( symbol.getDatatype() == DataType.FLOAT )
				{
					o = Float.parseFloat(ctx.specialValue().getText());
				}
				else if( symbol.getDatatype() == DataType.INT )
				{
					o = Integer.parseInt(ctx.specialValue().getText());
				}
				else if( symbol.getDatatype() == DataType.STRING )
				{
					o = ctx.specialValue().getText();
				}*/
			}
		}

		return null;
	}

	@Override
	public Object visitConditionalStatement(JavaBinksParser.ConditionalStatementContext ctx) {
		if( ctx.getText() != null )
		{
			System.out.println("visitConditionalStatement : " + ctx.getText());
			if(ctx.ifBlock() != null)
			{
				super.visit(ctx.ifBlock());
			}
			else if(ctx.switchBlock() != null)
			{
				super.visit(ctx.switchBlock());
			}
		}

		return null;
	}

	@Override
	public Object visitIfBlock(JavaBinksParser.IfBlockContext ctx) {
		if( ctx.getText() != null )
		{
			System.out.println("visitIfBlock: " + ctx.getText());
			if(ctx.ifCondition() != null)
			{
				super.visit(ctx.ifCondition());
			}
			if(ctx.elseIfBlock() != null)
			{
				super.visit(ctx.elseIfBlock());
			}
		}

		return null;
	}

	@Override
	public Object visitElseIfBlock(JavaBinksParser.ElseIfBlockContext ctx) {
		if( ctx.getText() != null )
		{
			System.out.println("visitElseIfBlock : " + ctx.getText());
			if(ctx.elseIf() != null)
			{
				super.visit(ctx.elseIf());
			}
			else if(ctx.elseCondition() != null)
			{
				super.visit(ctx.elseCondition());
			}

			if(ctx.elseIfBlock() != null)
			{
				super.visit(ctx.elseIfBlock());
			}
		}

		return null;
	}

	@Override
	public Object visitIfCondition(JavaBinksParser.IfConditionContext ctx) {
		if( ctx.getText() != null )
		{
			System.out.println("visitIfCondition : " + ctx.getText());
			if(ctx.IF().getText() != null)
			{
				boolean isTrue;

				if(ctx.conditionalExpression() != null)
				{
					isTrue = (boolean) super.visit(ctx.conditionalExpression());
					System.out.println("isTrue : " + isTrue);

					if(isTrue)
					{
						if(ctx.LBRACE().getText() != null)
						{
							symbolTable.enterScope();
						}
						if(ctx.codeBlock() != null)
						{
							super.visit(ctx.codeBlock());
						}
						if(ctx.RBRACE().getText() != null)
						{
							symbolTable.exitScope();
							System.out.println("SCOPE MAIN EXIT");
						}
					}
				}

			}

		}

		return null;
	}

	@Override
	public Object visitElseCondition(JavaBinksParser.ElseConditionContext ctx) {
		if( ctx.getText() != null )
		{
			System.out.println("visitIfCondition : " + ctx.getText());
			if(ctx.ELSE().getText() != null)
			{
				if(ctx.LBRACE().getText() != null)
				{
					symbolTable.enterScope();
				}
				if(ctx.codeBlock() != null)
				{
					super.visit(ctx.codeBlock());
				}
				if(ctx.RBRACE().getText() != null)
				{
					symbolTable.exitScope();
					System.out.println("SCOPE MAIN EXIT");
				}
			}

		}

		return null;
	}

	@Override
	public Object visitElseIf(JavaBinksParser.ElseIfContext ctx) {
		if( ctx.getText() != null )
		{
			System.out.println("visitIfCondition : " + ctx.getText());
			if(ctx.ELSEIF().getText() != null)
			{
				boolean isTrue;

				if(ctx.conditionalExpression() != null)
				{
					isTrue = (boolean) super.visit(ctx.conditionalExpression());
					System.out.println("isTrue : " + isTrue);

					if(isTrue)
					{
						if(ctx.LBRACE().getText() != null)
						{
							symbolTable.enterScope();
						}
						if(ctx.codeBlock() != null)
						{
							super.visit(ctx.codeBlock());
						}
						if(ctx.RBRACE().getText() != null)
						{
							symbolTable.exitScope();
							System.out.println("SCOPE MAIN EXIT");
						}
					}
				}

			}

		}

		return null;
	}

	@Override
	public Object visitSwitchBlock(JavaBinksParser.SwitchBlockContext ctx) {
		return super.visitSwitchBlock(ctx);
	}

	@Override
	public Object visitSwitchCase(JavaBinksParser.SwitchCaseContext ctx) {
		return super.visitSwitchCase(ctx);
	}

	@Override
	public Object visitCaseBlock(JavaBinksParser.CaseBlockContext ctx) {
		return super.visitCaseBlock(ctx);
	}

	@Override
	public Object visitCaseCondition(JavaBinksParser.CaseConditionContext ctx) {
		return super.visitCaseCondition(ctx);
	}

	@Override
	public Object visitDefaultBlock(JavaBinksParser.DefaultBlockContext ctx) {
		return super.visitDefaultBlock(ctx);
	}

	@Override
	public Object visitConditionalExpression(JavaBinksParser.ConditionalExpressionContext ctx) {
		if(ctx.getText() != null)
		{
			System.out.println("visitConditionalExpression : " +ctx.getText());
			if(ctx.specialValue().expression().expr().value().IntegerLiteral() != null)
			{
				String[] condition2;

				int value1 = Integer.parseInt(ctx.specialValue().expression().expr().value().IntegerLiteral().getText());

				if(ctx.conditionalExpression2() != null)
				{
					int value2;

					if(ctx.conditionalExpression2().getText().contains("=="))
					{
						condition2 = ctx.conditionalExpression2().getText().split("==");
						value2 = Integer.parseInt(condition2[1]);

						if(value1 == value2)
						{
							return true;
						}
						else
						{
							return false;
						}
					}
					else if(ctx.conditionalExpression2().getText().contains(">="))
					{
						condition2 = ctx.conditionalExpression2().getText().split(">=");
						value2 = Integer.parseInt(condition2[1]);
						System.out.println(value2);

						if(value1 >= value2)
						{
							return true;
						}
						else
						{
							return false;
						}
					}
					else if(ctx.conditionalExpression2().getText().contains("<="))
					{
						condition2 = ctx.conditionalExpression2().getText().split("<=");
						value2 = Integer.parseInt(condition2[1]);

						if(value1 <= value2)
						{
							return true;
						}
						else
						{
							return false;
						}
					}
					else if(ctx.conditionalExpression2().getText().contains("!="))
					{
						condition2 = ctx.conditionalExpression2().getText().split("!=");
						value2 = Integer.parseInt(condition2[1]);

						if(value1 != value2)
						{
							return true;
						}
						else
						{
							return false;
						}
					}
					else if(ctx.conditionalExpression2().getText().contains("!"))
					{

					}
					else if(ctx.conditionalExpression2().getText().contains("&&"))
					{

					}
					else if(ctx.conditionalExpression2().getText().contains("||"))
					{

					}
					else if(ctx.conditionalExpression2().getText().contains(">"))
					{
						condition2 = ctx.conditionalExpression2().getText().split(">");
						value2 = Integer.parseInt(condition2[1]);

						if(value1 > value2)
						{
							return true;
						}
						else
						{
							return false;
						}
					}
					else if(ctx.conditionalExpression2().getText().contains("<"))
					{
						condition2 = ctx.conditionalExpression2().getText().split("<");
						value2 = Integer.parseInt(condition2[1]);

						if(value1 < value2)
						{
							return true;
						}
						else
						{
							return false;
						}
					}

				}
				else
				{
					if(value1 > 0)
					{
						return true;
					}
					else
					{
						return false;
					}
				}
			}

		}

		return null;
	}

	@Override
	public Object visitConditionalExpression2(JavaBinksParser.ConditionalExpression2Context ctx) {

		if(ctx.getText() != null)
		{
			/*System.out.println("visitConditionalExpression2 : " + ctx.getText());

			String[] string = null;
			String logOp = ctx.getText().substring(0, 3);

			if(logOp.equals(">="))
			{
				string[0] = logOp;
				string[1] = ctx.getText().substring(3);
			}

			return ctx.getText().split("");*/
		}

		return null;
	}

	@Override
	public Object visitLoopStatement(JavaBinksParser.LoopStatementContext ctx) {
		return super.visitLoopStatement(ctx);
	}

	@Override
	public Object visitWhileBlock(JavaBinksParser.WhileBlockContext ctx) {
		return super.visitWhileBlock(ctx);
	}

	@Override
	public Object visitDoWhileBlock(JavaBinksParser.DoWhileBlockContext ctx) {
		return super.visitDoWhileBlock(ctx);
	}

	@Override
	public Object visitForBlock(JavaBinksParser.ForBlockContext ctx) {
		return super.visitForBlock(ctx);
	}

	@Override
	public Object visitDecValue(JavaBinksParser.DecValueContext ctx) {
		return super.visitDecValue(ctx);
	}

	@Override
	public Object visitInitValue(JavaBinksParser.InitValueContext ctx) {
		return super.visitInitValue(ctx);
	}

	@Override
	public Object visitStep(JavaBinksParser.StepContext ctx) {
		return super.visitStep(ctx);
	}

	@Override
	public Object visitExpression(JavaBinksParser.ExpressionContext ctx) {

		if(ctx.getText() != null){
			System.out.println("visitExpression : " +ctx.getText());

			if(ctx.expr().getText() != null)
			{
				super.visit(ctx.expr());
			}

		}
		return null;
	}

	@Override
	public Object visitExpr(JavaBinksParser.ExprContext ctx) {

		ArrayList<ExprToken> tokenList;
		ArrayList<ExprToken> postFix;
		ScoopsPre currScope = symbolTable.getCurrentScope();

		if(ctx.getText() != null)
		{
			tokenList = ExprTokenizer.tokenize(ctx.getText(), currScope);

//			if(ctx.operator() != null)
//			{
				postFix = PrecedenceParser.ConvertToPostFix(tokenList);
				String result = Evaluator.evaluate(postFix);

				System.out.println("Result: " +result);

				return result;
//			}


		}

		return null;
	}

	@Override
	public Object visitFunctionDeclaration(JavaBinksParser.FunctionDeclarationContext ctx) {
		return super.visitFunctionDeclaration(ctx);
	}

	@Override
	public Object visitDeclarationParameter(JavaBinksParser.DeclarationParameterContext ctx) {
		return super.visitDeclarationParameter(ctx);
	}

	@Override
	public Object visitMultiDeclarationParameter(JavaBinksParser.MultiDeclarationParameterContext ctx) {
		return super.visitMultiDeclarationParameter(ctx);
	}

	@Override
	public Object visitSingleDeclarationParameter(JavaBinksParser.SingleDeclarationParameterContext ctx) {
		return super.visitSingleDeclarationParameter(ctx);
	}

	@Override
	public Object visitReturnStatement(JavaBinksParser.ReturnStatementContext ctx) {
		return super.visitReturnStatement(ctx);
	}

	@Override
	public Object visitFunctionCall(JavaBinksParser.FunctionCallContext ctx) {
		return super.visitFunctionCall(ctx);
	}

	@Override
	public Object visitFunctionCallNoTerminator(JavaBinksParser.FunctionCallNoTerminatorContext ctx) {
		return super.visitFunctionCallNoTerminator(ctx);
	}

	@Override
	public Object visitCallParameter(JavaBinksParser.CallParameterContext ctx) {
		return super.visitCallParameter(ctx);
	}

	@Override
	public Object visitArray(JavaBinksParser.ArrayContext ctx) {
		return super.visitArray(ctx);
	}

	@Override
	public Object visitArrayAssignment(JavaBinksParser.ArrayAssignmentContext ctx) {
		return super.visitArrayAssignment(ctx);
	}

	@Override
	public Object visitList(JavaBinksParser.ListContext ctx) {
		return super.visitList(ctx);
	}

	@Override
	public Object visitBoolList(JavaBinksParser.BoolListContext ctx) {
		return super.visitBoolList(ctx);
	}

	@Override
	public Object visitCharList(JavaBinksParser.CharListContext ctx) {
		return super.visitCharList(ctx);
	}

	@Override
	public Object visitFloatList(JavaBinksParser.FloatListContext ctx) {
		return super.visitFloatList(ctx);
	}

	@Override
	public Object visitIntegerList(JavaBinksParser.IntegerListContext ctx) {
		return super.visitIntegerList(ctx);
	}

	@Override
	public Object visitStringList(JavaBinksParser.StringListContext ctx) {
		return super.visitStringList(ctx);
	}

	@Override
	public Object visitPrinter(JavaBinksParser.PrinterContext ctx) {
		System.out.println("visitPrinter : " + ctx.getText());

		if( ctx.StringLiteral() != null )
		{
//			String[] string = ctx.StringLiteral().getText().substring(1, ctx.StringLiteral().getText().length()-1).split("~");
			String string = ctx.StringLiteral().getText().toString();

			for( int i = 0; i < string.length(); i++ ) {
				/*System.out.println(string[i]);
				textareaLog.append(string[i] + "\n");*/

				if (string.charAt(i) == '~')
				{
					textareaLog.append("\n");
				}
				else
				{
					textareaLog.append(Character.toString(string.charAt(i)));
				}
			}
		}
		else if( ctx.specialValue() != null )
		{
			String string = symbolTable.getCurrentScope().retrieve(ctx.specialValue().getText()).getValue().toString();

			if( string.startsWith("\"") && string.endsWith("\"") )
			{
				string = string.substring(1, string.length()-1);
			}

			System.out.println(string);
			textareaLog.append(string);
		}

		return null;
	}

	@Override
	public Object visitScanner(JavaBinksParser.ScannerContext ctx) {
		return super.visitScanner(ctx);
	}

	@Override
	public Object visitCodeBlock(JavaBinksParser.CodeBlockContext ctx) {
		System.out.println("visitCodeBlock : " + ctx.getText());

		if( ctx.declaration() != null )
		{
			super.visit(ctx.declaration());
		}
		else if( ctx.assignment() != null )
		{
			super.visit(ctx.assignment());
		}
		else if( ctx.conditionalStatement() != null )
		{
			super.visit(ctx.conditionalStatement());
		}
		else if( ctx.loopStatement() != null )
		{
			super.visit(ctx.loopStatement());
		}
		else if( ctx.functionCall() != null )
		{
			super.visit(ctx.functionCall());
		}
		else if( ctx.array() != null )
		{
			super.visit(ctx.array());
		}
		else if( ctx.expression() != null )
		{
			System.out.println("In experession");
			super.visit(ctx.expression());
		}
		else if( ctx.printer() != null )
		{
			super.visit(ctx.printer());
		}
		else if( ctx.scanner() != null )
		{
			super.visit(ctx.scanner());
		}

		if( ctx.codeBlock() != null )
		{
			super.visit(ctx.codeBlock());
		}

		return null;
	}

	@Override
	public Object visitMain(JavaBinksParser.MainContext ctx) {
		symbolTable.enterScope();

		System.out.println("visitMain : " + ctx.getText());
		if( ctx.codeBlock() != null )
		{
			super.visit(ctx.codeBlock());
		}

		if( ctx.returnMain().getText() != null )
		{
			super.visit(ctx.returnMain());
		}

		symbolTable.exitScope();
		System.out.println("SCOPE MAIN EXIT");
		return null;
	}

	@Override
	public Object visitReturnMain(JavaBinksParser.ReturnMainContext ctx) {
		if( ctx.IntegerLiteral() != null)
		{
			System.out.println("visitReturnMain : " + ctx.getText());
			return ctx.IntegerLiteral();
		}

		return null;
	}

	@Override
	public Object visitBooleanLiteral(JavaBinksParser.BooleanLiteralContext ctx) {
		return super.visitBooleanLiteral(ctx);
	}

	/*@Override
	public Object visitComment(JavaBinksParser.CommentContext ctx) {
		return super.visitComment(ctx);
	}*/
}
