package normal.useInterface;

public interface OuterInterface {
    void outerMethod();

    interface InnerInterface {
        void innerMethod();
    }
}

class InterfaceImpl implements OuterInterface, OuterInterface.InnerInterface {
    public void outerMethod() {
        System.out.println("OuterInterface method implemented.");
    }

    public void innerMethod() {
        System.out.println("InnerInterface method implemented.");
    }

    public static void main(String[] args) {
        InterfaceImpl impl = new InterfaceImpl();
        impl.outerMethod();
        impl.innerMethod();
    }
}


