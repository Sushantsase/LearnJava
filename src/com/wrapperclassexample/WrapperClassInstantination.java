package com.wrapperclassexample;

public class WrapperClassInstantination {
    public static void main(String[] args){

        Integer intFactory = Integer.valueOf(15);
        System.out.println(intFactory);

        //values get cached
    Integer a = Integer.valueOf(100);
    Integer b = Integer.valueOf(100);
        System.out.println(a==b);

    }
}
