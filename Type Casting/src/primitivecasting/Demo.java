package primitivecasting;

public class Demo {
    public static void main(String[] args) {
        //Widening (smaller to Bigger)
        //1.ex convert int to double
        int a = 25;
        double b = a;
        System.out.println(a+" "+b); // 25 25.0

        //int to double
        double c =50;
        System.out.println(c);//50.0

        //char to int
        char x= 'A';
        int y = x;
        System.out.println(x+" "+y);//A 65
        System.out.println("--------------------------------");

        //NARROWING (convert bigger to smaller )

        //convert double to int
        double i = 23.5;
        int j = (int) i;
        System.out.println(i+" "+j);//23.5  23

        //double to int
        int z  = (int)34.6;
        System.out.println(z);//34

        //int to char
        int p = 68;
        char q = (char)p;
        System.out.println(p+ " "+ q);//68 D

        System.out.println("----------------------------");

        System.out.println((int)65.8); //65
        System.out.println((char) 65);//A
        System.out.println("A"+"B");//AB
        System.out.println("A"+10);//A10
        System.out.println('A'+"B");//AB
        System.out.println("A"+10+20);//A1020
        System.out.println(10+20+"A");//30A
        System.out.println('A'+'B');//131
        System.out.println('a'+20);//117





    }
}
