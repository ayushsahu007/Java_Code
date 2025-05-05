package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Product {
    public static void main(String[] args) {
        Map<Integer, String> indmap = new HashMap<Integer, String>();
        indmap.put(171, "Dohni");
        indmap.put(82, "Virat");
        indmap.put(10, "Rohit");
        System.out.println("Iterating Map using entrySet()");
        Set<Map.Entry<Integer, String>> set = indmap.entrySet();
        for (Map.Entry<Integer, String> entry : set) {
            System.out.println(entry);
        }
    }
}