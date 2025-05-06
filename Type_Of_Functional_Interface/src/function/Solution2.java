package function;

import java.util.Scanner;
import java.util.function.Function;

public class Solution2 {
    public static void main(String[] args) {
        Function<Integer,Integer> sqr = i -> i * i;
        Function<Integer,Integer> cube = i -> i* i * i;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        sc.close();

        System.out.println("Square" + sqr.apply(n));
        System.out.println("Cube "+ cube.apply(n));
        //first square after that cube
        System.out.println("Square and Cube " + sqr.andThen(cube).apply(n));
        //first cube after that square
        System.out.println("Cube And Square "+ sqr.compose(cube).apply(n));
    }
}
