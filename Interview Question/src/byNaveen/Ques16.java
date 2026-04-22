package byNaveen;

import java.util.HashSet;
import java.util.Set;

//Find Duplicate element in an Array
public class Ques16 {
    //1.brute fore
    //2.HashSet
    //3.HashMap<K , V>
    //4.Stream
    public static void main(String[] args) {
        String infra[] = {"Amazon","GCP","Google","Meta","Google","Meta","IBM"};
        //1.Brute force
        System.out.println("**************Brute Force******************");
        for (int i =0;i<infra.length;i++){
            for (int j = i+1;j<infra.length;j++){
                if (infra[i].equals(infra[j])){
                    System.out.println(infra[i]);
                }
            }
        }
        System.out.println("**************Hash Set********************");
        Set<String> data = new HashSet<String>();
        for (String e : infra){
           if (data.add(e) == false){
               System.out.println(e);
           }
        }
        System.out.println("**************Hash Map********************");
//        HashMap<String,Integer> infraMap = new HashMap<String , Integer>();
//        for (String e : infra){
//        Integer count =  infraMap.get(e);
//        if (count == null){
//            infraMap.put(e,1);
//        }
//        }
    }
}
