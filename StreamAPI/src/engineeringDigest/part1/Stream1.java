package engineeringDigest.part1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Stream1 {
    public static void main(String[] args) {
        //Without Stream
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int count =0;
        for(int i : numbers){
            if (i % 2 == 0){
                count++;
            }
        }
        System.out.println(count);

        //With Stream
   Long c = numbers.stream().filter(x -> x % 2 == 0).count();
        System.out.println(c);
    }
}
