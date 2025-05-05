package comparator1;

import java.util.ArrayList;
import java.util.Collections;

public class SortingUsingAL {
    public static void main(String[] args) {
        ArrayList<Pen> al = new ArrayList<Pen>();
        al.add(new Pen(20)); // Pen p1 = new Pen(20);
        al.add(new Pen(30)); // Pen p1 = new Pen(30);
        al.add(new Pen(10)); // Pen p1 = new Pen(10);

        Collections.sort(al,new PenCostComparator());

        for (Pen p : al){
            System.out.println(p);
        }

    }
}
