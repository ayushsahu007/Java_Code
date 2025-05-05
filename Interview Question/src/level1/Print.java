package level1;

public class Print {
    public static void main(String[] args) {
        //print hello world without any ";" semicolon
        //1
        if (System.out.printf("Hello World") == null){

        }
        //2
        if (System.out.append("Hello World") == null){

        }
        //3
        if (System.out.append("Hello World").equals(null)){

        }
        //4.
        for (int i = 0;i<1;System.out.println("Hello World")){
            i++;
        }
    }
}
