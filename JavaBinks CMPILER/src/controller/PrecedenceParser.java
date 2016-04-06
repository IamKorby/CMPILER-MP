package controller;

import model.ExprToken;
import model.ExprType;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by WilliamPC on 4/7/2016.
 */
public class PrecedenceParser {
    public static ArrayList<ExprToken> ConvertToPostFix(ArrayList<ExprToken> input)
    {


            ArrayList<ExprToken> postFix = new ArrayList<>();
            Stack<ExprToken> stack = new Stack<>();
            ExprToken currentToken;
            ExprToken stackTop;
            int ISP; // In stack priority
            int ICP; // Incoming priority

            for (ExprToken list1 : input)
            {
                currentToken = list1;
                if (currentToken.getType() == ExprType.OPERAND)
                {
                    postFix.add(currentToken);
                }
                else if (currentToken.getType() == ExprType.GROUPING_SYMBOL)
                {
                    String token = currentToken.getToken();
                    if ("(".equals(token))
                    {
                        stack.push(currentToken);
                    }
                    else if (")".equals(token))
                    {
                        ExprToken stackToken = stack.pop();
                        if ( stackToken.getType() == ExprType.OPERATOR ||
                                stackToken.getType() == ExprType.OPERATOR_UNARY )
                        {
                            postFix.add(stackToken);
                        }
                    }
                }
                else if ( currentToken.getType() == ExprType.OPERATOR ||
                        currentToken.getType() == ExprType.OPERATOR_UNARY )
                {
                    ICP = assignICP(currentToken);
                    if (stack.empty())
                    {
                        stack.push(currentToken);
                    }
                    else
                    {
                        ExprToken top = stack.peek();
                        ISP = assignISP(top);
                        if (ISP < ICP)
                        {
                            stack.push(currentToken);
                        }
                        else if (ISP >= ICP)
                        {
                            while (ISP >= ICP && !stack.empty())
                            {
                                postFix.add(stack.pop());
                                if (!stack.empty())
                                {
                                    top = stack.peek();
                                    ISP = assignISP(top);
                                }

                            }
                            stack.push(currentToken);
                        }
                    }
                }
            }
            if (!stack.empty())
            {
                while (!stack.empty())
                {
                    stackTop = stack.peek();
                    if ("(".equals(stackTop.getToken()))
                    {
                        stack.pop();
                    }

                    if( !stack.empty() )
                    {
                        postFix.add(stack.pop());
                    }
                }
            }

            return postFix;

    }

    static int assignICP(ExprToken token)
    {
        int ICP = 0;
        String tokenSymbol = token.getToken();
        if ("*".equals(tokenSymbol) || "/".equals(tokenSymbol) || "%".equals(tokenSymbol))
        {
            ICP = 2;
        }
        else if ("+".equals(tokenSymbol) || "-".equals(tokenSymbol))
        {
            ICP = 1;
        }
        else if ("(".equals(tokenSymbol))
        {
            ICP = 4;
        }
        return ICP;

    }

    static int assignISP(ExprToken token)
    {
        int ISP = 0;
        String tokenSymbol = token.getToken();
        if ("*".equals(tokenSymbol) || "/".equals(tokenSymbol) || "%".equals(tokenSymbol))
        {
            ISP = 2;
        }
        else if ("+".equals(tokenSymbol) || "-".equals(tokenSymbol))
        {
            ISP = 1;
        }
        else if ("(".equals(tokenSymbol))
        {
            ISP = 0;
        }
        return ISP;
    }
}
