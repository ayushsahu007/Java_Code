package com;

public class MainCalss {
    public static void main(String[] args) {
        Father f =new Father();
        Son s = new Son();
        Daughter d = new Daughter();

         //Son object s having Son class properties and Father class properties
        System.out.println(s instanceof Son);//true
        System.out.println(s instanceof Father);//true
        System.out.println(new Son() instanceof Father);//true
                          //Son object s
        System.out.println("------------------------------------");


// Daughter Object d having Daughter class and Father class Properties
        System.out.println(d instanceof Daughter);//true
        System.out.println(d instanceof Father);//true
        System.out.println(new Daughter() instanceof  Father);//true
                          // Daughter Object d
        System.out.println("----------------------------------------------");

        /*Father Object f having only father class Properties not
         having Son class and Daughter
         */
        System.out.println(f instanceof Father);//true
        System.out.println(f instanceof Son);//false
        System.out.println(f instanceof Daughter);//false
        System.out.println(new Father() instanceof Daughter);//false
                           // father object f
    }
}
