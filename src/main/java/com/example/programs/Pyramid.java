package com.example.programs;

public class Pyramid {

    public static void main(String[] args) {
        int rows = 9;
        System.out.println("Printing Pyramid");

        printPyramid(rows);

    }

    private static void printPyramid(int rows) {
        for(int ctr = 1; ctr <= rows; ctr++) {
            // whitespaces in front of the number
            int numberOfWhiteSpaces =  rows - ctr;
            // Print the whitespaces before printing the number
            printString(" ", numberOfWhiteSpaces );
            // print the number with a space
            printString(ctr + " ", ctr );
            // New line
            System.out.println("");
        }
    }

    public static void printString (String s, int numOfTimes) {
        for(int j = 0; j < numOfTimes; j++) {
            System.out.print(s);
        }
    }
}
