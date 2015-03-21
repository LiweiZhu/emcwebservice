package emcwebservice.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import emcwebservice.calculator.FibonacciCalculator;

@Controller
public class FibonacciController {

	@Autowired
	@Qualifier("NaiveFibonacciCalculator")
	FibonacciCalculator fibCalculator;
	
	@RequestMapping(value="/fibonacci/{n}", method=RequestMethod.GET)
	public @ResponseBody String generateFibonacciNumber(
			@PathVariable int n){

		try {
			long[] result = fibCalculator.generateFirstN(n);
			return Arrays.toString(result);
			
		} catch(IllegalArgumentException e) {
			return e.getMessage();
		}
		
	}
}
