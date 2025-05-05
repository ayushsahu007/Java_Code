package comparator;

import java.util.TreeSet;

public class PenMain {
    public static void main(String[] args) {
        Pen p1 = new Pen(20);
        Pen p2 = new Pen(30);
        Pen p3 = new Pen(40);

        TreeSet<Pen> t = new TreeSet<>(new PenCostComparator());
        t.add(p1);
        t.add(p2);
        t.add(p3);

        for (Pen p : t){
            System.out.println(p);
        }
    }
}
