// This is a mutant program.
// Author : ysma

package myinterpreter;


public class PException extends java.lang.Exception
{

    private static final long serialVersionUID = 1L;

    public  java.lang.String Message()
    {
        System.out.println( "Paranthesis not properly balanced!" );
        return "Paranthesis not properly balanced!";
    }

}
