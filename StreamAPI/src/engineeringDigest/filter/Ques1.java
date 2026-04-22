package engineeringDigest.filter;

import java.util.Arrays;
import java.util.List;

public class Ques1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,6);
        //count()
        long count = list.stream().filter(x -> x % 2 == 0).count();
        System.out.println("Count Even Number "+count);

        //forEach()
        //Print Even Number
        list.stream().filter(x -> x % 2 == 0).forEach(System.out::println);

//        //collect()
//        list.stream().filter(x -> x % 2 == 0).collect();

    }
}
