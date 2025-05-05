package singletonDesign;

public class PrimeMinister {
    private static PrimeMinister pm;
    public String name = "Modi";
    private PrimeMinister(){
        System.out.println("pm selected in this election");
    }
    public static PrimeMinister createAndReturn(){
        if (pm == null){
            pm = new PrimeMinister();
        }
        return pm;
    }
}
