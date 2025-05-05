package normal.useInterface;

public class Test {
     interface Demo{
         default void test(){
             System.out.println("De");
         }
         void demo();
     }
}
