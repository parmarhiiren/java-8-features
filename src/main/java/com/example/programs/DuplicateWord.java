package com.example.programs;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateWord {

    public static void main(String[] args) {
        String string = "Big black bug bit a big black dog on his big black nose";
        String[] strArray = string.split(" ");
        Set<String> uniqueWords = new HashSet<String>(Arrays.asList(strArray));
        System.out.println(" uniqueWords = " + uniqueWords);
        List<String> listOfWords = Arrays.asList(strArray);
        System.out.println(" listOfWords = " + listOfWords);
        for(String word : uniqueWords) {
            if(Collections.frequency(listOfWords, word) > 1) {
                System.out.print(word + " ");
            }
        }

        Map<String, Long> collect = Arrays.stream(string.split(" "))
                                        .collect(
                                                Collectors.groupingBy
                                                        (
                                                            Function.identity(),
                                                            Collectors.counting()
                                                        )
                                                );

        System.out.println(" collect " + collect);
    }
}
