package com.java8.completableFuture;

import java.util.Random;
import java.util.concurrent.*;

public class ComletableFuture {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Future<Integer> future = executorService.submit(new Task());
        try {
            Integer result = future.get();
            System.out.println(result);

        } catch (InterruptedException | ExecutionException e) {
            System.out.println("Error occured");
        }

    }
}

class Task implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        return new Random().nextInt();
    }

}
