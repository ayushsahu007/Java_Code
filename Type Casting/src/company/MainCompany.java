package company;

public class MainCompany {
    static void display(Employee obj){
        if(obj instanceof Developer){
            //Downcast to Devloper & access id & develop()
            Developer d =(Developer) obj;
            System.out.println("Id "+d.id);
            d.devolop();
        }
        else if (obj instanceof Tester){
            //Downcast to Tester & access id & test()
            Tester t = (Tester) obj;
            System.out.println("Id "+t.id);
            t.test();
        }
    }
    public static void main(String[] args) {
        display(new Developer());
        System.out.println("--------------------");
        display(new Tester());
    }
}


