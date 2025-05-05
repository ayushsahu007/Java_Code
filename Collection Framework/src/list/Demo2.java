package list;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo2 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);//0
//        list.add(5);//1
//        list.add(80);//2
       // System.out.println(list.get(2)); //2nd index --> 80
        //System.out.println(list.size());//3
        //1st way to fecth data for loop
//        for (int i = 0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
      //2nd way to fetch data for each loop
//        for (int x: list){
//            System.out.println(x);
//        }
        //3rd way
//        System.out.println(list);
//
//        System.out.println(list.contains(5)); //check element present or not
//        System.out.println(list.contains(50));
//
//        list.remove(2);//remove based
//        list.add(2,50); //add element index based
//        list.set(2,40);//set /replace data index based



        ArrayList<Integer> list1 = new  ArrayList<>(1000);
        System.out.println(list1.size());// 0 but capacity is 1000
        //System.out.println(list1.get(0)); // IndexOutOfBoundException

        ArrayList<Integer>list2 = new ArrayList<>(11);
        list2.add(1);  list2.add(1); list2.add(1);
        list2.add(1);  list2.add(1); list2.add(1);
        list2.add(1);  list2.add(1); list2.add(1);
        list2.add(1);  list2.add(1);

        System.out.println(list2.size()); // 11
        list2.add(1);
        System.out.println(list2.size());//12 but capacity increse by 1.5x = 17

        //how to check capacity  main method m exception throw krna hoga
        // Use reflection to access the 'elementData' array
//        Field field = ArrayList.class.getDeclaredField("elementData");
//        field.setAccessible(true);
//        Object[] elementData = (Object[]) field.get(list);

        // The length of 'elementData' array is the capacity
      //  System.out.println("Capacity: " + elementData.length);
        //note - element ko remove karne se capcity km nhi hoti
        //agr capcity ko kam karna hai to toToSize() method ka use krne se capsity km ho jati hai

        System.out.println("--------------------------------------");
        //another way to create a arraylist
        //isme list3 m upcasting hai
        List<String> list3 = Arrays.asList("Monday", "Tuesday", "Sunday");

        String[] array = {"Cat","Dog","Tom"};
            List<String> list4 = Arrays.asList(array);

        List<Integer> list5 = List.of(1, 2, 3, 4, 5);//repalce method on working


        List<String> anotherList = Arrays.asList("Apple","Banana","Orange");
        ArrayList<String> listFromCollection = new ArrayList<>(anotherList);
        System.out.println(listFromCollection);





    }
}
