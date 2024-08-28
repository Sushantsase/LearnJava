package com.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LLChallange {
    public static void main(String[] args) {
       // List<String> nineth = new LinkedList<String>(Arrays.asList("Ram", "Rohan", "Vipul", "John", "Ron"));
        List<String> tenth = new LinkedList<>(Arrays.asList("Ram", "Vishal", "Vip", "John", "ROn"));

        List<String> nineth = new LinkedList<>(Arrays.asList("Ram", "Rohan", "Vipul", "John", "Ron"));

        List<String> finalStud = finalStudent(nineth,tenth);
        System.out.println(finalStud);
    }

    private static List<String> finalStudent(List<String> a, List<String> b) {
        List<String> list = a;
        //System.out.println(list);
        for(String commonStudent: b){
            if(!a.contains(commonStudent)){
           //     System.out.println(commonStudent);
                list.add(commonStudent);
            }
        }
        return list;
    }
}
