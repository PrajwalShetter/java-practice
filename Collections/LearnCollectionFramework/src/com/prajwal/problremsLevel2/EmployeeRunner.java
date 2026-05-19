package com.prajwal.problremsLevel2;

import java.util.ArrayList;

public class EmployeeRunner {

    public static void main(String[] args) {

        ArrayList<Employee> employee = new ArrayList<>();

        employee.add(new Employee(101, "gagan", 30000));
        employee.add(new Employee(102,"bhuvana",10000));
        employee.add(new Employee(103, "hanumesh", 20000));
        employee.add(new Employee(104,"karthik", 900000));
        employee.add(new Employee(105, "jakki", 200000));

        for (Employee emp: employee){
           if(emp.salary >30000){
               System.out.println(emp.salary +" "+emp.id);
           }
        }


    }

}
