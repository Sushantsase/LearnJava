package com.wrapperclassexample;

public class ImmutableWrapper {
    public static void main(String[] args) {
        Integer a =100;
        Integer b =a;

        System.out.println(a==b);

        a = a+1;
        System.out.println( "a is "+a);
        System.out.println(a==b);

        System.out.println(b);

    }
}
