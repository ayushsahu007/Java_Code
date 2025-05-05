package learn_coding;

public class SleepMain {
    public static void main(String[] args) {

        Sleep s = new Sleep();
        Sleep s1 = new Sleep();
        Sleep s2 = new Sleep();

        s.setName("thread 1");
        s1.setName("thread 2");
        s2.setName("thread 3");

        s.start();
        s1.start();
        s2.start();

    }
}
