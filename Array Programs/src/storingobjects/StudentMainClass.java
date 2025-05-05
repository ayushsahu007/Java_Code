package storingobjects;

public class StudentMainClass {
    public static void main(String[] args) {
        Student s1 = new Student(21,"Tom");
        Student s2 = new Student(22,"Jack");
        Student s3 = new Student(23,"Jerry");

        Student[] s = {s1,s2,s3};
        for(int i = 0;i<s.length;i++){
            System.out.println("Age:"+s[i].age + "  Name:"+s[i].name);
        }
    }
}
