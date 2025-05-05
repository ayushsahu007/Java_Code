package tostring;

public class Employee {
    int id;
    String name;

    Employee(int id,String name){
        this.id=id;
        this.name=name;
    }
    @Override
    public String toString(){
        return "Emp id of "+ name+" is "+id;
    }


    public static void main(String[] args) {
        Employee emp = new Employee(101,"Ramesh");
        Employee emp1= new Employee(102,"Rahul");
        System.out.println(emp);//emp.toString()
        System.out.println(emp1);//emp1.toString()

    }
}
