package problamSolvingGrok;

import java.util.*;

//Problem 1 : Given a list of strings, find the frequency of each unique word and return a map with words as keys and their frequencies as values. Ignore case sensitivity and handle empty or null inputs gracefully.
//Example:
//
//Input: ["Apple", "banana", "apple", "Cherry", "banana", "apple"]
//Output: {apple=3, banana=2, cherry=1}
public class Ques0 {

    public static Map<String,Integer> freq(List<String> words){
        //1.Handle null or empty input
        if (words == null || words.isEmpty()){
            return Collections.emptyMap();
        }

        //2.Initialize a hashmap to store the result
        Map<String,Integer> freqMap = new HashMap<>();

        //3.Iterate through each word in the input list
        for (String word : words){
            if (word != null){
                String lowerCase = word.toLowerCase();

                freqMap.put(lowerCase,freqMap.getOrDefault(lowerCase,0)+1);
            }
        }
        return freqMap;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "banana", "apple", "Cherry", "banana", "apple");

        Map<String, Integer> result = freq(list);

        System.out.println(result);

    }
}
