package com.string;

public class ImmutableExample {
    public static void main(String[] args) {
        String a = new String("hello");
        System.out.println(a);
        String b= a.concat("child");
        System.out.println(a);
        System.out.println(b);
    }
}
