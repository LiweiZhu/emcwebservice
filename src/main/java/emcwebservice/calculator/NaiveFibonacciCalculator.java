package emcwebservice.calculator;

import java.math.BigInteger;

import org.springframework.stereotype.Component;

@Component("NaiveFibonacciCalculator")
public class NaiveFibonacciCalculator implements FibonacciCalculator{

	@Override
	public BigInteger[] generateFirstN(int n) {
		if(n < 0) {
			throw new IllegalArgumentException(String.format("Negative input (%d) is invalid.", n));
		}
		
		BigInteger[] result = new BigInteger[n];
		
		if(n == 0) {
			return result;
		}
		
		result[0] = BigInteger.ZERO;
		if(n == 1) {
			return result;
		}
		
		result[1] = BigInteger.ONE;
		if(n == 2) {
			return result;
		}
		
		for(int i = 2; i < n; i++) {
			result[i] = result[i-1].add(result[i-2]);
		}
		
		return result;
		
	}

}
