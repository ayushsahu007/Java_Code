package consumer;

import java.util.Scanner;
import java.util.function.Consumer;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter a Number ");
        int n = sc.nextInt();

        Consumer<Integer> c = new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.println(i*i);
            }
        };
        c.accept(n);
        Consumer<Integer> c1 = i -> System.out.println(i*i);
       c1.accept(n);
    }
}
