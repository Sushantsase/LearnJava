package com.TreeSet;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

// Admission in School, store list of student in Sorted Order of their names
public class TreeSetExample {
    public static void main(String[] args) {

        List<String> studentList = new ArrayList<>();
        studentList.add("Vipul");
        studentList.add("Vishal");studentList.add("Sushant");studentList.add("Anup");studentList.add("Rohan");studentList.add("Sarthak");
        System.out.println(studentList);

        TreeSet<String> sortStudent = new TreeSet<String>();
//        for(String s: studentList){
//            sortStudent.add(s);
//        }

sortStudent.addAll(studentList);
       // TreeSet<String> sortStudent = new TreeSet<String>(studentList);
        System.out.println(sortStudent);
        TreeSet<Integer> tree1 = new TreeSet<Integer>();
        TreeSet<Integer> tree2 = new TreeSet<Integer>();
        for (int i = 10; i < 25; i++) {
            if (i % 7 == 0) tree1.add(i);
        }
        tree2 = (TreeSet) tree1.clone();
        tree1.add(176);
        System.out.println(tree1 + " " + tree2);


    }
}
