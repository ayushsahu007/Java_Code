package example;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Infinite loop
        while(true){
            System.out.println("Enter a Choice");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Hii");
                    break;
                case 2:
                    System.out.println("Bye");
                    break;
                case 3:
                    System.out.println("Thank you!");
                    System.exit(0);//Terminate the JVM/Program
                default:
                    System.out.println("Invaild Choice");
            }
            System.out.println("----------------");
            sc.close();
        }//End of while loop
    }//End of Main
}
