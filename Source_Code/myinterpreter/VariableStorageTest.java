package myinterpreter;

import static org.junit.Assert.*;

import org.junit.Test;

public class VariableStorageTest {
	
	@Test
	public void testAddVariableRetValue() {
		VariableStorage test = new VariableStorage();
		test.addVariable("a", 1.0);
		test.addVariable("b", 2.0);
		test.addVariable("c", 3.0);
		Double testDouble1 = 1.0;
		Double testDouble2 = 2.0;
		Double testDouble3 = 3.0;
		
		//Assertions
		assertEquals(testDouble1, test.retValue("a"));
		assertNotEquals("Other",test.retValue("a"));
		assertNotNull(test.retValue("a"));
		
		assertEquals(testDouble2, test.retValue("b"));
		assertNotEquals("Other",test.retValue("b"));
		assertNotNull(test.retValue("b"));
		
		assertEquals(testDouble3, test.retValue("c"));
		assertNotEquals("Other",test.retValue("c"));
		assertNotNull(test.retValue("c"));
		
		assertEquals(null, test.retValue("d"));
		assertNotEquals("Other",test.retValue("d"));
		assertNull(test.retValue("d"));
	}

}
