package defaultmethod;

public interface MyInterafce {
    default void test(){
    }
    default void demo(){
        System.out.println("This is demo");
    }
}

