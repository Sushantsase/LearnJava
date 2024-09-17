package com.string;

public class ImmutableExample {
    public static void main(String[] args) {
//        String a = new String("hello");
//        System.out.println(a);
//        String b= a.concat("child");
//        System.out.println(a);
//        System.out.println(b);
//
//        String m1 = "Bad news";
//        String m2 = "Bad news";
//        System.out.println(m1==m2);
//        System.out.println(m1.equals(m2));
//
        String a1= "Hello";
        String a2= "World";
        String a3 = a1+a2;
        String a4= "HelloWorld";
        System.out.println(a3==a4);
        System.out.println(a3.equals(a4));
    }
}
