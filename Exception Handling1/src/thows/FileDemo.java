package thows;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileDemo {
    public static void read() throws FileNotFoundException {
        FileReader fr = new FileReader("open.txt");
    }
}
