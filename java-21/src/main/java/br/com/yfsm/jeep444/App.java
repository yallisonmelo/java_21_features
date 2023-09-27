package br.com.yfsm.jeep444;

import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class App {
    //This is sample code using virtual thread, it is not recommended to use it in production
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            IntStream.range(0, 100).forEach(i -> {
               var process = new Process().process(i);
               executor.submit(process);
            });
        }
        System.out.println("Time taken: " + (System.currentTimeMillis() - start) + "ms");
    }
}
