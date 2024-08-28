package com.ChallengeArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ChallengeMain {
    public static void main(String[] args) {
        ArrayList<String> maths = new ArrayList<String>();
        ArrayList<String> science = new ArrayList<String>();

//        maths.add("Ram");
//        maths.add("Tom ");
//        maths.add("Ravi");
//        maths.add("Tanvi");
//        maths.add("Vikas");

        //or
        maths.addAll(Arrays.asList(new String[]{"Ram", "Tom", "Ravi", "Tanvi", "Vikas"}));
//        for (String a : maths) {
//            System.out.println("Students who like Maths: " + a);
//        }

        science.add("john");
        science.add("Ravi");
        science.add("Abhi");
        science.add("Vikas");
        science.add("Faisal");
//        for (String c : science) {
//            System.out.println("Science " + c);
//        }

        System.out.println(maths.size());

        for (int i = 0; i < maths.size(); i++) {
            for (int j = 0; j < science.size(); j++) {
                if (maths.get(i) == science.get(j)) {  // or if(Objects.equals(maths.get(i), science.get(j)))
                    System.out.println(science.get(j));
                }
            }

        }
    }
}
