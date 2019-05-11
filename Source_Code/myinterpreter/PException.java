package myinterpreter;

public class PException extends Exception
{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String Message()
	{
		System.out.println("Paranthesis not properly balanced!");
		return "Paranthesis not properly balanced!";
	}
}
