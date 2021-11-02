package com.example.programs;

public class ReverseString {

    public static void main(String[] args) {
        String str = "Hiiren";
        String reverseStr = new StringBuilder().append(str).reverse().toString();
        System.out.println("Reverse String using StringBuilder : " + reverseStr);
        reverse(str);
    }

    public static void reverse(String str) {
        String returnStr = "";
        // Convert to Character Array
        char[] chars = str.toCharArray();
        System.out.print("Reverse String using method : ");
        for(int c = chars.length - 1; c >= 0; c--) {
            System.out.print(chars[c]);
        }
    }
}
