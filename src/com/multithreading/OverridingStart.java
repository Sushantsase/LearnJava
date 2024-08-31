package com.multithreading;

class ThreadOverrideStart extends Thread{
//    @Override
//    public void start() {
//        System.out.println("Noraml Start");
//    }

    @Override
    public void run() {
        System.out.println("Noraml Run");
    }
}
public class OverridingStart {
    public static void main(String[] args) {
        ThreadOverrideStart ov = new ThreadOverrideStart();
        ov.start();
    }
}
