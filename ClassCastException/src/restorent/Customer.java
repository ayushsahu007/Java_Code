package restorent;

import java.util.Scanner;

public class Customer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hotel h = new Hotel();
        System.out.println("Enter a Order no - ");
        System.out.println("1. Idly ");
        System.out.println("2. Dosa ");
        System.out.println("3. Vada ");
           Food f = h.order(sc.nextInt());
           if (f instanceof Idly){
               System.out.println("Ordering Food ");
           }else if (f instanceof Dosa){
               System.out.println("Ordering Dosa");
           }else if(f instanceof Vada){
               System.out.println("Ordering Vada");
           }
           else {
               System.out.println("Invild Choice !!");
           }
    }
}
