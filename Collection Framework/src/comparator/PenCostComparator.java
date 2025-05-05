package comparator;

import java.util.Comparator;

public class PenCostComparator implements Comparator<Pen> {

    @Override
    public int compare(Pen x, Pen y) {
        return x.cost - y.cost;
        //return y.cost - x.cost;
    }
}
