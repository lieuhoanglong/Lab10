package mockdemo;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import org.junit.Before;

// @RunWith attaches a runner with the test class to initialize the test data
@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTest {
/*
	//@InjectMocks annotation is used to create and inject the mock object
	@InjectMocks
	MathApplication mathApplication = new MathApplication();

	//@Mock annotation is used to create the mock object to be injected
	@Mock
	CalculatorService calcService;
*/
	private MathApplication mathApplication;
	private CalculatorService calcService;

	@Before
	public void setUp(){
		mathApplication = new MathApplication();
		calcService = mock(CalculatorService.class);
		mathApplication.setCalculatorService(calcService);
	}
	@SuppressWarnings("deprecation")
	@Test
	public void testAdd( ){
		//add the behavior of calc service to add two numbers
		when(calcService.add(10.0,20.0)).thenReturn(30.00);
		//test the add functionality
		Assert.assertEquals(mathApplication.add(10.0, 20.0),30.0,0.0);
		//verify the behavior
		verify(calcService).add(10.0, 20.0);
	}
	
	@Test
	public void testSubtract() {
		//add the behavior of calc service to subtract two numbers
		when(calcService.subtract(20.0,10.0)).thenReturn(10.00);
		//test the subtract functionality
		Assert.assertEquals(mathApplication.subtract(20.0, 10.0),10.0,0.0);
	}
	
	@Test
	public void testMultiply() {
		//add the behavior of calc service to multiply two numbers
		when(calcService.multiply(20.0,10.0)).thenReturn(200.00);
		//test the multiply functionality
		Assert.assertEquals(mathApplication.multiply(20.0, 10.0),200.0,0.0);
	}
	
	@Test
	public void testDivide() {
		//add the behavior to throw exception
		doThrow(new ArithmeticException("Division by Zero"))
				.when(calcService).divide(10.0,0.0);
		try
		{
			mathApplication.divide(10.0, 0.0);
		} catch ( ArithmeticException exc )
		{	
			String expected = "Division by Zero";
			String actual = exc.getMessage();
			Assert.assertEquals( expected, actual );
		}
		
		// now test a normal case
		when(calcService.divide(20.0,10.0)).thenReturn(2.00);
		//test the modulus functionality
		Assert.assertEquals(mathApplication.divide(20.0, 10.0),2.0,0.0);
	}
	
	@Test
	public void testModulus() {
		//add the behavior to throw exception
		doThrow(new ArithmeticException("Division by Zero"))
				.when(calcService).modulus(10.0,0.0);
		try
		{
			mathApplication.modulus(10.0, 0.0);
		} catch ( ArithmeticException exc )
		{	
			String expected = "Division by Zero";
			String actual = exc.getMessage();
			Assert.assertEquals( expected, actual );
		}
		
		// now test a normal case
		when(calcService.modulus(20.0,10.0)).thenReturn(0.00);
		//test the modulus functionality
		Assert.assertEquals(mathApplication.modulus(20.0, 10.0),2.0,0.0);
	}
}
