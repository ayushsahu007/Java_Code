package com;

class BankImpl implements Bank{
    int balance = 5000;
    @Override
    public void deposit(int amount){
        System.out.println("Deposting Amount ₹ "+amount);
        balance = balance + amount; //balance += amount;
        System.out.println("Amount Deposited Successful");
    }
    @Override
    public void withdraw(int amount){
        System.out.println("Withdrawing ₹ " + amount);
        balance = balance - amount; // balance -= amount;
        System.out.println("Amount Withdrawn Successfull");
    }
    @Override
    public void cheakBalance(){
        System.out.println("Available Balance: ₹ "+ balance);
    }
}
