package level1;

public class DividedByZero {
    /*
    What will be the output when you divide a number by zero ?
    NUmber = Integer,Double,Float
     */
    public static void main(String[] args) {
        System.out.println(10.0/0);//
        System.out.println(12.22f/0);
        System.out.println(39/0.0);
        System.out.println(19.999d/0);
        System.out.println(0/0.0); //NaN
        System.out.println(0.0/0);//NaN
        System.out.println(0.0/0.0);//NaN
        System.out.println(12.33/0.0);
    }
}
