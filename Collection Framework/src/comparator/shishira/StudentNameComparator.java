package comparator.shishira;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1,Student s2){
        return s1.name.compareToIgnoreCase(s2.name);//ascending order
        //return s2.name.compareToIgnoreCase(s1.name);
    }

}
