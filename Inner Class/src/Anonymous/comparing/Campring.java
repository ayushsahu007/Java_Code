package Anonymous.comparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//using Comparator
public class Campring {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person(10,"ayush"));
        persons.add(new Person(34,"rajesh"));
        persons.add(new Person(10,"suresh"));
        persons.add(new Person(10,"mahesh"));
        persons.add(new Person(10,"ayush"));

        for(Person person : persons){
            System.out.println(person);
        }

        System.out.println("-----------Based on Age--------------");
      //  Comparator<Person>
        Comparator<Person> ageComparator = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.age,p2.age);
            }
        };

        Collections.sort(persons,ageComparator);
        for (Person person : persons){
            System.out.println(person);
        }
        System.out.println("============Based on Name================");

        Comparator<Person> nameComparetor = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.name.compareTo(p2.name);
            }
        };
        Collections.sort(persons,nameComparetor);
        for (Person person : persons){
            System.out.println(person);
        }
    }
}
