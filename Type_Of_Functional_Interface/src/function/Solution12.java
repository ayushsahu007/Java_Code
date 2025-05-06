package function;

import java.util.function.Function;

//Program to get the square of the given number and using function interface
public class Solution12 {
    public static void main(String[] args) {
        Function<Integer,Integer> f1 = i -> i * i;
        System.out.println(f1.apply(3));
    }
}
