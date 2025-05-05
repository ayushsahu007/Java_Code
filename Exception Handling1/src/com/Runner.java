package com;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Start");

        try {
            System.out.println(10/0);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("End");
    }
}
