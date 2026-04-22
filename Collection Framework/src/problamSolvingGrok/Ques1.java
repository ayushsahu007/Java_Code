package problamSolvingGrok;

import jdk.jfr.Description;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//Problem 1: Remove Duplicates from a List
//Description: Given a List<Integer>, remove all duplicates while preserving the original order of elements.

public class Ques1 {

    public static void main(String[] args) {
        List<Integer> list = List.of(10,20,30,40,10,20,30,40,30,40,50,30,20,10);
        Set<Integer> set = new TreeSet<>(list);
        System.out.println(set);
    }
}
