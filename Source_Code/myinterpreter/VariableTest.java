package myinterpreter;

import static org.junit.Assert.*;

import org.junit.Test;

public class VariableTest {

	@Test
	public void testGetVariableName() {
		Variable test1 = new Variable();
		test1.setVariableName("tempVariable1");
		Variable test2 = new Variable();
		test2.setVariableName("tempVariable2");
		
		//Assertions
		assertEquals("tempVariable1",test1.getVariableName());
		assertNotEquals("Other",test1.getVariableName());
		assertTrue(test1.getVariableName() == "tempVariable1");
		assertFalse(test1.getVariableName() != "tempVariable1");
		assertNotNull(test1.getVariableName());
		
		assertEquals("tempVariable2",test2.getVariableName());
		assertNotEquals("Other",test2.getVariableName());
		assertTrue(test2.getVariableName() == "tempVariable2");
		assertFalse(test2.getVariableName() != "tempVariable2");
		assertNotNull(test2.getVariableName());
	}

}
