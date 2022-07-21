package com.example.programs;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class OddEvenPrinterUsingJava8 {

    private static Object object = new Object();

    // Even Predicate
    private static IntPredicate evenPredicate = e -> e % 2 == 0;

    // Odd Predicate
    private static IntPredicate oddPredicate = e -> e % 2 != 0;


    public static void main(String[] args) throws InterruptedException {

        // Create 2 Threads
        CompletableFuture.runAsync(() -> OddEvenPrinterUsingJava8.printNumbers(oddPredicate));
        CompletableFuture.runAsync(() -> OddEvenPrinterUsingJava8.printNumbers(evenPredicate));
        Thread.sleep(1000);

    }
    // Print
    public static void printNumbers(IntPredicate evenOddCondition) {
        IntStream.rangeClosed(1, 10).filter(evenOddCondition).forEach(OddEvenPrinterUsingJava8::execute);
    }

    // Execute method
    private static void execute(int number) {
        synchronized (object) {
            try {
                System.out.println(Thread.currentThread().getName() + " : " + number);
                object.notify();
                object.wait();
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
    }
}
