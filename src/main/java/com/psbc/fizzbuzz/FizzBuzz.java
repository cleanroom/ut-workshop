package com.psbc.fizzbuzz;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FizzBuzz {

    /** FizzBuzz */
    private static final String FIZZ_BUZZ = "FizzBuzz";

    /** Fizz */
    private static final String FIZZ = "Fizz";

    /** Buzz */
    private static final String BUZZ = "Buzz";


    public String fizzBuzz(int num) {
        Map<Integer, String> tmpMap = new TreeMap<>();

        for (int i = 1; i <= 100; i++) {
            if (((i % 3) == 0) && ((i % 5) == 0)) {
                tmpMap.put(i, FIZZ_BUZZ);
            } else if ((i % 3) == 0) {
                tmpMap.put(i, FIZZ);
            } else if ((i % 5) == 0) {
                tmpMap.put(i, BUZZ);
            } else {
                tmpMap.put(i, String.valueOf(i));
            }
        }

        System.out.println(tmpMap.toString());
        return tmpMap.get(num);
    }

}
