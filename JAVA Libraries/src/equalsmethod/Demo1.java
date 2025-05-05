package equalsmethod;

public class Demo1 {
    public static void main(String[] args) {
        String s1 = new String("Ayush");
        String s2 = new String("ayush");
        String s3 = new String("Ayush");
        String s4 = new String("Sahu");
        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//false
        System.out.println(s1.equalsIgnoreCase(s2));//true
    }
}
