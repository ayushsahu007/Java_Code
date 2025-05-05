package Loosly;

public class Main {
    public static void main(String[] args) {
    Engine engine = new PetrolEngine();
    engine.start();
    Car car = new Car(engine);
    car.drive();
    }
}
