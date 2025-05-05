package string;
//how to make our class as immutable
public final class Test1 {
    private final int i;
    public Test1(int i){
        this.i = i;
    }
    public int getI() {
        return i;
    }
    public Test1 modify(int k){
        if (this.i == k){
            return this;
        }else {
            return new Test1(k);
        }
    }

    public static void main(String[] args) {
        Test1 t1 = new Test1(10);
        //t1.i  = 25; //error
        Test1 t2 = t1.modify(10);
        Test1 t3 = t1.modify(20);
    }
}