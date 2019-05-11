package myinterpreter;

import static org.junit.Assert.*;

import org.junit.Test;

public class EvaluateStringTest {

	@Test
	public void testApplyOperations() {
		EvaluateString test=new EvaluateString();
		Double testDouble1 = 5.0;
		Double testDouble2 = 4.0;
		
		//Assertions
		try {
			assertEquals(testDouble1,test.applyOperations('+',2.0,3.0));
		}
		catch (DZException E1) {
			assertEquals("Divide by zero error!",E1.Message());
			assertNotEquals("Other",E1.Message());
			assertTrue(E1.Message() == "Divide by zero error!");
			assertFalse(E1.Message() != "Divide by zero error!");
			assertNotNull(E1.Message());
		}
		try {
			assertNotEquals(testDouble2,test.applyOperations('+',2.0,3.0));
		}
		catch (DZException E1) {
			assertEquals("Divide by zero error!",E1.Message());
			assertNotEquals("Other",E1.Message());
			assertTrue(E1.Message() == "Divide by zero error!");
			assertFalse(E1.Message() != "Divide by zero error!");
			assertNotNull(E1.Message());
		}
		try {
			assertNotNull(test.applyOperations('+',2.0,3.0));
		}
		catch (DZException E1) {
			assertEquals("Divide by zero error!",E1.Message());
			assertNotEquals("Other",E1.Message());
			assertTrue(E1.Message() == "Divide by zero error!");
			assertFalse(E1.Message() != "Divide by zero error!");
			assertNotNull(E1.Message());
		}
		
		try {
			assertEquals(testDouble1,test.applyOperations('/',0.0,2.0));
		}
		catch (DZException E1) {
			assertEquals("Divide by zero error!",E1.Message());
			assertNotEquals("Other",E1.Message());
			assertTrue(E1.Message() == "Divide by zero error!");
			assertFalse(E1.Message() != "Divide by zero error!");
			assertNotNull(E1.Message());
		}
		try {
			assertNotEquals(testDouble2,test.applyOperations('/',0.0,2.0));
		}
		catch (DZException E1) {
			assertEquals("Divide by zero error!",E1.Message());
			assertNotEquals("Other",E1.Message());
			assertTrue(E1.Message() == "Divide by zero error!");
			assertFalse(E1.Message() != "Divide by zero error!");
			assertNotNull(E1.Message());
		}
		try {
			assertNotNull(test.applyOperations('/',0.0,2.0));
		}
		catch (DZException E1) {
			assertEquals("Divide by zero error!",E1.Message());
			assertNotEquals("Other",E1.Message());
			assertTrue(E1.Message() == "Divide by zero error!");
			assertFalse(E1.Message() != "Divide by zero error!");
			assertNotNull(E1.Message());
		}
	}
	
	@Test
	public void testHasPrecedence() {
		EvaluateString test=new EvaluateString();
		
		//Assertions
		assertEquals(true,test.hasPrecedence('+','-'));
		assertNotEquals(false,test.hasPrecedence('+','-'));
		assertTrue(test.hasPrecedence('+','-'));
		assertFalse(!test.hasPrecedence('+','-'));
		assertNotNull(test.hasPrecedence('+','-'));
		
		assertEquals(false,test.hasPrecedence('*','-'));
		assertNotEquals(true,test.hasPrecedence('*','-'));
		assertTrue(!test.hasPrecedence('*','-'));
		assertFalse(test.hasPrecedence('*','-'));
		assertNotNull(test.hasPrecedence('*','-'));
		
		assertEquals(false,test.hasPrecedence('*','('));
		assertNotEquals(true,test.hasPrecedence('*','('));
		assertTrue(!test.hasPrecedence('*','('));
		assertFalse(test.hasPrecedence('*','('));
		assertNotNull(test.hasPrecedence('*','('));
	}
	
	@Test
	public void testEvaluate() {
		EvaluateString test=new EvaluateString();
		Double testDouble1 = 5.0;
		Double testDouble2 = 4.0;
		
		//Assertions
		try {
			assertEquals(testDouble1,test.evaluate("2+3"));
		}
		catch (DZException E1) {
			assertEquals("Divide by zero error!",E1.Message());
			assertNotEquals("Other",E1.Message());
			assertTrue(E1.Message() == "Divide by zero error!");
			assertFalse(E1.Message() != "Divide by zero error!");
			assertNotNull(E1.Message());
		}
		try {
			assertNotEquals(testDouble2,test.evaluate("2+3"));
		}
		catch (DZException E1) {
			assertEquals("Divide by zero error!",E1.Message());
			assertNotEquals("Other",E1.Message());
			assertTrue(E1.Message() == "Divide by zero error!");
			assertFalse(E1.Message() != "Divide by zero error!");
			assertNotNull(E1.Message());
		}
		try {
			assertNotNull(test.evaluate("2+3"));
		}
		catch (DZException E1) {
			assertEquals("Divide by zero error!",E1.Message());
			assertNotEquals("Other",E1.Message());
			assertTrue(E1.Message() == "Divide by zero error!");
			assertFalse(E1.Message() != "Divide by zero error!");
			assertNotNull(E1.Message());
		}
		
		try {
			assertEquals(testDouble1,test.evaluate("2/0"));
		}
		catch (DZException E1) {
			assertEquals("Divide by zero error!",E1.Message());
			assertNotEquals("Other",E1.Message());
			assertTrue(E1.Message() == "Divide by zero error!");
			assertFalse(E1.Message() != "Divide by zero error!");
			assertNotNull(E1.Message());
		}
		try {
			assertNotEquals(testDouble2,test.evaluate("2/0"));
		}
		catch (DZException E1) {
			assertEquals("Divide by zero error!",E1.Message());
			assertNotEquals("Other",E1.Message());
			assertTrue(E1.Message() == "Divide by zero error!");
			assertFalse(E1.Message() != "Divide by zero error!");
			assertNotNull(E1.Message());
		}
		try {
			assertNotNull(test.evaluate("2/0"));
		}
		catch (DZException E1) {
			assertEquals("Divide by zero error!",E1.Message());
			assertNotEquals("Other",E1.Message());
			assertTrue(E1.Message() == "Divide by zero error!");
			assertFalse(E1.Message() != "Divide by zero error!");
			assertNotNull(E1.Message());
		}
	}

}
