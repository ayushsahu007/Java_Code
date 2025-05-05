package Functional_Interface.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

class  Main{
    public static class Student {
        int id;
        String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {

        Function<String,String> f = x -> x.substring(0,3);

        Function<List<Student>,List<Student>> studentWithAyuAsPrefix = li -> {
            List<Student> result = new ArrayList<>();
            for (Student s : li){
                if (f.apply(s.getName()).equalsIgnoreCase("ayu")){
                     result.add(s);
                }

            }
            return result;
        };
      Student s1 =  new Student( 2,"Ayush");
      Student s2  = new Student(4,"Rahul");
        Student s3 =  new Student (2,"Ayushman");
        List<Student> students = Arrays.asList(s1,s2,s3);
List<Student> filtered = studentWithAyuAsPrefix.apply(students);
        System.out.println(filtered);

    }

}