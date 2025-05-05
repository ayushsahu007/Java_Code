package com;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Start");
        int[] a= {10,20,30,40,50};

        try{
            System.out.println(10/0);
        }catch (ArithmeticException e){
            System.out.println("Invaild Denominator");

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invaild Index");
        }
        catch (Exception e){
            System.out.println("Exception Handled");
        }
        System.out.println("End");
    }
}
