package mock;

public class Student {
    int age;

@Override
 public String toString(){
    return "Student@123";
}
      @Override
       public int hashCode(){
       return 123;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Student) {
                Student s = (Student) obj;
                return this.age == age;
            }
            return false;
        }


    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);
        System.out.println(student.hashCode());
        System.out.println(student.equals(student));
    }
}
