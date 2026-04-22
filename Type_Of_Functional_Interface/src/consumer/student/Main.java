package consumer.student;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Jhon",89));
        students.add(new Student("Jack",79));
        students.add(new Student("Rohan",49));
        students.add(new Student("Tom",56));
        students.add(new Student("Jhony",26));

        Predicate<Student> above60 = student -> student.marks >= 60;
        Function<Student,String> getGrade = student -> {
            int marks = student.marks;
            if (marks >= 90 )
                return "A+[Distinction]";
            if (marks >=75)
                return "Grade A";
            if (marks >=60)
                return "Grade B";
            if (marks >= 45)
                return "Grade C";
            else
                return "Fail";
        };

        Consumer<Student> display = s -> {
            System.out.println("Name "+ s.name);
            System.out.println("Marks "+s.marks);
            System.out.println("Grade "+getGrade.apply(s));
            System.out.println("-------------");

        };

        for (Student s : students){
            if (above60.test(s)){
                display.accept(s);
            }
        }
    }
}
