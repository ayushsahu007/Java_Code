package wayToUsageLambda;

public class LambdaDemo {
    public static void main(String[] args) {
        //Normal Class
        Sample s = new SampleImpl();
        s.run();

        //Anonymous Class
        Sample s1 = new Sample() {
            @Override
            public void run() {
                System.out.println("Anonymous Class");
            }
        };
        s1.run();

        //Lambda Expression
        Sample s3 = () ->
        {
            System.out.println("Lambda");
        };
        s3.run();

        //simplified way
        Sample s4 = () -> System.out.println("Simplified way");
        s4.run();
    }
}
