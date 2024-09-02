package com.wrapperclassexample;

import java.util.Objects;

public class WrapperCompare {
    public static void main(String[] args) {
        Integer a = Integer.valueOf(1000);
        Integer b = Integer.valueOf(1000);

        System.out.println(a == b);  // Caching Range is very importasnt (-128 to 127 it will print true )

        System.out.println(a.equals(b));

        Integer a1 = 100;
        Integer b1 = null;
        if (b1 != null && a1.equals(b1)) {
            System.out.println("Equals");
        } else {
            System.out.println("Not Equals");
        }

        Integer m = 15;
        Integer n = null;
        System.out.println(Objects.equals(m,n));
    }
}
