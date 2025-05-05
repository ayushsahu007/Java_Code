package student;

public class Student {
    String name;
    int age;
    double perc;

    public Student(String name, double perc, int age) {
        this.name = name;
        this.perc = perc;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", perc=" + perc +
                '}';
    }
}
