package durgesh;

public class Main {
    public static void main(String[] args) {
        //this is 1 way to achieve interface ka method
            MyInter m = new MyInterImpl();
            m.sayHello();

/*            another way to achieve interface method
             ,without creating new class using
            anonymous class */

        //this is anonymous class
        MyInter m1 = new MyInter() {
            @Override
            public void sayHello() {
                System.out.println("This is 1st Anonymous class");
            }
        };

        m1.sayHello();

        MyInter m2 = new MyInter(){
            @Override
            public void sayHello(){
                System.out.println("This is 2nd Anonymous Class");
            }
        };

        m2.sayHello();

      //  3rd way achieve interface method by using lambda

//        MyInter i = () -> {
//            System.out.println("this is lambda");
//        };
MyInter i = () -> System.out.println("this is lambda");
     i.sayHello();
     MyInter i2 = () -> System.out.println("this is 2nd time using lambda");
  i2.sayHello();



    }
}
