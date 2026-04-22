package engineeringDigest.part1;

import java.util.List;
import java.util.stream.Stream;

//ParallelStream
public class Stream5 {
    public static void main(String[] args) {
        // A type of Stream that enables parallel processing of elements
        //Allowing multiple threads to process parts of the Stream simultaneously
        //This can significantly improve performance for large data sets
        // workload is distributed across multiple threads

//        List<Integer> list = Stream.iterate(1, x -> x + 1).limit(10).toList();
//        System.out.println(list);

        long startTime = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1, x -> x + 1).limit(20000).toList();
        List<Long> factorialList = list.stream().map(Stream5::factorial).toList();
//        List<Long> factorialList = list.stream().map(Stream5::factorial).sequential().toList();

        long endTime = System.currentTimeMillis();
        System.out.println("Time taken with Sequential stream : " + (endTime - startTime) + " ms");
        System.out.println("------------------------------------------------------------");
        startTime = System.currentTimeMillis();
       factorialList = list.parallelStream().map(Stream5::factorial).toList();
       endTime = System.currentTimeMillis();
        System.out.println("Time taken with Parallel stream : " + (endTime - startTime) + " ms");
    }

    private static long factorial(int n){
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}
