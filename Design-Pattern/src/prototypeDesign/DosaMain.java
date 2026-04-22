package prototypeDesign;

import java.util.Scanner;

public class DosaMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DosaFactory.getInstance(sc.next());
//        System.out.println(DosaFactory.getInstance("Masala"));
//        System.out.println(DosaFactory.getInstance("Set"));
//        System.out.println(DosaFactory.getInstance("Kaali"));
    }
}
