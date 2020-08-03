package demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDivision {

	@Test
	public void testDivideWith0() {
		assertEquals(0.0, MyClass.divide(0, 5),0.0);
		//fail("Not yet implemented");
	}
	
	@Test
	public void testDivideByZero() {
		assertNull(MyClass.divide(5, 0));
		//fail("Not yet implemented");
	}

}
