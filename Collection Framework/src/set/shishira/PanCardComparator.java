package set.shishira;

import java.util.Comparator;

public class PanCardComparator implements Comparator<PanCard> {
    @Override
    public int compare(PanCard p1, PanCard p2) {
        return p1.panNumber.compareToIgnoreCase(p2.panNumber);
    }
}
