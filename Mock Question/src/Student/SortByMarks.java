package Student;

import java.util.Comparator;

public class SortByMarks implements Comparator {
    @Override
    public int compare(Object o1,Object o2){
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;
        return s2.marks-s1.marks;
    }
}
