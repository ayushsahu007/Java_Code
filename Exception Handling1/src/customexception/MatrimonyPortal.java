package customexception;

import java.util.Scanner;

public class MatrimonyPortal {
    static void vaildateAge(int age) throws InvaildAgeException{
        if(age>21){
            System.out.println("Get married soon !");
        }else {
            throw new InvaildAgeException("Invaild Age");
        }
    }

    public static void main(String[] args) {
        System.out.println("Start");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        scan.close();
        try {
            vaildateAge(age);
        }catch (InvaildAgeException e){
            System.out.println(e.getMessage());
        }
        System.out.println("End");
    }
}
