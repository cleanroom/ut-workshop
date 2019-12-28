package com.psbc.fizzbuzz;

import org.junit.Assert;
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
    public void testError(){
       String result =  fizzBuzz.fizzBuzz(3);
        assertEquals("应该返回Fizz",  String.valueOf(3), "Fizz");
    }

}
