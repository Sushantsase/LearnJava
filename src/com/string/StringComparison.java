package com.string;

import java.util.Arrays;

public class StringComparison {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "Hello";
//
//        int n = 2004;
//
//        System.out.println(s1.equals(s2));
//
//        System.out.println(s1.equals(s3));
//        System.out.println(s1.equalsIgnoreCase(s3));
//
//        System.out.println(s1.compareTo(s2));
//        System.out.println(s1.compareTo(s3));

        String a = new String("Hello");

        String b = new String("Hello");

        System.out.println(a==b);
        System.out.println(s1==s2);
        System.out.println(a.equals(b));
        System.out.println(a.compareTo(b));


//        String line = "John,doe,30,se";
//        String[] a = line .split(",");
//        System.out.println(Arrays.toString(a));
    }
}
