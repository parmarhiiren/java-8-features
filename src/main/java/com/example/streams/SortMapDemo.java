package com.example.streams;

import com.example.database.Employee;

import java.util.*;

public class SortMapDemo {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("eight", 8);
        map.put("ten", 10);
        map.put("four", 4);
        map.put("two", 2);

        System.out.println("******** Map using Lamda ************");
        List<Map.Entry<String,Integer>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, (obj1,obj2) -> obj1.getKey().compareTo(obj2.getKey()));
        entries.stream().forEach(System.out::println);
        System.out.println("******** Map using Stream : comparingByKey ************");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println("******** Map using Stream : comparingByValue ************");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        Map<Employee, Integer> employeeMap = new HashMap<>();
        employeeMap.put(new Employee(123, "Hiiren", "IT", 600000),60);
        employeeMap.put(new Employee(456, "Rajesh", "Civil", 900000),90);
        employeeMap.put(new Employee(789, "Ravi", "Defence", 500000),50);
        employeeMap.put(new Employee(147, "Manish", "Chemical", 400000),40);
        employeeMap.put(new Employee(159, "Sai", "Mobile", 1200000),120);
        System.out.println("******** Map using Stream : Employee : salary field ************");
        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary))).forEach(System.out::println);
        System.out.println("******** Map using Stream : Employee : salary field : Reverse ************");
        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed())).forEach(System.out::println);


    }
}
