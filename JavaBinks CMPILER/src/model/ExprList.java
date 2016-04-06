package model;

/**
 * Created by WilliamPC on 4/7/2016.
 */
public class ExprList {
    // list of valid tokens
    private static final String[] operators = {"+", "-", "*", "/", "%"};
    private static final String[] groupers = {"(", ")"};
    private static final String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "."};

    // FUNCTION  : check if symbol is an operator or not
    // PARAMETER : character symbol to be checked
    // RETURN    : true if operator, else false
    public static boolean containsOperator(char operator)
    {
        for( int i = 0; i < operators.length; i++ )
        {
            if( operators[i].charAt(0) == operator )
            {
                return true;
            }
        }

        return false;
    }

    // FUNCTION  : check if symbol is a grouping symbol or not
    // PARAMETER : character symbol to be checked
    // RETURN    : true if grouping symbol, else false
    public static boolean containsGrouper(char grouper)
    {
        for( int i = 0; i < groupers.length; i++ )
        {
            if( groupers[i].charAt(0) == grouper )
            {
                return true;
            }
        }

        return false;
    }

    // FUNCTION  : check if symbol is an operand or not
    // PARAMETER : character symbol to be checked
    // RETURN    : true if operand, else false
    public static boolean containsNumber(char number)
    {
        for( int i = 0; i < numbers.length; i++ )
        {
            if( numbers[i].charAt(0) == number )
            {
                return true;
            }
        }

        return false;
    }
}
