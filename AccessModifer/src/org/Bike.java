package org;

import com.Vehicle;

public class Bike extends Vehicle {
    public static void main(String[] args) {
        Bike b =new Bike();
        System.out.println(b.brand);
        b.start();
    }
}
