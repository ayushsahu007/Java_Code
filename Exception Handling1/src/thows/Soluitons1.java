package thows;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Soluitons1 {
    static void run() throws FileNotFoundException{
        FileReader fr = new FileReader("Text.text");
    }
    public static void main(String[] args) {
        System.out.println("Start");
        try {
            run();
        }catch (Exception e ){
            System.out.println(e.getMessage());
        }
        System.out.println("End");

    }
}
