package myinterpreter;

import static org.junit.Assert.*;

import org.junit.Test;

public class NVExceptionTest {

	@Test
	public void test() {
		NVException test = new NVException("tempVariable");
		
		//Assertions
		assertEquals("Variable : ' tempVariable 'does not exist!",test.Message());
		assertNotEquals("Other",test.Message());
		assertTrue(test.Message().equals("Variable : ' tempVariable 'does not exist!"));
		assertFalse(!test.Message().equals("Variable : ' tempVariable 'does not exist!"));
		assertNotNull(test.Message());
	}

}
