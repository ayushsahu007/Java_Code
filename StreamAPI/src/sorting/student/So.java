package sorting.student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Student who got more than 85 marks;
public class So
{
    public static void main(String[] args) {
        List<Student> students = List.of( new Student(1,34.7,"Ayush"),
        new Student(2,56.1,"Suresh"),
        new Student(8,34.5,"Mahesh"),
        new Student(9,79.2,"Praksh"),
        new Student(3,93.9,"Hairendra"),
        new Student(5,23.0,"Raju"));

//        students.stream().forEach(System.out::println);
//        System.out.println("---Student who have scored more than 85");
//
//        students.stream()
//                .filter(stu -> stu.getMarks() >= 85)
//                .forEach(System.out::println);

        //  for student score along with grade
      Map<String,List<Student>> grades =  students.stream()
                .collect(Collectors.groupingBy(Student::getGrade));
               grades.forEach((k,v) -> {
              System.out.println(k);
            v.forEach(System.out::println);
           System.out.println("----------------------");
      });
    }
}
