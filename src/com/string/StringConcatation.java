package com.string;

public class StringConcatation {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "Java";
        int n = 2004;

        String ans = s1 +  s2 + n;
        System.out.println(ans);

        System.out.println(s2.concat(s1));
        System.out.println(s1.concat(s2).concat(String.valueOf(n)));
    }
}
