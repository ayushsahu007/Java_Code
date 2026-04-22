package normal;

public class Sample {
   // private int a =10;
   final int a = 10;
    class Demo{
         void test() {
            System.out.println("this is Inner Class");
            //any private variable use in inner class
           // System.out.println(a);
        }
    }

//    public static void main(String[] args) {
//        Demo d = new Sample().new Demo();
//        d.test();
 //   }
}
