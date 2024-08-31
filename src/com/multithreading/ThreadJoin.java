package com.multithreading;

class Thread40 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 7; i++) {
            System.out.println("Hello From run()");
            try {

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}
public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        Thread40 tr4 = new Thread40();
        tr4.start();
        tr4.join();
        for (int i = 0; i < 7; i++) {
            System.out.println("Hello From Main");
        }
    }
}
