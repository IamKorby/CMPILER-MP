package custom_codes;

import com.sun.org.apache.xerces.internal.impl.dv.DatatypeException;
import com.sun.org.apache.xpath.internal.SourceTree;
import controller.Evaluator;
import controller.ExprTokenizer;
import controller.PrecedenceParser;
import generated_codes.JavaBinksBaseVisitor;
import generated_codes.JavaBinksParser;
import generated_codes.JavaBinksVisitor;
import model.*;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by Justin on 20/03/2016.
 */
public class JavaBinksVisitorImplementation extends JavaBinksBaseVisitor implements Runnable
{
	private SymbolTable symbolTable;
	private ParseTree tree;
	private JTextArea textareaLog;

	public JavaBinksVisitorImplementation( JTextArea log, ParseTree tree )
	{
		this.symbolTable = new SymbolTable();
		this.tree = tree;
		this.textareaLog = log;
	}

	@Override
	public Object visitStart( JavaBinksParser.StartContext ctx )
	{
		System.out.println(ctx.getText());

		if( !ctx.main().getText().isEmpty() )
		{
			super.visit(ctx.main());
		}

		return null;
	}

	@Override
	public Object visitDatatype( JavaBinksParser.DatatypeContext ctx )
	{
		// TODO:

		return null;
	}

	@Override
	public Object visitReturntype( JavaBinksParser.ReturntypeContext ctx )
	{
		// TODO:

		return null;
	}

	@Override
	public Object visitOperator( JavaBinksParser.OperatorContext ctx )
	{
		// TODO:

		return null;
	}

	@Override
	public Object visitSpecialOperator( JavaBinksParser.SpecialOperatorContext ctx )
	{
		// TODO:

		return null;
	}

	@Override
	public Object visitSpecial2Operator( JavaBinksParser.Special2OperatorContext ctx )
	{
		// TODO:

		return null;
	}

	@Override
	public Object visitLogicalOperator( JavaBinksParser.LogicalOperatorContext ctx )
	{
		// TODO:

		return null;
	}

	@Override
	public Object visitValue( JavaBinksParser.ValueContext ctx )
	{
		// TODO:

		return null;
	}

	@Override
	public Object visitSpecialValue( JavaBinksParser.SpecialValueContext ctx )
	{
		// TODO:

		return null;
	}

