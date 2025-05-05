package comparable.shishira;

public class Student implements Comparable<Student> {
    int id;
    double perc;
    String name;

    public Student(int id, double perc, String name) {
        this.id = id;
        this.perc = perc;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.id + " " + this.perc + " " + this.name;
    }

    @Override
    public int compareTo(Student anotherStudent) {
      //  return this.name.compareToIgnoreCase(anotherStudent.name); //Ascending
       return this.id-anotherStudent.id;

    }


}
