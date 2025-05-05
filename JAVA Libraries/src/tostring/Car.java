package tostring;

public class Car {
    @Override
    public String toString(){
        return "Car@100";
    }
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c);//c.toString()

        /**
         * 1.c.toString();
         * 2.String Representation of an object
         * 3.FullyQualifiedClassName@HexadecimalValueOfHashCode
         */

    }
}
