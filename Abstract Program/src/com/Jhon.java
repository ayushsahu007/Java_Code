package com;

public class Jhon extends Filpkart{
            @Override
          public void buy(){
                System.out.println("Buying laptop from filpkart");
            }
            @Override
            void pay(){
                System.out.println("Paying $50000 from Phonepe");
            }

    public static void main(String[] args) {
        Jhon j =new Jhon();
        //Phonepe pe = new Phonepe();
        j.buy();
        j.pay();
//        Phonepe pe = new Phonepe() {
//            @Override
//            void pay() {
//                System.out.println("Hello");
//            }
//        };
//       pe.pay();
    }
}
