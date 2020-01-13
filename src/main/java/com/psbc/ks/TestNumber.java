package com.psbc.ks;

public class TestNumber {
	
	private final static String _FIZZ_ = "Fizz";
	private final static String _BUZZ_ = "Buzz";
	private final static String _WHIZZ__= "Whizz";
	private final static String _INVALID__= "Invalid input";

	public String calc(int number) {
		StringBuffer sb = new StringBuffer();
		
		if ( number <= 0  ) {
			sb.append( _INVALID__);
			return sb.toString();
		}
		
		if (isDivide(number, 3)) {
			sb.append(_FIZZ_);
		}
		
		if (isDivide(number, 5)) {
			sb.append(_BUZZ_);
		}
		
		if (isDivide(number, 7)) {
			sb.append(_WHIZZ__);
		}
		
		if ( sb.length() == 0 ) {
			sb.append(number);
		}
		
		return sb.toString();
	}

	private boolean isDivide(int number, int i) {
		return number % i == 0;
	}
}
