package mock.student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student(120, "sdf");
        Student s2 = new Student(123, "uytre");
        HashMap<Integer, Student> m = new HashMap<>();

        //add object to the map
        m.put(1, s1);
        m.put(2, s2);
        m.put(101, new Student(101, "tom"));
        m.put(102, new Student(102, "wer"));
        Set<Map.Entry<Integer, Student>> set = m.entrySet();
        for (Map.Entry<Integer, Student> entry : set) {
            System.out.println(entry);
        }
    }
}