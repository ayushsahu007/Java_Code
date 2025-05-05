package com;

class Vehicle {
         String brand = "Honda";
}
class Car extends Vehicle{
  void drive(){
      System.out.println("Driveing Car !");
  }
}
class Bike extends Vehicle{
    void ride(){
        System.out.println("Riding Bike");
    }
}

