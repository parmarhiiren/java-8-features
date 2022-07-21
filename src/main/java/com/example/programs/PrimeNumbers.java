package com.example.programs;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

/**
 * Check if the number is Prime
 * Prime Numbers are those numbers that are divided by themselves or by 1
 *
 * Logic  :
 *
 * 1.) Iterate from 2 till the half the number
 * 2.) if the modulo == 0 then number is not a prime
 * 3.) if it passes thru all the numbers and the modulo > 0 then the number is a prime
 *
 */
public class PrimeNumbers {

    public static void main(String[] args) {
        checkPrime(17);
        checkPrime(4);
        checkPrime(445);
        System.out.println(" Prime = " + isPrimeNumber(17));
        System.out.println(" Prime = " + isPrimeNumber(4));
        System.out.println(" Prime = " + isPrimeNumber(445));

    }

    private static void checkPrime(int number) {
        boolean isPrime = true;
        if (number == 0 || number == 1) {
            isPrime = false;
        } else if (number == 2) {
            isPrime = true;
        } else {
            for (int ctr = 2; ctr <= number / 2; ctr++) {
                int temp = number % ctr;
                if (temp == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }

    private static boolean isPrimeNumber(int number) {
        IntPredicate isDivisible = index -> number % index == 0;
        return number > 1 && IntStream.range(2, number).noneMatch(isDivisible);
    }
}
