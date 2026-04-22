package byNaveen;

//Print from 1 to 100 without using any number
public class Ques1 {
    public static void main(String[] args) {
        int one = 'A'/'A';  // 1
        String s1 = "..........";
        // String s1.length() --> 10;
        //way 1
        //(int i = 1 ; i <= (10 * 10 = 100); i++)
        for(int i = one ; i<=(s1.length()*s1.length());i++){
            System.out.println(i);
        }

        //way 2
        //ascii value a = 97 , b = 98 , c = 99 ,d = 100
        //int (int i = 1;i<= 100 (d) ; i++
     for (int i = one ; i<='d';i+=one){
    System.out.println(i);
         }
    }
}
