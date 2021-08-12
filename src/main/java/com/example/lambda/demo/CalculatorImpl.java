package com.example.lambda.demo;


interface Calculator  {
    // void switchOn();
    // void sum(int input);
    int subtract(int num1, int num2);
}
public class CalculatorImpl { // implements Calculator { // <-- This is the Traditonal method
    /*
    If you use the traditional approach then
    we need to add implements and override the method
    @Override
    public void switchOn() {
        System.out.println("Switch On");
    }
    */

    public static void main(String[] args) {
        // Lambda expression of the switchOn method
        /*
        Calculator calculator = () -> System.out.println("Switch On");
        calculator.switchOn();
        */

        // Lamda expression for one input
        /*
        Calculator calculator = (input) -> System.out.println("Sum = " + input);
        calculator.sum(123);
        */
        // Lambda expression for 2 inputs and return type.
        // You dont even need to write return statement if it is in one statement
        Calculator calculator =  (num1, num2) ->  {
            if(num2 < num1) {
                throw new RuntimeException("Number 2 needs to be greater than number 1");
            }
            return num2 - num1;
        };
        System.out.println(calculator.subtract(15,12));
    }

    // ()  -> {body}
}
