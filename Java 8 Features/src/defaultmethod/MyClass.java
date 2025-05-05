package defaultmethod;
interface A{
    default void sayHello(){
        System.out.println("A says Hello");
    }
}
interface B{
    default void sayHello(){
        System.out.println("B says Hello");
    }
}
public class MyClass implements A,B {
    public static void main(String[] args) {
             MyClass m = new MyClass();
             m.sayHello();
    }

    @Override
    public void sayHello() {
        A.super.sayHello();
        B.super.sayHello();
        System.out.println("Own Method");
    }
}
