package comparator1;

import java.util.TreeSet;

public class SortingUsingTS {
    public static void main(String[] args) {
        TreeSet<Pen> t = new TreeSet<Pen>(new PenCostComparator());
        t.add(new Pen(20));//calls compare() ibternally
        t.add(new Pen(90));
        t.add(new Pen(70));

        for (Pen p : t){
            System.out.println(p);
        }

    }
}
