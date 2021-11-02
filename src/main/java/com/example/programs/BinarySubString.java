package com.example.programs;

/**
 * Given a binary string, count number of substrings that start and end with 1.
 * For example, if the input string is “00100101”, then there are three substrings “1001”, “100101” and “101”.
 * For example, if the input string is “0010110010”, then there are six substrings
 * “101“, “1011“, “1011001“, “11“, “11001“, “1001“.
 */
public class BinarySubString {

    public static void main(String[] args) {
        String input = "0010110010";
        char[] inputArr = input.toCharArray();
        System.out.println("Count = " + countSubString(input));
    }

    private static int countSubString(String input) {
        int count = 0;
        char[] inputArr = input.toCharArray();
        int strLen = input.length();
        for(int ctr = 0; ctr < strLen; ctr++) {
            // Starting Point
            if(inputArr[ctr] == '1') {
                for (int ctr1 = ctr + 1; ctr1 < strLen; ctr1++) {
                    if(inputArr[ctr1] == '1') {
                        System.out.print(input.substring(ctr, ctr1 + 1) + " ");
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
