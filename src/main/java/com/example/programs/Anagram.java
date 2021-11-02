package com.example.programs;

import java.util.Arrays;

/**
 * Anagram means if two Strings have the same characters but in a different order.
 * example : Angel vs Angle
 */
public class Anagram {

    public static void main(String[] args) {
        String word = "Angel";
        String anagramWord = "Angle";

        String sortedWord = sortCharacters(word);
        String sortedAnagramWord = sortCharacters(anagramWord);
        if(sortedWord.equalsIgnoreCase(sortedAnagramWord)) {
            System.out.println(" Both are Anagram words ");
        } else {
            System.out.println(" Both are NOT Anagram words ");
        }
    }

    private static String sortCharacters(String word) {
        word = word.toLowerCase();
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }
}
