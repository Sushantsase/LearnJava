package com.ChallengeArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class quizz {
    public static void main(String[] args) {
        ArrayList<Integer> abc = new ArrayList<Integer>();
//        abc.add(3);
//        abc.add(2);
//        abc.add(1);

       abc.addAll(Arrays.asList(3,2,1));
        for(Integer a:abc){
            System.out.println(a);
        }
        abc.add(6);

        for(Integer a:abc){
            System.out.println(a);
        }
    }
}
