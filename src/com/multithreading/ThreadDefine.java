package com.multithreading;


class Thread1 extends Thread{

    @Override
    public void run(){
for (int i=0; i<5;i++){
    System.out.println("Hello From Run()");

}

    }

//    @Override
//    public void start() {
//        super.start();
//    }
}
public class ThreadDefine {
    public static void main(String[] args) {
        Thread1 t = new Thread1();
        t.start();
        for(int i=0;i<5;i++){
            System.out.println("From Main");
        }
    }
}
