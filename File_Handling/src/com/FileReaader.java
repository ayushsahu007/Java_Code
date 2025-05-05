package com;

import java.io.*;


public class FileReaader {
    public static void main(String[] args) throws IOException {
        File dir = new File("Google");
        File file2 = new File(dir,"you.txt");

        //FileReader fd = new FileReader(file2);
        FileReader fd = new FileReader(file2);
        System.out.println( fd.read());
        int i = fd.read();
        System.out.println((char) i);//downcast

        while (i!=-1){
            System.out.println((char) i);
            i=fd.read();
        }
    }
}
