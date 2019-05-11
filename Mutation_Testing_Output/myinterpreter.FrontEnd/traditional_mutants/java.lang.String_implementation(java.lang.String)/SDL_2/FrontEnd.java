// This is a mutant program.
// Author : ysma

package myinterpreter;


import java.util.*;


public class FrontEnd
{

    public  java.lang.String implementation( java.lang.String inputType )
    {
        myinterpreter.BackEnd connector = new myinterpreter.BackEnd();
        java.lang.String output = "";
        if (inputType == "Continuous") {
            java.util.Scanner scan = new java.util.Scanner( System.in );
            java.lang.String input;
        } else {
            output = connector.processor( inputType );
        }
        return output;
    }

}
