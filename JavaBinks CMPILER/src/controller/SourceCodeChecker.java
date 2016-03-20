package controller;

import custom_codes.CheckerResult;
import custom_codes.LexerErrorListener;
import custom_codes.ParserErrorListener;
import generated_codes.JavaBinksLexer;
import generated_codes.JavaBinksParser;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import view.MainGUI;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/**
 * Created by Justin on 20/03/2016.
 */
public class SourceCodeChecker
{
	JavaBinksLexer lexer;
	CommonTokenStream tokens;
	LexerErrorListener lexerErrorListener;
	JavaBinksParser parser;
	ParserErrorListener parserErrorListener;
	ParseTree tree;
	TreeViewer treeViewer;

	MainGUI mainGUI;

	public CheckerResult check( String input )
	{
		InputStream is = new ByteArrayInputStream(input.getBytes());
		ANTLRInputStream inputStream = null;
		try
		{
			inputStream = new ANTLRInputStream(is);
		}
		catch ( IOException e )
		{
			e.printStackTrace();
		}

		// Do Lexer stuff using JavaBinksLexer and LexerErrorListener
		JavaBinksLexer lexer = new JavaBinksLexer(inputStream);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		LexerErrorListener lexError = new LexerErrorListener();
		lexer.removeErrorListeners();
		lexer.addErrorListener(lexError);
		lexerErrorListener = lexError;

		// Do Parser stuff using JavaBinksParser and ParserErrorListener
		JavaBinksParser parser = new JavaBinksParser(tokens);
		ParserErrorListener parserError = new ParserErrorListener();
		parser.removeErrorListeners();
		parser.addErrorListener(parserError);
		ParseTree tree = parser.start();
		parserErrorListener = parserError;
		this.parser = parser;
		if( lexError.hasErrors() )
		{
			/*System.out.println("\nLEXICAL ERRORS FOUND!");
			System.out.println(lexError);*/
			return CheckerResult.LEXICAL_ERROR;
		}
		else
		{
			if( parserError.hasErrors() )
			{
				/*System.out.println("\nSYNTAX ERRORS FOUND!");
				System.out.println(parserError);*/
				return CheckerResult.SYNTAX_ERROR;
			}
			else
			{
				/*System.out.println("NO LEXICAL AND SYNTACTICAL ERRORS FOUND!");
				System.out.println(tree.toStringTree(parser));*/

				TreeViewer treeViewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
				treeViewer.setScale(1);
				this.treeViewer = treeViewer;

				return CheckerResult.NO_ERROR;
			}
		}
	}

	public String getLexicalError()
	{
		return lexerErrorListener.toString();
	}

	public String getSyntaxError()
	{
		return parserErrorListener.toString();
	}

	public JavaBinksParser getParser()
	{
		return parser;
	}

	public TreeViewer getAbstractSyntaxTree()
	{
		return treeViewer;
	}

	public void setScale( double scale )
	{
		treeViewer.setScale(scale);
	}

	public void setView( MainGUI mainGUI )
	{
		this.mainGUI = mainGUI;
	}
}
