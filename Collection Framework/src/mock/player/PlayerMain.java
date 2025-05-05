package mock.player;

import java.util.ArrayList;
import java.util.Collections;

public class PlayerMain {
    public static void main(String[] args) {
        Player p1 = new Player(100,"TOm");
        Player p2 = new Player(200,"Rohit");
        Player p3 = new Player(150,"Yash");
        Player p4 = new Player(250,"Nitya");

        ArrayList<Player> al = new ArrayList<>();
        al.add(p1);  al.add(p2);  al.add(p3);  al.add(p4);

//        for (Player p : al){
//            System.out.println(p);
//        }
        System.out.println("------------------------------");
        Collections.sort(al);
//        for (Player p : al){
//            System.out.println(p);
//        }
        Player lowScore = al.get(0);
        Player highScore = al.get(al.size()-1);
        System.out.println(lowScore);
        System.out.println(highScore);
    }
}
