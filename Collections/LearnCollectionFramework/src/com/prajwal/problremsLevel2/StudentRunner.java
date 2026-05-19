package com.prajwal.problremsLevel2;

import java.util.HashMap;
import java.util.Map;

public class StudentRunner {
    public static void main(String[] args) {

        HashMap<Integer, Student> student = new HashMap<>();

        student.put(101,new Student(101,"ravi", 12));
        student.put(102,new Student(102,"akash", 14));
        student.put(103,new Student(103,"suri", 12));
        student.put(104,new Student(104,"jaggi", 19));
        student.put(105,new Student(105,"mosoo", 15));

        System.out.println(student.isEmpty());
        for (Map.Entry<Integer, Student> e : student.entrySet()){
            System.out.println(e.getValue()+" "+e.getKey());
        }

    }
}
