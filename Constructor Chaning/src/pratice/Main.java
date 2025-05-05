package pratice;

public class Main {
    public static void main(String[] args) {
        Sub3 s1 = new Sub3();
        System.out.println("--------------------------------------");
       Sub3 s2 = new Sub3(10);
        System.out.println("---------------------------------------");
        s1.type();
        s1.style();
        System.out.println("---------------------------------------");
        s2.type();
        s2.style();
    }
}
