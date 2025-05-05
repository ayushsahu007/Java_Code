package practice;

public class OnlyTry {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        } catch (ArithmeticException e){
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
