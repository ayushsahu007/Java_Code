package list;

import java.util.Arrays;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
                    ll.add(10);
                    ll.add(20);
                    ll.add(30);
        System.out.println(ll);
                     ll.addFirst(50);
        System.out.println(ll);
        ll.addLast(90);
        System.out.println(ll);
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.get(3));
        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat","Dog","Elephant"));
        System.out.println(animals);

        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Dog","Lion"));
        System.out.println(animalsToRemove);

        animals.removeAll(animalsToRemove);
        System.out.println(animals);

    }

}
