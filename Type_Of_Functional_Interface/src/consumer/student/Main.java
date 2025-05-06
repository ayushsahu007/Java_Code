package consumer.student;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Jhon",89));
        students.add(new Student("Jack",79));
        students.add(new Student("Rohan",76));
        students.add(new Student("Tom",56));
        students.add(new Student("Jhony",26));
    }
}
