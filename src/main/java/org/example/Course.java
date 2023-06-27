package org.example;

import java.util.LinkedList;
import java.util.List;

public class Course {

    private List<Student> students;

    public Course() {
        students = new LinkedList<>();
    }

    public Course(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printStudents() {
        for (Student student : students) {
            System.out.println("Name: " + student.getName(student));
            System.out.println("Age: " + student.getAge(student));
        }
    }

}
