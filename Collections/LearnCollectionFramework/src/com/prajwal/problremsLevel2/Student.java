package com.prajwal.problremsLevel2;

public class Student {

    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age){
        this.id=id;
        this.name= name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
