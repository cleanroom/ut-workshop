package com.psbc.fizzbuzz;

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
     * Whizz
     */
    private static final String WHIZZ = "Whizz";

    /**
     * FizzWhizz
     */
    private static final String FIZZ_WHIZZ = "FizzWhizz";

    /**
     * BuzzWhizz
     */
    private static final String BUZZ_WHIZZ = "BuzzWhizz";

    /**
     * FizzBuzzWhizz
     */
    private static final String FIZZ_BUZZ_WHIZZ = "FizzBuzzWhizz";


    /**
     * 判断是否是 Fizz, Buzz, FizzBuzz
     *
     * @param num
     * @return
     */
    public String of(int num) throws IllegalArgumentException {

        if (num <= 0){
            throw new IllegalArgumentException("Invalid input");
        }

        if (((num % 3) == 0) && ((num % 5) == 0) && ((num % 7) == 0)) {
            return FIZZ_BUZZ_WHIZZ;
        }

        if (((num % 3) == 0) && ((num % 5) == 0)) {
            return FIZZ_BUZZ;
        }

        if (((num % 3) == 0) && ((num % 7) == 0)) {
            return FIZZ_WHIZZ;
        }

        if (((num % 5) == 0) && ((num % 7) == 0)) {
            return BUZZ_WHIZZ;
        }

        if ((num % 3) == 0) {
            return FIZZ;
        }
        if ((num % 5) == 0) {
            return BUZZ;
        }

        if ((num % 7) == 0) {
            return WHIZZ;
        }
        return String.valueOf(num);
    }

}
