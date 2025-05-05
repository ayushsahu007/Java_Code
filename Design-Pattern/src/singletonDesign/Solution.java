package singletonDesign;

public class Solution {
    public static void main(String[] args) {
      Marriage m =   Marriage.createAndReturn();
        System.out.println("Age :"+m.age);
    }
}
