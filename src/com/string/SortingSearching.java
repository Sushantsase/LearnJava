package com.string;

import java.util.Arrays;

public class SortingSearching {
    public static void main(String[] args) {
        String[] str = {"java", "c++", "javascript", "python"};
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));


        int[] in ={1,5,9,47,3,6};
        Arrays.sort(in);
        System.out.println(Arrays.toString(in));

        Arrays.binarySearch(str,"hello");
        System.out.println(Arrays.binarySearch(str,"javascript"));
    }
}
