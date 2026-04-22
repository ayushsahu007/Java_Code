import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Solution6 {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(10) ; l.add(20) ; l.add(30) ; l.add(40) ; l.add(50) ; l.add(60) ;

        int[] a = l.stream().mapToInt(Integer :: intValue).toArray();
        System.out.println(a);

        List<Integer> l2 = List.of(10,20,30,40,50);
        System.out.println(l2);


    }
}
