package copyConstructor;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student(101,"Ayush");
        Student s = new Student(student); // copy
        System.out.println(s.id+"  "+s.name);

    }
}
