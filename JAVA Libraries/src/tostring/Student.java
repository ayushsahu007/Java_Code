package tostring;

public class Student {
    int age;
    Student(int age){
        this.age = age;
    }
    @Override
    public String toString(){
        return "Age is "+age;
    }
    //Override toString() to return age
    public static void main(String[] args) {
        Student s = new Student(20);
        System.out.println(s);
    }
}
