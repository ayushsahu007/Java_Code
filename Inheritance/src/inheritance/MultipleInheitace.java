package inheritance;

interface Vehicle{
    default void start(){
        System.out.println("Vehicle Start");
    }
}

interface Car1 extends Vehicle{
    default void start(){
        System.out.println("Car Started ");
    }
}
interface Bus extends Vehicle{
    default void start(){
        System.out.println("Bus Started");
    }
}
class Engine implements Car1 ,Bus{

    @Override
    public void start() {
        Car1.super.start();
    }
}


public class MultipleInheitace {
}
