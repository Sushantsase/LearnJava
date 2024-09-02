package com.wrapperclassexample;

import java.util.ArrayList;
import java.util.List;

public class AutoboxingUnboxing {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int num = 10;
        list.add(num);
        System.out.println("Autoboxing " + list);

        Integer inteobj = Integer.valueOf(30);
        int num2 = inteobj;
        System.out.println("Unboxing " + num2);

        Integer intExp = 5;
        int sum = intExp + 5;
        System.out.println(sum);

        int value= 7;
        myMethod(value);
    }

    static void myMethod(Integer obj){
        System.out.println(obj);
    }
}
