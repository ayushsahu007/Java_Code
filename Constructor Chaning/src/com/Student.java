package com;

public class Student {
    Student(int age){
        System.out.println("Age: "+age);
    }
    Student(String name){
        this(22);
        System.out.println("Name: "+name);
    }
    Student(double height){
        this("Tom");
        System.out.println("Height: "+height);
    }

    public static void main(String[] args) {
        new Student(5.7);
    }
}
