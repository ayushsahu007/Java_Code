package com.it;

public class Developer extends Software {
    void dev(){
        System.out.println("This is Devloper");
    }
    public Developer(int id,String name ,int age) {
        this.id = id;
        this.name =name;
        this.age = age;
    }

}
