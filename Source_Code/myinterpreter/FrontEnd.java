package myinterpreter;

import java.util.*;

public class FrontEnd 
	{
	
	//This method scans the input and sends the input to BackEnd class 
	public String implementation(String inputType)
		{
		BackEnd connector = new BackEnd();
		String output = "";
		if(inputType == "Continuous")
			{
			Scanner scan=new Scanner(System.in);
			String input;
			while(true)
				{
				System.out.println(">>>");
				input= scan.nextLine();
				if(input.equals("stop")||input.equals("exit"))
					break;
				System.out.println(connector.processor(input));
				output = "Continuous inputType choosen so output is continuous";
				}
			}
		else
			{
				output = connector.processor(inputType);
			}
		return output;
		}
	}
