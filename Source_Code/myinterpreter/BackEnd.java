package myinterpreter;

import java.lang.*;
import java.util.*;

//This class is used for providing the proper input to the OutputGenerator class
public class BackEnd
	{
	
	private OutputGenerator ogObject=new OutputGenerator();
	
	//This method provides the proper input to the OutputGenerator class
	public String processor(String givenString)
		{
		if(givenString.length()!=0)
			{
			try
				{
				boolean validation = inputValidation(givenString);
				String inputWithoutSpaces=new String();
				inputWithoutSpaces=inputWOSpaces(givenString);
				return ogObject.splitString(inputWithoutSpaces);
				}
			catch(ICException E1)
				{
				return E1.Message();
				}
			catch(PException E1)
				{
				return E1.Message();
				}
			catch(NVException E1)
				{
				return E1.Message();
				}
			catch(DZException E1)
				{
				return E1.Message();
				}
			catch(CNTASGNException E1)
				{
				return E1.Message();
				}
			catch(IVSTException E1)
				{
				return E1.Message();
				}
			}
		return givenString;
		}
	
	//This method checks whether the given user input is valid or not
	public boolean inputValidation(String givenString) throws ICException,PException
			{
			Stack<Character> paranthesisHolder=new Stack<Character>();
			for(int i=0;i<givenString.length();i++)
				{
				if(givenString.charAt(i)=='*'||givenString.charAt(i)=='%'||givenString.charAt(i)==' '||givenString.charAt(i)=='-'||givenString.charAt(i)=='('||givenString.charAt(i)==')'||givenString.charAt(i)=='+'||givenString.charAt(i)=='='||givenString.charAt(i)=='/'|| (givenString.charAt(i) <=57 && givenString.charAt(i)>=48)||(givenString.charAt(i)<=90&&givenString.charAt(i)>=65)||(givenString.charAt(i)<=122&&givenString.charAt(i)>=97))
					{
					if(givenString.charAt(i)=='(')
						{
						paranthesisHolder.push((Character)givenString.charAt(i));
						}
					else if(givenString.charAt(i)==')')
						{
						if(paranthesisHolder.size()!=0)
							paranthesisHolder.pop();
						else
							throw new PException();
						}
					}
				else
					{
					throw new ICException();	
					}
				}	
			if(paranthesisHolder.size()!=0)
				throw new PException();
			return true;
			}
	
	//This method removes white spaces from the given user input
	public String inputWOSpaces(String givenString)
		{
		String correctString="";
		givenString=givenString.trim();
		for(int i=0;i<givenString.length();i++)
			{
			if(givenString.charAt(i)!=' ')
				{
				correctString=correctString+givenString.charAt(i);
				}
			}
			return correctString;
		}
	}
