package com.example.programs;

import java.util.Optional;

public class FizzBuzz {

    public static void main(String[] args) {
        int number = 45;
        System.out.println(fizzBuzz(number));
    }

    public static String fizzBuzz(int number) {
//        String value = "";
//        String fizz = number % 3 == 0 ? "Fizz" : "";
//        String buzz = number % 5 == 0 ? "Buzz" : "";
//        value = Optional.of(number).map(num -> fizz + buzz).get();
//        return value;

        return Optional.of(number)
                .map(num -> (num % 3 == 0 ? "Fizz" : "") +
                            (num % 5 == 0 ? "Buzz" : ""))
                .get();
    }

}

