package com;

//Accessing public member in different class, same package
public class EmployeeMain{
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println("ID : "+employee.id);
        System.out.println("Name : "+employee.name);
        Employee.work();
    }
}
