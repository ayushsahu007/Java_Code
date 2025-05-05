package singletonDesign;

public class Account {
       private static  Account ac = null;
    private Account(){
        System.out.println("Object Created");
    }
    public static void createObject(){
               if (ac==null){
                   ac = new Account();
               }
               else {
                   System.out.println("Object not Created");
               }
               }

}
