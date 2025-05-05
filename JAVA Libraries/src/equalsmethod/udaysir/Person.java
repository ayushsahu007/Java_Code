package equalsmethod.udaysir;

public class Person {
    int age;

    public Person(int age) {
        this.age = age;
    }
    public boolean equals(Object o){
        if (o instanceof Student){
            Student s = (Student) o;
            return this.age == s.age;
        }
        return false;
    }

    public static void main(String[] args) {
        Person p = new Person(20);
        Student s = new Student(20);
        System.out.println(p.equals(s));
    }
}
