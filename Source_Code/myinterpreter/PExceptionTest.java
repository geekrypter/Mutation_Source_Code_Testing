package myinterpreter;

import static org.junit.Assert.*;

import org.junit.Test;

public class PExceptionTest {

	@Test
	public void test() {
		PException test = new PException();
		
		//Assertions
		assertEquals("Paranthesis not properly balanced!",test.Message());
		assertNotEquals("Other",test.Message());
		assertTrue(test.Message() == "Paranthesis not properly balanced!");
		assertFalse(test.Message() != "Paranthesis not properly balanced!");
		assertNotNull(test.Message());
	}

}
