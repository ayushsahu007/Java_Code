package durgesh;

public class UserThread extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.getMessage();
        }
        System.out.println("This is user defined thread ");
    }
   
}
