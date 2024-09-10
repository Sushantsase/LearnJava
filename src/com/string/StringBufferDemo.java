package com.string;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("hello");
        System.out.println(str);
        str.append("world");
        System.out.println(str);

        String a = new String("hello");
        System.out.println(a);
       String b= a.concat("child");
        System.out.println(a);
        System.out.println(b);
    }
}
