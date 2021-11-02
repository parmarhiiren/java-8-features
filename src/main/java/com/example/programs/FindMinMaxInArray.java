package com.example.programs;

import java.util.Arrays;

public class FindMinMaxInArray {

    public static void main(String[] args) {
        int[] intArray = {7, 12, 2, 5, 9, 33};
        System.out.println("Minimum in the array is "+ Arrays.stream(intArray).min().getAsInt());
        System.out.println("Maximum in the array is " + Arrays.stream(intArray).max().getAsInt());
    }
}
