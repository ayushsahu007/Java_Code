package com;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class HeteroCollectionDemo {
    public static void main(String[] args) {
        Tree t = new Tree();
        Employee e = new Employee();
        Pen p = new Pen();

        //heterogeneous
        List<Object> lst = new LinkedList<Object>();
        lst.add(t);
        lst.add(e);
        lst.add(p);

//        for(Object o : lst){
//            System.out.println(o);
//        }

        for (int i =0;i<lst.size();i++){
            Object obj = lst.get(i);
            if (obj instanceof  Tree){
                Tree tr = (Tree) obj;
                tr.grow();
                System.out.println(tr.type+" "+tr.height);
            }else if (obj instanceof Employee){
                Employee emp = (Employee) obj;
                emp.work();
                System.out.println(emp.dept+" "+emp.salary);
            }else if (obj instanceof Pen){
                Pen pen = (Pen)obj;
                pen.write();
                System.out.println(pen.price);
            }
        }
    }
}
