package com.multithreading;

public class Task implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 7; i++) {
            System.out.println("Hello From run()");
        }
    }


}
