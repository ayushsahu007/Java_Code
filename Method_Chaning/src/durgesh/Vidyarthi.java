package durgesh;

public class Vidyarthi {
    private String name;
    private int age;
    private String city;

    public Vidyarthi setName(String name) {
        this.name = name;
        return this;
    }

    public Vidyarthi setAge(int age) {
        this.age = age;
        return this;
    }

    public Vidyarthi setCity(String city) {
        this.city = city;
        return this;
    }
    public static Vidyarthi of(){
        return new Vidyarthi();
    }
}
