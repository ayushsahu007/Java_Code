package thows;

public class Solutions2 {
    static void run() throws ArithmeticException{
        System.out.println(10/0);
//        try {
//            throw new ArithmeticException();
//        }catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }
    }
    public static void main(String[] args) {
        System.out.println("Start");
        try {
            run();
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        System.out.println("End");

    }
}

