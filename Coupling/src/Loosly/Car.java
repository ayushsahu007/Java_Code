package Loosly;

public class Car {
    private Engine engine;
    Car(Engine engine){
        this.engine = engine;
    }
    void drive(){
        engine.start();
        System.out.println("Car Start");
    }
}
