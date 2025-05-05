package practice;

public class Custom {
    public static void both() throws ArithmeticException,ArrayIndexOutOfBoundsException {
        System.out.println(10 / 0);
        System.out.println("Hello");
        int[] arr1 = {1, 2, 3};
        System.out.println(arr1[5]);
    }
//    public static void div() throws ArithmeticException {
//        System.out.println(10 / 0);
//        System.out.println("Artimetic");
//    }
//    public static void arr() throws ArrayIndexOutOfBoundsException {
//        int[] arr1 = {1, 2, 3};
//        System.out.println(arr1[5]);
//        System.out.println("Array");
//    }
    public static void main(String[] args) {
        System.out.println("Start");
        try {
            both();
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
//        try {
//            div();
//            arr();
//        } catch (Exception e) {
//            System.out.println("Exception Super");
//            System.out.println("End");
//        }
        System.out.println("End");
    }
}
