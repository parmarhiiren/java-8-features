package com.example.programs;

/**
 * A string is provided as an input from the console which consist of integer value.
 * Insert '*' if the subsequent numbers are even and insert '-' if the subsequent number are odd.
 *
 *
 * Input: 21462675756 Output: 214*6*2*67-5-7-56
 * Input: 98676555533 Output: 98*6765-5-5-5-3-3
 */
public class StarsAndDashes {

    public static void main(String[] args) {

        String input = "21462675756";
        String input1 = "98676555533";
        System.out.println("Input = " + input + " & Modified Value = " + getStarsAndDashesValue(input));
        System.out.println("Input = " + input1 + " & Modified Value = " + getStarsAndDashesValue(input1));
    }

    private static String getStarsAndDashesValue(String input) {

        StringBuilder sb = new StringBuilder(input);
        for(int ctr = 0; ctr < input.length() - 1; ctr++ ) {
            // Get the number and the subsequent number
            int num = Integer.parseInt(String.valueOf(input.charAt(ctr)));
            int num1 = Integer.parseInt(String.valueOf(input.charAt(ctr + 1)));
            // Check if the both the numbers are Even
            if (checkEven(num) && checkEven(num1)) {
                // Both are even, insert a * at the next location
                sb.insert(ctr + 1,"*");
                // The input is now the new String with * added
                input = sb.toString();
                // Skip the * that is added so that it does not interfere in the loop
                ctr++;
            } else if (checkOdd(num) && checkOdd(num1)) { // Check if the both the numbers are Even
                sb.insert(ctr + 1,"-"); // Both are Odd, insert a - at the next location
                input = sb.toString(); // The input is now the new String with - added
                ctr++; // Skip the - that is added so that it does not interfere in the loop
            }
        }
        return sb.toString();
    }

    private static boolean checkEven(int number) {
        return number % 2 == 0;
    }

    private static boolean checkOdd(int number) {
        return number % 2 != 0;
    }
}
