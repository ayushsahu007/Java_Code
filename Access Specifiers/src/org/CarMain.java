package org;

import com.Car;
///Accessing Public members in different package
public class CarMain {
    public static void main(String[] args) {
        System.out.println("Brand -> "+ Car.brand);
        Car car = new Car();
        System.out.println("Cost -> "+car.cost);
    }
}
