package durgesh;

public class ThreadOP {
    public static void main(String[] args)  {
        System.out.println("Start Program ");
        int x = 20+23;
        System.out.println(x);
            Thread t =  Thread.currentThread();
            String threadName = t.getName();
        System.out.println(threadName);
        System.out.println("I want to change Theard Name");
        t.setName("Java");
        try {
            Thread.sleep(100);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(t.getName());
        System.out.println(t.getId() );
        //user defined thread
        UserThread us = new UserThread();
        us.start();
        System.out.println("End Program");
    }
}
