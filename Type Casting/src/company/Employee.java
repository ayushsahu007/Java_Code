package company;

class Employee {
    int id = 101;
}
class Developer extends Employee{
    void devolop(){
        System.out.println("Devloping App");
    }
}
class Tester extends Employee {
    void test(){
        System.out.println("Testing App ");
    }
}
