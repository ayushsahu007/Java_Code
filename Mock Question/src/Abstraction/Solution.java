package Abstraction;
// Showcase Abstraction using Abstract class , where Achieve Upcasting in all 3 ways.
public class Solution {
    static void selectApp(FoodDeliveryApp f){
        f.orderFood();
    }
    public static void main(String[] args) {
        //upcasting using Method Calling
        selectApp(new Swiggy());
        selectApp(new Zomato());

        //Upcasting using Generalization
        FoodDeliveryApp f = new Swiggy();
        f.orderFood();
        FoodDeliveryApp f2 = new Zomato();
        f2.orderFood();

        //Upcasting Using Single Refernce
        FoodDeliveryApp f3;
        f3 = new Swiggy();
        f3.orderFood();
        f3 = new Zomato();
        f3.orderFood();
    }
}
