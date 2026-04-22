package copyConstructor;

public class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    Student(Student s){
        this.id = s.id;
        this.name = s.name;
    }
}
