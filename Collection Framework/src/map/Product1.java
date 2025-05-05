package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Product1 {
    public static void main(String[] args) {
        Map<Integer, String> indmap = new LinkedHashMap<>();
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
