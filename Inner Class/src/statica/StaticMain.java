package statica;

public class StaticMain {
    public static void main(String[] args) {
        Sample s = new Sample();
        System.out.println(s);
        Sample.Demo s1 = new Sample.Demo();
        System.out.println(s1);
    }
}
