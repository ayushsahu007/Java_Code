package Person;

import java.util.Comparator;

public class SortBySalary implements Comparator<Person> {
    @Override
    public int compare(Person p1,Person p2){
        return Double.compare(p1.salary, p2.salary);
    }

}
