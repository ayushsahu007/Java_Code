package comparator.shishira;

import java.util.*;

public class SortDemo {
    public static void main(String[] args) {
        Student s1 = new Student(1,89.0,"Naruto");
        Student s2 = new Student(30,95.8,"Sasuke");
        Student s3 = new Student(90,70.0,"Kiba");
        Student s4 = new Student(49,85.0,"Neji");
        Student s5 = new Student(83,91.5,"Sakura");
        //  Student s6 = new Student(64,96.9,"Shikamaru");

        List<Student> lst = new Stack<>();
        lst.add(s1); lst.add(s2);lst.add(s3);lst.add(s4);
        lst.add(s5); //lst.add(s6);

//        for (Student student : lst){
//            System.out.println(student);
//        }
        for(int i = 0;i<lst.size();i++){
            Student s = lst.get(i);
            System.out.println(s);
        }
        System.out.println("---------------------------------");

         Comparator ctr1 = new StudentNameComparator();
        System.out.println("Comapare Name Based");
        Collections.sort(lst,ctr1);
        for (Student student : lst){
            System.out.println(student);
        }

        System.out.println("---------------------------------");
        System.out.println("Compare Id Based");
        Comparator<Student> ctr2 = new StudentIdComparator() ;
        Collections.sort(lst,ctr2);
        for (Student student : lst){
            System.out.println(student);
        }
        System.out.println("------------------------------------");
        Comparator<Student>ctr3 = new StudentPercComparator();
        System.out.println("Comapre Percentage Based");
        Collections.sort(lst,ctr3);
        for (Student student : lst){
            System.out.println(student);
        }
    }
}
