package Vehicle;

public class Test {
    public static void main(String[] args){
        Vehicle v ;
        v = new Bike();
        v= new Car();

        if (v instanceof Bike){
            System.out.println("Upcasting to Bike ");
            Bike b = (Bike) v;
            System.out.println(b.brand+b.cost);
        } else if (v instanceof Car)
        {
            System.out.println("Upcasting to Car");
            Car c = (Car) v;
            System.out.println(c.brand+c.fuel);
        }
    }
}
