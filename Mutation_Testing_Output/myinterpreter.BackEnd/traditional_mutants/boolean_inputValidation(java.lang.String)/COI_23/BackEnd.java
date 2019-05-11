// This is a mutant program.
// Author : ysma

package myinterpreter;


import java.lang.*;
import java.util.*;


public class BackEnd
{

    private myinterpreter.OutputGenerator ogObject = new myinterpreter.OutputGenerator();

    public  java.lang.String processor( java.lang.String givenString )
    {
        if (givenString.length() != 0) {
            try {
                boolean validation = inputValidation( givenString );
                java.lang.String inputWithoutSpaces = new java.lang.String();
                inputWithoutSpaces = inputWOSpaces( givenString );
                return ogObject.splitString( inputWithoutSpaces );
            } catch ( myinterpreter.ICException E1 ) {
                return E1.Message();
            } catch ( myinterpreter.PException E1 ) {
                return E1.Message();
            } catch ( myinterpreter.NVException E1 ) {
                return E1.Message();
            } catch ( myinterpreter.DZException E1 ) {
                return E1.Message();
            } catch ( myinterpreter.CNTASGNException E1 ) {
                return E1.Message();
            } catch ( myinterpreter.IVSTException E1 ) {
                return E1.Message();
            }
        }
        return givenString;
    }

    public  boolean inputValidation( java.lang.String givenString )
        throws myinterpreter.ICException, myinterpreter.PException
    {
        java.util.Stack<Character> paranthesisHolder = new java.util.Stack<Character>();
        for (int i = 0; i < givenString.length(); i++) {
            if (!(givenString.charAt( i ) == '*' || givenString.charAt( i ) == '%' || givenString.charAt( i ) == ' ' || givenString.charAt( i ) == '-' || givenString.charAt( i ) == '(' || givenString.charAt( i ) == ')' || givenString.charAt( i ) == '+' || givenString.charAt( i ) == '=' || givenString.charAt( i ) == '/' || givenString.charAt( i ) <= 57 && givenString.charAt( i ) >= 48) || givenString.charAt( i ) <= 90 && givenString.charAt( i ) >= 65 || givenString.charAt( i ) <= 122 && givenString.charAt( i ) >= 97) {
                if (givenString.charAt( i ) == '(') {
                    paranthesisHolder.push( (java.lang.Character) givenString.charAt( i ) );
                } else {
                    if (givenString.charAt( i ) == ')') {
                        if (paranthesisHolder.size() != 0) {
                            paranthesisHolder.pop();
                        } else {
                            throw new myinterpreter.PException();
                        }
                    }
                }
            } else {
                throw new myinterpreter.ICException();
            }
        }
        if (paranthesisHolder.size() != 0) {
            throw new myinterpreter.PException();
        }
        return true;
    }

    public  java.lang.String inputWOSpaces( java.lang.String givenString )
    {
        java.lang.String correctString = "";
        givenString = givenString.trim();
        for (int i = 0; i < givenString.length(); i++) {
            if (givenString.charAt( i ) != ' ') {
                correctString = correctString + givenString.charAt( i );
            }
        }
        return correctString;
    }

}
