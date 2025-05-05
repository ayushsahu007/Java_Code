package com.it;

public class Employee extends Software{

    void emp(){
        System.out.println("This is Employee");
    }

    public Employee(int id,String name ,int age) {
        this.id = id;
        this.name =name;
        this.age = age;
    }
}
