package demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMultiply {

	@Test
	public void testMultiplyByZero() {
		// assert statements
		 assertEquals(0, MyClass.multiply(10, 0));
		 assertEquals(0, MyClass.multiply(0, 10));
		 assertEquals(0, MyClass.multiply(0, 0));
		//fail("Not yet implemented");
	}

	@Test
	public void testMultiplyByOne() {
		// assert statements
		 assertEquals(7, MyClass.multiply(7, 1));
		 assertEquals(7, MyClass.multiply(1, 7));
		 assertEquals(1, MyClass.multiply(1, 1));
		//fail("Not yet implemented");
	}
	
	@Test
	public void testMultiplyByNegative() {
		// assert statements
		 assertTrue(MyClass.multiply(7, -1)<0);
		 assertEquals(-7, MyClass.multiply(-1, 7));
		 assertEquals(-1, MyClass.multiply(-1, 1));
		//fail("Not yet implemented");
	}
}
