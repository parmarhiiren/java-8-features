package com.example.programs;

/**
 * Swap 2 numbers using a third variable
 * Swap 2 numbers without using a third variable
 */
public class SwapTwoNumbers {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println("Before Swapping : x = " + x + " y = " + y);
        swapWithoutVariable(x , y);
        swapWithVariable(x , y);
    }

    private static void swapWithVariable(int x, int y) {
        int z;
        z = x;
        x = y;
        y = z;
        System.out.println("After  Swapping : x = " + x + " y = " + y);
    }

    public static void swapWithoutVariable(int x, int y) {
        y = x + y; // y = 30
        x = y - x; // x = 20
        y = y - x; // y = 10
        System.out.println("After  Swapping : x = " + x + " y = " + y);
    }
}
