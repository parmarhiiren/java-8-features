package com.example.predefined;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo { // implements Supplier<String> {
//    @Override
//    public String get() {
//        return " Hello World";
//    }

    public static void main(String[] args) {
        // Traditional way
        // Implements interface Supplier & override get() method
        // System.out.println(new SupplierDemo().get());

        // Lamda way
        Supplier<String> supplier = () -> "Hello World";
        System.out.println(supplier.get());

        List<String> list = Arrays.asList("a", "b", "c", "d", "e");
        System.out.println(list.stream().findAny().orElseGet(supplier));
        List<String> emptyList = Arrays.asList();
        System.out.println(emptyList.stream().findAny().orElseGet(() -> "Hello emptyList"));
    }
}
