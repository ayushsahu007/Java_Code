package constructoroverloading;

public class Parking {
    int noOfCars;
    int floor;
    Parking(int noOfCars){
        this.noOfCars=noOfCars;
    }
    Parking(int noOfCars,int floor){
        this.floor=floor;
    }

    public static void main(String[] args) {
        Parking p1 = new Parking(10);
        Parking p2 = new Parking(2);
        System.out.println("NO.of Cars :"+p1.noOfCars);
        System.out.println("No of Cars :"+p1.noOfCars +" Floor :"+p2.floor);
    }

}

