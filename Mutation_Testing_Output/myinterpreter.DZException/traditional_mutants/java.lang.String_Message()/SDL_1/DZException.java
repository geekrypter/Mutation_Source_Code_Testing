// This is a mutant program.
// Author : ysma

package myinterpreter;


public class DZException extends java.lang.Exception
{

    private static final long serialVersionUID = 1L;

    public  java.lang.String Message()
    {
        return "Divide by zero error!";
    }

}
