package Student;

import java.util.*;

public class StudentSorting {
    public static void main(String[] args) {
        List l = new ArrayList();

        Student s1 = new Student(1,"Xyx",78);
        Student s2 = new Student(2,"Ram",90);
        Student s3 = new Student(3,"Syam",88);
        Student s4 = new Student(4,"Dinga",68);

        l.add(s1);
        l.add(s2);
        l.add(s3);
        l.add(s4);
        for (Object s : l){
            System.out.println(s);
        }
        System.out.println("----------------------------------------");
        Comparator ct = new SortByMarks();
        Collections.sort(l,ct);

        ListIterator itr = l.listIterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("-----------------------------------");
        while (itr.hasPrevious()){
            System.out.println(itr.previous());
        }

    }
}
