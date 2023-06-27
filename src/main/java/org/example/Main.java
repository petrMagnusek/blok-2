package org.example;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
/*
        // prvni cast
        Car car = new Car("skoda", "fabia", 2015);

        prnValues(car);

        car.setMake("Ford");
        car.setModel("Focus");
        car.setYear(2010);

        prnValues(car);

        // druha cast
        Rectangle rectangle = new Rectangle(12, 20);
        double area = rectangle.getArea();
        System.out.println("Obsah je: " + area);
*/


        List<Student> students = new LinkedList<Student>();
        students.add(new Student("Karel", 22));
        students.add(new Student("Petr", 45));
        Course course = new Course(students);
        course.printStudents();
    }

    private static void prnValues(Car car) {
        System.out.println("maker is: " + car.getMake() + "\nmodel is: " + car.getModel() + "\nyear is:  " + + car.getYear());
    }


}