package list;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>(11);
        System.out.println(list.size());
        list.add(1); list.add(1); list.add(1); list.add(1);
        list.add(1);list.add(1);list.add(1);list.add(1);
        list.add(1);list.add(1);list.add(1);
        System.out.println(list.size());
        list.add(1);

        System.out.println(list.size());
        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        Object[] elementData = (Object[]) field.get(list);

        // The length of 'elementData' array is the capacity
        System.out.println("Capacity: " + elementData.length);
    }
}
