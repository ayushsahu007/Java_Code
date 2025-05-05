package employee;

import java.util.Collections;
import java.util.LinkedList;

public class Employee {
    int empId;
    String empName;
    double empSalary;

    public Employee(int empId, double empSalary, String empName) {
        this.empId = empId;
        this.empSalary = empSalary;
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(101,1234,"Ram");
        Employee emp2 = new Employee(102,123,"Shyam");
        Employee emp3 = new Employee(103,76543,"Shiva");
        Employee emp4 = new Employee(201,67543,"Narayana");
        Employee emp5 = new Employee(203,98765,"Krishna");

        LinkedList<Employee> ll = new LinkedList<>();
        ll.add(emp1);  ll.add(emp2); ll.add(emp3); ll.add(emp4); ll.add(emp5);

        for(Employee emp : ll){
            System.out.println(emp);
        }
        System.out.println("-------------------------------");
  EmployeeNameComparator ctr = new EmployeeNameComparator();
        Collections.sort(ll,ctr);
        for (Employee emp :ll){
            System.out.println(emp);
        }
    }
}
