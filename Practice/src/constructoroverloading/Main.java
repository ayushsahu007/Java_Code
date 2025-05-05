package constructoroverloading;

class Book {
    String title;
    String author;

    // Constructor with title only
    public Book(String title) {
        this.title = title;
    }

    // Constructor with both title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Java Basics");
        Book book2 = new Book("Java Basics", "John Doe");
        
    }
}
