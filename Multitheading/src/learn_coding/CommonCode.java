package learn_coding;

public class CommonCode extends Thread {
    @Override
    public void run(){
        String s = Thread.currentThread().getName();
        for (int i = 0;i<3;i++){
            System.out.println(s);
            //this is for yield method
           // Thread.yield();
        }
    }
}
