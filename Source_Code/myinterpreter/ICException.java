package myinterpreter;

public class ICException extends Exception
{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String Message()
	{
		System.out.println("Invalid character!");
		return "Invalid character!";
	}
}
