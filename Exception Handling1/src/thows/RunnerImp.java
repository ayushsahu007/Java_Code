package thows;

import java.io.FileNotFoundException;

public class RunnerImp {
    public static void main(String[] args) {
        System.out.println("Starts");
      try {
          FileDemo.read();
      }catch (FileNotFoundException e){
          e.printStackTrace();
      }
        System.out.println("Ends");
    }
}
