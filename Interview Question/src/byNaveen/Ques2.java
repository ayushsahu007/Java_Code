package byNaveen;

import java.util.stream.IntStream;

//Print 1 to 100 withou any loop
public class Ques2 {
    //1. using recursion
    //2 .Java Stream api
    public static void main(String[] args) {
        //printNum(1);
        //Java Stream
        IntStream.range(1,101).forEach(e -> System.out.println(e));
    }
    public static void printNum(int num){
      if (num<=100){
          System.out.println(num);
          num++;
          printNum(num);
      }
    }

}
