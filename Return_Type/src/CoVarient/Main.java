package CoVarient;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        Parent p = new Child();
        parent.show();
        child.show();
        p.show();
    }
}
