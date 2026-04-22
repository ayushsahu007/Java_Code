package emp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1,"Ayush",4563));
        employees.add(new Employee(2,"A453h",44252));
        employees.add(new Employee(3,"Aysrh",7652));
        employees.add(new Employee(4,"Asfh",442));


        for(Employee em : employees){
            System.out.println(em);
        }

        Collections.sort(employees);

        System.out.println("--------------------------------------------------------------------------");
        for(Employee em : employees){
            System.out.println(em);
        }


    }





}