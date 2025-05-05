package predicate;

import java.util.function.Predicate;
//WAP a program to check given number is greater than 10 or not
public class Solution1 {
    public static void main(String[] args) {
        Predicate<Integer> p1 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                return i>10;
            }
        };
        System.out.println(p1.test(40));

        Predicate<Integer> p2 = x -> x> 10;
        System.out.println(p2.test(30));
        System.out.println(p2.test(5));

    }
}
