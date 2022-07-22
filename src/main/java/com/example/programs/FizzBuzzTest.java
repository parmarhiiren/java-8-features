package com.example.programs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class FizzBuzzTest {

    @Test
    public void testNumbers() {
        IntStream.rangeClosed(1,100).asLongStream().forEach(n -> {
            if(n % 3 == 0 && n % 5 == 0)
                Assertions.assertEquals("FizzBuzz", FizzBuzz.fizzBuzz((int) n ));
            else if(n % 3 == 0)
                Assertions.assertEquals("Fizz", FizzBuzz.fizzBuzz((int) n ));
            else if(n % 5 == 0)
                Assertions.assertEquals("Buzz", FizzBuzz.fizzBuzz((int) n ));
        });
    }

    @Test
    public void testNumbersDivisibleBy3() {
        Assertions.assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
    }

    @Test
    public void testNumbersDivisibleBy5() {
        Assertions.assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
    }

    @Test
    public void testNumbersDivisibleBy3and5() {
        Assertions.assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    }

}