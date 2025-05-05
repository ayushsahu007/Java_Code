package rtp;

public class MainRunner {

    static void display(Employee obj){
        obj.work();
    }
    public static void main(String[] args) {
        //1.Upcasting method
        display(new Developer());//rule 3
        display(new Tester());//rule 3

        System.out.println("===================");
        //2.Upcasting using seperate reference variable
           Employee e1 = new Developer();
           e1.work();
           Employee e2 = new Tester();
           e2.work();
        System.out.println("----------------");
        //3.Upcasting using single refernce variable
        Employee e;
        e = new Developer();
        e.work();
        e = new Tester();
        e.work();

    }
}
