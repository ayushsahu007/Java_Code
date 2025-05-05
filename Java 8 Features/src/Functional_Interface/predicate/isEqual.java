package Functional_Interface.predicate;

import java.util.Objects;
import java.util.function.Predicate;

public class isEqual {

    public static class Student{
        int id;
        String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {

          Student s1 = new Student(12,"Ayush");
          Student s2 = new Student(23 , "Ram");

        Predicate<Student> studentPredicate = x -> x.getId() > 1;
        System.out.println(studentPredicate.test(s2) );

    Predicate<Object> predicate = Predicate.isEqual("Ayush");
        System.out.println(predicate.test("Ayush"));

        Predicate<Object> predicat = Predicate.isEqual(1);
        System.out.println(predicate.test(1));
    }
}
