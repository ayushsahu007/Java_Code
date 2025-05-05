package equalsmethod;

public class Employees{
    int id;
    Employees(int id){
        this.id = id;
    }
    @Override
    public boolean equals(Object obj){ // Upcasting
        if (obj instanceof Employees){
            Employees emp = (Employees) obj; //DownCasting
            return this.id == emp.id; //Comparision
        }
        return false;
    }
    public static void main(String[] args) {
        Employees e1 = new Employees(101);
        Employees e2 = new Employees(101);
        Employees e3 = new Employees(102);
        System.out.println(e1.equals(e2));
        System.out.println(e1.equals(e3));

    }
}
