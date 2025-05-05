package Person;

public class Person {
    int id ;
    String name;
    double salary;

    Person(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary = salary;
    }
    // Display Method
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}
