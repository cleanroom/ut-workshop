package com.psbc.fizzbuzz;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

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
    public void testShouldReturnFizz() throws IllegalArgumentException {
        assertEquals("Fizz", fizzBuzz.of(3));
    }

    @Test
    public void testShouldReturnBuzz() throws IllegalArgumentException {
        assertEquals("Buzz", fizzBuzz.of(5));
    }

    @Test
    public void testShouldReturnFizzBuzz() throws IllegalArgumentException {
        assertEquals("FizzBuzz", fizzBuzz.of(15));
    }

    @Test
    public void testShouldReturnNumber() throws IllegalArgumentException {
        assertEquals("8", fizzBuzz.of(8));
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testThrowException() throws IllegalArgumentException {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Invalid input");
         fizzBuzz.of(0);
    }

    @Test
    public void testShouldReturnWhizz(){
        assertEquals("Whizz", fizzBuzz.of(14));
    }

    @Test
    public void testShouldReturnFizzWhizz(){
        assertEquals("FizzWhizz", fizzBuzz.of(21));
    }

    @Test
    public void testShouldReturnBuzzWhizz(){
        assertEquals("BuzzWhizz", fizzBuzz.of(35));
    }

    public void testShouldReturnFizzBuzzWhizz(){
        assertEquals("FizzBuzzWhizz", fizzBuzz.of(105));
    }

}
