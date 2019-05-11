package myinterpreter;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class OutputGeneratorTest {

	@Test
	public void testIsOperator() {
		OutputGenerator test = new OutputGenerator();
		
		//Assertions
		assertEquals(true,test.isOperator('+'));
		assertNotEquals(false,test.isOperator('+'));
		assertTrue(test.isOperator('+'));
		assertFalse(!test.isOperator('+'));
		assertNotNull(test.isOperator('+'));
		
		assertEquals(false,test.isOperator('$'));
		assertNotEquals(true,test.isOperator('$'));
		assertTrue(!test.isOperator('$'));
		assertFalse(test.isOperator('$'));
		assertNotNull(test.isOperator('$'));
	}
	
	@Test
	public void testSplitString() {
		OutputGenerator test = new OutputGenerator();
		
		//Assertions
		try {
			assertEquals("3.0",test.splitString("1+2"));
		}
		catch(IVSTException E1) {
			assertEquals("Invalid Syntax!",E1.Message());
			assertNotEquals("Other",E1.Message());
			assertTrue(E1.Message() == "Invalid Syntax!");
			assertFalse(E1.Message() != "Invalid Syntax!");
			assertNotNull(E1.Message());
		}
		catch(NVException E2) {
			assertNotEquals("Other",E2.Message());
			assertTrue(E2.Message() != "Other");
			assertNotNull(E2.Message());
		}
		catch(DZException E3) {
			assertEquals("Divide by zero error!",E3.Message());
			assertNotEquals("Other",E3.Message());
			assertTrue(E3.Message() == "Divide by zero error!");
			assertFalse(E3.Message() != "Divide by zero error!");
			assertNotNull(E3.Message());
		}
		catch(CNTASGNException E4) {
			assertEquals("Cannot Assign to operator!",E4.Message());
			assertNotEquals("Other",E4.Message());
			assertTrue(E4.Message() == "Cannot Assign to operator!");
			assertFalse(E4.Message() != "Cannot Assign to operator!");
			assertNotNull(E4.Message());
		}
		try {
			assertNotEquals("other",test.splitString("1+2"));
		}
		catch(IVSTException E1) {
			assertEquals("Invalid Syntax!",E1.Message());
			assertNotEquals("Other",E1.Message());
			assertTrue(E1.Message() == "Invalid Syntax!");
			assertFalse(E1.Message() != "Invalid Syntax!");
			assertNotNull(E1.Message());
		}
		catch(NVException E2) {
			assertNotEquals("Other",E2.Message());
			assertTrue(E2.Message() != "Other");
			assertNotNull(E2.Message());
		}
		catch(DZException E3) {
			assertEquals("Divide by zero error!",E3.Message());
			assertNotEquals("Other",E3.Message());
			assertTrue(E3.Message() == "Divide by zero error!");
			assertFalse(E3.Message() != "Divide by zero error!");
			assertNotNull(E3.Message());
		}
		catch(CNTASGNException E4) {
			assertEquals("Cannot Assign to operator!",E4.Message());
			assertNotEquals("Other",E4.Message());
			assertTrue(E4.Message() == "Cannot Assign to operator!");
			assertFalse(E4.Message() != "Cannot Assign to operator!");
			assertNotNull(E4.Message());
		}
		try {
			assertNotNull(test.splitString("1+2"));
		}
		catch(IVSTException E1) {
			assertEquals("Invalid Syntax!",E1.Message());
			assertNotEquals("Other",E1.Message());
			assertTrue(E1.Message() == "Invalid Syntax!");
			assertFalse(E1.Message() != "Invalid Syntax!");
			assertNotNull(E1.Message());
		}
		catch(NVException E2) {
			assertNotEquals("Other",E2.Message());
			assertTrue(E2.Message() != "Other");
			assertNotNull(E2.Message());
		}
		catch(DZException E3) {
			assertEquals("Divide by zero error!",E3.Message());
			assertNotEquals("Other",E3.Message());
			assertTrue(E3.Message() == "Divide by zero error!");
			assertFalse(E3.Message() != "Divide by zero error!");
			assertNotNull(E3.Message());
		}
		catch(CNTASGNException E4) {
			assertEquals("Cannot Assign to operator!",E4.Message());
			assertNotEquals("Other",E4.Message());
			assertTrue(E4.Message() == "Cannot Assign to operator!");
			assertFalse(E4.Message() != "Cannot Assign to operator!");
			assertNotNull(E4.Message());
		}
		
		
		try {
			assertEquals("3.0",test.splitString("-+"));
		}
		catch(IVSTException E1) {
			assertEquals("Invalid Syntax!",E1.Message());
			assertNotEquals("Other",E1.Message());
			assertTrue(E1.Message() == "Invalid Syntax!");
			assertFalse(E1.Message() != "Invalid Syntax!");
			assertNotNull(E1.Message());
		}
		catch(NVException E2) {
			assertNotEquals("Other",E2.Message());
			assertTrue(E2.Message() != "Other");
			assertNotNull(E2.Message());
		}
		catch(DZException E3) {
			assertEquals("Divide by zero error!",E3.Message());
			assertNotEquals("Other",E3.Message());
			assertTrue(E3.Message() == "Divide by zero error!");
			assertFalse(E3.Message() != "Divide by zero error!");
			assertNotNull(E3.Message());
		}
		catch(CNTASGNException E4) {
			assertEquals("Cannot Assign to operator!",E4.Message());
			assertNotEquals("Other",E4.Message());
			assertTrue(E4.Message() == "Cannot Assign to operator!");
			assertFalse(E4.Message() != "Cannot Assign to operator!");
			assertNotNull(E4.Message());
		}
		try {
			assertNotEquals("other",test.splitString("-+"));
		}
		catch(IVSTException E1) {
			assertEquals("Invalid Syntax!",E1.Message());
			assertNotEquals("Other",E1.Message());
			assertTrue(E1.Message() == "Invalid Syntax!");
			assertFalse(E1.Message() != "Invalid Syntax!");
			assertNotNull(E1.Message());
		}
		catch(NVException E2) {
			assertNotEquals("Other",E2.Message());
			assertTrue(E2.Message() != "Other");
			assertNotNull(E2.Message());
		}
		catch(DZException E3) {
			assertEquals("Divide by zero error!",E3.Message());
			assertNotEquals("Other",E3.Message());
			assertTrue(E3.Message() == "Divide by zero error!");
			assertFalse(E3.Message() != "Divide by zero error!");
			assertNotNull(E3.Message());
		}
		catch(CNTASGNException E4) {
			assertEquals("Cannot Assign to operator!",E4.Message());
			assertNotEquals("Other",E4.Message());
			assertTrue(E4.Message() == "Cannot Assign to operator!");
			assertFalse(E4.Message() != "Cannot Assign to operator!");
			assertNotNull(E4.Message());
		}
		try {
			assertNotNull(test.splitString("-+"));
		}
		catch(IVSTException E1) {
			assertEquals("Invalid Syntax!",E1.Message());
			assertNotEquals("Other",E1.Message());
			assertTrue(E1.Message() == "Invalid Syntax!");
			assertFalse(E1.Message() != "Invalid Syntax!");
			assertNotNull(E1.Message());
		}
		catch(NVException E2) {
			assertNotEquals("Other",E2.Message());
			assertTrue(E2.Message() != "Other");
			assertNotNull(E2.Message());
		}
		catch(DZException E3) {
			assertEquals("Divide by zero error!",E3.Message());
			assertNotEquals("Other",E3.Message());
			assertTrue(E3.Message() == "Divide by zero error!");
			assertFalse(E3.Message() != "Divide by zero error!");
			assertNotNull(E3.Message());
		}
		catch(CNTASGNException E4) {
			assertEquals("Cannot Assign to operator!",E4.Message());
			assertNotEquals("Other",E4.Message());
			assertTrue(E4.Message() == "Cannot Assign to operator!");
			assertFalse(E4.Message() != "Cannot Assign to operator!");
			assertNotNull(E4.Message());
		}
		
	}
	@Test
	public void testFormExpressionString() {
		OutputGenerator test = new OutputGenerator();
		ArrayList<String> expressions = new ArrayList<String>();
		expressions.add("1");
		expressions.add("+");
		expressions.add("2");
		ArrayList<String> expressions2 = new ArrayList<String>();
		expressions2.add("2");
		expressions2.add("/");
		expressions2.add("0");
		ArrayList<String> expressions3 = new ArrayList<String>();
		expressions3.add("a");
		expressions3.add("+");
		expressions3.add("1");
		ArrayList<String> expressions4 = new ArrayList<String>();
		expressions4.add("a");
		expressions4.add("=");
		expressions4.add("1");
		//Assertions
		try {
			assertEquals("3.0",test.formExpressionString(expressions));
		}
		catch(NVException E1) {
			assertNotEquals("Other",E1.Message());
			assertTrue(E1.Message() != "Other");
			assertNotNull(E1.Message());
		}
		catch(DZException E2) {
			assertEquals("Divide by zero error!",E2.Message());
			assertNotEquals("Other",E2.Message());
			assertTrue(E2.Message() == "Divide by zero error!");
			assertFalse(E2.Message() != "Divide by zero error!");
			assertNotNull(E2.Message());
		}
		try {
			assertNotEquals("Other",test.formExpressionString(expressions));
		}
		catch(NVException E1) {
			assertNotEquals("Other",E1.Message());
			assertTrue(E1.Message() != "Other");
			assertNotNull(E1.Message());
		}
		catch(DZException E2) {
			assertEquals("Divide by zero error!",E2.Message());
			assertNotEquals("Other",E2.Message());
			assertTrue(E2.Message() == "Divide by zero error!");
			assertFalse(E2.Message() != "Divide by zero error!");
			assertNotNull(E2.Message());
		}
		try {
			assertNotNull(test.formExpressionString(expressions));
		}
		catch(NVException E1) {
			assertNotEquals("Other",E1.Message());
			assertTrue(E1.Message() != "Other");
			assertNotNull(E1.Message());
		}
		catch(DZException E2) {
			assertEquals("Divide by zero error!",E2.Message());
			assertNotEquals("Other",E2.Message());
			assertTrue(E2.Message() == "Divide by zero error!");
			assertFalse(E2.Message() != "Divide by zero error!");
			assertNotNull(E2.Message());
		}
		
		try {
			assertEquals("3.0",test.formExpressionString(expressions2));
		}
		catch(NVException E1) {
			assertNotEquals("Other",E1.Message());
			assertTrue(E1.Message() != "Other");
			assertNotNull(E1.Message());
		}
		catch(DZException E2) {
			assertEquals("Divide by zero error!",E2.Message());
			assertNotEquals("Other",E2.Message());
			assertTrue(E2.Message() == "Divide by zero error!");
			assertFalse(E2.Message() != "Divide by zero error!");
			assertNotNull(E2.Message());
		}
		try {
			assertNotEquals("Other",test.formExpressionString(expressions2));
		}
		catch(NVException E1) {
			assertNotEquals("Other",E1.Message());
			assertTrue(E1.Message() != "Other");
			assertNotNull(E1.Message());
		}
		catch(DZException E2) {
			assertEquals("Divide by zero error!",E2.Message());
			assertNotEquals("Other",E2.Message());
			assertTrue(E2.Message() == "Divide by zero error!");
			assertFalse(E2.Message() != "Divide by zero error!");
			assertNotNull(E2.Message());
		}
		try {
			assertNotNull(test.formExpressionString(expressions2));
		}
		catch(NVException E1) {
			assertNotEquals("Other",E1.Message());
			assertTrue(E1.Message() != "Other");
			assertNotNull(E1.Message());
		}
		catch(DZException E2) {
			assertEquals("Divide by zero error!",E2.Message());
			assertNotEquals("Other",E2.Message());
			assertTrue(E2.Message() == "Divide by zero error!");
			assertFalse(E2.Message() != "Divide by zero error!");
			assertNotNull(E2.Message());
		}
		
		try {
			assertEquals("3.0",test.formExpressionString(expressions3));
		}
		catch(NVException E1) {
			assertNotEquals("Other",E1.Message());
			assertTrue(E1.Message() != "Other");
			assertNotNull(E1.Message());
		}
		catch(DZException E2) {
			assertEquals("Divide by zero error!",E2.Message());
			assertNotEquals("Other",E2.Message());
			assertTrue(E2.Message() == "Divide by zero error!");
			assertFalse(E2.Message() != "Divide by zero error!");
			assertNotNull(E2.Message());
		}
		try {
			assertNotEquals("Other",test.formExpressionString(expressions3));
		}
		catch(NVException E1) {
			assertNotEquals("Other",E1.Message());
			assertTrue(E1.Message() != "Other");
			assertNotNull(E1.Message());
		}
		catch(DZException E2) {
			assertEquals("Divide by zero error!",E2.Message());
			assertNotEquals("Other",E2.Message());
			assertTrue(E2.Message() == "Divide by zero error!");
			assertFalse(E2.Message() != "Divide by zero error!");
			assertNotNull(E2.Message());
		}
		try {
			assertNotNull(test.formExpressionString(expressions3));
		}
		catch(NVException E1) {
			assertNotEquals("Other",E1.Message());
			assertTrue(E1.Message() != "Other");
			assertNotNull(E1.Message());
		}
		catch(DZException E2) {
			assertEquals("Divide by zero error!",E2.Message());
			assertNotEquals("Other",E2.Message());
			assertTrue(E2.Message() == "Divide by zero error!");
			assertFalse(E2.Message() != "Divide by zero error!");
			assertNotNull(E2.Message());
		}
		
		try {
			assertEquals("Variable given as input",test.formExpressionString(expressions4));
		}
		catch(NVException E1) {
			assertNotEquals("Other",E1.Message());
			assertTrue(E1.Message() != "Other");
			assertNotNull(E1.Message());
		}
		catch(DZException E2) {
			assertEquals("Divide by zero error!",E2.Message());
			assertNotEquals("Other",E2.Message());
			assertTrue(E2.Message() == "Divide by zero error!");
			assertFalse(E2.Message() != "Divide by zero error!");
			assertNotNull(E2.Message());
		}
		try {
			assertNotEquals("Other",test.formExpressionString(expressions4));
		}
		catch(NVException E1) {
			assertNotEquals("Other",E1.Message());
			assertTrue(E1.Message() != "Other");
			assertNotNull(E1.Message());
		}
		catch(DZException E2) {
			assertEquals("Divide by zero error!",E2.Message());
			assertNotEquals("Other",E2.Message());
			assertTrue(E2.Message() == "Divide by zero error!");
			assertFalse(E2.Message() != "Divide by zero error!");
			assertNotNull(E2.Message());
		}
		try {
			assertNotNull(test.formExpressionString(expressions4));
		}
		catch(NVException E1) {
			assertNotEquals("Other",E1.Message());
			assertTrue(E1.Message() != "Other");
			assertNotNull(E1.Message());
		}
		catch(DZException E2) {
			assertEquals("Divide by zero error!",E2.Message());
			assertNotEquals("Other",E2.Message());
			assertTrue(E2.Message() == "Divide by zero error!");
			assertFalse(E2.Message() != "Divide by zero error!");
			assertNotNull(E2.Message());
		}
	}

}
