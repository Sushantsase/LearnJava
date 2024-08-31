package com.multithreading;

 class Thread11 extends Thread{
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("From Runb()");
        }
    }
}
public class StartVsRun {
    public static void main(String[] args) {
        Thread11 t1 = new Thread11();
        Thread11 t2 = new Thread11();

        t1.start();
        t2.start();
        for(int i=0;i<5;i++){
            System.out.println("From Main");
        }

    }
}
