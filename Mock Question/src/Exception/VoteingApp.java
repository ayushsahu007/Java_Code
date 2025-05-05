package Exception;

import java.util.Scanner;

public class VoteingApp {
    static void vaildAge(int age , String n) throws AgeInvaildException,NotACitizenException {
        if (age < 18 || age > 100){
            throw new AgeInvaildException("Invaild Age");
        }
      if (!n.equals("India")){
          throw new NotACitizenException("Invaild Nationality");
      }
    }
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age -  ");
        int age = sc.nextInt();
        System.out.println("Enter Nationality - ");
        String n = sc.next();
        sc.close();

        try {
            vaildAge(age,n);
        }catch (AgeInvaildException e){
            System.out.println(e.getMessage());
        }catch (NotACitizenException e){
            System.out.println(e.getMessage());
        }
    }
}
