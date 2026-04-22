package sorting.employee;


import java.util.ArrayList;

public class Soluton {
    public static void main(String[] args) {
        ArrayList<Employee> employee = new ArrayList<>();
        employee.add(new Employee(1,34.7,"Ayush"));
        employee.add(new Employee(2,56.1,"Suresh"));
        employee.add(new Employee(8,34.5,"Mahesh"));
        employee.add(new Employee(9,79.2,"Praksh"));
        employee.add(new Employee(3,93.9,"Hairendra"));
        employee.add(new Employee(5,23.0,"Raju"));

        //only for a letter
        employee.stream()
                .filter(emp -> emp.getName().contains("d") ||
                                        emp.getName().contains("D"))
               // .filter(emp -> emp.getName().contains("a"))
                .forEach(System.out::println);

    }
}
