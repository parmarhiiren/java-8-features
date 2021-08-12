package com.example.predefined;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author HParmar
 */
public class PredicateDemo { // implements Predicate<Integer> {

    // Predicate is used for Conditional checks
//    @Override
//    public boolean test(Integer i) {
//        if(i % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }

    public static void main(String[] args) {
        // Traditional way
        // Implement interface Predicate & override test method
        // System.out.println(new PredicateDemo().test(4));

        // Lambda way
        Predicate<Integer> evenNoPredicate = (i) -> i % 2 == 0;
        System.out.println(evenNoPredicate.test(6));

        // Example with Streams
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.stream().filter(evenNoPredicate).forEach(i -> System.out.println("Even no " + i));


    }

}
