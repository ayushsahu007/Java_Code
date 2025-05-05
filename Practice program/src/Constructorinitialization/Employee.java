package Constructorinitialization;

public class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, double salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(230,3342,"Nick");
        Employee e2 = new Employee(231,3425,"Rameshr");
        System.out.println("ID :" +e1.id+" "+"Name :"+e1.name+"  "+"Salary"+e1.salary);
        System.out.println("ID :"+e2.id+" "+"Name :"+e2.name+"  "+ "Salary"+e2.salary);
    }
}
