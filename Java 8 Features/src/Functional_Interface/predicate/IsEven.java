package Functional_Interface.predicate;

import java.util.function.Predicate;

public class IsEven {
    public static void main(String[] args) {
        Predicate<Integer> isEven = x -> x % 2 == 0 ;
        System.out.println(isEven.test(10 ));
      /*
                 test(10); this is method and pass 10 value
                 lambda function
               isEven  = (x) -> {
                x % 2 == 0 ; cheak condition and return boolean value
                  }
         */

        int sal = 1000;
        if(isEven.test(sal)){
            System.out.println("Even salary");
        }



    }
}
