package supplier;

import java.util.Date;
import java.util.function.Supplier;

//Write a Supplier to Supply date
public class Solution1 {
    public static void main(String[] args) {
//        Date d = new Date();
//        System.out.println(d);
        Supplier<Date> s = new Supplier<Date>() {
            @Override
            public Date get() {
                return new Date();
            }
        };

        Supplier<Date> s1 = () -> new Date();
        System.out.println(s1.get());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(s1.get());
    }

}
