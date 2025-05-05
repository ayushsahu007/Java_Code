package comm;

public class Demo2 {
    public static void main(String[] args) {
        int a[] = {10,20,30};
        for (int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }

        System.out.println("-----------------------------");
        // Using For Each loop
        for (int b : a){
            System.out.println(b);
        }

        System.out.println("------------------------------");
        String[] fruits = {"Apple","Banana","Mango","orange"};

        for(int i = 0; i<fruits.length;i++)
        {
            System.out.println(fruits[i]);
        }
    }
}
