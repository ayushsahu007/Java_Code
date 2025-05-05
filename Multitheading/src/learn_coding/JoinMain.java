package learn_coding;

public class JoinMain {
    public static void main(String[] args) {
        CommonCode j1  = new CommonCode();
        CommonCode j2  = new CommonCode();
        CommonCode j3  = new CommonCode();
        j1.setName("thread 1");
        j2.setName("thread 2");
        j3.setName("thread 3");

        j1.start();
        j2.start();
        try {
            j2.join();
        } catch (InterruptedException e) {
             e.getMessage();
        }
        j3.start();
    }
}
