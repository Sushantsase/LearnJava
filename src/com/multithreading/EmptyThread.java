package com.multithreading;

class EmptyThreadRun extends Thread{

}
public class EmptyThread {
    public static void main(String[] args) {
        EmptyThreadRun em = new EmptyThreadRun();
        em.start();
    }
}
