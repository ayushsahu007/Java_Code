package builder;

public class Product {
              private final int id;
               private final String name;
               private final int quantity;
               private final double price;
               private final String type;


               //Constructor Of Product
       public Product(Builder b) {
        this.id = b.id;
        this.name = b.name;
        this.quantity = b.quantity;
        this.price = b.price;
        this.type =b.type;
    }

    //Static Nested Class
    static class Builder{
        private  int id;
        private String name;
        private int quantity;
        private double price;
        private String type;

        //Constructor of Builder Class
        public Builder() {

        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Product build(){
            return new Product(this);
        }
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
