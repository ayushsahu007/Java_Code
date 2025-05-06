package function;

import java.util.function.Function;

public class Solution1 {
    public static void main(String[] args) {
        Function<String,String> f1 = s -> {
            System.out.println("Exexcuting f1");
            return s.toUpperCase();
        };

        Function<String ,String> f2 = s -> {
            System.out.println("Exexcuting f2");
           return s.substring(0,8);
        };

        String s = "Jspider Basavangudi Banglore";
        System.out.println(f1.apply(s));
        System.out.println(f2.apply(s));

        Function<String,String> f3 = f1.andThen(f2);
        System.out.println(f3.apply(s));

        Function<String,String> f4 = f1.compose(f2);
        System.out.println(f4.apply(s));
    }
}
