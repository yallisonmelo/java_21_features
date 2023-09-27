package br.com.yfsm.jeep444;

import java.time.Duration;

public class Process {

    public Runnable process(int id) {
        return () -> {
            System.out.println("Starting process " + id);
            try {
                Thread.sleep(Duration.ofSeconds(1));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println("Finished process " + id);
        };
    }
}
