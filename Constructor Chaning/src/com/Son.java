package com;

public class Son extends Father{
    Son(){
        //super(); used implicitly
        System.out.println(2);
    }
    public static void main(String[] args) {
         new Son();
    }
}
