package Anonymous;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator cal = new Calculator() {
           public void add(int a, int b){
               System.out.println(a+b);
            }

            public void sub(int a,int b){
                System.out.println(a-b);
            }

             public void mul(int a,int b){
                 System.out.println(a*b);
             }

             public void div(int a,int b){
                 System.out.println(a/b);
             }
             public void mod(int a,int b){
                 System.out.println(a%b);
             }
        };

        cal.add(10,20);
        cal.sub(20,40);
        cal.mul(30,2);
        cal.div(40,2);
        cal.mod(10,5);
    }
}
