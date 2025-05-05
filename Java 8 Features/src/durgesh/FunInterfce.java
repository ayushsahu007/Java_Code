package durgesh;

public class FunInterfce {
    public static void main(String[] args) {
//        SumInter s = (int a,int b) -> {
//                 return a+b;
//        };

        SumInter s = (a,b) -> a+b;

        System.out.println(s.sum(10,20));
        System.out.println(s.sum(10,40));

        LengthInter l = (str) -> str.length();

        System.out.println(l.getLength("Ayush"));


    }
}
