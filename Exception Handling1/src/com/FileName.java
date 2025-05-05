package com;

import java.io.FileReader;

//Example of Cheaked Exception
public class FileName {
    //this is cheaked exception
    void read(){
        try {
            FileReader r = new FileReader("open.txt");

        }catch (Exception e){
            System.out.println("File is Not Present");
        }
    }
    //this is uncheaked exception
          void divide() {
              System.out.println(10/0);
          }

    public static void main(String[] args) {
        FileName fe = new FileName();
        System.out.println("Start");
        fe.read();
        try {
            fe.divide();
        }catch (ArithmeticException e){
            System.out.println("Invaild Denominator");
        }
        System.out.println("End");
    }
}
