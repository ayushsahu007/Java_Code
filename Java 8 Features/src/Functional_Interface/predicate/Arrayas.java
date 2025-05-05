package Functional_Interface.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Arrayas {
    public static void main(String[] args) {
        //sum of even number
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        int sum = numbers.stream().filter(n -> n % 2 == 0 ).mapToInt(n -> n).sum();

        System.out.println(sum);
        //other way
        int sum2 = 0;
        for(int n : numbers){
              if (n % 2 ==0){
                  sum+=n;
              }
            System.out.println(sum);

        }


    }
}
