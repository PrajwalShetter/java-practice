package com.xworkz.devcollections.Arraylist.studentManagement.runner;

import com.xworkz.devcollections.Arraylist.studentManagement.Dto.StudentDto;

import java.util.ArrayList;
import java.util.stream.Collectors;

import static jdk.nashorn.internal.objects.NativeArray.forEach;

public class StudentRunner {

    public static void main(String[] args) {

        StudentDto s1 = new StudentDto(1, "ravi", 88.08);
        StudentDto s2 = new StudentDto(2, "manoj", 90.4);
        StudentDto s3 = new StudentDto(3, "nithya", 72.89);
        StudentDto s4 = new StudentDto(4, "ganga", 75.00);
        StudentDto s5 = new StudentDto(5, "kiran", 80.08);


        ArrayList<StudentDto> students = new ArrayList<>();

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);


        for (StudentDto std : students) {
            System.out.println(std);
        }
        System.out.println("======================");
        for (StudentDto std : students) {
            if (std.getPercentage() > 75) {
                System.out.println(std);
            }
        }


        System.out.println("using stream");

        System.out.println("display all the students who having greater than 75");
        students.stream().
                filter(greater -> greater.getPercentage() > 75).
                forEach(std -> System.out.println(std));

        System.out.println("\n");
        System.out.println("display only the students names");
        students.stream()
                .forEach(std -> System.out.println(std.getName()));

        System.out.println("\n");
        System.out.println("count the number of total number of students");
        System.out.println(students.stream().count());


        System.out.println("Find the students with highest percentage");
        System.out.println(students.stream().sorted((o1, o2) -> (int) (o2.getPercentage() - o1.getPercentage())).findFirst());

        System.out.println("\n");
        System.out.println("Find the student with lowest percentage");
        System.out.println(students.stream().sorted((o1, o2) -> (int) (o1.getPercentage() - o2.getPercentage())).findFirst());


        System.out.println("\n");
        System.out.println("calculate the avg percentage :");
        double avg = students.stream()
                .collect(Collectors.averagingDouble(StudentDto::getPercentage));
        System.out.println(avg);


        System.out.println("\n");
        System.out.println("Sort the students by percentage in ascending order");
        students.stream().
                sorted((o1, o2) -> (int) (o1.getPercentage() - o2.getPercentage()))
                .forEach(std -> System.out.println(std));


        System.out.println("\n");
        System.out.println("Sort the students by name in alphabetical order");
        students.stream().map(StudentDto::getName).
               sorted().forEach(std-> System.out.println(std));

        System.out.println("\n");
        System.out.println("Collect the names of all students into a List<String>.");
        students.stream().map(StudentDto::getName).collect(Collectors.toList()).forEach(std-> System.out.println(std));


        System.out.println("\n");
        System.out.println("Check whether any student has scored more than 90%.");
        students.stream()
                .filter(std->std.getPercentage()>90).forEach(std-> System.out.println(std));

        System.out.println("\n");
        System.out.println("Check whether all students have scored above 35%.");
        students.stream()
                .filter(std->std.getPercentage()<35).forEach(std-> System.out.println(std));

        System.out.println("\n");
        System.out.println("Display the first student after sorting by percentage.");
        System.out.println(students.stream().
                sorted((o1, o2) ->( int)(o2.getPercentage()- o1.getPercentage())).findFirst());



    }
}



