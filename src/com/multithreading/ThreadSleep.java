package com.multithreading;

class Thread4 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 7; i++) {
            try {

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Hello From run()");
        }
    }
}

public class ThreadSleep {
    public static void main(String[] args) {
        Thread4 tr4 = new Thread4();
        tr4.start();
        for (int i = 0; i < 7; i++) {
            System.out.println("Hello From Main");
        }
    }
}
