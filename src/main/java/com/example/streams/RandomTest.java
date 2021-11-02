package com.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RandomTest {

    public static void main(String[] args) {
        // Integer list multiply each number by 5
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.println("Multiplied List = " + list.stream().map(a -> a * 5).collect(Collectors.toList()));

        // Count no of i's in the String
        String s = "India is my country";
        System.out.println("Count = " + s.chars().filter(a -> ( a == 'i' || a == 'I')).count());

    }
}
