package normal.useInterface;
public class InterfaceContainer {

    interface DefaultNestedInterface { // default access
        void display();
    }

    class Impl implements DefaultNestedInterface {
        public void display() {
            System.out.println("DefaultNestedInterface implemented.");
        }
    }

    public static void main(String[] args) {
        InterfaceContainer ic = new InterfaceContainer();
        DefaultNestedInterface d = ic.new Impl();
        d.display();
    }
}

