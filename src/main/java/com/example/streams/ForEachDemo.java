package com.example.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hiiren");
        list.add("Rajesh");
        list.add("Sai");
        list.add("Ravi");
        list.add("Manish");

        System.out.println("-------------Traditional-------------");
        for(String s : list) {
            System.out.println(s);
        }

        System.out.println("-------------Stream API Way-------------");
        list.stream().forEach(s -> System.out.println(s));

        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Hiiren");
        map.put(2,"Rajesh");
        map.put(3,"Sai");
        map.put(4,"Ravi");
        map.put(5,"Manish");
        // forEach method internally calls "accept" method of the Consumer interface
        System.out.println("-------------Map Stream API Way 1-------------");
        map.forEach((key,value) -> System.out.println( key + ":" + value));
        System.out.println("-------------Map Stream API Way 2-------------");
        map.entrySet().stream().forEach(mapObj -> System.out.println(mapObj));

        // Filter method : used for Conditional check
        System.out.println("-------------Traditional Filter -------------");
        for(String s : list) {
            if(s.startsWith("R")) {
                System.out.println(s);
            }
        }
        System.out.println("-------------Stream API Way Filter-------------");
        list.stream().filter(name -> name.startsWith("R")).forEach(s -> System.out.println(s));

        System.out.println("-------------Filter Map Stream API Way-------------");
        // Filter Keys that are even
        map.entrySet().stream().filter(key -> key.getKey() % 2 == 0).forEach(mapObj -> System.out.println(mapObj));
    }

}
