package com.kovanLabs.intern.concurrency;
import java.util.concurrent.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeoutException;

public class Future {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Integer> task = () -> {
            System.out.println("Calculation started...");
            Thread.sleep(3000);
            return 10 + 20;
        };

        java.util.concurrent.Future<Integer> future = executor.submit(task);


        System.out.println("Main thread is doing other work...");
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Main working... " + i);
                Thread.sleep(500);
            }


            Integer result = future.get(2, TimeUnit.SECONDS);
            System.out.println("Result: " + result);

        } catch (TimeoutException e) {
            System.out.println("Task is taking too long! Timeout occurred.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }
}
