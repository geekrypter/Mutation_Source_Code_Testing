// This is a mutant program.
// Author : ysma

package myinterpreter;


public class NVException extends java.lang.Exception
{

    private static final long serialVersionUID = 1L;

    private java.lang.String variable;

    public NVException( java.lang.String givenVariable )
    {
        variable = givenVariable;
    }

    public  java.lang.String Message()
    {
        System.out.println( "Variable : " + "' " + variable + " '" + "does not exist!" );
        return "Variable : " + "' " + " '" + "does not exist!";
    }

}
