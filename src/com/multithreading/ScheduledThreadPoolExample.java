package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExample {
    public static void main(String[] args) {
        ScheduledExecutorService exc = Executors.newScheduledThreadPool(10);
        //exc.schedule(new Task(),1, TimeUnit.SECONDS);
        exc.scheduleAtFixedRate(new Task(),3,2,TimeUnit.SECONDS);
    exc.scheduleWithFixedDelay(new Task(),3,2,TimeUnit.SECONDS);
    }
}
