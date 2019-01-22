package org.javacream.training.scratch;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MultiThreadingDemo {

    public static void main(String[] args) {
	ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
	executor.scheduleAtFixedRate(() -> System.out.println(new Date()), 0, 1, TimeUnit.SECONDS);
	
    
    }

}
