package sorting.student;

import java.util.ArrayList;
import java.util.List;

public class Solution4 {

    public static List<Student> sortByRollNo(List<Student> students){
        return students.stream()
                .sorted((s1,s2) -> Integer.compare(s1.rollNo,s2.rollNo))
                .toList();
    }

    public static List<Student> sortByNames(List<Student> students){
        return students.stream()
                .sorted((s1,s2) -> s1.sName.compareTo(s2.sName))
                .toList();
    }

    public static List<Student> sortByMarks(List<Student> students){
        return students.stream()
                .sorted((s1,s2) -> Double.compare(s1.marks,s2.marks))
                .toList();
    }
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1,34.7,"Ayush"));
        students.add(new Student(2,56.1,"Suresh"));
        students.add(new Student(8,34.5,"Mahesh"));
        students.add(new Student(9,79.2,"Praksh"));
        students.add(new Student(3,93.9,"Hairendra"));
        students.add(new Student(5,23.0,"Raju"));

        System.out.println("Before Sorting ");
        students.stream().forEach(System.out::println);

        System.out.println("\n Sorted Based on Roll No : ");
        sortByRollNo(students).stream().forEach(System.out::println);

        System.out.println("\n Sorted Based on Names : ");
        sortByNames(students).stream().forEach(System.out::println);

        System.out.println("\n Sorted Based on Marks : ");
        sortByMarks(students).stream().forEach(System.out::println);

    }
}
