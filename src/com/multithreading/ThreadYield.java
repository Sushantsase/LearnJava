package com.multithreading;

class Thread12 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 7; i++) {
           // Thread.yield();
            System.out.println("Hello From run()");
        }
    }

}
public class ThreadYield {
    public static void main(String[] args) {
        Thread12 t12 = new Thread12();
        t12.start();
        for (int i = 0; i < 7; i++) {
            Thread12.yield();
            System.out.println("Hello From main()");
        }
    }
}
