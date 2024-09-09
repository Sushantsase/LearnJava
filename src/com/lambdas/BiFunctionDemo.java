package com.lambdas;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionDemo {
    public static int add(int a, int b){
        return a+b;
    }

    public static int subtract(int a, int b){
        return a-b;
    }

   // public static BiFunction<Integer,Integer,Integer> addFunction = Integer::sum;

    public static BiFunction<Integer,Integer,Integer> addFunction = (a, b) -> (a+b);

    public static BiFunction<Integer,Integer,Integer> SubFunction = (a, b) -> (a-b);
    public static void main(String[] args) {
        System.out.println(add(10,8));
        System.out.println(subtract(10,8));

        System.out.println(addFunction.apply(10,20));
        System.out.println(SubFunction.apply(10,20));
        Function<Integer,Integer> abcc = x -> x*10;
        System.out.println(addFunction.andThen(abcc).apply(5,3));  // Chaining


    }
}
