package methodoverloading;

public class Airtel {
    void pay(String upiId){
        System.out.println("Payment using UPI ID");
    }
    void pay(long cardNo,int cvv){
        System.out.println("Payment using Card No and Cvv");
    }

    public static void main(String[] args) {
        Airtel a = new Airtel();
        a.pay("ayush32@ybl");
        a.pay(32454L,232);
    }
}
