package emcwebservice.test;

import java.math.BigInteger;

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
		BigInteger[] result = calculator.generateFirstN(n);
		
		BigInteger two = new BigInteger("2");
		BigInteger three = new BigInteger("3");
		BigInteger five = new BigInteger("5");
		BigInteger eight = new BigInteger("8");
		BigInteger thirteen = new BigInteger("13");
		BigInteger twentyOne = new BigInteger("21");
		BigInteger thirtyFour = new BigInteger("34");
		
		BigInteger[] expectedResult = new BigInteger[]{BigInteger.ZERO, BigInteger.ONE, 
				BigInteger.ONE, two, three, five, eight, thirteen, twentyOne, thirtyFour};
		
		Assert.assertArrayEquals(result, expectedResult);
	}
}
