package practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class LHM {
    public static void main(String[] args) {
        HashMap<String, Double> lhm=new HashMap<>();
        lhm.put("jit", 15000.5);
        lhm.put("bibek",15000.400);
        lhm.put("ayush",4500.3);

        Set<String> s = lhm.keySet();
        for(String s1: s){
            System.out.println(s1.hashCode());
        }
        System.out.println(lhm);
    }
}
