package com.generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericExample {
    public static void main(String[] args) {
        //Without generics

//        List number = new ArrayList();
//        number.add(5);
//        number.add(55);
//        number.add(" astring");
//        System.out.println(number);
//
//        for (Object ele : number){
//            Integer num = (Integer) ele;
//            System.out.println(num);
//        }

        // generics

        List<Integer> number = new ArrayList<>();
        number.add(5);
        number.add(55);
       // number.add(" astring");
        System.out.println(number);

        for (Object ele : number){

            System.out.println(ele);
        }
    }
}
