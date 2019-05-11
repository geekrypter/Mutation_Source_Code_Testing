package myinterpreter;

public class Interpreter
{
	/*
	 * inputType = "Continuous" allows users to give input as a continuous stream
	 * inputType = <Expression in form of string> allows users to give input for one time
	 */ 
	
	public static void main(String[] args)
	{
		//program starts from here
		String inputType = "1+2";
		System.out.println(run(inputType));
	}
	
	public static String run(String inputType) {
		FrontEnd start=new FrontEnd();
		return start.implementation(inputType);
	}
}
