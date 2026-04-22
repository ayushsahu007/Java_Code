import java.util.Locale;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution8 {

    public static void displayChars(String s){
      //  IntStream i = s.chars();
      //  i.mapToObj(c -> (char)c).forEach(System.out::println);

        s.chars().mapToObj(c->(char)c).forEach(System.out::println);
    }

    public static long getVowelCount(String s){
        return s.chars()
                .filter(ch -> "AEIOUaeiou".indexOf(ch) != -1)
                .count();
    }
    public static void getVowelPrint(String s){
        //here print only Ascii number
         s.chars()
                .filter(ch -> "AEIOUaeiou".indexOf(ch) != -1)
                 .mapToObj(c->(char)c)
                .forEach(System.out::println);
    }
    public static void getVowel(String s){
        //here print only Ascii number
        s.chars()
                .filter(ch -> "AEIOUaeiou".indexOf(ch) != -1)
                .forEach(System.out::println);
    }

    public static boolean isPanagram(String s){
//        s =s.toLowerCase();
//        long c = s.chars().distinct().filter(ch -> ch>= 97 && ch <= 122).count();
//        return c == 26;
        //one line code
        return s.toLowerCase()
                .chars()
                .distinct()
                .filter(ch -> ch>= 97 && ch <= 122)
                .count() == 26;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String");
        String s = sc.nextLine();
        sc.close();

//        displayChars(s);
//        System.out.println(getVowelCount(s));
//        getVowel(s);
//        getVowelPrint(s);
        System.out.println(isPanagram(s));


    }
}
