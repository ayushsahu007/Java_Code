package vehicle;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeMain {
    public static void main(String[] args) {
        TreeSet<Vehicle> vehicles = new TreeSet<>();
        new Comparator<Vehicle>(){
            @Override
            public int compare(Vehicle v1, Vehicle v2 ){
              return v1.brand.compareTo(v2.brand);
            }
        };
        vehicles.add(new Vehicle("Tata" ," Black"));
        vehicles.add(new Vehicle("BYD" ," Mate BLake"));
        vehicles.add(new Vehicle("Tesla" ," Silver"));
        vehicles.add(new Vehicle("Mahindra" ," Red"));

        for (Vehicle vehicle : vehicles){
            System.out.println(vehicle);
        }
    }
}
