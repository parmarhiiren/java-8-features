package com.example.predefined;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author HParmar
 */
public class ConsumerDemo { // implements Consumer<Integer> {


    public static void main(String[] args) {

        // Below is the Traditional way to do
        // Implement the Consumer interface and call the accept method
        // new ConsumerDemo().accept(6);

        // Since the return type is Consumer interface, Java knows the lamda expression is of
        // accept method that needs implementation
        // accept method does not return anything ( void is the return type )
        Consumer<Integer> consumer = (i) -> System.out.println(" Value Passed = " + i);
        consumer.accept(4);

        // Example of forEach takes Consumer as input, we can pass the implementation directly
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.stream().forEach((i) -> System.out.println(" Print Value = " + i));




    }

//    @Override
//    public void accept(Integer integer) {
//        System.out.println(" Value passed = " + integer);
//    }

}
