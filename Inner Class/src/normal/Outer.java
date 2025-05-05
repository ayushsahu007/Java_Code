package normal;

public class Outer {
    private int a = 10;
     public class Inner {
        public  static void today(){
            System.out.println("aeswr");
        }
    }

    public static void main(String[] args) {
     //   Outer.Inner in = new Outer().new Inner();
        Outer.Inner.today();    }
}
