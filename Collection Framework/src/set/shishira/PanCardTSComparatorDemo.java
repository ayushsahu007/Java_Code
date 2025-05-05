package set.shishira;

import java.util.TreeSet;

public class PanCardTSComparatorDemo {
    public static void main(String[] args) {
        PanCard p1 = new PanCard("FAB341HDH","Ramesh");
        PanCard p2 = new PanCard("KSJ3430JI","Umesh");
        PanCard p3 = new PanCard("FAB341HDH","Ramesh");
        PanCard p4 = new PanCard("OLP839SNL","Suresh");




        PanCardComparator pnc = new
                PanCardComparator();

        TreeSet<PanCard> ts = new TreeSet<>(pnc);
        ts.add(p1); ts.add(p2); ts.add(p3); ts.add(p4);

        for(PanCard pc : ts){
            System.out.println(pc);
        }

    }
}
