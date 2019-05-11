package myinterpreter;

import static org.junit.Assert.*;

import org.junit.Test;

public class IVSTExceptionTest {

	@Test
	public void test() {
		IVSTException test = new IVSTException();
		
		//Assertions
		assertEquals("Invalid Syntax!",test.Message());
		assertNotEquals("Other",test.Message());
		assertTrue(test.Message() == "Invalid Syntax!");
		assertFalse(test.Message() != "Invalid Syntax!");
		assertNotNull(test.Message());
	}

}
