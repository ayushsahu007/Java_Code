package staticmethod;
interface A {
    static void sayHello(){
        System.out.println("Hello ");
    }
}
public class Myclass implements A{
    public static void main(String[] args) {
        Myclass m = new Myclass();
        //m.sayHello(); -> error
        //Myclass.sayHello(); -> error
        /* interface method access only interface name
            nor class anme neither object reference
         */
        A.sayHello();
    }

}
