package normal.useInterface;

public class Main {
    public static void main(String[] args) {
        Test.Demo d = new Test.Demo() {
            @Override
            public void test() {
                System.out.println("We can use Class Inside Interface");
            }

            @Override
            public void demo() {
                System.out.println("Normal method");
            }
        };
        d.demo();
        d.test();
    }
}
