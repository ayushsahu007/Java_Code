package com;

import java.util.Scanner;

public class CalculatorMainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       Calculator calculator =new CalculatorImpl(); //Rule 4 Upcasting
        System.out.println("Enter 2 number - ");
        int X = sc.nextInt();
       int y = sc.nextInt();
       sc.close();

       calculator.add(X,y);
       calculator.mul(X,y);
    }
}
