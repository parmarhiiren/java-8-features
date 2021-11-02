package com.example.programs;

public class Fibonacci {

    public static void main(String[] args) {
        int number = 10;
        int a = 0;
        int b = 1;
        int c = 1;
        for(int i = 0; i < number; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a + " ");
        }
        System.out.println("Using Recursive = " + fibo(number));

    }

    private static int fibo(int number) {
        if (number <= 1) {
            return number;
        }
        return fibo(number - 1) + fibo(number - 2);
    }
}
