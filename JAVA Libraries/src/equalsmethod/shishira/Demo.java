package equalsmethod.shishira;

public class Demo {
    public static void main(String[] args) {
        String s1 = new String("Guldu");
        String s2 = new String("guldu");
        System.out.println(s1==s2);//false
        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equalsIgnoreCase(s2));//true
    }
}
