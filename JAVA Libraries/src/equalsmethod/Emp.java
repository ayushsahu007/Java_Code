package equalsmethod;

public class Emp {
    int id;
    Emp(int id){
        this.id = id;
    }

    public static void main(String[] args) {
        Emp e1 = new Emp(101);
        Emp e2 = new Emp(101);
        System.out.println(e1.equals(e2));
    }
}
