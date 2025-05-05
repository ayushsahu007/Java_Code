package singletonDesign;

public class Aadhar {
  private static Aadhar a = null;
    private Aadhar(){
        System.out.println("Aadhar");
    }
    public static void aadharObject(){
       if (a == null)
           a = new Aadhar();
        System.out.println(a);

    }
}
