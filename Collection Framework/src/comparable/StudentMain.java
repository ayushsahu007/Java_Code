package comparable;

import java.util.TreeSet;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student(22);
        Student s2 = new Student(23);
        Student s3 = new Student(24);

        TreeSet<Student> t = new TreeSet<Student>();
        t.add(s1);//calls compareTO() of Student Class
        t.add(s2);
        t.add(s3);
        for (Student s : t){
            System.out.println(s);
        }
    }
}
