package com.example.programs;

public class Palindrome {

    public static void main(String[] args) {
        checkPalindrome("madam");
        checkPalindrome("  ");
        checkPalindrome("");
        checkPalindrome(null);
        checkPalindrome("hiiren");
    }

    private static void checkPalindrome(String palindromeStr) {
        if(palindromeStr == null || palindromeStr.trim().length() < 1 ) {
            System.out.println("Input is null or empty");
            return;
        }
        String reverseStr = new StringBuilder().append(palindromeStr).reverse().toString();
        String reverseStr1 = reverse(palindromeStr);
        System.out.println(" reverseStr1 = " + reverseStr1);
        if(palindromeStr.equalsIgnoreCase(reverseStr)) {
            System.out.println(palindromeStr + " is a palindrome");
        } else {
            System.out.println(palindromeStr + " is not a palindrome");
        }
    }

    private static String reverse(String original) {
        String returnStr = "";
        for (int s = original.length() - 1; s >= 0; s--) {
            returnStr = returnStr + original.charAt(s);
        }
        return returnStr;

    }
}
