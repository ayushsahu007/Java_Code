package Array;

public class Ques1 {
    public static void main(String[] args) {
        int arr[] = {1,7,23,32,55};
        int target = 70;
        boolean flag = false;
        for (int i = 0; i<arr.length;i++){
            if (arr[i] == target){
                System.out.println("Element Found");
                flag = true;
            }
        }
        if (flag == false){
            System.out.println("Element not found");
        }
    }
}
