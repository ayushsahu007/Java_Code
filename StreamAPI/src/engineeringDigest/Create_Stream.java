package engineeringDigest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Create_Stream {
    public static void main(String[] args) {
        //1. List to Convert Stream
        List<String> list = Arrays.asList("Apple", "Berry", "Avacado", "Sitafal");
        Stream<String> listStream = list.stream();

        //tips alt + enter = to create local variable shortcut
        //2.Array to Stream
        String[] arr = {"Apple", "Berry", "Avacado", "Sitafal"};
        Stream<String> stream = Arrays.stream(arr);

        //3.to Create Stream Using Stream.of()
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);


      //to Generate Stream (Infinite Stream)
        Stream<String> limit1 = Stream.generate(() -> "Hello").limit(5);
        Stream<Integer> limit2 = Stream.generate(() -> (int) Math.random() * 100).limit(5);
        //to iterate Stream (Infinite Stream)
        Stream<Integer> limit = Stream.iterate(0, n -> n + 1).limit(100);

        System.out.println(limit1);

    }
}
