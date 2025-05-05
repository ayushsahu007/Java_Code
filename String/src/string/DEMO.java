package string;

public class DEMO {
    public static void main(String[] args) {
        String s = "Ayush"; // object - ayush
        System.out.println(s);
        s = "Ayush" + "Sahu"; //objct - Ayush sahu
        System.out.println(s);
        s = s+"new"; //object - new
        System.out.println(s); //object - ayushsahunew

        String s1 = "James";
        s.concat("Bond");
        System.out.println(s1);

        String nm =new  String("Ayush");
        String s3 = "Ayush";
        String s2 = "Ayush";

        String st =new  String("Good");
        String st1 = st.concat("Morning");
        System.out.println(st1);

        Pen p1 = new Pen();
        Pen p2 = p1;
        System.out.println(p1 == p2);

        String sp = "Bharat";
        String sp1 = "Bharat";
        String sp2 = new String("Bharat");
        System.out.println(sp==sp1);
        System.out.println(sp.equals(sp2));

        String e1= new String("India");
        String e2 = "Great";
        String e3 = e1.concat(e2);
        String e4 = "IndiaGreat";
        System.out.println(e3==e4);
        System.out.println(e3.equals(e4));

        String x = "Hello";
        x = x+"World";
        System.out.println(x); //HelloWorld
        String y = "HelloWorld";
        System.out.println(x == y); //false
        String z = "HelloWorld";
        System.out.println(z==y);

        String a = "India";
       a = a.concat("Hindustan");
         String b =   a+"Hindustan";
        System.out.println(a==b);

















    }
}
