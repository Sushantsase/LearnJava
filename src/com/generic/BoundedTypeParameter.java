package com.generic;

import java.util.ArrayList;
import java.util.List;

public class BoundedTypeParameter {
    public static double sumInteger(List<Integer> abc) {
        double sum=0.0;
        for(Integer add:abc){

            sum+=add;
        }
      //  System.out.println(sum);
        return sum;
    }

    public static double sumDouble(List<Double> abc) {
        double sum=0.0;
            for(Double add:abc){

            sum+=add;
        }
        //  System.out.println(sum);
        return sum;
    }

    public static <T extends Number> double sumNumber(List<T> abc) {
        double sum=0.0;
        for(T add:abc){

            sum+=add.doubleValue();
        }
        //  System.out.println(sum);
        return sum;
    }



    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(10);
        integers.add(5);
        integers.add(50);
        System.out.println(sumInteger(integers));

        List<Double> doubles = new ArrayList<>();
        doubles.add(5.2);
        doubles.add(10.8);
        doubles.add(5.2);
        doubles.add(50.9);
        System.out.println(sumDouble(doubles));

        System.out.println(sumNumber(doubles));


    }
}
