package comparator.shishira;

public class Student {
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
}