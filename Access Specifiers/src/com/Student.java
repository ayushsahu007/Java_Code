package com;
//Accessing public members inside the same class
public class Student {
    public static int age = 23;
    public static String name = "Tom";

    public void study(){
        System.out.println("Studing !!");
    }
    public static void main(String[] args) {
        System.out.println("Age : "+Student.age);
        System.out.println("Name : "+Student.name);
        Student student = new Student();
        student.study();
    }
}
