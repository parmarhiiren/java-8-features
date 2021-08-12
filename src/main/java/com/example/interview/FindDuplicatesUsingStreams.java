package com.example.interview;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Find no of times a word/number is repeated
 *
 * input : 5, 3, 4, 1, 3, 7, 2, 9, 9, 4
 * output: 1-1, 2-1, 3-2, 4-2, 5-1, 7-1, 9-2
 *
 * input : "Amanda", "Rob", "Sunny", "Amanda", "Rob"
 * output: Amanda-2, Rob-2, Sunny-1
 *
 */
public class FindDuplicatesUsingStreams {

    public static void main(String[] args) {

        List<Integer>  listOfNumbers = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4);
        List<String> listOfNames = Arrays.asList("Amanda", "Rob", "Sunny", "Amanda", "Rob");

        // Way 1
        Map<Integer, Integer> mapOfNumbers = new HashMap<>();
        listOfNumbers.stream().forEach((num) -> {
            mapOfNumbers.put(num, mapOfNumbers.containsKey(num) ? mapOfNumbers.get(num) + 1 : 1);
        });
        System.out.println("mapOfNumbers => " + mapOfNumbers);

        Map<String, Integer> mapOfNames = new HashMap<>();
        listOfNames.stream().forEach((name) -> {
            mapOfNames.put(name, mapOfNames.containsKey(name) ? mapOfNames.get(name) + 1 : 1);
        });
        System.out.println("mapOfNames => " + mapOfNames);

        // Way 2
        Map<Integer, Long> mapOfNumbers1 = listOfNumbers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("mapOfNumbers1 = " + mapOfNumbers1);

        Map<String, Long> mapOfNames1 = listOfNames.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("mapOfNames1 = " + mapOfNames1);

    }
}
