package normal.useInterface;

public class ContainerClass {
    // Nested interface with public access
    public interface PublicNestedInterface {
        void show();
    }

    // Nested interface with private access
    private interface PrivateNestedInterface {
        void hidden();
    }

    class Implementation implements PublicNestedInterface {
        public void show() {
            System.out.println("PublicNestedInterface implemented.");
        }
    }

    private class HiddenImplementation implements PrivateNestedInterface {
        public void hidden() {
            System.out.println("PrivateNestedInterface implemented.");
        }
    }

    public void testPrivateInterface() {
        PrivateNestedInterface p = new HiddenImplementation();
        p.hidden();
    }

    public static void main(String[] args) {
        ContainerClass c = new ContainerClass();
        PublicNestedInterface pub = c.new Implementation();
        pub.show();

        c.testPrivateInterface();
    }
}
