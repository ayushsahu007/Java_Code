package problamSloving.Employee;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(12000, "Ayush"));
        employees.add(new Employee(18500, "Riya"));
        employees.add(new Employee(14500, "Suresh"));
        employees.add(new Employee(30000, "Anjali"));
        employees.add(new Employee(19800, "Karan"));
        employees.add(new Employee(26000, "Pooja"));


        System.out.println("Before Incrementing");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
        System.out.println("-------------------------");

        Predicate<Employee> p = emp -> emp.salary <= 15000;

        Function<Employee, Employee> f = emp -> {
            emp.salary = emp.salary + 6000;
            return emp;
        };

//        ArrayList<Employee> employees2 = new ArrayList<>();
//        for (Employee employee : employees) {
//            if (p.test(employee)) {
//                Employee emp = f.apply(employee);
//                employees2.add(emp);
//            }
//        }
//        System.out.println("Employees who got a hike:");
//        for (Employee emp : employees2) {
//            System.out.println(emp);
//        }

        System.out.println("Employe who got hike !!");
        for (Employee emp : employees) {
            if (p.test(emp)) {
                System.out.println(emp);
                f.apply(emp); //Incrementing employee salary 6000
            }
        }



        System.out.println("------------------");
        System.out.println("After Incrementing");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }

}



