package hotel;
//class inherit only one class and class implements multiple interface
//              1.first extends    2.implements
public class Jerry extends Person implements Hotel,Theatre{
    @Override
    public void orderFood(String name){
        //incre and visibility of method use public specifier
        System.out.println("Ordering Food "+name);
    }

    @Override
   public void watchMovie(String name){
        System.out.println("Watching "+name);
    }
    //Not mandatory to override as it concrete
    @Override
    void walk(){
        System.out.println("Walking");
    }

    @Override
    void eat(){
        System.out.println("Eating Food");

    }
    //Optionally we can also override walk () from Person,but not Mandatory
    //as its already a concrete method
    public static void main(String[] args) {
        Jerry j = new Jerry();
        j.walk();
        j.orderFood("Dosa");
        j.eat();
        j.watchMovie("Puspa ");
    }
}
