package constructoroverloading;
//Overloading using Static keyword
public class Demo {
    static void student(String name){
        System.out.println("Method 1 for Name");
    }
    static void student(String name,int age){
        System.out.println("Method 2 for Name,Age");
    }
    static void student(String name,int age,long contact){
        System.out.println("Method 3 for Name,Age,Contact");
    }

    public static void main(String[] args) {
       Demo.student("Tom");
       Demo.student("Jack",32);
       Demo.student("Jerry",20,685432L);
    }
}
