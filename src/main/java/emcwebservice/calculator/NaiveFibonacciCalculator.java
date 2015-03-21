package emcwebservice.calculator;

import org.springframework.stereotype.Component;

@Component("NaiveFibonacciCalculator")
public class NaiveFibonacciCalculator implements FibonacciCalculator{

	@Override
	public long[] generateFirstN(int n) {
		if(n < 0) {
			throw new IllegalArgumentException(String.format("Negative input (%d) is invalid.", n));
		}
		
		long[] result = new long[n];
		
		if(n == 0) {
			return result;
		}
		
		result[0] = 0;
		if(n == 1) {
			return result;
		}
		
		result[1] = 1;
		if(n == 2) {
			return result;
		}
		
		for(int i = 2; i < n; i++) {
			result[i] = result[i-1] + result[i-2];
		}
		
		return result;
		
	}

}
