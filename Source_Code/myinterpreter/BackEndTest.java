package myinterpreter;

import static org.junit.Assert.*;

import org.junit.Test;

public class BackEndTest {

	@Test
	public void testInputWOSpaces() {
		BackEnd test = new BackEnd();
		
		//Assertions
		assertEquals("HelloWorld",test.inputWOSpaces("Hello World"));
		assertNotEquals("Other",test.inputWOSpaces("Hello World"));
		assertTrue(test.inputWOSpaces("Hello World").equals("HelloWorld"));
		assertFalse(!test.inputWOSpaces("Hello World").equals("HelloWorld"));
		assertNotNull(test.inputWOSpaces("Hello World"));
		
		assertEquals("HelloWorld",test.inputWOSpaces("Hello     World"));
		assertNotEquals("Other",test.inputWOSpaces("Hello     World"));
		assertTrue(test.inputWOSpaces("Hello     World").equals("HelloWorld"));
		assertFalse(!test.inputWOSpaces("Hello     World").equals("HelloWorld"));
		assertNotNull(test.inputWOSpaces("Hello     World"));
	}
	
	@Test
	public void testInputVaidation() {
		BackEnd test = new BackEnd();
		
		//Assertions
		try {
			assertEquals(true,test.inputValidation("1+2"));
		}
		catch(ICException E1) {
			assertEquals("Invalid character!",E1.Message());
			assertNotEquals("Other",E1.Message());
			assertTrue(E1.Message() == "Invalid character!");
			assertFalse(E1.Message() != "Invalid character!");
			assertNotNull(E1.Message());
		}
		catch(PException E2) {
			assertEquals("Paranthesis not properly balanced!",E2.Message());
			assertNotEquals("Other",E2.Message());
			assertTrue(E2.Message() == "Paranthesis not properly balanced!");
			assertFalse(E2.Message() != "Paranthesis not properly balanced!");
			assertNotNull(E2.Message());
		}
		try {
			assertNotEquals(false,test.inputValidation("1+2"));
		}
		catch(ICException E1) {
			assertEquals("Invalid character!",E1.Message());
			assertNotEquals("Other",E1.Message());
			assertTrue(E1.Message() == "Invalid character!");
			assertFalse(E1.Message() != "Invalid character!");
			assertNotNull(E1.Message());
		}
		catch(PException E2) {
			assertEquals("Paranthesis not properly balanced!",E2.Message());
			assertNotEquals("Other",E2.Message());
			assertTrue(E2.Message() == "Paranthesis not properly balanced!");
			assertFalse(E2.Message() != "Paranthesis not properly balanced!");
			assertNotNull(E2.Message());
		}
		try {
			assertNotNull(test.inputValidation("1+2"));
		}
		catch(ICException E1) {
			assertEquals("Invalid character!",E1.Message());
			assertNotEquals("Other",E1.Message());
			assertTrue(E1.Message() == "Invalid character!");
			assertFalse(E1.Message() != "Invalid character!");
			assertNotNull(E1.Message());
		}
		catch(PException E2) {
			assertEquals("Paranthesis not properly balanced!",E2.Message());
			assertNotEquals("Other",E2.Message());
			assertTrue(E2.Message() == "Paranthesis not properly balanced!");
			assertFalse(E2.Message() != "Paranthesis not properly balanced!");
			assertNotNull(E2.Message());
		}
		
		try {
			assertEquals(true,test.inputValidation("(1+2"));
		}
		catch(ICException E1) {
			assertEquals("Invalid character!",E1.Message());
			assertNotEquals("Other",E1.Message());
			assertTrue(E1.Message() == "Invalid character!");
			assertFalse(E1.Message() != "Invalid character!");
			assertNotNull(E1.Message());
		}
		catch(PException E2) {
			assertEquals("Paranthesis not properly balanced!",E2.Message());
			assertNotEquals("Other",E2.Message());
			assertTrue(E2.Message() == "Paranthesis not properly balanced!");
			assertFalse(E2.Message() != "Paranthesis not properly balanced!");
			assertNotNull(E2.Message());
		}
		try {
			assertNotEquals(false,test.inputValidation("(1+2"));
		}
		catch(ICException E1) {
			assertEquals("Invalid character!",E1.Message());
			assertNotEquals("Other",E1.Message());
			assertTrue(E1.Message() == "Invalid character!");
			assertFalse(E1.Message() != "Invalid character!");
			assertNotNull(E1.Message());
		}
		catch(PException E2) {
			assertEquals("Paranthesis not properly balanced!",E2.Message());
			assertNotEquals("Other",E2.Message());
			assertTrue(E2.Message() == "Paranthesis not properly balanced!");
			assertFalse(E2.Message() != "Paranthesis not properly balanced!");
			assertNotNull(E2.Message());
		}
		try {
			assertNotNull(test.inputValidation("(1+2"));
		}
		catch(ICException E1) {
			assertEquals("Invalid character!",E1.Message());
			assertNotEquals("Other",E1.Message());
			assertTrue(E1.Message() == "Invalid character!");
			assertFalse(E1.Message() != "Invalid character!");
			assertNotNull(E1.Message());
		}
		catch(PException E2) {
			assertEquals("Paranthesis not properly balanced!",E2.Message());
			assertNotEquals("Other",E2.Message());
			assertTrue(E2.Message() == "Paranthesis not properly balanced!");
			assertFalse(E2.Message() != "Paranthesis not properly balanced!");
			assertNotNull(E2.Message());
		}
		
		try {
			assertEquals(true,test.inputValidation("1$2"));
		}
		catch(ICException E1) {
			assertEquals("Invalid character!",E1.Message());
			assertNotEquals("Other",E1.Message());
			assertTrue(E1.Message() == "Invalid character!");
			assertFalse(E1.Message() != "Invalid character!");
			assertNotNull(E1.Message());
		}
		catch(PException E2) {
			assertEquals("Paranthesis not properly balanced!",E2.Message());
			assertNotEquals("Other",E2.Message());
			assertTrue(E2.Message() == "Paranthesis not properly balanced!");
			assertFalse(E2.Message() != "Paranthesis not properly balanced!");
			assertNotNull(E2.Message());
		}
		try {
			assertNotEquals(false,test.inputValidation("1$2"));
		}
		catch(ICException E1) {
			assertEquals("Invalid character!",E1.Message());
			assertNotEquals("Other",E1.Message());
			assertTrue(E1.Message() == "Invalid character!");
			assertFalse(E1.Message() != "Invalid character!");
			assertNotNull(E1.Message());
		}
		catch(PException E2) {
			assertEquals("Paranthesis not properly balanced!",E2.Message());
			assertNotEquals("Other",E2.Message());
			assertTrue(E2.Message() == "Paranthesis not properly balanced!");
			assertFalse(E2.Message() != "Paranthesis not properly balanced!");
			assertNotNull(E2.Message());
		}
		try {
			assertNotNull(test.inputValidation("1$2"));
		}
		catch(ICException E1) {
			assertEquals("Invalid character!",E1.Message());
			assertNotEquals("Other",E1.Message());
			assertTrue(E1.Message() == "Invalid character!");
			assertFalse(E1.Message() != "Invalid character!");
			assertNotNull(E1.Message());
		}
		catch(PException E2) {
			assertEquals("Paranthesis not properly balanced!",E2.Message());
			assertNotEquals("Other",E2.Message());
			assertTrue(E2.Message() == "Paranthesis not properly balanced!");
			assertFalse(E2.Message() != "Paranthesis not properly balanced!");
			assertNotNull(E2.Message());
		}
	}
	
