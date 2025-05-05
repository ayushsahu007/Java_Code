package pratice;

public class Sub3 extends Sub1 implements Sub2 {
    Sub3(){
        System.out.println("this is 3 subclass zero const");
    }
    Sub3(int a){
        super("style");
        System.out.println("this is 3 subclass para const");
    }
    @Override
    public void type(){
        System.out.println("this is parent interface");
    }
    @Override
    public void style(){
        System.out.println("This is sub interface");
    }
}
