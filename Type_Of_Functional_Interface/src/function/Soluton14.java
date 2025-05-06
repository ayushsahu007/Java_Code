package function;

import java.util.function.Function;
//Write a program to remove the space in a given String
public class Soluton14 {
    public static void main(String[] args) {
        Function<String,String> f = s-> s.replaceAll(" ","");
        System.out.println(f.apply("Ayush Sahu"));
    }
}
