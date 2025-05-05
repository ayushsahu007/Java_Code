package array;

public class Student {
    String name;
    int age;
    long contactno;
     Student(String name,int age,long contactno){
         this.name=name;
         this.age=age;
         this.contactno=contactno;
     }
    public static void main(String[] args) {
        Student s1 = new Student("Tom",20,628324L);
        Student s2 = new Student("Jack",24,8584930423L);
        Student s3 = new Student("Jeery",43,9876543L);
        Student s4 = new Student("Jhon",32,98765432L);
        Student s5 = new Student("King",31,76543345L);

        Student[] students= {s1,s2,s3,s4,s5};

        for(int i = 0;i<students.length;i++){
            System.out.println("Name :"+students[i].name + " Age :"+students[i].age+" Contact no. "+students[i].contactno);
        }

    }
}
