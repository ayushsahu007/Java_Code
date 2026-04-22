package durgesh;

public class Main {
    public static void main(String[] args) {
        //Traditional way
        Student s = new Student();
        s.setName("Rahul");
        s.setCity("Pune");
        s.setAge(20);
        System.out.println(s);

        //by using method chaining
       Vidyarthi v = new Vidyarthi();
       v.setName("Ram").setCity("Pune").setAge(34);
        System.out.println(v);

       //By using static method
        Vidyarthi v1 = Vidyarthi.of().setAge(34).setName("dfg").setCity("adsfghm");
        System.out.println(v1);

    }
}