package com;

public class Solution {
    //Genreliazation or UpCasting
    //1.Display(new Son()); => FAther obj = new Son();
    //2.Display(new Daughter()); => Father obj = new Daughter()
    static void display(Father obj) {//
        if (obj instanceof Son) {
            System.out.println("DownCasting");
            Son s = (Son) obj;//Downcasting
            System.out.println(s.x + " " + s.y);
        } else if (obj instanceof Daughter) {
            System.out.println("Downcasting");
            Daughter d = (Daughter) obj;//Downcasting
            System.out.println(d.x + " " + d.z);
        }
    }
        public static void main (String[]args){
            display(new Son());
            System.out.println("-----------------");
            display(new Daughter());
        }

}
