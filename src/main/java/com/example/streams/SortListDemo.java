package com.example.streams;

import com.example.database.Database;
import com.example.database.Employee;

import java.util.*;

public class SortListDemo {

    public static void main(String[] args) {
        List<Integer> listOfIntegers = new ArrayList<>();
        listOfIntegers = (Arrays.asList(8,3,12,4));

        // Traditional Way
        System.out.println("********** Traditional Way : Primitive data types ********** ");
        Collections.sort(listOfIntegers); // Ascending
        System.out.println(" Ascending Order = " + listOfIntegers);
        Collections.reverse(listOfIntegers); // Descending
        System.out.println(" Descending Order = " + listOfIntegers);

        System.out.println("********** Stream Way : Primitive data types********** ");
        System.out.println("Ascending Order = ");
        listOfIntegers.stream().sorted().forEach(i -> System.out.println(i));
        System.out.println("Descending Order = ");
        listOfIntegers.stream().sorted(Comparator.reverseOrder()).forEach(i -> System.out.println(i));

        System.out.println("********** Traditional Way : Employee object ********** ");
        List<Employee> listOfEmployees = Database.getEmployees();
        Collections.sort(listOfEmployees, new EmployeeComparator());
        System.out.println("Traditional : Ascending order : salary field = " + listOfEmployees);
        System.out.println("********** Lamda Way : Employee object ********** ");
        Collections.sort(listOfEmployees, (employee1, employee2) -> (int) (employee1.getSalary() - employee2.getSalary()));
        System.out.println("Lambda : Ascending order : salary field = " + listOfEmployees);
        System.out.println("********** Stream Way : Employee object ********** ");
        listOfEmployees.stream().sorted((employee1, employee2) -> (int) (employee1.getSalary() - employee2.getSalary()));
        System.out.println("Stream : Ascending order : salary field = " + listOfEmployees);
        listOfEmployees.stream().sorted((employee1, employee2) -> (int) (employee1.getSalary() - employee2.getSalary())).forEach(System.out::println);
        System.out.println("Stream : Ascending order : salary field : Method Reference = ");
        listOfEmployees.stream().sorted(Comparator.comparing(employee -> employee.getSalary())).forEach(System.out::println);
        System.out.println("Stream : Ascending order : name field : Method Reference = ");
        listOfEmployees.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);

    }
}

class EmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o1.getSalary() - o2.getSalary());
    }
}
