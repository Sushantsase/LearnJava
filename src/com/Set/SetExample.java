package com.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<String>(); //set is interface so we cant instatiate so we use Hashset
        //    Set<String> s1 = new HashSet<String>(List.of(new String[]{"Abc", "Pqr", "Xyz"}));
         //s1.addAll(Arrays.asList(new String[]{"Abc", "Pqr", "Xyz"}));
         s1.addAll(List.of(new String[]{"John", "ABC", "Roy"}));

         Set<String> s2 = new HashSet<String>(List.of(new String[]{"Lita","Tina","Roy"}));

        Set<String> newSet = new HashSet<>(s1);
        newSet.addAll(s2);
       System.out.println(newSet);  // union


        Set<String> newSetIntersection = new HashSet<>(s1);
        newSetIntersection.retainAll(s2);
        System.out.println(newSetIntersection); // Intersection
    }
    }

