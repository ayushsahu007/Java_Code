package javabean;

public class StudentMainClass {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Rahul");
        s.setAge(23);
        System.out.println(s.getName() + s.getAge());
    }
}
