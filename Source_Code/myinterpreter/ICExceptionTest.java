package myinterpreter;

import static org.junit.Assert.*;

import org.junit.Test;

public class ICExceptionTest {

	@Test
	public void test() {
		ICException test = new ICException();
		
		//Assertions
		assertEquals("Invalid character!",test.Message());
		assertNotEquals("Other",test.Message());
		assertTrue(test.Message() == "Invalid character!");
		assertFalse(test.Message() != "Invalid character!");
		assertNotNull(test.Message());
	}

}
