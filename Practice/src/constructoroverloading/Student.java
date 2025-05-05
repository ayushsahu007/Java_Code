package constructoroverloading;

public class Student {
    String s_id;
    String name;
    int marks;
    Student(String u,String n,int m){
        s_id = u;
        name =n;
        marks = m;
    }
    Student(String u,String n){
        s_id = u;
        name = n;
    }

    public static void main(String[] args) {
        Student s1= new Student("2342","Rahul",522);
        Student s2= new Student("2425","rohan");
        System.out.println("Name = "+s1.name+" Student id = "+s1.s_id+" Marks = "+s1.marks);
        System.out.println("Name = "+s2.name+" Student id = "+s2.s_id);
    }    
}

