package thows;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo2 {
    static void  read() throws FileNotFoundException,ArithmeticException{
        FileReader fr = new FileReader("open.txt");
       // System.out.println(10/0);
    }

    public static void main(String[] args) {
        System.out.println("Start");
        try {
            Demo2.read();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println("End");
    }
}
