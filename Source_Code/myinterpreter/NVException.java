package myinterpreter;

public class NVException extends Exception
{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String variable;
	
	public NVException(String givenVariable)
	{
		variable=givenVariable;
	}
	
	public String Message()
	{
		System.out.println("Variable : "+"' "+variable+" '"+"does not exist!");
		return "Variable : "+"' "+variable+" '"+"does not exist!";
	}
}
