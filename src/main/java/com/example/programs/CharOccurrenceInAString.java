package com.example.programs;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharOccurrenceInAString {

    public static void main(String[] args) {
        String str = "I am in in an interview";
        long count = str.chars().filter(ch -> ch == 'i').count();
        System.out.println("count = " + count);

        Map<String, Long> collect = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}
