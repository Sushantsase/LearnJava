package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingelThreadPoolExample {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for(int i=0;i<10;i++){
            executorService.execute(new Task());

        }

    }
}
