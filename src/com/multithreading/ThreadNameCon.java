package com.multithreading;

public class ThreadNameCon {
    public static void main(String[] args) {
        Thread tr = new Thread(new Task());
        Thread tr1 = new Thread(new Task());
      //  tr.start();
        tr1.setName("Hello");
        System.out.println(tr.getName());
        System.out.println(tr1.getName());
    }
}
