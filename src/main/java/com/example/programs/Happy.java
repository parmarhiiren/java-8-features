package com.example.programs;

/**
 * A happy number is a number defined by the following process:
 *
 * Starting with any positive integer, replace the number by the sum of the squares of its digits.
 * Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
 * Those numbers for which this process ends in 1 are happy.
 * Return true if n is a happy number, and false if not.
 *
 * Example 1:
 *
 * Input: n = 19
 * Output: true
 * Explanation:
 * 1 square + 9 square = 82
 * 8 square + 2 square = 68
 * 6 square + 8 square = 100
 * 1 square + 0 square + 0 square = 1
 */
public class Happy {

    public static void main(String[] args) {
        int n = 19;
        System.out.println(n + " is a happy number ? Answer = " + isHappy(n));
    }

    public static boolean isHappy(int n) {
        if (n == 1 || n == 7)
            return true;

        if (n > 1 && n < 10)
            return false;

        int cal = 0;
        while (n > 0) {
            int remainder = n % 10;
            System.out.println(" remainder = " + remainder);
            cal += Math.pow(remainder, 2);
            System.out.println(" cal = " + cal);
            n = n / 10;
            System.out.println(" n = " + n);
        }
        System.out.println("--------------------");
        return isHappy(cal);
    }
}
