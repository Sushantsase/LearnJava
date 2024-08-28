package com.LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//Countries start from P remove and number of countries start form I
public class LinkedHashSetExample {

    public static void main(String[] args) {
        Set<String> countries = new LinkedHashSet<>(List.of(new String[]{"China", "India", "PK", "US", "Peru", "PKKDD", "Indonesia"}));
        System.out.println(countries);

        Set<String> temp = new LinkedHashSet<String>();
        for (String s : countries) {
            if (!(s.equals("PK") || s.equals("Peru") || s.equals("PKKDD"))) {
                temp.add(s);

            }
        }
        System.out.println(temp);

        int count =0;

        for(String a : countries){
            if(a.charAt(0)=='I'){
                count ++;

            }


        }
        System.out.println(count);

    }
}


