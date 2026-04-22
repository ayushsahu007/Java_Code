package engineeringDigest.part1;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//IntermediateOps
public class Stream2 {

    //Intermediate operation transform a stream into another stream
    //They are Lazy , meaning they don't execute until  a terminal operation is invoked

    public static void main(String[] args) {

       List<String >list =  Arrays.asList("Ayush","Ram","SHyam","Kiran");
        //filter
        Stream<String>  filteredStream = list.stream().filter(x -> x.startsWith("A"));

        //no filter at this point
       long res = list.stream().filter(x -> x.startsWith("A")).count();
        System.out.println(res);


        //map
        Stream<String> stringStream = list.stream().map(String::toUpperCase);

        //3. Sorted Stream
        Stream<String> sorted = list.stream().sorted();
        Stream<String> sortedStreamUsingComparetor = list.stream().sorted((x, y) -> x.length() - y.length());

        //4.distinct
        System.out.println(list.stream().filter(x -> x.startsWith("A")).distinct().count());

        //limit
        System.out.println(Stream.iterate(1,x -> x + 1).limit(100).count());

        //Skip
        System.out.println(Stream.iterate(1,x -> x + 1).skip(10).limit(100).count());

        //7.Peak
        //Perform an action on each element as it is consumed.
        Stream.iterate(1, x -> x + 1).skip(10).limit(100).peek(System.out::println).limit(100).peek(System.out::println).count();

        //flatmap
        //Handle stream of collections , lists or arrays where each element is itself a collection
        //flatten nested structures (e.g., lists within lists) so that they can  be processed as a
        //Transform and Flatten elements as the same time
      List<List<String>> listOfLists =  Arrays.asList(
                Arrays.asList("Apple","Banana"),
                Arrays.asList("Orange","kiwi"),
                Arrays.asList("Peer","grape")
        );
        System.out.println(listOfLists.get(1).get(1));
        System.out.println(listOfLists.stream().flatMap(x -> x.stream()).map(String::toUpperCase).toList());




    }
}
