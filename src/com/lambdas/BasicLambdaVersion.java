package com.lambdas;

interface show {
    boolean sayHi();
}

interface Operation {
    int add(int a, int b);

}

public class BasicLambdaVersion {

//    public void show() {
//        System.out.println("Hello");
//    }

    public static void main(String[] args) {
//        show abc = new show() {
//            @Override
//            public boolean sayHi() {
//                System.out.println("Say bHi");
//                return false;
//            }
//        };
//        System.out.println(abc.sayHi());
//
//
//        show abcd = () -> {
//            {
//                System.out.println("Say bHi");
//            }
//        };
//
//        or
//
//        show abcds = () ->
//                System.out.println("Say bHi");

        Operation op = new Operation() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };
        System.out.println(op.add(15, 45));

        Operation op1 = (int a, int b) -> {
            return a + b;
        };

        Operation op2 = (int a, int b) -> (a+b);

        Operation op3 = (a,b) -> (a+b);
        System.out.println(op3.add(15, 45));


    }
}