	@Override
	public Object visitDeclaration( JavaBinksParser.DeclarationContext ctx )
	{
		DataType dataType = null;

		if( ctx.getText() != null )
		{
			System.out.println("VISIT DECLARATION: " + ctx.getText());
			if( ctx.datatype().getText().equalsIgnoreCase(DataType.BOOLEAN.toString()) )
			{
				dataType = DataType.BOOLEAN;
			}
			else if( ctx.datatype().getText().equalsIgnoreCase(DataType.CHAR.toString()) )
			{
				dataType = DataType.CHAR;
			}
			else if( ctx.datatype().getText().equalsIgnoreCase(DataType.FLOAT.toString()) )
			{
				dataType = DataType.FLOAT;
			}
			else if( ctx.datatype().getText().equalsIgnoreCase(DataType.INT.toString()) )
			{
				dataType = DataType.INT;
			}
			else if( ctx.datatype().getText().equalsIgnoreCase(DataType.STRING.toString()) )
			{
				dataType = DataType.STRING;
			}

			String[] variables = ctx.multiDec().getText().split(",");

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

	/*@Override
	public Object visitMultiDec( JavaBinksParser.MultiDecContext ctx )
	{
		if( ctx.getText() != null )
		{
			System.out.println("VISIT MULTI DECLARATION: " + ctx.getText());


		}

		return null;
	}

	@Override
	public Object visitSingleDec( JavaBinksParser.SingleDecContext ctx )
	{
		// TODO:

		return null;
	}*/

	@Override
	public Object visitAssignment( JavaBinksParser.AssignmentContext ctx )
	{
		if( ctx.getText() != null )
		{
			System.out.println("VISIT ASSIGNMENT:" + ctx.getText());
			//:   VariableFuncName ASSIGN specialValue SEMI
			//|   VariableFuncName specialOperator specialValue SEMI

			if( ctx.getText().contains("="))
			{
				Symbol symbol = symbolTable.getCurrentScope().retrieve(ctx.VariableFuncName().getText());
				Object o = null;

				if( ctx.specialValue().expression() != null )
				{
					o = super.visit(ctx.specialValue().expression());
				}
				else if( ctx.specialValue().functionCallNoTerminator() != null )
				{
					o = super.visit(ctx.specialValue().functionCallNoTerminator());
				}

				symbol.setValue(o);
				
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
	public Object visitConditionalStatement( JavaBinksParser.ConditionalStatementContext ctx )
	{
		if( ctx.getText() != null )
		{
			System.out.println("VISIT CONDITIONAL STATEMENT: " + ctx.getText());
			if(ctx.ifBlock().getText() != null)
			{
				super.visit(ctx.ifBlock());
			}
			else if(ctx.switchBlock().getText() != null)
			{
				super.visit(ctx.switchBlock());
			}
		}

		return null;
	}

	@Override
	public Object visitIfBlock( JavaBinksParser.IfBlockContext ctx )
	{
		if( ctx.getText() != null )
		{
			System.out.println("VISIT IF BLOCK: " + ctx.getText());
			if(ctx.ifCondition().getText() != null)
			{
				super.visit(ctx.ifCondition());
			}
			if(ctx.elseIfBlock().getText() != null)
			{
				super.visit(ctx.elseIfBlock());
			}
		}

		return null;
	}

	@Override
	public Object visitElseIfBlock( JavaBinksParser.ElseIfBlockContext ctx )
	{
		if( ctx.getText() != null )
		{
			System.out.println("VISIT ELSE IF BLOCK: " + ctx.getText());
			if(ctx.elseIf().getText() != null)
			{
				super.visit(ctx.elseIf());
			}
			else if(ctx.elseCondition().getText() != null)
			{
				super.visit(ctx.elseCondition());
			}

			if(ctx.elseIfBlock().getText() != null)
			{
				super.visit(ctx.elseIfBlock());
			}
		}

		return null;
	}

	@Override
	public Object visitIfCondition( JavaBinksParser.IfConditionContext ctx )
	{
		if( ctx.getText() != null )
		{
			System.out.println("VISIT IF CONDITION: " + ctx.getText());
			if(ctx.IF().getText() != null)
			{
				if(ctx.conditionalExpression().getText() != null)
				{
					super.visit(ctx.conditionalExpression());
				}
				if(ctx.LBRACE().getText() != null)
				{
					symbolTable.enterScope();
				}
				if(ctx.codeBlock().getText() != null)
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
	public Object visitElseCondition( JavaBinksParser.ElseConditionContext ctx )
	{
		symbolTable.enterScope();

		if( ctx.getText() != null )
		{
			System.out.println("VISIT ELSE CONDITION: " + ctx.getText());
			if(ctx.ELSE().getText() != null)
			{
				//TODO: ???
			}
			if(ctx.codeBlock().getText() != null)
			{
				super.visit(ctx.codeBlock());
			}
		}

		symbolTable.exitScope();
		System.out.println("SCOPE MAIN EXIT");
		return null;
	}

	@Override
	public Object visitElseIf( JavaBinksParser.ElseIfContext ctx )
	{
		symbolTable.enterScope();

		if( ctx.getText() != null )
		{
			System.out.println("VISIT ELSE IF: " + ctx.getText());
			if(ctx.ELSEIF().getText() != null)
			{
				//TODO: ???
			}
			if(ctx.conditionalExpression().getText() != null)
			{
				super.visit(ctx.conditionalExpression());
			}
			if(ctx.codeBlock().getText() != null)
			{
				super.visit(ctx.codeBlock());
			}
		}

		symbolTable.exitScope();
		System.out.println("SCOPE MAIN EXIT");
		return null;
	}

	@Override
	public Object visitSwitchBlock( JavaBinksParser.SwitchBlockContext ctx )
	{
		// TODO:

		return null;
	}

	@Override
	public Object visitSwitchCase( JavaBinksParser.SwitchCaseContext ctx )
	{
		// TODO:

		return null;
	}

	@Override
	public Object visitCaseBlock( JavaBinksParser.CaseBlockContext ctx )
	{
		// TODO:

		return null;
	}

	@Override
	public Object visitCaseCondition( JavaBinksParser.CaseConditionContext ctx )
	{
		// TODO:

		return null;
	}

	@Override
	public Object visitDefaultBlock( JavaBinksParser.DefaultBlockContext ctx )
	{
		// TODO:

		return null;
	}

	@Override
	public Object visitConditionalExpression( JavaBinksParser.ConditionalExpressionContext ctx )
	{
		// TODO:

		return null;
	}

	@Override
	public Object visitLoopStatement( JavaBinksParser.LoopStatementContext ctx )
	{
		// TODO:

		return null;
	}

	@Override
	public Object visitWhileBlock( JavaBinksParser.WhileBlockContext ctx )
	{
		// TODO:

		return null;
	}

	@Override
	public Object visitDoWhileBlock( JavaBinksParser.DoWhileBlockContext ctx )
	{
		// TODO:

		return null;
	}

	@Override
	public Object visitForBlock( JavaBinksParser.ForBlockContext ctx )
	{
		// TODO:

		return null;
	}

	@Override
	public Object visitDecValue( JavaBinksParser.DecValueContext ctx )
	{
		// TODO:

		return null;
	}

	@Override
	public Object visitInitValue( JavaBinksParser.InitValueContext ctx )
	{
		// TODO:

		return null;
	}

	@Override
	public Object visitStep( JavaBinksParser.StepContext ctx )
	{
		// TODO:

		return null;
	}

	@Override
	public Object visitExpression( JavaBinksParser.ExpressionContext ctx )
	{
		// TODO:
		ArrayList<ExprToken> tokenList;
		ArrayList<ExprToken> postFix;
		ScoopsPre currScope = symbolTable.getCurrentScope();
		if(ctx.getText() != null){
			System.out.println("VISIT EXPRESSION: " +ctx.getText());
			System.out.println(ctx.expr().getText());
			tokenList = ExprTokenizer.tokenize(ctx.expr().getText(), currScope);
			postFix = PrecedenceParser.ConvertToPostFix(tokenList);
			String result = Evaluator.evaluate(postFix);
			System.out.println("Result: " +result);

			return result;

		}
		return null;
	}

	@Override
	public Object visitExpr( JavaBinksParser.ExprContext ctx )
	{
		// TODO:

		return null;
	}

	@Override
	public Object visitFunctionDeclaration( JavaBinksParser.FunctionDeclarationContext ctx )
	{
		// TODO:

		return null;
	}

	@Override
	public Object visitDeclarationParameter( JavaBinksParser.DeclarationParameterContext ctx )
	{
		// TODO:

		return null;
	}

	@Override
	public Object visitMultiDeclarationParameter( JavaBinksParser.MultiDeclarationParameterContext ctx )
	{
		// TODO:

		return null;
	}

	@Override
	public Object visitSingleDeclarationParameter( JavaBinksParser.SingleDeclarationParameterContext ctx )
	{
		// TODO:

		return null;
	}

	@Override
	public Object visitReturnStatement( JavaBinksParser.ReturnStatementContext ctx )
	{
		// TODO:

		return null;
	}

	@Override
	public Object visitFunctionCall( JavaBinksParser.FunctionCallContext ctx )
	{
		// TODO:

		return null;
	}

	@Override
	public Object visitFunctionCallNoTerminator( JavaBinksParser.FunctionCallNoTerminatorContext ctx )
	{
		// TODO:

		return null;
	}

	@Override
	public Object visitCallParameter( JavaBinksParser.CallParameterContext ctx )
	{
		// TODO:

		return null;
	}

	@Override
	public Object visitArray( JavaBinksParser.ArrayContext ctx )
	{
		// TODO:

		return null;
	}

	@Override
	public Object visitArrayAssignment( JavaBinksParser.ArrayAssignmentContext ctx )
	{
		// TODO:

		return null;
	}

	@Override
	public Object visitList( JavaBinksParser.ListContext ctx )
	{
		// TODO:

		return null;
	}

	@Override
	public Object visitBoolList( JavaBinksParser.BoolListContext ctx )
	{
		// TODO:

		return null;
	}

	@Override
	public Object visitCharList( JavaBinksParser.CharListContext ctx )
	{
		// TODO:

		return null;
	}

	@Override
	public Object visitFloatList( JavaBinksParser.FloatListContext ctx )
	{
		// TODO:

		return null;
	}

	@Override
	public Object visitIntegerList( JavaBinksParser.IntegerListContext ctx )
	{
		// TODO:

		return null;
	}

	@Override
	public Object visitStringList( JavaBinksParser.StringListContext ctx )
	{
		// TODO:

		return null;
	}

	@Override
	public Object visitPrinter( JavaBinksParser.PrinterContext ctx )
	{
		System.out.println("VISIT PRINTER: " + ctx.getText());

		if( ctx.StringLiteral() != null )
		{
			String[] string = ctx.StringLiteral().getText().substring(1, ctx.StringLiteral().getText().length()-1).split("~");

			for( int i = 0; i < string.length; i++ )
			{
				System.out.println(string[i]);
				textareaLog.append(string[i] + "\n");
			}
		}
		else if( ctx.specialValue() != null )
		{
			String string = symbolTable.getCurrentScope().retrieve(ctx.specialValue().getText()).getValue().toString();

			if( string.startsWith("\"") && string.endsWith("\"") )
			{
				string = string.substring(1, string.length()-1);
			}

			textareaLog.append(string);
		}

		return null;
	}

	@Override
	public Object visitScanner( JavaBinksParser.ScannerContext ctx )
	{
		// TODO:

		return null;
	}

	@Override
	public Object visitCodeBlock( JavaBinksParser.CodeBlockContext ctx )
	{
		System.out.println("VISIT CODE BLOCK: " + ctx.getText());

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
	public Object visitMain( JavaBinksParser.MainContext ctx )
	{
		symbolTable.enterScope();

		System.out.println("VISIT MAIN: " + ctx.getText());
		System.out.println(ctx.codeBlock());
		if( ctx.codeBlock() != null )
		{
			super.visit(ctx.codeBlock());
		}

		if( ctx.returnMain().isEmpty() )
		{
			super.visit(ctx.returnMain());
		}

		symbolTable.exitScope();
		System.out.println("SCOPE MAIN EXIT");
		return null;
	}

	@Override
	public Object visitReturnMain( JavaBinksParser.ReturnMainContext ctx )
	{
		if( ctx.IntegerLiteral() != null )
		{
			return ctx.IntegerLiteral();
		}

		return null;
	}

	@Override
	public Object visitBooleanLiteral( JavaBinksParser.BooleanLiteralContext ctx )
	{
		// TODO:

		return null;
	}

	@Override
	public void run()
	{
		this.visit(tree);
	}
}
