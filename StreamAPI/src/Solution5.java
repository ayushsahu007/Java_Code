import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution5 {
    public static void main(String[] args) {
        //1.Group of value
        Stream<Integer> s1 = Stream.of(10,20,30,40,50);
        s1.map(i -> i+5).forEach(System.out :: println);

        System.out.println();

        //2.Array
        Integer [] a = {10,20,30,40,50};
        Stream<Integer> s2 = Stream.of(a);
        s2.filter(i -> i%20 ==0).forEach(System.out::println);

        //3.
        int[] a1 = {10,20,30,40};
        IntStream s3 = IntStream.of(a1);
        s3.forEach(System.out::println);
    }
}
