package com.collection;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> ele = new ArrayList<String>();
        ele.add("A");
        ele.add("B");
        ele.add("C");
        ele.add(2, "D");
        System.out.println(ele.remove("A"));
        for (String a : ele) {
            System.out.println(a);
        }
        int x = ele.indexOf("A");
        System.out.println("Index: "+x);

        ele.clear();
        if(ele.isEmpty()){
            System.out.println("Array List is empty");
        }

    }
}
