package converted;

import java.util.ArrayList;

public class ListToArray {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");
        list.add("Pear");

        for(String s:list){
            System.out.println(s);
        }

        //ArrayList to String Array Conversion
        String[] str = new String[list.size()];
        for(int i = 0;i<list.size();i++){
           str[i] = list.get(i);
        }
        System.out.println("-------------------");
        for (String s : str){
            System.out.println(s);
        }


    }
}
