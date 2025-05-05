package constructoroverloading;

public class Test {
    void printDetails(String name){
        System.out.println("Name :"+name);
    }
    void printDetails(String name,int age){
        System.out.println("Name :"+name+" Age :"+age);
    }
    void printDetails(String name,int age,String occ){
        System.out.println("Name :"+name+" Age "+age+" Occu :"+occ);
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.printDetails("Ayush");
        t.printDetails("Manoj",25);
        t.printDetails("Shisra",45,"Java Trainer");
    }
}
