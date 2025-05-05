package inheritance;

// Base interface (acts as ClassA)
interface A {
    default void show() {
        System.out.println("This is Super Interface ");
    }
}

// Interface extending A (acts as ClassB)
interface B extends A {
    default void show() {
        System.out.println("This is 1st Sub Interface ");
    }
}

// Another interface extending A (acts as ClassC)
interface C extends A {
    default void show() {
        System.out.println("This is 2nd Sub Interface");
    }
}

// ClassD implements both B and C, resolving the conflict
class D implements B, C {
    @Override
    public void show() {
        System.out.println("This is Sub Class");
        B.super.show(); // Explicitly calling B's show()
        C.super.show(); // Explicitly calling C's show()
    }
}

// Main Class
public class DiamondPrablam {
    public static void main(String[] args) {
        D obj = new D();
        obj.show(); // Calls the resolved method
    }
}
