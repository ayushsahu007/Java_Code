package function;

import java.util.function.Function;
//TO check length of String
public class Solution11 {
    public static void main(String[] args) {
        Function<String,Integer> f = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

        Function<String,Integer> f1 = t -> t.length();
        System.out.println(f1.apply("Ayush"));
    }
}
