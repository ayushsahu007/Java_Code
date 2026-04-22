package engineering_digest;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        A my = new A();
        System.out.println(my.getState());
        my.start();
        System.out.println(my.getState());
        my.join();
        System.out.println(my.getState());
        
    }
}
