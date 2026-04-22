package engineeringDigest;

import java.util.Arrays;

//Why Use Stream
//Reduced line of code and improve readability
public class WhyUse {
    public static void main(String[] args) {
        //imperative approach
        int[] arr = {1,2,3,4,5};
        int sum = 0;
        for (int i = 0;i<arr.length;i++){
            if (arr[i]%2==0){
                sum+=arr[i];
            }
        }
        System.out.println("Sum of Even NUmber is "+sum);

        //Stream
     //   int sum1 = Arrays.stream(arr).filter(n -> n% 2 == 0)
    }
}
