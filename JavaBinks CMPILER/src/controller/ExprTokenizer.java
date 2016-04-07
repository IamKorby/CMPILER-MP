package controller;

import model.*;


import java.util.ArrayList;

/**
 * Created by WilliamPC on 4/7/2016.
 */
public class ExprTokenizer {

    private static ArrayList<ExprToken> tokenList;


    public static ArrayList<ExprToken> tokenize(String exp, ScoopsPre scope){

        tokenList = new ArrayList<>();
        String num = "";
        int currChar = 0;
        boolean hasUnknown = false;

        while( currChar != exp.length() )
        {
            // check if character is an operator
            if(ExprList.containsOperator(exp.charAt(currChar)) )
            {
                // create a new TokenNode object containing the string value of the character and the tokentype operator
                // add the tokenNode object to the parsedInput arraylist
                // increment currChar afterwards to check the next character

                if( exp.charAt(currChar) == '+' || exp.charAt(currChar) == '-' )
                {

                    tokenList.add(new ExprToken(charToString(exp.charAt(currChar)), ExprType.OPERATOR_UNARY));
                }
                else
                {
                    tokenList.add( new ExprToken(charToString(exp.charAt(currChar)), ExprType.OPERATOR) );
                }
                currChar++;
            }
            // check if character is a grouping symbol
            else if( ExprList.containsGrouper(exp.charAt(currChar)) )
            {
                // create a new TokenNode object containing the string value of the character and the tokentype grouping symbol
                // add the tokenNode object to the parsedInput arraylist
                // increment currChar afterwards to check the next character
                tokenList.add(new ExprToken(charToString(exp.charAt(currChar)), ExprType.GROUPING_SYMBOL));
                currChar++;
            }
            // check if character is an operand
            else if( ExprList.containsNumber(exp.charAt(currChar)) )
            {
                // initialize num to empty string
                num = "";

                // continue checking and adding the next characters to num while the character is a number
                do
                {
                    // concatenate the character to num
                    // increment currChar afterwards to check the next character
                    num += String.valueOf(exp.charAt(currChar));
                    currChar++;
                } while( currChar != exp.length() && ExprList.containsNumber(exp.charAt(currChar)) );

                // create a new tokenNode object containing the string value of the character / set of characters and the tokenType operand
                // add the tokenNode object to the parsedInput arraylist
                tokenList.add(new ExprToken(num, ExprType.OPERAND));
            }
            // other symbols
            else
            {
                // create a new TokenNode object containing the string value of the character and the tokentype unknown
                // add the tokenNode object to the parsedInput arraylist
                // increment currChar afterwards to check the next character


                Symbol symbol = scope.retrieve(Character.toString(exp.charAt(currChar)));
                System.out.println("Symbol Value: " +symbol.getValue());
                tokenList.add(new ExprToken(symbol.getValue().toString(),ExprType.OPERAND));

                currChar++;

                // this input has an unknown value, it fails the lexical analysis phase
                hasUnknown = true;
            }
        }

        return tokenList;
    }

    private static String charToString( char symbol )
    {
        String s = "";

        if( symbol == '+' )
        {
            s = "+";
        }
        else if( symbol == '-' )
        {
            s = "-";
        }
        else if( symbol == '*' )
        {
            s = "*";
        }
        else if( symbol == '/' )
        {
            s = "/";
        }
        else if( symbol == '%' )
        {
            s = "%";
        }
        else if( symbol == '(' )
        {
            s = "(";
        }
        else if( symbol == ')' )
        {
            s = ")";
        }

        return s;
    }
}
