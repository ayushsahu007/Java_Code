package predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;
//Wap to pragram to cheak given collection is empty or not
public class Solution3 {
    public static void main(String[] args) {
        Predicate<Collection> p1 = new Predicate<Collection>() {
            @Override
            public boolean test(Collection c) {
                return c.isEmpty();
            }
        } ;
        System.out.println(p1.test(new ArrayList()));
        /////////////////////////////////////////////

        Predicate<Collection> p2 = c -> c.isEmpty();
        ArrayList<Integer> l = new ArrayList<>();
        l.add(10);  l.add(20);  l.add(30);
        System.out.println(p2.test(l));
    }
}
