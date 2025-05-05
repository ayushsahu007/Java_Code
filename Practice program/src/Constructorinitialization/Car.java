package Constructorinitialization;

public class Car {
    String brand;
    double cost;
    Car(String brand,double cost) {
        this.brand = brand;
        this.cost = cost;
 }
         public static void main(String[] args) {
         Car c1 = new Car("Honda ",432555.4);
         Car c2 = new Car("Volvo ",989730.3);
             System.out.println(c1.brand+c1.cost);
             System.out.println(c2.brand+c2.cost);
    }
}
