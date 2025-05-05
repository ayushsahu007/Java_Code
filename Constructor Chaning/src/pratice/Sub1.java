package pratice;

public class Sub1 implements Parent{
    Sub1(){
        System.out.println("This subclass1 zero Constructor");
    }
    Sub1(String child){
        System.out.println("this subclass1 perameter constructor");
    }

    @Override
    public void type() {
        System.out.println("this is sub1 class");
    }
}
