package udaysir;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 1000;
        System.out.println("Enter Amount to be Withdraw :");
        int amount = sc.nextInt();

        if (amount<=balance){
            System.out.println("Withdraw SuccessFully");
        }else{
            try {
                InsufficientBalanceExceeption obj = new InsufficientBalanceExceeption();
                throw obj;
            } catch (InsufficientBalanceExceeption e) {
                System.out.println("Insufficient Balance "+e.getMessage());
            }
        }
    }
}
