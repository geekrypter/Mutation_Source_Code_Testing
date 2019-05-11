package myinterpreter;

import static org.junit.Assert.*;

import org.junit.Test;

public class CNTASGNExceptionTest {

	@Test
	public void testCNTASGNException() {
		CNTASGNException test = new CNTASGNException();
		
		//Assertions
		assertEquals("Cannot Assign to operator!",test.Message());
		assertNotEquals("Other",test.Message());
		assertTrue(test.Message() == "Cannot Assign to operator!");
		assertFalse(test.Message() != "Cannot Assign to operator!");
		assertNotNull(test.Message());
	}

}
