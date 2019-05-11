package myinterpreter;

public class CNTASGNException extends Exception
{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String Message()
	{
		System.out.println("Cannot Assign to operator!");
		return "Cannot Assign to operator!";
	}
}
