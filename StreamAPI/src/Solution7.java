import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        IntStream.range(1,n+1).forEach(System.out::println);
        System.out.println("-------------");
        IntStream.rangeClosed(1,n).forEach(System.out::println);
        System.out.println("-----------------");
        IntStream.rangeClosed(0,n).filter(i ->i%2 ==0).forEach(System.out::println);

    }
}
