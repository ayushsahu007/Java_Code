package javabean;

public class HotelMainClass {
    public static void main(String[] args) {
        Hotel h = new Hotel();
        h.setName("Taj");
        h.setRating(4.5);
        System.out.println("Hotel Name: "+h.getName());
        System.out.println("Ratings: "+h.getRating());
    }
}
