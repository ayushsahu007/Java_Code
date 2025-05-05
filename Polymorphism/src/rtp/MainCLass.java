package rtp;

public class MainCLass {
    //1.decideVehicle(new car()); -> Vehicle obj = new car()  -> obj.start()
    //2.decideVehicle(new bike()); -> Vehicle obj = new bike() -> obj.bike()
    static void decideVehicle(Vehicle obj){
        obj.start();
    }
    public static void main(String[] args) {

        //1.Upcsting using method
        decideVehicle(new Car()); //rule 3
        decideVehicle(new Bike());//rule 3

        System.out.println("-----------------------------");
        //2.Upcasting using seperate refernece variable
        Vehicle v1 = new Car();//rule-3
        v1.start();
        Vehicle v2 = new Bike();//rule -3
        v2.start();

        System.out.println("------------------------");
        //3.Upcasting using single reference variable
        Vehicle v;
        v= new Car();//rule 3
        v.start();
        v= new Bike(); //rule 3
        v.start();

    }
}
