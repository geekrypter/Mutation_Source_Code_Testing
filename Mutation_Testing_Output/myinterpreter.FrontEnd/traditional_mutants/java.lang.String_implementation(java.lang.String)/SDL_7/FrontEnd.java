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
            while (true) {
                System.out.println( ">>>" );
                input = scan.nextLine();
                System.out.println( connector.processor( input ) );
                output = "Continuous inputType choosen so output is continuous";
            }
        } else {
            output = connector.processor( inputType );
        }
        return output;
    }

}
