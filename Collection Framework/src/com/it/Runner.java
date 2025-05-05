package com.it;

import java.util.ArrayList;
//This is Another way to Store Object
public class Runner {
    public static void main(String[] args) {
        Software e = new Employee(12,"Dinga",45);
        Software d = new Developer(14,"Ayush",12);
        Software t = new Tester(34,"asd",45);
        ArrayList<Software> lst = new ArrayList<>();
        lst.add(e);
        lst.add(d);
        lst.add(t);

        //without instanceof operator
        Employee e1 = (Employee) e;
        System.out.println(e1.age+e1.name+e1.id);
        e1.emp();

        Tester t1 = (Tester) t;
        System.out.println(t1.age+t1.name+t1.id);
        t1.test();

        Developer d1 = (Developer) d;
        System.out.println(d1.age+d1.name+d1.id);
        d1.dev();


    }
}
