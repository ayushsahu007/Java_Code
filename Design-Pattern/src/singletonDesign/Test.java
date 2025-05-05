package singletonDesign;

public class Test {
    public static void main(String[] args) {
      PrimeMinister pm =   PrimeMinister.createAndReturn();
        System.out.println("Name :"+pm.name);
    }
}
