package learn_coding;

public class Suspend {
    public static void main(String[] args) {
        CommonCode s1  = new CommonCode();
        CommonCode s2  = new CommonCode();
        CommonCode s3  = new CommonCode();
        s1.setName("Tony");
        s2.setName("Hulk");
        s3.setName("Loki");

        s1.start();

        s2.start();
        s2.suspend();

        s3.start();
        s2.resume();


    }
}
