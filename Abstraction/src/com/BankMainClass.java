package com;

import java.util.Scanner;

public class BankMainClass {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        Bank b = new BankImpl();
        b.cheakBalance();
        System.out.println("-------------------");
        b.deposit(2000);
        b.cheakBalance();
        System.out.println("---------------------");

        b.withdraw(4000);
        b.cheakBalance();

    }
}
