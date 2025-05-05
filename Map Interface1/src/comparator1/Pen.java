package comparator1;

public class Pen {
    int cost;
    Pen(int cost){
        this.cost = cost;
    }
    @Override
    public String toString(){
        return "Cost :"+this.cost;
    }
}
