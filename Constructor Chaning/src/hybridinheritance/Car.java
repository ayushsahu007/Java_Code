package hybridinheritance;

public class Car extends Vehicle implements Engine{
    Car(){
        super();
        System.out.println("Car : Default Constructor");
    }
    Car(String type){
        super(type);
        System.out.println("Car :"+type);
    }
}
