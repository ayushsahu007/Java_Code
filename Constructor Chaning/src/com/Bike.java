package com;

 class Bike extends Vehicle{
     Bike(){
         super("Honda");
         System.out.println("In Bike");
     }
    public static void main(String[] args) {
        new Bike();
    }

}
