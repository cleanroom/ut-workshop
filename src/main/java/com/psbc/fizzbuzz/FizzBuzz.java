package com.psbc.fizzbuzz;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FizzBuzz {

    /**
     * FizzBuzz
     */
    private static final String FIZZ_BUZZ = "FizzBuzz";

    /**
     * Fizz
     */
    private static final String FIZZ = "Fizz";

    /**
     * Buzz
     */
    private static final String BUZZ = "Buzz";


    /**
     * 判断是否是 Fizz, Buzz, FizzBuzz
     * @param num
     * @return
     */
    public String of(int num) {

        if (((num % 3) == 0) && ((num % 5) == 0)) {
            return FIZZ_BUZZ;
        }
        if ((num % 3) == 0) {
            return FIZZ;
        }
        if ((num % 5) == 0) {
            return BUZZ;
        }
        return String.valueOf(num);

    }

}
