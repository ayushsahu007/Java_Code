package problamSloving.Employee;

public class Employee {
    int salary;
    String name;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + salary +
                ", name='" + name + '\'' +
                '}';
    }

    public Employee(int id, String name) {
        this.salary = id;
        this.name = name;
    }
}
