package engineeringDigest.part1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Stateless Lazy Evaluation
public class Stream4 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Carl", "David");

        Stream<String> stream = names.stream().filter(name -> {
            System.out.println("Filtering " + name);
            return name.length() > 3;
        });

        System.out.println("Before Terminal Operations ");

        List<String> result = stream.collect(Collectors.toList());

        System.out.println("After Terminal Operations ");
        System.out.println(result);
    }
}
