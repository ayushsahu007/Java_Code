package comparable.shishira;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ALSortDemo {
    public static void main(String[] args) {
        Student s1 = new Student(12,35.6,"Rimuru");
        Student s2 = new Student(233,50.66,"Alice");
        Student s3 = new Student(526,99,"Chloe");
        Student s4 = new Student(89,63.6,"Ranga");

        List<Student> lst = new LinkedList<>();
        lst.add(s1); lst.add(s2); lst.add(s3);lst.add(s4);
        System.out.println("------------------------------------");

        for (Student s : lst){
            System.out.println(s);
        }
        Collections.sort(lst);
        System.out.println("-----------------------------------");

//        for(int i = 0;i<lst.size();i++){
//            Student s = lst.get(i);
//            System.out.println(s);
//        }
        for (Student s : lst){
            System.out.println(s);
        }



    }
}
