package map.Stundenr1;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentMain {

    public static void main(String[] args) {
        Student s1 = new Student(1,"Raj");
        Student s2 = new Student(2,"Rahul");
        Dept d1 = new Dept(23);
        Dept d2 = new Dept(25);
        HashMap<Student,Dept> m = new HashMap<>();
        m.put(s1,d1);
        m.put(s2,d2);

        for (Student key : m.keySet()){
            System.out.println(key+" "+m.get(key));
        }

    }
}
