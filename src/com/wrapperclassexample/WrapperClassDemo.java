package com.wrapperclassexample;

import java.util.ArrayList;

public class WrapperClassDemo {
    public static void main(String[] args) {
        int a = 5;

        //Integer integerWrapper = new Integer(a);  with old version of java
        Integer factoryInt = Integer.valueOf(a);

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(5);
        System.out.println(arrayList);

        int parseInt = Integer.parseInt("123");
        System.out.println(parseInt);

        Integer mynull = null;
        if(mynull == null){
            System.out.println("This is null");
        }
    }
}
