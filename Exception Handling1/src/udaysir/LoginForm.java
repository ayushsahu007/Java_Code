package udaysir;

import java.util.Scanner;

public class LoginForm {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter user id ");
        String id = sc.nextLine();
        if(id.equals("admin")){
            System.out.println("Enter a passwod");
            int password = sc.nextInt();
            if (password == 1234){
                System.out.println("Login Successful ");
            }
            else {
               try {
                   InvaildPasswordException obj = new InvaildPasswordException();
                   throw obj;
               }catch (InvaildPasswordException e){
                   System.out.println("Invaild Password");
               }
            }
        }
        else
            System.out.println("Wrong id !");

    }
}
