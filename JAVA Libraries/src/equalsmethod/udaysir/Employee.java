package equalsmethod.udaysir;

public class Employee {
    int id;
    double height;

    public Employee(int id, double height) {
        this.id = id;
        this.height = height;
    }
    @Override
    public boolean equals(Object obj){
        if (obj instanceof Employee){
            Employee e = (Employee) obj;
            return this.id==e.id && this.height==e.height;
        }
                   return false;
    }


    public static void main(String[] args) {
        Employee e1 = new Employee(101,5.6);
        Employee e2 = new Employee(101,5.6);

        System.out.println(e1.equals(e2));
        System.out.println("------------");
        System.out.println(new Employee(123,6.0).equals(new Employee(32,5.6)));

        if (e1.equals(e2)){
            System.out.println("Content are same");
        }else
            System.out.println("Content are Not Same");
    }
}
