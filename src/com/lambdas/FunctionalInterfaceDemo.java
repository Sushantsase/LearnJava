package com.lambdas;

//class Test implements Runnable{
//
//    @Override
//    public void run() {
//    System.out.println("demo");
//}
//
//}


@FunctionalInterface
interface playable{
    void play();

}



public class FunctionalInterfaceDemo {
    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Demo");
            }
        });
    }
}
