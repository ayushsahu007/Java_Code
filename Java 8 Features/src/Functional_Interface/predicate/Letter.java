package Functional_Interface.predicate;

import java.util.function.Predicate;

public class Letter {
    public static void main(String[] args) {
        Predicate<String> startWithLetterV = x -> x.toLowerCase().charAt(0) == 'v' ;
     //   System.out.println(startWithLetterV.test("Heelo"));

        Predicate<String> endWithLetterL = x -> x.toLowerCase().charAt(x.length()-1) == 'l';

         // and condition if both true then excute
         //cheak both condition are true
       Predicate<String>and = startWithLetterV.and(endWithLetterL);
        System.out.println(and.test("Vipul")); // true

        //cheak both if one condition are true then excute
        Predicate<String> or = startWithLetterV.or(endWithLetterL);
        System.out.println(or.test("vipin"));

        //not include this (not operator)
        Predicate<String> negate = startWithLetterV.negate();
        System.out.println(negate.test("vipin")); // false v is include

        System.out.println(startWithLetterV.negate().test("Ayush")); // true bcoz v is not include
    }
}
