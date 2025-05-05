package normal;

public class InnerMain {
    public static void main(String[] args) {
        Sample s = new Sample();
        System.out.println(s);
        //one way
        Sample.Demo s1 = s.new Demo();
        System.out.println(s1);
     s1.test();

      //other way
        Sample.Demo s2 = new Sample().new Demo();
        s2.test();
    }
}
