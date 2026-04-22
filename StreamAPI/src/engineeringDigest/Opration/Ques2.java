package engineeringDigest.Opration;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

//Cumulative Sum
public class Ques2 {
    public static void main(String[] args) {
        //[1,2,3,4,5] --> [1,3,6,10,15]
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        int sum = 0;
//        numbers.parallelStream().map(
//                x -> {
//                    int i = x + sum;
//                    sum = i;
//                    return i;
//                }).toList();

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        AtomicInteger sum = new AtomicInteger(0);
        List<Integer> cumulativeSum = numbers.stream().map(sum::addAndGet).toList();
        System.out.println("Expected cumulative sum: "+cumulativeSum);
    }
}
