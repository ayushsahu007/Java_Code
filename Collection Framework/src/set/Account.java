package set;

public class Account implements Comparable<Account>{
    long accountNum;
    String name;
    double bal;

    public Account(long accountNum,String name,double bal){
        this.accountNum = accountNum;
        this.name = name;
        this.bal = bal;
    }
    @Override
    public String toString(){
        return this.name+" "+this.accountNum+" "+this.bal;
    }
    @Override
    public int compareTo(Account o){
        //descending order
        Long l = this.accountNum;
        return l.compareTo(o.accountNum) * -1;
    }
}

