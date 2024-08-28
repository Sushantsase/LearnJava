package com.Set;
// Common elements in hashset without contains

import java.util.HashSet;
import java.util.List;

public class CommonInHashSet {
    public static void main(String[] args) {
        HashSet<String> h1 = new HashSet<>();
        h1.addAll(List.of(new String[]{"Ram","Rack","Dhoni","Modi","Sonia","Sushant"}));
        System.out.println(h1);

        HashSet<String> h2 = new HashSet<String>(List.of(new String[]{"Ram","Sushant","Rack","Dhoni","Rohan","Rahul"}));
        System.out.println(h2);

        HashSet<String> h3 = new HashSet<String>(List.of(new String[]{"Sonia","Sushant","Dhoni","Rohan","Rahul","Vipul"}));
        System.out.println(h3);
//        h3.retainAll(h1);
//        h1.retainAll(h2);
//        h2.retainAll(h3);
//        h3.retainAll(h1);
//        System.out.println(h1);
//        System.out.println(h2);
//        System.out.println(h3);

        h3.retainAll(h2);
        h3.retainAll(h1);
        System.out.println(h3);
    }
}
