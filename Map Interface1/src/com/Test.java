package com;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        HashMap<String , Integer> hm = new HashMap<>();
        hm.put("Rohan",10);
        hm.put("Neo",20);
        hm.put("James",007);
        Set<String> s1 = hm.keySet();
        for (String key : s1){
            System.out.println(key+" -->"+hm.get(key));
        }
        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();
        lhm.put(10,"Java");
        lhm.put(20,"Python");
        lhm.put(30,"c++");

        Set<Integer> s = lhm.keySet();
        for (int key : s){
            System.out.println(key+" -->"+lhm.get(key));
        }

        TreeMap<Integer , String > tm = new TreeMap<>();
        tm.put(30,"Indore");
        tm.put(10,"Pune");
        tm.put(20,"Delhi");
        Set<Integer> s3 = tm.keySet();
        for (Integer key : s3){
            System.out.println(key+" -->"+tm.get(key));
        }
    }
}
