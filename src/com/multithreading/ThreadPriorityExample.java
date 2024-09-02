package com.multithreading;

class PriorityOfThread extends Thread{


}
public class ThreadPriorityExample {
    public static void main(String[] args) {
        PriorityOfThread ptr = new PriorityOfThread();
        System.out.println(ptr.getPriority());
        ptr.setPriority(10);
        System.out.println(ptr.getPriority());

    }
}
