package com.multithreading;

class ThreadOverload extends Thread{
    @Override
    public void run(){
        System.out.println("Normal");  // run() with
    }
    public void run(int i){
        System.out.println("Parameter");
    }
}
public class OverloadThread {
    public static void main(String[] args) {
        ThreadOverload tr = new ThreadOverload();
        tr.start();
    }
}
