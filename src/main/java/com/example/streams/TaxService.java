package com.example.streams;

import com.example.database.Database;
import com.example.database.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {

    public static List<Employee> evaluateTaxUsers(String taxable) {
        return ("tax".equals(taxable)) ?
            Database.getEmployees().stream().filter(employee -> employee.getSalary() > 500000).collect(Collectors.toList()) :
            Database.getEmployees().stream().filter(employee -> employee.getSalary() <= 500000).collect(Collectors.toList());

        // Using Ternary Operator

    }

    public static List<Employee> evaluateTaxUsers(boolean taxable) {
        if(taxable)
            return Database.getEmployees().stream().filter(employee -> employee.getSalary() > 500000).collect(Collectors.toList());
        else
            return Database.getEmployees().stream().filter(employee -> employee.getSalary() <= 500000).collect(Collectors.toList());

        // Using Ternary Operator

    }

    public static void main(String[] args) {
        System.out.println("***** Using if/else *********");
        System.out.println("Taxable Users = " + evaluateTaxUsers(true));
        System.out.println("Non Taxable Users = " + evaluateTaxUsers(false));
        System.out.println("***** Using Ternary Operator *********");
        System.out.println("Taxable Users = " + evaluateTaxUsers("tax"));
        System.out.println("Non Taxable Users = " + evaluateTaxUsers("nontax"));
    }
}
