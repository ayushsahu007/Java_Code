package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) {
        Student s = new Student(1,"Ram",89);
        //write/output ---->output Stream
        //format:output ----> byte stream

        try {
            FileOutputStream fops = new FileOutputStream("student_data.txt");
            ObjectOutputStream oops = new ObjectOutputStream(fops);
            oops.writeObject(s);
            System.out.println("Write Operation Success");
            oops.close(); fops.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
