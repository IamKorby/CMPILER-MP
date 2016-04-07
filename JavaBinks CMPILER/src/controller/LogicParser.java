package controller;

import model.ScoopsPre;
import model.Symbol;

import java.util.ArrayList;

/**
 * Created by WilliamPC on 4/7/2016.
 */
public class LogicParser {

    private int x,y;
    private final char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    private final String[] operators = {"<", "<=", ">", ">=", "!=", "=="};
    private ArrayList operands;
    private String s;
    public boolean  parseLogic(String exp,ScoopsPre scoops){
        System.out.println("Inside parser");
        int currChar = 0;
        String num = "";
        operands = new ArrayList<>();
        while(currChar < exp.length()){
            if(containsOperator(Character.toString(exp.charAt(currChar)))){
                s = Character.toString(exp.charAt(currChar));
                currChar++;
            }
            else if(containsNumber(exp.charAt(currChar))){
                do
                {
                    // concatenate the character to num
                    // increment currChar afterwards to check the next character
                    num += String.valueOf(exp.charAt(currChar));
                    currChar++;
                } while( currChar != exp.length() && containsNumber(exp.charAt(currChar)) );
                operands.add(Integer.parseInt(num));
                System.out.println("Checkpoint");
            }
    /*        else{
                Symbol symbol = scoops.retrieve(Character.toString(exp.charAt(currChar)));

                operands.add(Integer.parseInt(symbol.getValue().toString()));

                currChar++;
            }*/

        }

        return evaluate(operands,s);

    }

    public boolean containsOperator(String currChar){
        for(int i = 0; i < operators.length; i++){
            if(currChar == operators[i]){
                return true;
            }
        }


        return false;
    }

    public boolean containsNumber(char currChar){
        for(int i = 0; i < numbers.length; i++){
            if(currChar == numbers[i]){
                return true;
            }
        }
        return false;
    }

    public boolean evaluate(ArrayList operands,String s){
        x = (int)operands.get(0);
        y = (int)operands.get(1);

        if(s == ">"){
            if(x > y){
                return true;
            }
            else{
                return false;
            }
        }
        else if(s == ">="){
            if(x >= y){
                return true;
            }
            else{
                return false;
            }
        }
        else if(s == "<"){
            if(x < y){
                return true;
            }
            else{
                return false;
            }
        }
        else if(s == "<="){
            if(x <= y){
                return true;
            }
            else{
                return false;
            }
        }
        else if(s == "!="){
            if(x != y){
                return true;
            }
            else{
                return false;
            }
        }
        else if(s == "=="){
            if(x == y){
                return true;
            }
            else{
               return false;
            }
        }
        return false;
    }
}
