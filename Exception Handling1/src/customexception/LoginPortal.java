package customexception;

import java.util.Scanner;

public class LoginPortal {
    private static void vaildate(int password){
        if (password == 1234){
            System.out.println("Login Succes,Welcome Guldu");
        }
        else {
            try {
                throw new InvaildAgeException("Invaild Password");
            }catch (InvaildAgeException e){
                System.out.println(e.getMessage());
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Start");
        Scanner sc = new Scanner(System.in);
        int password = sc.nextInt();
        sc.close();
        vaildate(password);
        System.out.println("End");

    }
}
