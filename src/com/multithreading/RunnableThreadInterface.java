package com.multithreading;

class RunnableThread implements Runnable {
    @Override
    public void run() {
        System.out.println("From Run");
    }
}

public class RunnableThreadInterface {
    public static void main(String[] args) {
        RunnableThread rt = new RunnableThread();// Instance of the Thread
        Thread t = new Thread(rt); //Creating THread object using thread class

        t.start();
    }
}
