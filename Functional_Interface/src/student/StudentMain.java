package student;

import java.util.Comparator;
import java.util.TreeSet;

public class StudentMain {
    public static void main(String[] args) {
        Comparator<Student> ctrName = (s1 ,s2) -> s1.name.compareTo(s2.name);

        TreeSet<Student> students = new TreeSet<>(ctrName);
        students.add(new Student("Tom",34.9,45));
        students.add(new Student("Jerry",74.9,45));
        students.add(new Student("Bean",97.9,45));
        students.add(new Student("Richie",24.9,45));
        students.add(new Student("Jack",9.9,45));

        System.out.println("Based on Name");
        for (Student student : students){
            System.out.println(student);
        }

        System.out.println("-----------------------------------");
       //  Comparator<Student> ctr = (s1,s2) -> Double.compare(s1.perc,s2.perc);

        TreeSet<Student> students1 = new TreeSet<Student>((s1,s2) -> Double.compare(s1.perc,s2.perc));
        students1.add(new Student("Tom",34.9,45));
        students1.add(new Student("Jerry",74.9,45));
        students1.add(new Student("Bean",97.9,45));
        students1.add(new Student("Richie",24.9,45));
        students1.add(new Student("Jack",9.9,45));

        System.out.println("Based on Percentage");
        for (Student student : students1){
            System.out.println(student);
        }

    }
}
