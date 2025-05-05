package learn_coding;

public class  Sleep extends Thread {

    @Override
    public void run(){
       String n = Thread.currentThread().getName();
       for (int i = 0;i<10;i++){
           try {
               System.out.println(n);
               Thread.sleep(2000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
    }
}
