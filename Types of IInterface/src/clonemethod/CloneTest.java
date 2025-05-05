package clonemethod;

public class CloneTest {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.type = "Soap";
        p1.quantity = 3;
        p1.price = 300;

//        try {
//            Object obj = p1.clone();
//            Product p = (Product) obj;
//            System.out.println(p.quantity+" "+p.type+" "+p.price);
//            System.out.println(p);
//        } catch (CloneNotSupportedException e) {
//            System.out.println("Clone Failed");
//        }
        System.out.println(p1);

        try {
            p1.clone();
            System.out.println("Cloning Success");
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
