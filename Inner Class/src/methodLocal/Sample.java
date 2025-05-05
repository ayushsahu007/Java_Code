package methodLocal;

public class Sample {
    void run(){
        System.out.println("Run() Started");
        //method loacl inner class
        class Demo{

        }
        Demo d = new Demo();
        System.out.println(d);
        System.out.println("Run() Ended");
    }
}
