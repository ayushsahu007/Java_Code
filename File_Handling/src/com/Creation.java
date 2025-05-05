package com;

import java.io.File;
import java.io.IOException;

public class Creation {
    public static void main(String[] args) throws IOException {
        File file = new File("hell.txt");
        //check file exist or not
        System.out.println(file.exists());//false

        //create a new file
        file.createNewFile();
        System.out.println(file.exists());//true

        //For folder
        File dir = new File("win");
        //check
        System.out.println(dir.exists());
        //create
        dir.mkdir();
        System.out.println(dir.exists());


    }
}
