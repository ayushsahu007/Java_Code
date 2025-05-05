package methodoverrinding;

public class Car extends Vehicle{
    @Override
    void start(){
        super.start();
        System.out.println("Car Started");
    }
}
