package string;

public final class Test {
    private final int i; // Field is now final to prevent modification.

    // Constructor to initialize the field
    public Test(int i) {
        this.i = i;
    }

    // Getter to access the field (no setter allowed)
//    public int getI() {
//        return i;
//    }

    // Method that returns a new object if modification is needed
    public Test modify(int k) {
        if (this.i == k) {
            return this; // Return the same object if the state is unchanged
        } else {
            return new Test(k); // Create a new object if the state is different
        }
    }

    public static void main(String[] args) {
        Test t1 = new Test(10);

        // This line would cause a compile-time error because `i` is private and final.
        // t1.i = 25;

        // Using the modify method
        Test t2 = t1.modify(10); // Returns the same object (t1)
        Test t3 = t1.modify(20); // Returns a new object with i = 20

        // Print results to verify
//        System.out.println("t1.i: " + t1.getI()); // 10
//        System.out.println("t2 == t1: " + (t2 == t1)); // true
//        System.out.println("t3.i: " + t3.getI()); // 20
    }
}
