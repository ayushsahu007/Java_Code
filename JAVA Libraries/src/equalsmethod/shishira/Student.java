package equalsmethod.shishira;

public class Student {
    int id;
    String name;
    public Student(int id,String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public boolean equals(Object obj){
        boolean res = false;
        if (obj instanceof Student){
            Student s = (Student) obj;
            if (this.id==s.id){
                res = true;
        }
         }
        return res;
    }

    public static void main(String[] args) {
        Student s1 = new Student(101,"Dinga");
        Student s2 = new Student(102,"Moti");
        System.out.println(s1.equals(s2));

    }
}
