package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Product {
    public static void main(String[] args) {
        Map<Integer, String> indmap = new HashMap<>();
        indmap.put(171, "Dohni");
        indmap.put(82, "Virat");
        indmap.put(10, "Rohit");
        Set<Map.Entry<Integer, String>> set = indmap.entrySet();
        for (Map.Entry<Integer, String> entry : set) {
           Integer key = entry.getKey();
           String value = entry.getValue();
         //   System.out.println("<"+key+","+value+">");
            System.out.println(entry);
        }
    }
}
