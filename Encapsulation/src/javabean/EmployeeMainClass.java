package javabean;

import java.util.Scanner;

public class EmployeeMainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Employee ID : ");
        int id = sc.nextInt();
        System.out.println("Enter a Employee Name : ");
        String name = sc.nextLine();

        Employee employee = new Employee();
        employee.setId(id);
        employee.setName(name);
        System.out.println("Employee ID - "+employee.getId());
        System.out.println("Employee Name - "+employee.getName());
    }
}

