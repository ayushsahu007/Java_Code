package storingobjects;

public class Car {
    int cost ;
    Car(int cost){
        this.cost=cost;
    }
    public static void main(String[] args) {
        Car c1 = new Car(50000);
        Car c2 = new Car(70000);

        System.out.println(c1.cost);
        System.out.println(c2.cost);

        Car[] c = new Car[2];  // Car[] c = {c1,c2};
        c[0] = c1;
        c[1] = c2;

        //Forword
        for(int i=0;i<c.length;i++){
            System.out.println("Cost :"+c[i].cost);
            //  c[0] = c1.cost
            //c[1] = c2.cost
        }


    }
}
