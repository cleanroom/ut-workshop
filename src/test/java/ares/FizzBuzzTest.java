package ares;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void testFizzBuzz(){
        assertEquals("Fizz",FizzBuzz.sayFizzBuzz(3));
        assertEquals("Buzz",FizzBuzz.sayFizzBuzz(5));
        assertEquals("FizzBuzz",FizzBuzz.sayFizzBuzz(15));
        assertEquals("8",FizzBuzz.sayFizzBuzz(8));
    }
}
