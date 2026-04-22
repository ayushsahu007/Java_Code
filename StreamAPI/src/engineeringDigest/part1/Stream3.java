package engineeringDigest.part1;

import sorting.student.So;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Terminal Oprations
public class Stream3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);

        //1. collect
        list.stream().skip(1).collect(Collectors.toList());
        list.stream().skip(1).toList();

        //2. forEach
        list.stream().forEach(x -> System.out.println(x));

        //3. reduce : Combines elements to produce a si ngle result
      Optional<Integer> optionalInteger = list.stream().reduce((x, y) -> x+y);
//        Optional<Integer> optionalInteger = list.stream().reduce(Integer::sum);

        System.out.println(optionalInteger.get());

        // 4.count

        //5.anyMatch , allMatch , noneMatch
        boolean b = list.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(b);

        boolean b1 = list.stream().allMatch(x -> x > 0);
        System.out.println(b1);

        boolean b2 = list.stream().noneMatch(x -> x < 0);
        System.out.println(b2);

        //6.findFirst , findAny
        System.out.println(list.stream().findFirst().get());
        System.out.println(list.stream().findAny().get());

        //7.toArray()
        Object[] array = Stream.of(1, 2, 3, 4).toArray();

        //8.min / max
        System.out.println("max: "+Stream.of(1,22,67).max(Comparator.naturalOrder()).get());
        System.out.println("max: "+Stream.of(1,22,67).min(Comparator.naturalOrder()).get());

        //Example 1 = find name where lenght is more than 3
        List<String> list1 = Arrays.asList("Ayush", "Bob", "David", "Jack", "Oggy");
        System.out.println(list1.stream().filter(x -> x.length() > 3).collect(Collectors.toList()));

        //Example : Squaring and Sorting Number
        List<Integer> list2 = Arrays.asList(1, 2, 3, 6, 8, 2, 9, 4, 9, 0);
        System.out.println(list2.stream().map(x -> x*x).sorted().toList());

        //Example : Summing Value
        List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list3.stream().reduce(Integer::sum));

        //Example : Counting Occurrences of a character
        String sentences = "Hello World";
        System.out.println(sentences.chars().filter(x -> x =='l').count());







    }
}
