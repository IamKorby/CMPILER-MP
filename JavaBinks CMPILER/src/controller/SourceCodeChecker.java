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
		reset();

		// Convert String input into FileInput then feed to ANTLRInputStream
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
		lexer = new JavaBinksLexer(inputStream);
		tokens = new CommonTokenStream(lexer);
		lexerErrorListener = new LexerErrorListener();
		lexer.removeErrorListeners();
		lexer.addErrorListener(lexerErrorListener);

		if( lexerErrorListener.hasErrors() )
		{
			return CheckerResult.LEXICAL_ERROR;
		}
		else
		{
			// Do Parser stuff using JavaBinksParser and ParserErrorListener
			parser = new JavaBinksParser(tokens);
			parserErrorListener = new ParserErrorListener();
			parser.removeErrorListeners();
			parser.addErrorListener(parserErrorListener);

			if( parserErrorListener.hasErrors() )
			{
				return CheckerResult.SYNTAX_ERROR;
			}
			else
			{
				// Generate abstract syntax tree
				tree = parser.start();

				treeViewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
				treeViewer.setScale(1);

				return CheckerResult.NO_ERROR;
			}
		}
	}

	private void reset()
	{
		lexer = null;
		tokens = null;
		lexerErrorListener = null;
		parser = null;
		parserErrorListener = null;
		tree = null;
		treeViewer = null;
	}

	public String getLexicalError()
	{
		return lexerErrorListener.toString();
	}

	public String getSyntaxError()
	{
		return parserErrorListener.toString();
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
