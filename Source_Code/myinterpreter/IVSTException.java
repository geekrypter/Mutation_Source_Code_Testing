package myinterpreter;

public class IVSTException extends Exception
{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String Message()
	{
		System.out.println("Invalid Syntax!");
		return "Invalid Syntax!";
	}
}
