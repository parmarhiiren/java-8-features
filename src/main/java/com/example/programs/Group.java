package com.example.programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Group {

    public static void main(String[] args) {
        String[] strArr = new String[] {"X:-1","Y:1","X:-4","B:3","X:5"};
        groupTotal(strArr);
    }

    private static void groupTotal(String[] strArr) {
        Map<String, Integer> mapOfNumbers = new HashMap<>();

        Arrays.stream(strArr).forEach((values) -> {
            String[] split = values.split(":"); // Split based on colon
            String key = split[0];
            int value = Integer.parseInt(split[1]);
            // Add the values; if the map contains the values get the value and add the new value
            mapOfNumbers.put(key, mapOfNumbers.containsKey(key) ? mapOfNumbers.get(key).intValue() + value : value);
        });

        // Filter values that not zero
        Map<String, Integer> collect = mapOfNumbers.entrySet().stream()
                .filter(e -> e.getValue().intValue() != 0)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(collect);
    }
}
