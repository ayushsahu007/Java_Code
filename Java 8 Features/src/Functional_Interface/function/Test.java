package Functional_Interface.function;

import java.util.function.Function;

public class Test {

    public static void main(String[] args) {
        Function<String,Integer> getLength = x -> x.length();
        System.out.println(getLength.apply("Ayush"));

        Function<String,String> first_Three =s -> s.substring(0, 3);
        System.out.println("Ayush");



    }
}
