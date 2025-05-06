package function;

import java.util.function.Function;

//program to return UpperCase
public class Solution13 {
    public static void main(String[] args) {
        Function<String,String> f = s -> s.toUpperCase();
        System.out.println(f.apply("Hello"));
    }
}
