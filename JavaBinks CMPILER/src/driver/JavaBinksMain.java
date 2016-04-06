package driver;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

import custom_codes.JavaBinksVisitorImplementation;
import custom_codes.LexerErrorListener;
import custom_codes.ParserErrorListener;
import generated_codes.JavaBinksLexer;
import generated_codes.JavaBinksParser;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;

/**
 * Created by hannah on 3/19/16.
 */
public class JavaBinksMain {

    public static JavaBinksParser parser;

    public static void main(String[] args) throws Exception {


        // TODO: Read testfile.txt (our test input), put in a String
        //String filename = "C:\\Users\\Justin\\Desktop\\Test.txt";
	    String filename = "testfile.txt";
        Scanner scanner = new Scanner(new File(filename));
		String input = "";

	    while( scanner.hasNext() )
	    {
		    // append every line of the source code to input
		    input += scanner.nextLine() + "\n";
	    }

        System.out.println("\nSource Code:\n\n" + input);
	    // TODO: Convert String input into FileInput then feed to ANTLRInputStream
        InputStream is = new ByteArrayInputStream(input.getBytes());
        ANTLRInputStream inputStream = new ANTLRInputStream(is);

        // TODO: Do Lexer shit, use JavaBinksLexer and LexerErrorListener
        JavaBinksLexer lexer = new JavaBinksLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LexerErrorListener lexError = new LexerErrorListener();
	    lexer.removeErrorListeners();
	    lexer.addErrorListener(lexError);

        // TODO: Do Parser shit, use JavaBinksParser and ParserErrorListener
        JavaBinksParser parser = new JavaBinksParser(tokens);
        ParserErrorListener parserError = new ParserErrorListener();
	    parser.removeErrorListeners();
	    parser.addErrorListener(parserError);
        ParseTree tree = parser.start();

        // TODO: Check if LexerErrorListener and ParserErrorListener got an error, print error if yes
        if( lexError.hasErrors() )
        {
			System.out.println("\nLEXICAL ERRORS FOUND!");
            System.out.println(lexError);
        }
        else
        {
	        if( parserError.hasErrors() )
	        {
		        System.out.println("\nSYNTAX ERRORS FOUND!");
		        System.out.println(parserError);
	        }
	        else
	        {
		        System.out.println("NO LEXICAL AND SYNTACTICAL ERRORS FOUND!");

		        System.out.println(tree.toStringTree(parser));

		        JFrame frame = new JFrame("Antlr AST");
		        JPanel panel = new JPanel();
		        TreeViewer treeViewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
		        treeViewer.setScale(0.5);//scale a little
		        panel.add(treeViewer);
		        frame.add(panel);
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.setSize(200,200);
		        frame.setVisible(true);

		        JavaBinksVisitorImplementation visitor = new JavaBinksVisitorImplementation();


		        /*try
		        {
			        JavaBinksVisitorImplementation visitorImplementation = new JavaBinksVisitorImplementation();
			        int result = visitorImplementation.visit(tree);

			        System.out.println("Result: " + result);
		        }
		        catch( Exception e )
		        {
			        e.printStackTrace();
		        }*/
	        }
        }
    }
}
