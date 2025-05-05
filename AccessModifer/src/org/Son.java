package org;

import com.Father;
//If class is public then we use different packdge
//Accessing protected members in different package
//IS a Relationship
//Import
public class Son extends Father {
    public static void main(String[] args) {
        Son s = new Son();
        System.out.println(s.name);
        System.out.println(s.age);
    }
}
