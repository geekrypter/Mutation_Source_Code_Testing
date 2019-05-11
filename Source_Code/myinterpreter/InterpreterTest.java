package myinterpreter;

import static org.junit.Assert.*;

import org.junit.Test;

public class InterpreterTest {

	@Test
	public void testRun() {
		Interpreter test=new Interpreter();
		
		//Assertions
		assertEquals("3.0",test.run("2+1"));
		assertNotEquals("Other",test.run("2+1"));
		assertNotNull(test.run("2+1"));
		
		assertEquals("3.0",test.run("(2+1)"));
		assertNotEquals("Other",test.run("(2+1)"));
		assertNotNull(test.run("(2+1)"));
		
		assertEquals("Paranthesis not properly balanced!",test.run("(2+1"));
		assertNotEquals("Other",test.run("(2+1"));
		assertNotNull(test.run("(2+1"));
		
		assertEquals("Variable given as input",test.run("a=2"));
		assertNotEquals("Other",test.run("a=2"));
		assertNotNull(test.run("a=2"));
		
		assertEquals("Variable : ' b 'does not exist!",test.run("b+1"));
		assertNotEquals("Other",test.run("b+1"));
		assertNotNull(test.run("b+1"));
		
		assertEquals("Invalid Syntax!",test.run("+-"));
		assertNotEquals("Other",test.run("+-"));
		assertNotNull(test.run("+-"));
		
		assertEquals("Invalid character!",test.run("1$2"));
		assertNotEquals("Other",test.run("1$2"));
		assertNotNull(test.run("1$2"));
		
		assertEquals("Divide by zero error!",test.run("3/0"));
		assertNotEquals("Other",test.run("3/0"));
		assertNotNull(test.run("3/0"));
	}

}
