package Anonymous;

public class MainPopcorn {
    public static void main(String[] args) {
        Popcorn popcorn = new Popcorn();
        popcorn.taste();

        Popcorn saltPopcorn = new Popcorn(){
            @Override
            public void taste(){
                System.out.println("taste salty");
            }
        };
        Popcorn caramalPopcorn = new Popcorn(){
            @Override
            public void taste(){
                System.out.println("Sweet Popcorn");
            }
        };

        saltPopcorn.taste();
        caramalPopcorn.taste();
    }
}
