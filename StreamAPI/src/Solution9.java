import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution9 {

    public static boolean isPrime(int n){
        if(n==0 || n==1){
          return   false;
        }
        return IntStream.rangeClosed(2,n/2)
                .filter(i -> n%i == 0)
                .count() == 0;
    }

    public static boolean isPerfact(int n){
//    int s   = IntStream.rangeClosed(1,n/2).filter(i ->n%i==0).sum();
//        return n == s;
        return n == IntStream.rangeClosed(1,n/2)
                .filter(i -> n%i ==0)
                .sum();
    }

    public static boolean isArmStrong(int n){
        String numStr = String.valueOf(n);
        int no = numStr.length();
        return n ==    numStr.chars().map(ch ->(int)Math.pow(ch - '0',no))
                .sum();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter a Number");
        int n = sc.nextInt();
        sc.close();
       // System.out.println(isPrime(n));
        //System.out.println(isPerfact(n));
        System.out.println(isArmStrong(n));
    }
}
