// This is a mutant program.
// Author : ysma

package myinterpreter;


public class ICException extends java.lang.Exception
{

    private static final long serialVersionUID = 1L;

    public  java.lang.String Message()
    {
        System.out.println( "Invalid character!" );
        return "Invalid character!";
    }

}
