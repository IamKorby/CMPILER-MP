package controller;

import model.ExprToken;
import model.ExprType;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by WilliamPC on 4/7/2016.
 */
public class Evaluator {

    public static String evaluate(ArrayList<ExprToken> input)
    {
        Stack<ExprToken> stack = new Stack<ExprToken>();
        int currentPosition = 0;
        float x,y,result;

        //3 5 + 2 * 6 3 - +

        while( currentPosition < input.size() )
        {

                if( input.get(currentPosition).getType() == ExprType.OPERAND )
                {
                    stack.push(input.get(currentPosition));
                }
                else if( input.get(currentPosition).getType() == ExprType.OPERATOR ||
                        input.get(currentPosition).getType() == ExprType.OPERATOR_UNARY )
                {
                    x = 0;
                    y = 0;

                    if( !stack.empty() )
                    {
                            x = Float.parseFloat(stack.pop().getToken());

                    }

                    if( !stack.empty() )
                    {
                            y = Float.parseFloat(stack.pop().getToken());

                    }




                    if( input.get(currentPosition).getToken() == "+" )
                    {
                        y += x;
                    }
                    else if( input.get(currentPosition).getToken() == "-" )
                    {
                        y -= x;
                    }
                    else if( input.get(currentPosition).getToken() == "*" )
                    {
                        y *= x;
                    }
                    else if( input.get(currentPosition).getToken() == "/" )
                    {
                            y /= x;
                    }
                    else if( input.get(currentPosition).getToken() == "%" )
                    {
                            y %= x;

                    }

                    stack.push(new ExprToken(Float.toString(y), ExprType.OPERAND));
                }

                currentPosition++;
            }
                result = Float.parseFloat(stack.pop().getToken());
                return Float.toString(result);
        }


    }
