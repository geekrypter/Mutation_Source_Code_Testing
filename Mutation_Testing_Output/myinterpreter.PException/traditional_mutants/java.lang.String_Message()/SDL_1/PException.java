// This is a mutant program.
// Author : ysma

package myinterpreter;


public class PException extends java.lang.Exception
{

    private static final long serialVersionUID = 1L;

    public  java.lang.String Message()
    {
        return "Paranthesis not properly balanced!";
    }

}
