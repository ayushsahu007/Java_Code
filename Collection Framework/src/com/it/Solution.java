package com.it;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
       Employee e = new Employee(1,"Tom",20);
       Tester t = new Tester(2,"Jerryr",25);
       Developer d = new Developer(3,"Naruto",35);
        ArrayList<Software> lst = new ArrayList<>();
        lst.add(e);
        lst.add(t);
        lst.add(d);
        for (int i = 0;i<lst.size();i++){
            Software s = lst.get(i);
            if (s instanceof  Employee){
                Employee e1 = (Employee) s;
                System.out.println(e1.age+e1.id+e1.name);
                e1.emp();
            }
            else if(s instanceof Tester){
                Tester t1 = (Tester) s;
                System.out.println(t1.age+t1.id+t1.name);
                t1.test();
            }
            else if (s instanceof Developer){
                Developer d1 = (Developer)s;
                System.out.println(d1.age+d1.name+d1.id);
                d1.dev();
            }
        }
    }
}
