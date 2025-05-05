package comm;

public class Demo {
    public static void main(String[] args) {
        // ARRAY Declartion
        int []  a;
        // Array Creation
        a = new int[3];

        //PRINTING ARRAY ELEMENTS
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println("Length: "+a.length);
        System.out.println("----------------------");

        //ARRAY INITIALIZATION

      a[0] = 10;
      a[2] = 30;

        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println("Length: "+a.length);
        System.out.println("----------------------");

        //Array declartion and creation

        double[] d = new double[2];

        System.out.println(d[0]);
        System.out.println(d[1]);
        System.out.println("Length: "+d.length);
        System.out.println("---------------------");

        d[0] = 1.2;
        d[1] = 2.4;

        System.out.println(d[0]);
        System.out.println(d[1]);
        System.out.println("Length: "+d.length);
        System.out.println("---------------------");







    }
}
