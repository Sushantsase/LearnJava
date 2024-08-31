package com.multithreading;

class Thread5 extends Thread {
    public void run() {
        for (int i = 0; i < 7; i++) {
            System.out.println("Hello From run()");
        }
    }
}

class ThreadClassSleep extends Thread {
    public void run() {

        try {
            for (int i = 0; i < 7; i++) {
                System.out.println("Hello From run()");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

public class ThreadClassSleepInterrupt {
    public static void main(String[] args) {
//        Thread5 th5 = new Thread5();
//        th5.start();
//        th5.interrupt();

        ThreadClassSleep th = new ThreadClassSleep();
        th.start();
        th.interrupt();
    }
}