	@Test
	public void testProcessor() {
		BackEnd test = new BackEnd();
		
		//Assertions
				assertEquals("3.0",test.processor("2+1"));
				assertNotEquals("Other",test.processor("2+1"));
				assertNotNull(test.processor("2+1"));
				
				assertEquals("3.0",test.processor("(2+1)"));
				assertNotEquals("Other",test.processor("(2+1)"));
				assertNotNull(test.processor("(2+1)"));
				
				assertEquals("Paranthesis not properly balanced!",test.processor("(2+1"));
				assertNotEquals("Other",test.processor("(2+1"));
				assertNotNull(test.processor("(2+1"));
				
				assertEquals("Variable given as input",test.processor("a=2"));
				assertNotEquals("Other",test.processor("a=2"));
				assertNotNull(test.processor("a=2"));
				
				assertEquals("Variable : ' b 'does not exist!",test.processor("b+1"));
				assertNotEquals("Other",test.processor("b+1"));
				assertNotNull(test.processor("b+1"));
				
				assertEquals("Invalid Syntax!",test.processor("+-"));
				assertNotEquals("Other",test.processor("+-"));
				assertNotNull(test.processor("+-"));
				
				assertEquals("Invalid character!",test.processor("1$2"));
				assertNotEquals("Other",test.processor("1$2"));
				assertNotNull(test.processor("1$2"));
				
				assertEquals("Divide by zero error!",test.processor("3/0"));
				assertNotEquals("Other",test.processor("3/0"));
				assertNotNull(test.processor("3/0"));
	}

}
