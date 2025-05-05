package udaysir;

import java.util.Scanner;

public class MatrimonyPortal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Age");
        int age = sc.nextInt();
        if (age>20){
            System.out.println("You are Eligible for marriage");
        }else
        {
               try {
                   throw new AgeInvaildException("You are not eligible");
               }catch (AgeInvaildException e){
                   System.out.println(e.getMessage());
                  // System.out.println("Wait  "+ (20-age) + " Year");
               }
        }
    }
}
