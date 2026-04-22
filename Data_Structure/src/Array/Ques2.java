package Array;

import java.util.Scanner;

public class Ques2 {
    public static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
          //  int mid = start + (end - start)/2;
           int mid = (start + end)/2;
            if (arr[mid] == target){
                return mid;
            } else if (arr[mid]> target) {
                end = mid - 1;
            }else {
                start = mid +1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,7,28,32,55,72,88,100};
        int target = sc.nextInt();
        System.out.println(binarySearch(arr,target));
    }
}
