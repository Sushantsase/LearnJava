package com.generic;

public class GenericMethod {
//    public static int getFirst(int[] arr) {
//        if (arr.length == 0 || arr == null) {
//            return 0;
//        }
//        return arr[0];
//    }

    public static <T> T getFirst(T[] arr) {
        if (arr.length == 0 || arr == null) {
            return null;
        }
        return arr[0];
    }

    public static void main(String[] args) {
       int[] a = {1,2,3};
        Integer[] abc = new Integer[]{1,2,3};
        System.out.println(getFirst(abc));

        String[] str = {"Hello","sdf"};
        System.out.println(getFirst(str));
    }
}
