package predicate;

import java.util.function.Predicate;

public class Solution2 {
    public static void main(String[] args) {
        Predicate<String> str = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() >5;
            }
        };
        System.out.println(str.test("Java")); //false
/// ////////////////////////////////////////////////////
        System.out.println("---Using Lambda---");
        Predicate<String> str1 = (String s) -> {
            return s.length() >5 ;
        };
        System.out.println(str1.test("Ayush"));
        ///  /////////////////////////////////////////////////////
        Predicate<String> str2 = (s) -> {
            return s.length() >5 ;
        };
        System.out.println(str2.test("Functional"));
        /// ////////////////////////////////////////////////////
        Predicate<String> str3 = (String s) -> s.length() >5;
        System.out.println(str3.test("Jspider"));



    }
}
