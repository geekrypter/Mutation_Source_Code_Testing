// This is a mutant program.
// Author : ysma

package myinterpreter;


import java.util.Stack;


public class EvaluateString
{

    public static  java.lang.Double applyOperations( char givenOperator, java.lang.Double num2, java.lang.Double num1 )
        throws myinterpreter.DZException
    {
        switch (givenOperator) {
        case '+' :
            return num1 + num2;

        case '-' :
            return num1 - num2;

        case '*' :
            return num2;

        case '/' :
            if (num2 == 0) {
                throw new myinterpreter.DZException();
            }
            return num1 / num2;

        }
        return 0.00;
    }

    public static  boolean hasPrecedence( char operator1, char operator2 )
    {
        if (operator2 == '(' || operator2 == ')') {
            return false;
        }
        if ((operator1 == '*' || operator1 == '/') && (operator2 == '+' || operator2 == '-')) {
            return false;
        } else {
            return true;
        }
    }

    public static  java.lang.Double evaluate( java.lang.String givenExpression )
        throws myinterpreter.DZException
    {
        char[] tokens = givenExpression.toCharArray();
        java.util.Stack<Double> valueStack = new java.util.Stack<Double>();
        java.util.Stack<Character> operatorStack = new java.util.Stack<Character>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i] >= '0' && tokens[i] <= '9') {
                java.lang.StringBuffer strbuff = new java.lang.StringBuffer();
                while (i < tokens.length && (tokens[i] >= '0' && tokens[i] <= '9' || tokens[i] == '.')) {
                    strbuff.append( tokens[i++] );
                }
                valueStack.push( Double.valueOf( strbuff.toString() ) );
                i--;
            } else {
                if (tokens[i] == '(') {
                    operatorStack.push( tokens[i] );
                } else {
                    if (tokens[i] == ')') {
                        while (operatorStack.peek() != '(') {
                            valueStack.push( applyOperations( operatorStack.pop(), valueStack.pop(), valueStack.pop() ) );
                        }
                        operatorStack.pop();
                    } else {
                        if (tokens[i] == '+' || tokens[i] == '-' || tokens[i] == '*' || tokens[i] == '/') {
                            while (!operatorStack.empty() && hasPrecedence( tokens[i], operatorStack.peek() )) {
                                valueStack.push( applyOperations( operatorStack.pop(), valueStack.pop(), valueStack.pop() ) );
                            }
                            operatorStack.push( tokens[i] );
                        }
                    }
                }
            }
        }
        while (!operatorStack.empty()) {
            valueStack.push( applyOperations( operatorStack.pop(), valueStack.pop(), valueStack.pop() ) );
        }
        return valueStack.pop();
    }

    public static  java.lang.Double evaluateString( java.lang.String givenString )
        throws myinterpreter.DZException
    {
        return EvaluateString.evaluate( givenString );
    }

}
