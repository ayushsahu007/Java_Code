package org;

import com.Person;

public class PersonMainClass {
    public static void main(String[] args) {
        System.out.println("Name : "+ Person.name);
        System.out.println("Age : "+Person.age);
        Person p = new Person();
        p.walk();
    }
}
