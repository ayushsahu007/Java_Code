package builder;

public class ProductMain {
    public static void main(String[] args) {
        Product p  = new Product.Builder()
                .setId(11)
                .setName("Laptop")
                .setPrice(3245)
                .setQuantity(3)
                .setType("Electronics")
                .build();
    }
}
