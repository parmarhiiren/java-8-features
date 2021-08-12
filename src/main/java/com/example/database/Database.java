package com.example.database;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Database {

    public static List<Employee> getEmployees() {
        List<Employee> listOfEmployees = new ArrayList<>();
        listOfEmployees.add(new Employee(123, "Hiiren", "IT", 600000));
        listOfEmployees.add(new Employee(456, "Rajesh", "Civil", 900000));
        listOfEmployees.add(new Employee(789, "Ravi", "Defence", 500000));
        listOfEmployees.add(new Employee(147, "Manish", "Chemical", 400000));
        listOfEmployees.add(new Employee(159, "Sai", "Mobile", 1200000));
        return listOfEmployees;
    }

    public static List<User> getUsers() {
        List<User> listOfUsers = new ArrayList<>();
        listOfUsers.add(new User(123, "Hiiren", "hiiren@gmail.com", Arrays.asList("123456789","987654321")));
        listOfUsers.add(new User(456, "Rajesh", "raju@gmail.com", Arrays.asList("456789123","84958421")));
        listOfUsers.add(new User(789, "Ravi", "ravi@gmail.com", Arrays.asList("46465464654","54654654654")));
        listOfUsers.add(new User(147, "Manish", "manish@gmail.com", Arrays.asList("79746543","3134832652")));
        listOfUsers.add(new User(159, "Sai", "sai@gmail.com", Arrays.asList("51654654351","4845132131")));
        return listOfUsers;
    }
}
