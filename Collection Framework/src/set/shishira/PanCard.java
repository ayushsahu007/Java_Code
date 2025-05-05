package set.shishira;

public class PanCard {
    String panNumber;
    String name;

    public PanCard(String panNumber,String name){
        this.panNumber = panNumber;
        this.name =name;
    }
    @Override
    public String toString(){
        return this.panNumber+" "+this.name;
    }
}
