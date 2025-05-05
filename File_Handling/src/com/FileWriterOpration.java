package com;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterOpration {
    public static void main(String[] args) throws IOException {
        File dir = new File("Google");
        dir.mkdir();

        File file = new File(dir,"you.txt");
        file.createNewFile();
        System.out.println(file.exists());


        FileWriter fw = new FileWriter(file);
        //FileWriter fw = new FileWriter(file,true); add more data append
        fw.write("PW");
        fw.write(54);
        fw.write(35);
        char ch[] = {'j','a','v','a'};
        fw.write(ch);

       fw.close();

        System.out.println("Open pw.txt file  ");






    }
}
