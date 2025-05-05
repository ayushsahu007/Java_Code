package comm;

public class Solution {
    public static void main(String[] args) {
        double[] marks = {98.2, 87.2, 45.6};
        //Forward  Traversing
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        System.out.println("-----------------------");
        //Reverse Traversing
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.println(marks[i]);
        }
    }
}
