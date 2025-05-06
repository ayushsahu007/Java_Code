package consumer.movie;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Bahubali","Prabhas","Anushka"));
        movies.add(new Movie("Kantara","Rishab","Saptami"));
        movies.add(new Movie("Matrix","Neo","Trinity"));
        movies.add(new Movie("Vettayan","Rajanikant","Manju"));

        Consumer<Movie> c = movie -> {
            System.out.println(movie.name);
            System.out.println(movie.hero);
            System.out.println(movie.heroine);
            System.out.println("--------------");
        };

        for (Movie m : movies){
            c.accept(m);
        }

    }
}
