import java.lang.reflect.Array;

public class MultiCatch {
    public static void main(String[] args) {
        int[] a = {10,20,30,40};

        try {
            System.out.println(a[33]);
        }catch (ArithmeticException e){
            System.out.println("Denominator should not be zero");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Specified Index is not present");
        }
        System.out.println("End");
    }
}
