package com.psbc.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


/**
 * @author 蒙元堪
 */
public class FizzBuzzTest {

    /** FizzBuzz 实例 */
    private FizzBuzz fizzBuzz = null;

    @Before
    public void init(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void testShouldReturnFizz(){
        assertEquals("Fizz", fizzBuzz.of(3));
    }

    @Test
    public void testShouldReturnBuzz(){
        assertEquals("Buzz", fizzBuzz.of(5));
    }

    @Test
    public void testShouldReturnFizzBuzz(){
        assertEquals("FizzBuzz", fizzBuzz.of(15));
    }

    @Test
    public void testShouldReturnNumber(){
        assertEquals("8", fizzBuzz.of(8));
    }

}
