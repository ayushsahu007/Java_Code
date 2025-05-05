package serialization;

import java.io.Serializable;

public class Student implements Serializable {
    int id;
    String name;
    double perc;
    public Student(int id,String name,double perc){
        this.id = id;
        this.name = name;
        this.perc = perc;
    }
}
