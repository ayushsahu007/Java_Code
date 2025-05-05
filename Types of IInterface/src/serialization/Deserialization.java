package serialization;

import java.io.*;

public class Deserialization {
    public static void main(String[] args) {

        try {
           FileInputStream fis = new FileInputStream("student_data.txt");
            ObjectInputStream oips = new ObjectInputStream(fis);
            Object obj = oips.readObject();//upcasting
            Student s = (Student) obj;
            System.out.println(s.id+ s.name+ s.perc);
            oips.close(); fis.close();
        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }

    }
}
