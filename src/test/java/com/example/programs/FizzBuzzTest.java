package com.example.programs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {
    /**
     * Method under test: {@link FizzBuzz#fizzBuzz(int)}
     */
    @Test
    void testFizzBuzz() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
        assertEquals("", FizzBuzz.fizzBuzz(1));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    }
}

