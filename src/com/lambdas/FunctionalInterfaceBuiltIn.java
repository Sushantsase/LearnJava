package com.lambdas;


import java.util.function.Function;

public class FunctionalInterfaceBuiltIn {
//    public static int add (int a, int b){
//        return a+b;
//    }
//
//    public static int subtract (int a, int b){
//        return a-b;
//    }

    public static int add (int a){
        return a+9;
    }

    public static int subtract (int a){
        return a-1;
    }
public static Function<Integer,Integer> addFunction = (a) -> a+3;
    public static Function<Integer,Integer> subFunction = (a) -> a-7;

    public static void main(String[] args) {
        System.out.println(add(10));
        System.out.println(subtract(10));

        System.out.println(addFunction.apply(10));
        System.out.println(subFunction.apply(10));

        System.out.println(addFunction.andThen(subFunction).apply(5));
    }
}
