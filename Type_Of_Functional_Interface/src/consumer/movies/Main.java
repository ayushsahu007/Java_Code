package consumer.movies;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<Movie> c1 = movie -> System.out.println(movie.name+" has been released");
        Consumer<Movie> c2 = movie -> System.out.println(movie.name+" was a "+movie.result+"movie");
        Consumer<Movie> c3 = movie -> System.out.println(movie.name+" Has been stored into database");

        Movie m1 = new Movie("Inception","SuperHit");
        c1.andThen(c2).andThen(c3).accept(m1);

        Movie m2 = new Movie("kgr","hit");
        c1.andThen(c2).andThen(c3).accept(m2);
    }
}
