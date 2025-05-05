package list;

import java.util.ArrayList;

public class Testt {
    public static void main(String[] args) {
        Student s1 = new Student(20,"tom");
        Student s2 = new Student(21,"jerry");
        Student s3 = new Student(22,"cat");

        ArrayList<Student> l = new ArrayList();
        l.add(s1);
        l.add(s2);
        l.add(s3);

        for(Student obj : l){
            System.out.println(obj);
          System.out.println("Name :"+obj.name+"Age :"+obj.age);

        }
    }
}
