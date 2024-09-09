package com.lambdas;

import java.util.ArrayList;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Abc","xyc","sdfsdf"));
        //System.out.println(names);
         //using lambdas
       // names.forEach(n -> System.out.println(n));
        names.forEach(System.out::println);

        names.forEach(n-> System.out.println(n.toUpperCase()));


    }
}
