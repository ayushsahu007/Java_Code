package Functional_Interface.cunsumer;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> consumer = s ->  System.out.println(s);
        consumer.accept("Ayush");

        Consumer<List<Integer>> listConsume1 = li -> {
            for (Integer i : li){
                System.out.println(i+ 1000);
            }
        };

        Consumer<List<Integer>> listConsumer2 = li -> {
          for (Integer i : li){
              System.out.println(i);
          }
        };

     //   listConsumer.accept(Arrays.asList(1,2,3,4,6));
        listConsumer2.andThen(listConsume1).accept(Arrays.asList(1,2,3,4));

        //other wat to write same things
        Consumer<List<Integer>> listConsumer = listConsumer2.andThen(listConsume1);
        listConsumer.accept(Arrays.asList(12,123,45,313));



    }
}
