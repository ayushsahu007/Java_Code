package staticmethod;
interface B{
    static void demo(){
        System.out.println("India");
    }
}
class D implements B{
    //demo () not a override this is seprate method for class D
    static void demo(){
        System.out.println("Bharat");
    }
}
public class Test implements B {
    public static void main(String[] args) {
      D d = new D();
       B.demo(); //Access Interface name
        D.demo();//Access Class Name

    }
}
