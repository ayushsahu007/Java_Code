package learncodeyt;

public class ThrowDemo {
    public static void main(String[] args) {
        ArithmeticException ae = new ArithmeticException("THis is My Exception");
        throw ae;
       // throw new ArithmeticException("This is new exception");
    }
}
