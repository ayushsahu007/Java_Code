package twoInterface;
interface Adder {
    void add(int a,int b);
}

interface Subtractor{
    void subtract(int a,int b);
}

public class AdderImpl {
    public static void main(String[] args) {

        Adder obj1 = (a,b) -> System.out.println(a+b);
        System.out.println(obj1);

        Subtractor obj2 = (a,b) -> System.out.println(a-b);
        System.out.println(obj2);

    }
}
