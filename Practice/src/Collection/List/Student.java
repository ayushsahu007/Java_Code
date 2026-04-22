package Collection.List;

public class Student implements Comparable<Student>{
    int id;
    String name;
    double marks;

    public Student(int id, double marks, String name) {
        this.id = id;
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(Student s){
     //   return this.name.compareToIgnoreCase(s.name);r66x
//        Integer i = this.id;
//        return i.compareTo(s.id);
        // return this.id - s.id;
        return Integer.compare(this.id,s.id);
    }
}
