package demo;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

//@RunWith binds a test runner with the test class (e.g. this class) to initialize the test data
@RunWith(MockitoJUnitRunner.class)

public class CalculationTester {
/*
	//@InjectMocks annotation is used to create and inject the mock object
	@InjectMocks 
	Calculator calculator = new Calculator();

	//@Mock annotation is used to create the mock object to be injected
	@Mock
	Calculating calcService;
*/
	private Calculator calculator;
	private Calculating calcService;
	
	@Before
	public void setUp() {
		calculator = new Calculator();
		calcService = mock(Calculating.class);
		calculator.setCalculatorService(calcService);
	}
	@Test
	public void testAdd(){
		//add the behavior of calc service to add two numbers
		when(calcService.add(30.0,20.0)).thenReturn(50.00);
		//test the add function
		Assert.assertEquals(calculator.add(30.0, 20.0),50.0,0);
		
		verify(calcService).add(30.0, 20.0);
	}
	
	@Test
	public void testSubtract(){
		//add the behavior of calc service to subtract two numbers
		when(calcService.subtract(30.0,20.0)).thenReturn(10.00);
		//test the substract function
		Assert.assertEquals(calculator.subtract(30.0, 20.0),10.0,0);
	}

	@Test
	public void testDivide(){
		//add the behavior of calc service to divide two numbers
		when(calcService.divide(30.0,10.0)).thenReturn(3.00);
		//test the divide function
		Assert.assertEquals(calculator.divide(30.0, 10.0),3.0,0);
		
		doThrow(new ArithmeticException("Divide by Zero"))
			.when(calcService).divide(30.0,0.0);
		try {
			calculator.divide(30.0, 0.0);
		}
		catch (ArithmeticException e) {
			String expected = "Divide by Zero";
			String actual =  e.getMessage();
			Assert.assertEquals(expected, actual);
		}
	}
}
