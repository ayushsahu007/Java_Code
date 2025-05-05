package normal.modifier;

public class Access {
    public  int a = 10;
    private int b = 20;
    protected int c = 30;

     void test(){
        System.out.println("This is Outer Class");
    }
       class Modifier{
            void test (){
                System.out.println(a+b+c);

            }
    }
}
