package com.ArrayListStudentExample;

import java.util.ArrayList;

public class School {
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList<Student>();
        Student s1 = new Student("Ram",1);
        studentArrayList.add(s1);

        Student s12 = new Student("Raja12",12);
        studentArrayList.add(s12);
        Student s13 = new Student("Rohan13",13);
        studentArrayList.add(s13);
        Student s14 = new Student("Anup14",14);
        studentArrayList.add(s14);
//
//        for(Student s : studentArrayList){
//            System.out.println("name :"+ s.getName()+" RollNumber :"+s.getRollNumber());
//        }
//
        studentArrayList.remove(s12);
        studentArrayList.set(0,s12);

        for(Student s : studentArrayList){
            System.out.println("name :"+ s.getName()+" RollNumber :"+s.getRollNumber());
        }
studentArrayList.clear();
        if(studentArrayList.isEmpty()){
            System.out.println("School ShutDown");
        }
        for(Student s : studentArrayList){
            System.out.println("name :"+ s.getName()+" RollNumber :"+s.getRollNumber());
        }
    }

}
