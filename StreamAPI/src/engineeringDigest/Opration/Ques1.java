package engineeringDigest.Opration;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ques1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 34, 564, 34, 86, 34, 87, 97, 54, 93, 6, 7, 86);

//        List<Integer> filteredList = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
//        System.out.println(filteredList);
//
//        List<Integer> mappedList = filteredList.stream().map(x -> x / 2).collect(Collectors.toList());
//        System.out.println(mappedList);

        List<Integer> collect = list.stream().filter(x -> x % 2 == 0)
                .map(x -> x / 2).distinct()
                .sorted((a, b) -> b - a)
                .limit(4)
                .skip(1)
                .collect(Collectors.toList());
        // System.out.println(collect);

        List<Integer> iterte = Stream.iterate(1, x -> x + 1)
                .limit(100).skip(1) // skip 1st element
                .filter(x -> x % 2 == 0)
                .map(x -> x / 10)
                .distinct()
                .sorted()
                // .peek(x -> System.out.println(x))
                .collect(Collectors.toList());
        //  System.out.println(iterte);

        Integer i = Stream.iterate(0, x -> x + 1).limit(101) // upto 100
                .filter(x -> x % 2 == 0)
                .distinct()
                .min((a, b) -> a - b).get();
        System.out.println(i);




    }

}
