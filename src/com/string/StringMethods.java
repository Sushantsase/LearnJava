package com.string;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
//        int[] a ={1,2,3,4,5};
//        System.out.println(a.length);

        String s = "Hello Worlds !";
        System.out.println(s.length());
//        System.out.println(s);
        String str=s.trim();
        System.out.println(str.length());
//        System.out.println(str);

        System.out.println(s.charAt(1));

        System.out.println(s.substring(5));
        System.out.println(s.substring(5,7));

        System.out.println(s.indexOf('p'));
        System.out.println(s.indexOf('W'));

        System.out.println(s.replace('W', 'Z'));
        System.out.println(s);

        System.out.println(s.startsWith("hello"));
        System.out.println(s.startsWith("Hello"));

        System.out.println(s.endsWith("!"));

        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(Arrays.toString(s.toCharArray()));


         String[] se = s.split("");
        System.out.println(Arrays.toString(se));
    }
}
