package Anonymous.comparing;

import java.lang.reflect.Array;
import java.util.ArrayList;
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

        System.out.println("----------------------------");
      //  Comparator<Person>
    }
}
