package Collection.List;

import java.util.*;

public class ArrayL {
    public static void main(String[] args) {
        Student s = new Student(1,67,"ram");
        Student s1= new Student(2,87,"syam");
        Student s2= new Student(3,63,"mohan");
        Student s3= new Student(4,85,"tiwari");


      //  LinkedList<Student> list = new LinkedList<>(Arrays.asList(s,s1,s3,s2));

        ArrayList<Student>list = new ArrayList<>();
//     list.add(s);   list.add(s1);   list.add(s2);   list.add(s3);

        Collections.addAll(list,s1,s2,s3,s);
        System.out.println(list);
//
//     for (Student student : list){
//         System.out.println(student);
//     }
// Collections.sort(list);
//        System.out.println("---------------------");
//        for (Student student : list){
//            System.out.println(student);
//        }

//    Student se =  list.get(2);
//        System.out.println(se);


//Convert to Array
//        Student[] arr = list.toArray(new Student[0]);
//
//        for (Student string : arr){
//            System.out.println(string);
//        }

//        Collections.list(list);

    }

}
