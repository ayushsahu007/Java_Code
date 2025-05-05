package clonemethod;

public class Product implements Cloneable {
      int quantity,price;
      String type;
      @Override
    public Object clone() throws CloneNotSupportedException {
          return super.clone();
      }
      @Override
    public String toString(){
          return this.quantity+" "+this.price+" "+this.type;
      }
}
