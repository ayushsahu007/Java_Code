package equalsmethod;

public class Student1 {
    int age ;

     Student1(int age){
         this.age=age;
     }
    public static void main(String[] args) {
        Student1 s1 = new Student1(20);
        Student1 s2 = new Student1(20);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.equals(s2));
    }
}
