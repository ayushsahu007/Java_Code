package equalsmethod.shishira;

public class EqualityDemo {
    public static void main(String[] args) {
        Student s1 = new Student(10,"Dinga");
        Student s2 = new Student(12,"Guldu");
        Student s3 = new Student(10,"Dinga");

        System.out.println(s1.equals(s3)); //true
        System.out.println(s1.equals(s2)); //false
        System.out.println(s1.equals("Hello")); //false

    }
}
