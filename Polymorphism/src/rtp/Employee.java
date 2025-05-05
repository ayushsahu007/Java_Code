package rtp;

 class Employee {
    void work(){
        System.out.println("Employee is working");
    }
}

class Developer extends Employee{
     @Override
    void work(){
         System.out.println("Developing App ");
     }
}

class Tester extends Employee{
     @Override
     void work(){
         System.out.println("Testing App");
     }

}
