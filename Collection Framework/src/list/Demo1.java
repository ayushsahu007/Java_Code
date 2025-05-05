package list;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList l = new ArrayList<>();
        l.add(10);
        l.add(10.5);
        l.add("Java");
        for (int i = 0;i<l.size();i++){
            System.out.println(l.get(i));
        }
        for (int i = l.size()-1;i>=0;i--){
            System.out.println(l.get(i));
        }
    }
}
