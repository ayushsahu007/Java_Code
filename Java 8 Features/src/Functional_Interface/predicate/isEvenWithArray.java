package Functional_Interface.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class isEvenWithArray {
    public static void main(String[] args) {
        Predicate<Integer> isEven = x -> x % 2 == 0;
        List<Integer> num = Arrays.asList(1,2,4,5,6,7);
        for (Integer i  : num){
            if (isEven.test(i)){
                System.out.println(i);
            }
        }


    }
}
