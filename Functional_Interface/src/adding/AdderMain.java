package adding;

public class AdderMain {
    public static void main(String[] args) {

        //Implementing class
        Adder a = new AdderImpl();
        a.add(20,30);

        //Anonymous class
        Adder a1 = new Adder() {
            @Override
            public void add(int a, int b) {
                System.out.println(a+b);
            }
        };
        a1.add(10,40);

        //Lambda Expression
        Adder a2 = (int x ,int y) -> {
            System.out.println(x+y);
        };
        a2.add(50,10);
        // without data type
        Adder a3 = (m,n) -> {
            System.out.println(m+n);
        };
        a2.add(10,20);

        //more simplifie one line
        Adder a4 = (o,p) -> System.out.println(o + p);
        a4.add(10,30);
    }
}
