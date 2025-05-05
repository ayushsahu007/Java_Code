package javabean;

public class Person {
    private int age;
    public void setAge(int age){
        if(age>0)
        {
            this.age=age;
            System.out.println("Vaild Age");
        }else
            System.out.println("Invaild Age");
    }
    public int getAge(){
        return age;
    }
}
