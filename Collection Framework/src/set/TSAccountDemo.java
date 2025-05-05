package set;

import java.util.Iterator;
import java.util.TreeSet;

public class TSAccountDemo {
    public static void main(String[] args) {
        Account a1 = new Account(2542748596L,"Guldu",12000.50);
        Account a2 = new Account(987340246L,"Dinga",8900.50);
        Account a3 = new Account(789249026L,"Rocky",34500.50);
        Account a4 = new Account(592120496L,"Chandu",67330.50);

        TreeSet<Account> ts = new TreeSet<Account>(); //--->Comparable
        ts.add(a1); ts.add(a2); ts.add(a3); ts.add(a4);

        Iterator<Account> itr =ts.iterator();
        while (itr.hasNext()){
            Account a = itr .next();
            System.out.println(a);

        }
    }
}
