package com.LinkedList;

import java.util.LinkedList;
import java.util.List;
/*
Queue Data structure using LL

 */
public class LLQueueExample {
    public static void main(String[] args) {
        List<Integer> q = new LinkedList<Integer>();
        q = insert(q,1);
        q = insert(q,2);q = insert(q,3);q = insert(q,4);
        System.out.println(q);

        q= remove(q);
        System.out.println(q);

        Integer asd = getFirstElement(q);
        System.out.println(asd);
    }

    private static List<Integer> insert(List<Integer> a, Integer x) {
        a.add(x);
        return a;
    }

    private static List<Integer> remove(List<Integer> a){
        a.remove(0);
        return a;
    }

    private static Integer getFirstElement(List<Integer> a){
        //return a.getFirst();
return a.get(0);
    }
}
