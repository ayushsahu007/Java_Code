package map.employee;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMain {
        public static void main(String[] args) {

            Employee e1 = new Employee(101, "Alice");
            Employee e2 = new Employee(102, "Bob");

            // Creating a Map without Generics
            Map m = new HashMap();
            // Storing objects in the Map
            m.put(101, e1);
            m.put(102, e2);
            // Iterating over the map
            for (Object key : m.keySet()) {
                Employee e = (Employee) m.get(key); //downcasting
                System.out.println("Key: " + key + ", Value: " + e);
            }
        }
}
