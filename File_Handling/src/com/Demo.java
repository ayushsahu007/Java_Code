package com;

import java.io.File;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        File file1 = new File("Google");
        //use to create Folder/directory
        System.out.println(file1.mkdir());//true

        //check file1 object have a google folder
        System.out.println(file1.exists());//true

        File file2 = new File("Google.txt");
        //used to create file
        System.out.println(file2.createNewFile());//true

        //check file2 object have a google.txt file
        System.out.println(file2.isFile());//true

        //cheak file1 object have directory
        System.out.println(file1.isDirectory());//true

        //cheak file2 object have directory
        System.out.println(file2.isDirectory());//false bcoz file2 have only file not directory

        File file3 = new File("Meta");
        file3.mkdir();//create directory
        File file4 = new File(file3,"facebook.com");
        file4.createNewFile();//facebook.com file created inside Meta folder
        System.out.println(file4.isFile());






    }
}
