package set.uday;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        HashSet h = new HashSet();
        h.add(20);
        h.add(30.90);
        h.add(null);
        h.add("Java");
        for (Object obj : h){
            System.out.println(obj);
        }
        System.out.println("------------");
        System.out.println(h);

    }
}
