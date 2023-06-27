package org.example;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName(Student student) {
        return student.name;
    }

    public int getAge(Student student) {
        return student.age;
    }
}
