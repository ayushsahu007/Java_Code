package com;

import java.util.HashMap;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put(10,"Java");
        m.put(20,"SQL");
        m.put(30,"Networking");
        System.out.println(m);
        m.put(20,"Python");
        System.out.println(m);




    }
}
