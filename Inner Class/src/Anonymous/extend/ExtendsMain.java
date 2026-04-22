package Anonymous.extend;

public class ExtendsMain {
    public static void main(String[] args) {
        Popcorn popcorn = new Popcorn();
        popcorn.taste();

        Popcorn saltyPopcorn = new SaltyPopcorn();
        saltyPopcorn.taste();

        CaramelPopcorn caramelPopcorn  = new CaramelPopcorn();
        caramelPopcorn.taste();
    }
}
