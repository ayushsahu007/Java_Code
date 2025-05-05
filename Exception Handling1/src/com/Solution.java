package com;

import java.util.Scanner;

public class Solution {
    static void run(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        try {
            System.out.println(a/b);
        }catch (ArithmeticException e){
        System.out.println("Invaild Denominator");
    }finally {
            System.out.println("Inside Finally");
            scan.close();
        }

        }
        public static void main(String[] args) {
        run();
    }
}
