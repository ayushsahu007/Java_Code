package javabean;

import java.util.Scanner;

public class CarMainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Car cost : ");
        int cost = sc.nextInt();
        Car c = new Car();

            c.setCost(cost);
            System.out.println(c.getCost());
        }
    }

