import java.util.Scanner;

public class Prac1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENter a NUmber");
        int n = sc.nextInt();
        int ogNum = n;

        int sum = 0;
        int pow = 0;

        int temp = n;
        while (temp!=0){
            pow++;
            temp = temp/10;
        }

        temp = n;
        while (temp!=0){
            int digit = temp%10;
            sum+= calculator(pow,digit);
               temp /= 10;
        }

        if (sum == ogNum){
            System.out.println("Number is Vaild");
        }else {
            System.out.println("Invaild");
        }
    }


    public static int calculator(int pow,int digit){
        int res = 1;
        for (int i = 0;i<pow;i++){
            res = res * digit;
        }
        return res;
    }

}
