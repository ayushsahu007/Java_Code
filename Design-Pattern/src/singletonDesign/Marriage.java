package singletonDesign;

public class Marriage {
    private static Marriage m = null;
    int age =25;

    private Marriage(){
        System.out.println("Got Married");
    }

    public static Marriage createAndReturn(){
        if (m == null){
            m = new Marriage();
        }
        return m;
    }
}
