package com.example.programs;

/**
 * Swap 2 numbers using a third variable
 * Swap 2 numbers without using a third variable
 */
public class SwapTwoNumbers {

    public static void main(String[] args) {
        int first = 10;
        int second = 20;
        System.out.println("Before Swapping : first = " + first + " second = " + second);
        swapWithoutVariable(first , second);
        swapWithVariable(first , second);
    }

    private static void swapWithVariable(int first, int second) {
        int third;
        third = first;
        first = second;
        second = third;
        System.out.println("After  Swapping : first = " + first + " second = " + second);
    }

    public static void swapWithoutVariable(int first, int second) {
        second = first + second; // second = 30
        first = second - first; // first = 20
        second = second - first; // second = 10
        System.out.println("After  Swapping : first = " + first + " second = " + second);
    }
}
