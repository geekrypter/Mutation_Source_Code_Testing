package myinterpreter;

public class DZException extends Exception
{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String Message()
	{
		System.out.println("Divide by zero error!");
		return "Divide by zero error!";
	}
}
