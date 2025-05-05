package Anonymous;

public class InnerMainThread {
    public static void main(String[] args) {
        Runnable r1  = new Runnable() {
            @Override
            public void run(){
                for (int i = 0;i<10;i++){
                    System.out.println("First Inner Thread");
                }
            }
        };
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0;i<10;i++){
                    System.out.println("Second Inner Class");
                }
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        for (int i = 0;i<10;i++){
            System.out.println("Inner Main Thread");
        }
    }
}
