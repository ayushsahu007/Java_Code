package Functional_Interface.function;

import java.util.function.Function;

public class otherMthod {
    public static void main(String[] args) {
        Function<Integer,Integer> function1 = x -> 2 * x ;
        Function<Integer,Integer> function2 = s -> s * s * s;

// function 1  => 2 * 3 => 6 ;
//function 2 => 6 * 6 * 6 => 216
        System.out.println(function1.andThen(function2).apply(3));

        // function2 => 3 * 3 * 3  => 27; 1st function2 after function1
        //function1 => 2 * 27 = 54;
        System.out.println(function2.andThen(function1).apply(3));

        //function2 =>  3 * 3 * 3  => 27; 1st function2 after function1 bcoz use compose
        //function1 => 2 * 27 = 54;
        System.out.println(function1.compose(function2).apply(3));
//static method
        Function<String,String> identityFunction = Function.identity();
        System.out.println(identityFunction.apply("Ayush"));

        //identity means input and output are same

    }
}
