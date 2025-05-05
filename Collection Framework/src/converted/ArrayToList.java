package converted;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//Convert an Array to ArrayList
public class ArrayToList {
    public static void main(String[] args) {
        String[] str = {"Apple","Banana","Orange","Mango"};

        //Method 1
        //Converting Array to ArrayList using Arrays.asList()
         ArrayList<String> list1 = new ArrayList<>(Arrays.asList(str));

        //Method 2
        // Declaring ArrayList
        ArrayList<String> al = new ArrayList<>();
        Collections.addAll(al,str);




    }
}
