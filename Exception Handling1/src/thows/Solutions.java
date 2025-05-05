package thows;

public class Solutions {
    static void run() throws ArithmeticException{
       try {
           throw new ArithmeticException();
       }catch (ArithmeticException e){
           System.out.println(e.getMessage());
       }
    }
    public static void main(String[] args) {
        System.out.println("Start");
        run();
        System.out.println("End");

    }
}
