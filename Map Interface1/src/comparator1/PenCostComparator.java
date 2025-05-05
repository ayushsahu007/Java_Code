package comparator1;

import java.util.Comparator;

public class PenCostComparator implements Comparator<Pen> {
    @Override
    public int compare(Pen x,Pen y){
        return x.cost - y.cost;
    }
    //x --> current object to be inserted
    //y -->already existing objet
}
