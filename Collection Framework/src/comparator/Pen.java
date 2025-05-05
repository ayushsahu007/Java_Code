package comparator;

public class Pen {
    int cost;
    Pen(int cost){
        this.cost = cost;
    }
    @Override
    public String toString(){
        return "cost :"+cost;
    }
}
