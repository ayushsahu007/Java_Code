package byNaveen;

import java.util.Arrays;

//Print 1 to 100 Number Without using any loop and Recursion
public class Ques3 {
    public static void main(String[] args) {
      //Arrays Fill
        Object num[] = new Object[100];
        Arrays.fill(num , new Object(){
              int count = 0;
              @Override
            public String toString(){
                  return Integer.toString(++count);
              }
        });
        System.out.println(Arrays.toString(num));

//        Object o = new Object(){
//            int count = 0;
//
//        };

    }
}
