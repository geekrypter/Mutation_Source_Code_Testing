// This is a mutant program.
// Author : ysma

package myinterpreter;


public class Interpreter
{

    public static  void main( java.lang.String[] args )
    {
        java.lang.String inputType = "1+2";
        System.out.println( run( inputType ) );
    }

    public static  java.lang.String run( java.lang.String inputType )
    {
        myinterpreter.FrontEnd start = new myinterpreter.FrontEnd();
        return "";
    }

}
