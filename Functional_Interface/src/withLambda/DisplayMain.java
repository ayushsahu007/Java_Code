package withLambda;

public class DisplayMain {
    public static void main(String[] args) {
        //1. Implementing class
       DIsplay d1 = new DisplayImpl();
        System.out.println(d1.getSize("Lambda"));

        //Anonymous Inner Class
        DIsplay d2 = new DIsplay() {
            @Override
            public int getSize(String s) {
                return s.length();
            }
        };
        System.out.println(d2.getSize("Anonymous"));

        //Lambda Expression
        DIsplay d3 = (x) -> {
            return x.length();
        };
        System.out.println(d3.getSize("Lambda Expression"));

        //4. remove parenthesis and return keyword
        DIsplay d4 = s -> s.length();
        System.out.println(d4.getSize("Java"));

    }
}
