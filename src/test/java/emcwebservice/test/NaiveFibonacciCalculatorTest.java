package emcwebservice.test;

import org.junit.Assert;
import org.junit.Test;

import emcwebservice.calculator.FibonacciCalculator;
import emcwebservice.calculator.NaiveFibonacciCalculator;


public class NaiveFibonacciCalculatorTest {

	private FibonacciCalculator calculator = new NaiveFibonacciCalculator();
	
	@Test(expected = IllegalArgumentException.class)
	public void testNegativeInput() {
		calculator.generateFirstN(-3);
	}

	@Test
	public void testCorrectInput() {
		int n = 10;
		long[] result = calculator.generateFirstN(n);
		long[] expectedResult = new long[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
		Assert.assertArrayEquals(result, expectedResult);
	}
}
