package myinterpreter;

import static org.junit.Assert.*;

import org.junit.Test;

public class DZExceptionTest {

	@Test
	public void test() {
		DZException test = new DZException();
		
		//Assertions
		assertEquals("Divide by zero error!",test.Message());
		assertNotEquals("Other",test.Message());
		assertTrue(test.Message() == "Divide by zero error!");
		assertFalse(test.Message() != "Divide by zero error!");
		assertNotNull(test.Message());
	}

}
