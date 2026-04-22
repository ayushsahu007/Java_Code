package emp;

public class Employee{
    public  int id;
    public String name;
    public double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

//    @Override
//    public int compareTo(Employee o) {
//        return this.id - o.id;
//    }

//    @Override
//    public int compareTo(Employee o) {
//        return Integer.compare(this.id, o.id);
//    }

//    @Override
//    public int compareTo(Employee o) {
//        Integer i = this.id;
//        return i.compareTo(o.id);
//    }


//    @Override
//    public int compareTo(Employee o) {
//        if (this.id == o.id) return 0;
//        else if (this.id > o.id) return 1;
//        else return -1;
//    }


}
