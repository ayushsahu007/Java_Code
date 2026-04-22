package sorting.employee;

public class Employee {

    private int id;
    private double marks;
    private String name;

    public Employee(int id,double marks,String name) {
        this.name = name;
        this.marks = marks;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }
}
