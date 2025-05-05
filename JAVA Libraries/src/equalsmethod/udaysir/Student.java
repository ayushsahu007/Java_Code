package equalsmethod.udaysir;

public class Student {
    int age;

    public Student(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj)  {
            if (obj instanceof Student){
                Student s = (Student) obj;
                return this.age == s.age;
            }
            return false;
    }
    public static void main(String[] args) {
        Student s1 = new Student(20);
        Student s2 = new Student(21);
        System.out.println(s1.equals(s2));
        System.out.println("---------------");

    }
}
