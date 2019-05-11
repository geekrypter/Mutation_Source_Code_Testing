package myinterpreter;

import static org.junit.Assert.*;

import org.junit.Test;

public class FrontEndTest {

	@Test
	public void testImplementation() {
		FrontEnd test=new FrontEnd();
		
		//Assertions
		assertEquals("3.0",test.implementation("2+1"));
		assertNotEquals("Other",test.implementation("2+1"));
		assertNotNull(test.implementation("2+1"));
		
		assertEquals("3.0",test.implementation("(2+1)"));
		assertNotEquals("Other",test.implementation("(2+1)"));
		assertNotNull(test.implementation("(2+1)"));
		
		assertEquals("Paranthesis not properly balanced!",test.implementation("(2+1"));
		assertNotEquals("Other",test.implementation("(2+1"));
		assertNotNull(test.implementation("(2+1"));
		
		assertEquals("Variable given as input",test.implementation("a=2"));
		assertNotEquals("Other",test.implementation("a=2"));
		assertNotNull(test.implementation("a=2"));
		
		assertEquals("Variable : ' b 'does not exist!",test.implementation("b+1"));
		assertNotEquals("Other",test.implementation("b+1"));
		assertNotNull(test.implementation("b+1"));
		
		assertEquals("Invalid Syntax!",test.implementation("+-"));
		assertNotEquals("Other",test.implementation("+-"));
		assertNotNull(test.implementation("+-"));
		
		assertEquals("Invalid character!",test.implementation("1$2"));
		assertNotEquals("Other",test.implementation("1$2"));
		assertNotNull(test.implementation("1$2"));
		
		assertEquals("Divide by zero error!",test.implementation("3/0"));
		assertNotEquals("Other",test.implementation("3/0"));
		assertNotNull(test.implementation("3/0"));
	}

}
