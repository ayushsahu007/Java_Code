package Person;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/*
Person
         id
         name
         salary
  Custom sort the person Based on salary & iterate using
  Entryset & iterator() display the Attributes of person whose
  name Start with 'A' & Do not Override toString()
 */

public class PersonMain {
    public static void main(String[] args) {
        Map<Person,String> m = new TreeMap<>(new SortBySalary());
        Person p1 = new Person(101,"Ayush",2345.45);
        Person p2 = new Person(102,"Suraj",1375.45);
        Person p3 = new Person(104,"Pawan",645.45);
        Person p4 = new Person(105,"Ravi",2625.45);
        Person p5 = new Person(107,"Aakash",945.45);

        m.put(p1,"Ayush");
        m.put(p2,"Suraj");
        m.put(p3,"Pawan");
        m.put(p4,"Ravi");
        m.put(p5,"Aakash");

        Iterator<Map.Entry<Person,String>> itr = m.entrySet().iterator();

        while (itr.hasNext()){
            Map.Entry<Person,String> entry = itr.next();
            Person p = entry.getKey();
            if (p.name.startsWith("A")){
                p.display();
            }
        }

    }
}
